/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *
 */

package org.wso2.ei.dashboard.core.rest.delegates.heartbeat;

import org.wso2.ei.dashboard.core.rest.model.UpdatedArtifact;
import java.util.List;

/**
 * Heartbeat object class.
 */
public class HeartbeatObject {
    private String product;
    private String groupId;
    private String nodeId;
    private Integer interval;
    private String mgtApiUrl;
    private long timestamp;
    private List<UpdatedArtifact> deployedArtifacts;
    private List<UpdatedArtifact> undeployedArtifacts;
    private List<UpdatedArtifact> stateChangedArtifacts;

    public HeartbeatObject(
            String product, String groupId, String nodeId, Integer interval, String mgtApiUrl, long timestamp,
            List<UpdatedArtifact> deployedArtifacts, List<UpdatedArtifact> undeployedArtifacts,
            List<UpdatedArtifact> stateChangedArtifacts) {

        this.product = product;
        this.groupId = groupId;
        this.nodeId = nodeId;
        this.interval = interval;
        this.mgtApiUrl = mgtApiUrl;
        this.timestamp = timestamp;
        this.deployedArtifacts = deployedArtifacts;
        this.undeployedArtifacts = undeployedArtifacts;
        this.stateChangedArtifacts = stateChangedArtifacts;
    }

    public String getProduct() {

        return product;
    }

    public void setProduct(String product) {

        this.product = product;
    }

    public String getGroupId() {

        return groupId;
    }

    public void setGroupId(String groupId) {

        this.groupId = groupId;
    }

    public String getNodeId() {

        return nodeId;
    }

    public void setNodeId(String nodeId) {

        this.nodeId = nodeId;
    }

    public Integer getInterval() {

        return interval;
    }

    public void setInterval(Integer interval) {

        this.interval = interval;
    }

    public String getMgtApiUrl() {

        return mgtApiUrl;
    }

    public void setMgtApiUrl(String mgtApiUrl) {

        this.mgtApiUrl = mgtApiUrl;
    }

    public long getTimestamp() {

        return timestamp;
    }

    public void setTimestamp(long timestamp) {

        this.timestamp = timestamp;
    }

    public List<UpdatedArtifact> getDeployedArtifacts() {

        return deployedArtifacts;
    }

    public void setDeployedArtifacts(List<UpdatedArtifact> deployedArtifacts) {

        this.deployedArtifacts = deployedArtifacts;
    }

    public List<UpdatedArtifact> getUndeployedArtifacts() {

        return undeployedArtifacts;
    }

    public void setUndeployedArtifacts(List<UpdatedArtifact> undeployedArtifacts) {

        this.undeployedArtifacts = undeployedArtifacts;
    }

    public List<UpdatedArtifact> getStateChangedArtifacts() {

        return stateChangedArtifacts;
    }

    public void setStateChangedArtifacts(List<UpdatedArtifact> stateChangedArtifacts) {

        this.stateChangedArtifacts = stateChangedArtifacts;
    }
}
