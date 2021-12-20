package ex.example.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanUtil implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public Object getBean(final String beanName) {
		final ApplicationContext applicationContext = this.applicationContext;
		return applicationContext.getBean(beanName);
	}
	
}