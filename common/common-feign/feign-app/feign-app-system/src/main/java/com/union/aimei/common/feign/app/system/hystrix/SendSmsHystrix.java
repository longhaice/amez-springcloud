package com.union.aimei.common.feign.app.system.hystrix;

import com.union.aimei.common.feign.app.system.SendSmsFeign;
import com.union.aimei.common.vo.system.SmsMessageVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * SendSmsHystrix
 *
 * @author liufeihua
 * @date 2017/12/27 16:41
 */
@Component(value = "app-SendSmsFeign")
public class SendSmsHystrix implements SendSmsFeign {
    @Override
    public int sendSmsMessage( SmsMessageVo smsMessageVo) {
        return 0;
    }

    /**
     * 批量发送短信
     *
     * @param smsMessageVo
     * @return
     */
    @Override
    public int sendSmsCodeList(List<SmsMessageVo> smsMessageVo) {
        return 0;
    }
}
