package pl.javastart;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer2 //implements WebApplicationInitializer

{

    //@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    	
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.setServletContext(servletContext);
        DispatcherServlet dispatcher = new DispatcherServlet(ctx);
        
        Dynamic dispatcherConfig = servletContext.addServlet("dispatcher", dispatcher);
        dispatcherConfig.addMapping("/");
    }
}