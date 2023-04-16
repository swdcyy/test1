package com.facebook.cache.common.CacheKey;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;

public interface abstract CacheKey	// class@00103c
{

    String a();
    boolean b();
    boolean c(Uri p0);
    boolean equals(Object p0);
    int hashCode();
    String toString();
}
