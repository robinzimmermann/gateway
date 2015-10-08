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
package org.kaazing.gateway.resource.address;

import static java.lang.String.format;
import static org.kaazing.gateway.resource.address.URLUtils.modifyURIScheme;

import java.net.URI;

public class ResourceFactories {

    private ResourceFactories() {
        // no-op
    }

    public static ResourceFactory keepAuthorityOnly(String newScheme) {
        return new KeepAuthorityOnlyTransportFactory(newScheme);
    }
    
    public static ResourceFactory changeSchemeOnly(String newScheme) {
        return new ChangeSchemeOnlyTransportFactory(newScheme);
    }
    
    private static final class KeepAuthorityOnlyTransportFactory extends ResourceFactory {

        private final String newScheme;
        
        public KeepAuthorityOnlyTransportFactory(String newScheme) {
            this.newScheme = newScheme;
        }
        
        @Override
        public URI createURI(URI location) {
            return URI.create(format("%s://%s", newScheme, location.getAuthority()));
        }
    }
    
    private static final class ChangeSchemeOnlyTransportFactory extends ResourceFactory {

        private final String newScheme;
        
        public ChangeSchemeOnlyTransportFactory(String newScheme) {
            this.newScheme = newScheme;
        }
        
        @Override
        public URI createURI(URI location) {
            return modifyURIScheme(location, newScheme);
        }
    }
}
