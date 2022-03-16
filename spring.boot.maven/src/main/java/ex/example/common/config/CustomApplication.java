package ex.example.common.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomApplication implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
	
	@Override
	public void customize(TomcatServletWebServerFactory factory) {	
		factory.setPort(8000);
        factory.setContextPath("/");
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404"));
	}
	
}