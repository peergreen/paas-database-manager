/**
 * JPaaS
 * Copyright 2012 Bull S.A.S.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * $Id:$
 */ 
package org.ow2.jonas.jpaas.database.manager.bean;

import org.ow2.jonas.jpaas.database.manager.api.DatabaseManager;
import org.ow2.jonas.jpaas.database.manager.api.DatabaseManagerBeanException;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName="DatabaseManagerBean")
@Local(DatabaseManager.class)
@Remote(DatabaseManager.class)
public class DatabaseManagerBean implements DatabaseManager {

  public DatabaseManagerBean() {
  }

  public void createDatabase(String dbName, String paasAgentName, String paasConfigurationName, Integer portRange) throws DatabaseManagerBeanException {
     //TODO
    System.out.println("JPAAS-DATABASE-MANAGER / createDatabase called");
  }

}
