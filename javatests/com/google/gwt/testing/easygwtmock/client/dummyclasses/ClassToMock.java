/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.testing.easygwtmock.client.dummyclasses;

/**
 * Dummy class for testing purposes
 * 
 * @author Michael Goderbauer
 */
public class ClassToMock {
  
  public String returnString() {
    return "Hi";
  }
  
  public int returnInt() {
    return 0;
  }
  
  public void noReturnValue() {
  }
  
  public final String finalMethod() {
    return "I am final";
  }
  
  @Override
  public final boolean equals(Object obj) {
    return true;
  }
}
