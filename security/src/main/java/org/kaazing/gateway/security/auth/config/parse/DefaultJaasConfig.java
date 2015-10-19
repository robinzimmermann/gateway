/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.security.auth.config.parse;

import java.util.HashMap;
import java.util.Map;

import org.kaazing.gateway.security.auth.config.JaasConfig;
import org.kaazing.gateway.security.auth.config.RoleConfig;
import org.kaazing.gateway.security.auth.config.UserConfig;


public class DefaultJaasConfig implements JaasConfig {

    private Map<String, UserConfig> users;
    private Map<String, RoleConfig> roles;

    public DefaultJaasConfig() {
        users = new HashMap<>();
        roles = new HashMap<>();
    }

    public Map<String, RoleConfig> getRoles() {
        return roles;
    }

    public Map<String, UserConfig> getUsers() {
        return users;
    }

}
