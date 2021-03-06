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
package com.alipay.sofa.common.config.source;

import com.alipay.sofa.common.utils.StringUtil;

/**
 * @author zhaowang
 * @version : SystemEnvConfigSource.java, v 0.1 2020年12月01日 1:42 下午 zhaowang Exp $
 */
public class SystemEnvConfigSource extends AbstractConfigSource {
    @Override
    public String doGetConfig(String key) {
        return System.getenv(key);
    }

    @Override
    public boolean hasKey(String key) {
        String env = System.getenv(key);
        return StringUtil.isNotBlank(env);
    }

    @Override
    public String getName() {
        return "SystemEnv";
    }

    @Override
    public int getOrder() {
        return ConfigSourceOrder.SYSTEM_ENV;
    }
}