package com.google.common.cache.a;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.lang.Iterable;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import pk.c;

public interface abstract a	// class@001784
{

    ConcurrentMap asMap();
    void cleanUp();
    Object get(Object p0,Callable p1);
    ImmutableMap getAllPresent(Iterable p0);
    Object getIfPresent(Object p0);
    void invalidate(Object p0);
    void invalidateAll();
    void invalidateAll(Iterable p0);
    void put(Object p0,Object p1);
    void putAll(Map p0);
    long size();
    c stats();
}
