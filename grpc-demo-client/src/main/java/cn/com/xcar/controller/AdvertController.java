package cn.com.xcar.controller;

import cn.com.xcar.grpc.client.SearchGrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lxj
 * @Date 2019-06-13 17:04
 **/
@RestController
public class AdvertController {

    @Autowired
    private SearchGrpcClient searchGrpcClient;

    @RequestMapping("ad/{placeId}")
    public String searchAdvert(@PathVariable Integer placeId) {

        return searchGrpcClient.search(placeId);
    }

}
