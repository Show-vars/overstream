/*
 * Copyright 2019 Bunjlabs
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

package com.overstreamapp.messageserver;

import com.bunjlabs.fuga.inject.Configuration;
import com.bunjlabs.fuga.inject.Singleton;
import com.bunjlabs.fuga.inject.Unit;
import com.overstreamapp.messageserver.support.DefaultMessageServer;

public class MessageServerUnit implements Unit {

    @Override
    public void setup(Configuration c) {
        c.bind(MessageServerSettings.class).auto();
        c.bind(DefaultMessageServer.class).auto();
        c.bind(MessageServer.class).to(DefaultMessageServer.class).in(Singleton.class);
    }
}
