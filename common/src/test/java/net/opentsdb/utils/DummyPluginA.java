// This file is part of OpenTSDB.
// Copyright (C) 2013-2014  The OpenTSDB Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package net.opentsdb.utils;

import org.junit.Ignore;

// need to ignore this class so JUnit doesn't try to run tests on it
@Ignore
public class DummyPluginA extends DummyPlugin {
  
  public DummyPluginA() {
    this.myname = "Dummy Plugin A";
  }
  
  public String mustImplement() { 
    return this.myname;
  }
}
