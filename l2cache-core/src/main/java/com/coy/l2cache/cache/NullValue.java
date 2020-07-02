package com.coy.l2cache.cache;

import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * 简单的可序列化类，用作{@code null}替换缓存存储，否则不支持{@code null}值
 *
 * @author chenck
 * @date 2020/7/1 17:39
 */
public final class NullValue implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final Object INSTANCE = new NullValue();

    private NullValue() {
    }

    private Object readResolve() {
        return INSTANCE;
    }


    @Override
    public boolean equals(@Nullable Object obj) {
        return (this == obj || obj == null);
    }

    @Override
    public int hashCode() {
        return org.springframework.cache.support.NullValue.class.hashCode();
    }

    @Override
    public String toString() {
        return "null";
    }
}
