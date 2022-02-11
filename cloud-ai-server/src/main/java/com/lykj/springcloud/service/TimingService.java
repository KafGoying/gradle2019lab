package com.lykj.springcloud.service;
import com.lykj.springcloud.data.result.Result;
/**
 * 项目查询服务
 * @author: kaf
 * @since: 2022/01/26
 */

public interface TimingService {

    /**
     * 开启所有软件工程
     * @param
     * @return
     */
    Result startAllProgramme( );
    /**
     * 关闭所有软件工程
     * @param
     * @return
     */
    Result closeAllProgramme( );

}
