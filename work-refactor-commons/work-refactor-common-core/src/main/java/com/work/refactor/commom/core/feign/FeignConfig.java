package com.work.refactor.commom.core.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * FeignConfig
 *
 * @author zhoug
 * @date 2024/12/13 10:39
 */
@RefreshScope
@Configuration
public class FeignConfig {
    /** feign路径前缀 */
    public static final String FEIGN_PREFIX = "/feign";
    /** feign验证 */
    @Value("${feign.sign}")
    private String sign;
    /** ip白名单 */
    @Value("#{'${feign.ips:}'.split(',')}")
    private List<String> ips;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    @Override
    public String toString() {
        return "FeignConfig{" +
                "sign='" + sign + '\'' +
                ", ips=" + ips +
                '}';
    }
}
