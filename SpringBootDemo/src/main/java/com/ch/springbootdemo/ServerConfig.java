package com.ch.springbootdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author 渔郎
 * @CLassName ServerConfig
 * @Description TODO
 * @Date 2022/4/30 22:16
 */

@Data
@Validated
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    @Max(value = 8888,message = "最大值不能大于8888")
    private int port;
    private long timeout;

    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeOut;

    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;


}
