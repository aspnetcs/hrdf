/**
 * Copyright 2007 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hrdf.hql;

public class ExitException extends SecurityException {
  private static final long serialVersionUID = -8085525076856622991L;
  /** Status code */
  private int status;

  /**
   * Constructs an exit exception.
   * 
   * @param status the status code returned via System.exit()
   */
  public ExitException(int status) {
    this.status = status;
  }

  /**
   * The status code returned by System.exit()
   * 
   * @return the status code returned by System.exit()
   */
  public int getStatus() {
    return status;
  }
}
