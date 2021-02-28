package my.starter.library.impl;

import my.starter.library.MyCustomComponent;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.property", havingValue = "prod")
public class MyCustomComponentProd implements MyCustomComponent {
	@Override
	public String getCustomComponentDescription() {
		return "This is custom component from prod version";
	}
}
