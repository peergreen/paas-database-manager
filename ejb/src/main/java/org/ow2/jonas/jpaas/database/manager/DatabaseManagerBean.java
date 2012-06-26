/**
 * JPaaS Util
 * Copyright (C) 2012 Bull S.A.S.
 * Contact: jasmine@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 * --------------------------------------------------------------------------
 * $Id$
 * --------------------------------------------------------------------------
 */
package org.ow2.jonas.jpaas.database.manager;

import org.ow2.jonas.jpaas.database.manager.api.DatabaseManagerBeanException;
import org.ow2.jonas.jpaas.database.manager.api.DatabaseManagerLocal;
import org.ow2.jonas.jpaas.database.manager.api.DatabaseManagerRemote;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName="DatabaseManagerBean")
@Local(DatabaseManagerLocal.class)
@Remote(DatabaseManagerRemote.class)
public class DatabaseManagerBean {

  public DatabaseManagerBean() {
  }

  public void createDatabase(String dbName, String paasAgentName, String paasConfigurationName, Integer portRange) throws DatabaseManagerBeanException {
     //TODO
    System.out.println("JPAAS-DATABASE-MANAGER / createDatabase called");
  }

}
