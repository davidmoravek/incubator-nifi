/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.cluster.manager.exception;

/**
 * Represents the exceptional case when a reconnection request is issued to a
 * node that cannot be reconnected (e.g., the node is not disconnected).
 *
 * @author unattributed
 */
public class IllegalNodeReconnectionException extends IllegalClusterStateException {

    public IllegalNodeReconnectionException() {
    }

    public IllegalNodeReconnectionException(String msg) {
        super(msg);
    }

    public IllegalNodeReconnectionException(Throwable cause) {
        super(cause);
    }

    public IllegalNodeReconnectionException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
