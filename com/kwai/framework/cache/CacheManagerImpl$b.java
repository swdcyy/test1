package com.kwai.framework.cache.CacheManagerImpl$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import j80.c;
import java.io.File;
import com.yxcorp.utility.Log;
import qkd.b;

public class CacheManagerImpl$b implements Runnable	// class@0014e8
{

    public void CacheManagerImpl$b(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CacheManagerImpl$b.class, "1")) {
          return;
       }
       File uFile = b.a(-1504323719).a();
       if (new File(uFile, "journal").exists()) {
          Log.g("CacheManagerImpl", "journalFile exists, delete oldCacheDir");
          b.m(uFile);
       }
       return;
    }
}
