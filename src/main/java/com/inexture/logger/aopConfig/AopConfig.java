package com.inexture.logger.aopConfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAutoConfiguration
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass= true)
@ComponentScan
public class AopConfig {
}
