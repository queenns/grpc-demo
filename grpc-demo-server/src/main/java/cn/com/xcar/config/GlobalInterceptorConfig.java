package cn.com.xcar.config;

import cn.com.xcar.interceptor.GrpcLoggerInterceptor;
import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lxj
 * @Date 2019-06-13 16:33
 **/
@Configuration
public class GlobalInterceptorConfig {

    @Bean
    public GlobalServerInterceptorConfigurer globalInterceptorConfigAdapter() {
        return globalServerInterceptorRegistry -> globalServerInterceptorRegistry.addServerInterceptors(new GrpcLoggerInterceptor());
    }

}
