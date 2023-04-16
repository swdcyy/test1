package com.kwai.middleware.resourcemanager.cache.dataloader.DefaultLocalDataLoader;
import db7.a;
import com.kwai.middleware.resourcemanager.cache.dataloader.DefaultLocalDataLoader$a;
import nsd.u;
import bb7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import com.yxcorp.utility.Log;
import java.io.File;
import java.lang.StringBuilder;
import java.io.Serializable;
import qkd.c;
import com.kwai.middleware.resourcemanager.cache.dataloader.DefaultLocalDataLoader$JsonParseThrowable;
import java.lang.Throwable;

public class DefaultLocalDataLoader implements a	// class@000f3e
{
    public final a a;
    public static final DefaultLocalDataLoader$a b;

    static {
       DefaultLocalDataLoader.b = new DefaultLocalDataLoader$a(null);
    }
    public void DefaultLocalDataLoader(a p0){
       a.p(p0, "adapter");
       super();
       this.a = p0;
    }
    public UnionResponse a(){
       String str = "[RMResource] LocalDataLoader";
       Log.g(str, "loadCacheFromFile\(\) called");
       UnionResponse unionRespons = null;
       if (!this.c().exists()) {
          Log.g(str, "cache file not exist");
          return unionRespons;
       }else {
          File uFile = this.c();
          try{
             Log.g(str, "loadCacheFromFile start: "+uFile.getPath());
             UnionResponse unionRespons1 = c.o(uFile);
             Log.g(str, "loadCacheFromFile end: "+uFile.getPath());
             if (unionRespons1 == null) {
                Log.n(str, "cache file maybe dirty, delete");
                this.c().delete();
             }else {
                unionRespons = unionRespons1;
             }
             return unionRespons;
          }catch(java.lang.Exception e1){
             Log.d(str, "loadCacheFromFile error "+e1);
             throw new DefaultLocalDataLoader$JsonParseThrowable(e1);
          }
       }
    }
    public void b(UnionResponse p0){
       Log.g("[RMResource] LocalDataLoader", "saveUnionResponse\(\) called");
       File parentFile = this.c().getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       c.x(p0, this.c());
       return;
    }
    public final File c(){
       return this.a.a();
    }
}
