/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.messaging;

import org.wso2.carbon.kernel.transports.CarbonTransport;

/**
 * Abstract class for Message listener.
 */
public abstract class TransportListener extends CarbonTransport {

    public TransportListener(String id) {
        super(id);
    }

    public abstract void setMessageProcessor(CarbonMessageProcessor messageProcessor);

    /**
     * Listen on given interface
     * @param interfaceId has port , host and all listener parameters
     * @return
     */
    public abstract boolean listen(String  interfaceId);

    /**
     * Stop Listening in given interface if already listening
     * @param interfaceId
     * @return
     */
    public abstract boolean stopListening(String  interfaceId);
}
