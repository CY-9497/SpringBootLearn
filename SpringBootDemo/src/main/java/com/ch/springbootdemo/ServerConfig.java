package com.ch.springbootdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 渔郎
 * @CLassName ServerConfig
 * @Description TODO
 * @Date 2022/4/30 22:16
 */

@Data
@ConfigurationProperties(prefix = "servers")
public class ServerConfig {
    private String ipAddress;
    private int port;
    private long timeout;

}
