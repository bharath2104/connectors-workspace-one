/*
 * Copyright © 2019 VMware, Inc. All Rights Reserved.
 * SPDX-License-Identifier: BSD-2-Clause
 */

package com.vmware.connectors.concur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@SuppressWarnings("PMD.UseUtilityClass")
public class HubConcurConnectorApplication {
    public static void main(final String[] args) {
        SpringApplication.run(HubConcurConnectorApplication.class, args);
    }
}
