package com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;

public interface abstract CacheErrorLogger	// class@00041d
{

    void a(CacheErrorLogger$CacheErrorCategory p0,Class p1,String p2,Throwable p3);
}
