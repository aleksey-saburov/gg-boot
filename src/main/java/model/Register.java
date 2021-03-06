/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package model;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.io.Serializable;

/**
 * Register definition.
 * <p>
 * Code generated by Apache Ignite Schema Import utility: 03/15/2016.
 */
public class Register implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    @QuerySqlField(index = true)
    private int id;
    @QuerySqlField(name = "last_mov_nbr")
    private Long lastMovNbr;
    @QuerySqlField()
    private long val;

    /**
     * Empty constructor.
     */
    public Register() {
        // No-op.
    }

    /**
     * Full constructor.
     */


    /**
     * Gets id.
     *
     * @return Value for id.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id New value for id.
     */
    public void setId(int id) {
        this.id = id;
    }

    public Long getLastMovNbr() {
        return lastMovNbr;
    }

    public void setLastMovNbr(Long lastMovNbr) {
        this.lastMovNbr = lastMovNbr;
    }

    public long getVal() {
        return val;
    }

    public void setVal(long val) {
        this.val = val;
    }
}

