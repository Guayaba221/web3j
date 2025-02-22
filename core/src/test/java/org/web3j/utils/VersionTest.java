/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.utils;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.web3j.utils.Version.DEFAULT;
import static org.web3j.utils.Version.getTimestamp;
import static org.web3j.utils.Version.getVersion;

class VersionTest {

    @Test
    void testGetVersion() throws IOException {
        assertEquals(getVersion(), (DEFAULT));
    }

    @Test
    void testGetTimestamp() throws IOException {
        assertEquals(getTimestamp(), ("2017-01-31 01:21:09.843 UTC"));
    }
}
