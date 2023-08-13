package com.tsinghua.mem;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 在主启动类启动时初始化配置文件中的内容
 * <p>
 * 创建时间: 2022-03-24 14:46
 *
 * @author v_fuxshen
 * @version v1.0.0
 * @since v1.0.0
 */
@Component
public class ConstantOssPropertiesUtils implements InitializingBean {

    @Value("AKIDOitshZL3czpV7gS7cyBHDVeayJXaWxOg")
    private String secretId;

    @Value("IMH0Xt2ulTyHONBmAMNBpNySQI1jHdnl")
    private String secretKey;


    public static String Tencent_secretId;
    public static String Tencent_secretKey;


    @Override
    public void afterPropertiesSet() throws Exception {
        Tencent_secretId = secretId;
        Tencent_secretKey = secretKey;
    }
}
