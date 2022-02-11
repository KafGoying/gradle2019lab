package com.lykj.springcloud.service.impl;
import com.lykj.springcloud.data.result.Result;
import com.lykj.springcloud.service.TimingService;
import org.springframework.stereotype.Service;

@Service
public class TimingServiceImpl implements TimingService {


    /**
     * 开启所有软件工程
     *
     * @return
     */
    @Override
    public Result startAllProgramme() {
//        启动邮件自动发送功能

        return null;
    }

    /**
     * 关闭所有软件工程
     *
     * @return
     */
    @Override
    public Result closeAllProgramme() {
//        关闭邮件自动发送功能
        return null;
    }
}
