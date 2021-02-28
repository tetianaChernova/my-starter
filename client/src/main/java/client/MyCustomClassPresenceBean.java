package client;

import my.starter.library.impl.MyCustomComponentDev;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(MyCustomComponentDev.class)
public class MyCustomClassPresenceBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() {
		System.out.println("Here in on presence bean");
	}
}
