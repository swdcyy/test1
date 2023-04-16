package com.kwai.framework.cache.CacheManager;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.Type;
import java.io.File;
import com.kwai.framework.cache.CacheManager$a;

public interface abstract CacheManager	// class@000b16
{

    boolean a(long p0);
    long b();
    void c(String p0,Object p1,Type p2,long p3);
    long d();
    long e();
    void f(boolean p0);
    Object g(String p0,Type p1);
    File get(String p0);
    boolean h();
    long i();
    boolean j(String p0);
    int k(CacheManager$a p0);
    void remove(String p0);
}
