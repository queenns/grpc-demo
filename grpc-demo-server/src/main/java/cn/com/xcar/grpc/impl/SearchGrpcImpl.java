package cn.com.xcar.grpc.impl;

import cn.com.xcar.proto.AdvertReply;
import cn.com.xcar.proto.AdvertRequest;
import cn.com.xcar.proto.SearchGrpc;
import com.google.common.collect.Maps;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @Author lxj
 * @Date 2019-06-13 15:44
 **/
@GrpcService
public class SearchGrpcImpl extends SearchGrpc.SearchImplBase {

    private Map<Integer, String> adverts = Maps.newHashMap();

    @PostConstruct
    public void initAdverts() {
        adverts.put(1111, "通栏");
        adverts.put(2222, "焦点图");
    }

    @Override
    public void search(AdvertRequest request, StreamObserver<AdvertReply> responseObserver) {

        AdvertReply reply = AdvertReply.newBuilder().setMsg(adverts.get(request.getPlaceId())).build();

        responseObserver.onNext(reply);

        responseObserver.onCompleted();

    }

}
