package com.google.common.cache.c;
import com.google.common.cache.a;
import ok.h;
import java.lang.Object;
import java.util.concurrent.ConcurrentMap;
import java.lang.Iterable;
import com.google.common.collect.ImmutableMap;

public interface abstract c implements a, h	// class@001786
{

    Object apply(Object p0);
    ConcurrentMap asMap();
    Object get(Object p0);
    void m(Object p0);
    Object n(Object p0);
    ImmutableMap n1(Iterable p0);
}
