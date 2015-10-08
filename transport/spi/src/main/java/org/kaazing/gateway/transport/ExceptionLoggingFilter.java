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
package org.kaazing.gateway.transport;

import org.slf4j.Logger;

public class ExceptionLoggingFilter
    extends LoggingFilter {

    public ExceptionLoggingFilter(Logger logger,
                                  String format) {
        super(logger, format);
    }

    public ExceptionLoggingFilter(Logger logger) {
        super(logger, "%s");
    }

    @Override
    protected boolean shouldLogSessionCreated() {
        return false;
    }

    @Override
    protected boolean shouldLogSessionOpened() {
        return getLogger().isDebugEnabled();
    }

    @Override
    protected boolean shouldLogMessageReceived() {
        return false;
    }

    @Override
    protected boolean shouldLogMessageSent() {
        return false;
    }

    @Override
    protected boolean shouldLogSessionIdle() {
        return false;
    }

    @Override
    protected boolean shouldLogExceptionCaught() {
        return getLogger().isDebugEnabled();
    }

    @Override
    protected boolean shouldLogSessionClosed() {
        return getLogger().isDebugEnabled();
    }

    @Override
    protected boolean shouldLogFilterWrite() {
        return false;
    }
}
