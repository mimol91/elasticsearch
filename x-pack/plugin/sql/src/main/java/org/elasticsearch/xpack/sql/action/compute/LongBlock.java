/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.sql.action.compute;

import java.util.Arrays;

public class LongBlock extends Block {

    private final long[] values;

    public LongBlock(long[] values, int positionCount) {
        super(positionCount);
        this.values = values;
    }

    @Override
    public long getLong(int position) {
        return values[position];
    }

    @Override
    public String toString() {
        return "LongBlock{" +
            "values=" + Arrays.toString(values) +
            '}';
    }
}
