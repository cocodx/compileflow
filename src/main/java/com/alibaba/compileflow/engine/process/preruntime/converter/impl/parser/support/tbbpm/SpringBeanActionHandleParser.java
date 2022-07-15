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
package com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.tbbpm;

import com.alibaba.compileflow.engine.definition.common.Element;
import com.alibaba.compileflow.engine.definition.common.action.impl.SpringBeanActionHandle;
import com.alibaba.compileflow.engine.definition.tbbpm.TbbpmModelConstants;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.ParseContext;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.model.XMLSource;
import com.alibaba.compileflow.engine.process.preruntime.converter.impl.parser.support.AbstractTbbpmElementParser;

/**
 * @author wuxiang
 * @author yusu
 */
public class SpringBeanActionHandleParser extends AbstractTbbpmElementParser<SpringBeanActionHandle> {

    @Override
    protected SpringBeanActionHandle doParse(XMLSource xmlSource, ParseContext parseContext) throws Exception {
        SpringBeanActionHandle springBeanActionHandle = new SpringBeanActionHandle();
        springBeanActionHandle.setBean(xmlSource.getString("bean"));
        springBeanActionHandle.setClazz(xmlSource.getString("clazz"));
        springBeanActionHandle.setMethod(xmlSource.getString("method"));
        return springBeanActionHandle;
    }

    @Override
    protected void attachChildElement(Element childElement, SpringBeanActionHandle element,
                                      ParseContext parseContext) {

    }

    @Override
    public String getName() {
        return TbbpmModelConstants.SPRING_BEAN_ACTION_HANDLE;
    }

}
