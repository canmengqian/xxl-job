package com.xxl.job.core.enums;

/**
 * Created by xuxueli on 17/5/10.
 */
public class RegistryConfig {

    // 心跳检测超时
    public static final int BEAT_TIMEOUT = 30;
    // 死亡超时
    public static final int DEAD_TIMEOUT = BEAT_TIMEOUT * 3;

    public enum RegistType{ EXECUTOR, ADMIN }

}
