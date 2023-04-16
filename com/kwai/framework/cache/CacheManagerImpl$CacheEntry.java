package com.kwai.framework.cache.CacheManagerImpl$CacheEntry;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class CacheManagerImpl$CacheEntry implements Serializable	// class@0014e6
{
    public final long mExpireDate;
    public final String mJson;
    public static final long serialVersionUID = 0xb12463d23486a733;

    public void CacheManagerImpl$CacheEntry(String p0,long p1){
       super();
       this.mJson = p0;
       this.mExpireDate = p1;
    }
}
