/*
 * Copyright (c) 2021 gematik GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.gematik.idp.test.ide;

import de.gematik.idp.test.steps.helpers.TestEnvironmentConfigurator;
import io.cucumber.junit.CucumberOptions;
import java.io.IOException;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    strict = true,
    features = {"src/test/resources/features"},
    glue = {"de.gematik.idp.test.steps"})
public class JUnitHookForIde {

    @BeforeClass
    public static void setupClass() throws IOException {
        TestEnvironmentConfigurator.initializeTestEnvironment();
    }
}