package cn.com.xcar.grpc.client;

import cn.com.xcar.proto.AdvertReply;
import cn.com.xcar.proto.AdvertRequest;
import cn.com.xcar.proto.SearchGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author lxj
 * @Date 2019-06-13 17:08
 **/
@Service
public class SearchGrpcClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchGrpcClient.class);

    @GrpcClient("advert-search")
    private SearchGrpc.SearchBlockingStub searchBlockingStub;

    public String search(final Integer placeId) {

        try {

            AdvertRequest request = AdvertRequest.newBuilder().setPlaceId(placeId).build();

            AdvertReply reply = this.searchBlockingStub.search(request);

            return reply.getMsg();

        } catch (final StatusRuntimeException e) {

            LOGGER.error("grpc client search failed", e);

            return null;

        }

    }

}
