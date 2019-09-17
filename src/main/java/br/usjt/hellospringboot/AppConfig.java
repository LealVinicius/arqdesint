package br.usjt.hellospringboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.usjt.hellospringboot.model.Calculadora;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.hellospringboot.controller.LoginInterceptor;
import br.usjt.hellospringboot.model.Calculadora;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Bean
	public Calculadora getCalcudora() {
		return new Calculadora();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/",
				"/fazerLogin");
	}
}
