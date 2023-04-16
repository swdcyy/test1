package com.facebook.cache.common.a;
import java.lang.String;
import com.facebook.cache.common.CacheEventListener$EvictionReason;
import com.facebook.cache.common.CacheKey;
import java.io.IOException;

public interface abstract a	// class@00103d
{

    long a();
    String b();
    long c();
    CacheEventListener$EvictionReason d();
    long e();
    CacheKey getCacheKey();
    IOException getException();
}
