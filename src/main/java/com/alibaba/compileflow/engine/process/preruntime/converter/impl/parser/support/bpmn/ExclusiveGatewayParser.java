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
package com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.bpmn;

import com.alibaba.compileflow.engine.definition.bpmn.BpmnModelConstants;
import com.alibaba.compileflow.engine.definition.bpmn.ExclusiveGateway;
import com.alibaba.compileflow.engine.definition.common.Element;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.ParseContext;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.XMLSource;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.AbstractBpmnElementParser;

/**
 * @author wuxiang
 * @author yusu
 */
public class ExclusiveGatewayParser extends AbstractBpmnElementParser<ExclusiveGateway> {

    @Override
    protected ExclusiveGateway doParse(XMLSource xmlSource, ParseContext parseContext) throws Exception {
        ExclusiveGateway exclusiveGateway = new ExclusiveGateway();
        exclusiveGateway.setId(xmlSource.getString(BpmnModelConstants.BPMN_ATTRIBUTE_ID));
        exclusiveGateway.setDefaultFlow(xmlSource.getString(BpmnModelConstants.BPMN_ATTRIBUTE_DEFAULT));
        return exclusiveGateway;
    }

    @Override
    protected void attachChildElement(Element childElement, ExclusiveGateway element, ParseContext parseContext) {

    }

    @Override
    public String getName() {
        return BpmnModelConstants.BPMN_ELEMENT_EXCLUSIVE_GATEWAY;
    }

}
