package cn.com.xcar.interceptor;

import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author lxj
 * @Date 2019-06-13 17:21
 **/
public class GrpcLoggerInterceptor implements ClientInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GrpcLoggerInterceptor.class);

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        LOGGER.info(method.getFullMethodName());
        return next.newCall(method, callOptions);
    }

}
