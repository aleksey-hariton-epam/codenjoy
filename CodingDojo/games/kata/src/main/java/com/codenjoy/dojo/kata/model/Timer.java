package com.codenjoy.dojo.kata.model;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 - 2017 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import java.util.Calendar;

/**
 * Created by indigo on 2017-04-03.
 */
public class Timer {
    public static int ONE_MINUTE_IN_MILLS = 60000;

    private long start = now();

    public void start() {
        start = now();
    }

    private long now() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public int end() {
        long delta = now() - start;
        return (int)(delta / ONE_MINUTE_IN_MILLS);
    }
}