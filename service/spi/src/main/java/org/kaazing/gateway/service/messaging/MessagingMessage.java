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
package org.kaazing.gateway.service.messaging;

/**
 * Container for data being passed between endpoints within the system.
 */
public interface MessagingMessage extends AttributeStore {

    /**
     * Gets the globally unique message identifier.
     * 
     * @return globally unique message identifier
     */
    String getId();
    
    /**
     * Gets the message playload. This can be an object of any serializable type, however different endpoints
     * will likely only support a specific subset of types.
     * 
     * @return message payload
     */
    Object getPayload();
    
}
