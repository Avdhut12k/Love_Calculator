package com.practiseApp.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
//1st approach to do the web.xml that is setup dispatcher servlet
public class LoveCalculatorApplicationInitializer /*implements WebApplicationInitializer*/ {

	public void onStartup(ServletContext servletContext) throws ServletException {

		/**
		 * 1st we need to create the servlet object and register that object with
		 * servlet context
		 * 
		 * then 1. set load-on-startup 2. set url-mapping
		 */

		// System.out.println("my custom class onStartup method
		// called>>>>>>>>>>>Avdhut");

		// As dispatcher servlet requires spring bean configuration file which is
		// webApplicationCCOntext needs to be created passed as an constructor argument
		
		
// xml file approach		//XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorApplicationConfig.class);
		
		
		// need to set the file of xml to the xmlWebApplicationContext class which is
		// present in classpath:(src/main/resources)
		//webApplicationContext.setConfigLocation("classpath:beans.xml");

		// create a dispatcher servlet object

		DispatcherServlet disServlet = new DispatcherServlet(webApplicationContext);

		// and register that dispatcher servlet object with the servlet context object
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				disServlet); // any name and class object or ref need to be there for the addServlet method

		// both ServletRegistration and Dynamic are inteface and Dynamic is inner
		// interface and implementation
		// is provided by Tomcat classes for those interfaces

		// 1.set load-on-startup
		// 2.set url-mapping

		myCustomDispatcherServlet.setLoadOnStartup(1);

		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");

	}

}
