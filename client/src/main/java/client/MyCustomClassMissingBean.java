package client;

import my.starter.library.impl.MyCustomComponentDev;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(MyCustomComponentDev.class)
public class MyCustomClassMissingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() {
		System.out.println("Here in on missing bean");
	}
}
