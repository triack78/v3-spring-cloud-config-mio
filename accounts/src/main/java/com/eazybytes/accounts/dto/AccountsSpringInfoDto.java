package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "spring")
public record AccountsSpringInfoDto(Map<String,Map<String,String>> config) {
}
