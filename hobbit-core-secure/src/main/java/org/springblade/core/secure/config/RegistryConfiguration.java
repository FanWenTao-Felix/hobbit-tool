package com.hobbit.core.secure.config;


import com.hobbit.core.secure.registry.SecureRegistry;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * secure注册默认配置
 *
 * @author Chill
 */
@Order
@Configuration
@AutoConfigureBefore(SecureConfiguration.class)
public class RegistryConfiguration {

  @Bean
  @ConditionalOnMissingBean(SecureRegistry.class)
  public SecureRegistry secureRegistry() {
    return new SecureRegistry();
  }

}
