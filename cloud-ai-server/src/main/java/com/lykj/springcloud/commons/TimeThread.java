package com.lykj.springcloud.commons;


import com.lykj.springcloud.email.feign.client.EmailFeignClient;
import com.lykj.springcloud.service.TimingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-07-01 15:28
 */
public class TimeThread extends Thread {
    private static TimeThread timeThread = null;
    private TimingService timingService;
    private Calendar time = Calendar.getInstance();
    private Boolean isSendSummaryJobMail = true, isSendPlanJobMail = true;

    @Autowired
    private EmailFeignClient emailFeignClient;

    public TimingService getTimingService() {
        return timingService;
    }

    public TimeThread setTimingService(TimingService timingService) {
        if (this.timingService == null) {
            this.timingService = timingService;
        }
        return this;
    }

    public static synchronized TimeThread getInstance() {
        if (timeThread == null) {
            timeThread = new TimeThread();
        }
        return timeThread;
    }

    private TimeThread() {
        super("CLogOracleWriterThread");
    }
//
//    private void InitPlanTimeAndSummaryTime() {
//        summaryTime = time;
//        planTime = time;
//        summaryTime.set(time.YEAR, time.MONTH, time.DATE, 8, 0, 0);
//        planTime.set(time.YEAR, time.MONTH, time.DATE, 18, 0, 0);
//    }
//
//    private Boolean IsTimeToSendEmail(String which) {
//        switch (which) {
//            case "AM": {
//                if (time.HOUR_OF_DAY == 7) {
//                    return
//                }
//            }
//        }
//        return false;
//    }

    @Override
    public void run() {
        while (true) {

//            emailFeignClient.SendTestEmail();
            try {
//                每天9：00启动一次“员工任务发送”任务；
                if (isSendPlanJobMail && time.get(Calendar.HOUR_OF_DAY) == 8) {
                    System.out.println("LOG 1 :每日计划任务启动");
//                    emailFeignClient.SendTestEmail();
                    isSendPlanJobMail = !isSendPlanJobMail;
                    isSendSummaryJobMail = true;
                }
//                每天18:30启动一次“员工当天工作完成情况任务发送”任务；

                if (isSendSummaryJobMail && time.get(Calendar.HOUR_OF_DAY) == 15) {
                    System.out.println("LOG 2 :员工当天工作完成情况任务");
                    isSendSummaryJobMail = !isSendSummaryJobMail;
                    isSendPlanJobMail = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Thread.sleep(1000);
                } catch (Exception eee) {
                }
            } finally {

            }
        }
    }
}

