// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.AzureCliCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import reactor.core.publisher.Mono;
import java.time.OffsetDateTime;

class ConfidentialLedgerClientTestBase extends TestBase {
    protected ConfidentialLedgerClient confidentialLedgerClient;
    protected ConfidentialLedgerClientBuilder confidentialLedgerClientBuilder;
    protected ConfidentialLedgerIdentityClient confidentialLedgerIdentityClient;

    @Override
    protected void beforeTest() {
        try {
            ConfidentialLedgerIdentityClientBuilder confidentialLedgerIdentityClientbuilder = new ConfidentialLedgerIdentityClientBuilder()
                .identityServiceUri(
                        Configuration.getGlobalConfiguration().get("IDENTITYSERVICEURI", "https://identity.confidential-ledger.core.azure.com"))
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
            if (getTestMode() == TestMode.PLAYBACK) {
                confidentialLedgerIdentityClientbuilder
                        .httpClient(interceptorManager.getPlaybackClient())
                        .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
            } else if (getTestMode() == TestMode.RECORD) {
                confidentialLedgerIdentityClientbuilder
                        .addPolicy(interceptorManager.getRecordPolicy())
                        .credential(new DefaultAzureCredentialBuilder().build());
            } else if (getTestMode() == TestMode.LIVE) {
                confidentialLedgerIdentityClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
            }
            confidentialLedgerIdentityClient = confidentialLedgerIdentityClientbuilder
                    .buildClient();
            
            String ledgerId = Configuration.getGlobalConfiguration().get("LEDGERID", "emily-java-sdk-tests");

            confidentialLedgerClientBuilder = new ConfidentialLedgerClientBuilder()
                    .ledgerUri(Configuration.getGlobalConfiguration().get("LEDGERURI", "https://emily-java-sdk-tests.confidential-ledger.azure.com"))
                    .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
            if (getTestMode() == TestMode.PLAYBACK) {
                confidentialLedgerClientBuilder
                        .httpClient(interceptorManager.getPlaybackClient())
                        .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
            } else if (getTestMode() == TestMode.RECORD) {
                confidentialLedgerClientBuilder
                        .addPolicy(interceptorManager.getRecordPolicy())
                        .credential(new DefaultAzureCredentialBuilder().build());
            } else if (getTestMode() == TestMode.LIVE) {
                confidentialLedgerClientBuilder.credential(new AzureCliCredentialBuilder().build());
            }
        } catch (Exception ex) {
            System.out.println("Error thrown from ConfidentialLedgerClientTestBase:" + ex);
        }
    }

}
