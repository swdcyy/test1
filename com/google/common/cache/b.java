package com.google.common.cache.b;
import com.google.common.cache.a;
import qk.t;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.lang.Iterable;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import pk.c;

public abstract class b extends t implements a	// class@001785
{

    public void b(){
       super();
    }
    public ConcurrentMap asMap(){
       return this.delegate().asMap();
    }
    public void cleanUp(){
       this.delegate().cleanUp();
    }
    public abstract a delegate();
    public Object delegate(){
       return this.delegate();
    }
    public Object get(Object p0,Callable p1){
       return this.delegate().get(p0, p1);
    }
    public ImmutableMap getAllPresent(Iterable p0){
       return this.delegate().getAllPresent(p0);
    }
    public Object getIfPresent(Object p0){
       return this.delegate().getIfPresent(p0);
    }
    public void invalidate(Object p0){
       this.delegate().invalidate(p0);
    }
    public void invalidateAll(){
       this.delegate().invalidateAll();
    }
    public void invalidateAll(Iterable p0){
       this.delegate().invalidateAll(p0);
    }
    public void put(Object p0,Object p1){
       this.delegate().put(p0, p1);
    }
    public void putAll(Map p0){
       this.delegate().putAll(p0);
    }
    public long size(){
       return this.delegate().size();
    }
    public c stats(){
       return this.delegate().stats();
    }
}
