package com.ydemo.base.cores.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("qiniu")
public class TestConfig {
    private static String AK;
    private static String SK;

    public static String getAK() {
        return AK;
    }

    public static void setAK(String AK) {
        TestConfig.AK = AK;
    }

    public static String getSK() {
        return SK;
    }

    public static void setSK(String SK) {
        TestConfig.SK = SK;
    }

}
