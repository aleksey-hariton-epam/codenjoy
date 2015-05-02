package com.codenjoy.dojo.services.settings;

import org.apache.commons.lang.StringUtils;

public class NullParameter<T> implements Parameter<T> {

    public static final Parameter INSTANCE = new NullParameter();

    private NullParameter() {
        // do nothing
    }

    @Override
    public T getValue() {
        return (T)new Object();
    }

    @Override
    public String getName() {
        return StringUtils.EMPTY;
    }

    @Override
    public void update(T value) {
        // do nothing
    }

    @Override
    public Parameter<T> def(T value) {
        return INSTANCE;
    }

    @Override
    public boolean itsMe(String name) {
        return false;
    }

    @Override
    public <V> Parameter<V> type(Class<V> integerClass) {
        return INSTANCE;
    }

    @Override
    public void select(int index) {
        // do nothing
    }
}
