package com.lykj.springcloud.email.feign.client;

import com.lykj.springcloud.data.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 喜欢看客户端feign接口
 *
 * @author: zealon
 * @since: 2019/7/4
 */
@FeignClient(contextId = "like", name = "light-reading-cloud-account", fallbackFactory = EmailFeignClient.class)
public interface EmailFeignClient {

    @GetMapping("/account/like-see/get-count")
    Result<Integer> getBookLikesCount(@RequestParam("bookId") String bookId);

    @GetMapping("test1")
    void SendTestEmail();
}