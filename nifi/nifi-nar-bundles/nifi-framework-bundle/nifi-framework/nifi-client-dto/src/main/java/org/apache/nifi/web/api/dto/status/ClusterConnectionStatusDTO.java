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
package org.apache.nifi.web.api.dto.status;

import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.nifi.web.api.dto.util.TimeAdapter;

/**
 * DTO for serializing the a connection's status across the cluster.
 */
@XmlType(name = "clusterConnectionStatus")
public class ClusterConnectionStatusDTO {

    private Collection<NodeConnectionStatusDTO> nodeConnectionStatus;
    private Date statsLastRefreshed;
    private String connectionId;
    private String connectionName;

    /**
     * The time the status were last refreshed.
     *
     * @return
     */
    @XmlJavaTypeAdapter(TimeAdapter.class)
    public Date getStatsLastRefreshed() {
        return statsLastRefreshed;
    }

    public void setStatsLastRefreshed(Date statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
    }

    /**
     * The connection id.
     *
     * @return
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * The connection name.
     *
     * @return
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * Collection of node connection status DTO.
     *
     * @return The collection of node connection status DTO
     */
    public Collection<NodeConnectionStatusDTO> getNodeConnectionStatus() {
        return nodeConnectionStatus;
    }

    public void setNodeConnectionStatus(Collection<NodeConnectionStatusDTO> nodeConnectionStatus) {
        this.nodeConnectionStatus = nodeConnectionStatus;
    }

}
