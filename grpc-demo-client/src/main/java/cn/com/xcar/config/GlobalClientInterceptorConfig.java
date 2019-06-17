package cn.com.xcar.config;

import cn.com.xcar.interceptor.GrpcLoggerInterceptor;
import net.devh.boot.grpc.client.interceptor.GlobalClientInterceptorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lxj
 * @Date 2019-06-13 17:18
 **/
@Configuration
public class GlobalClientInterceptorConfig {

    @Bean
    public GlobalClientInterceptorConfigurer globalClientInterceptorConfigurerAdapter() {
        return registry -> registry.addClientInterceptors(new GrpcLoggerInterceptor());
    }

}
