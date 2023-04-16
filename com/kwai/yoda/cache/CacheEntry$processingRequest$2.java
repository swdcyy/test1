package com.kwai.yoda.cache.CacheEntry$processingRequest$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CacheEntry$processingRequest$2 extends Lambda implements a	// class@001197
{
    public static final CacheEntry$processingRequest$2 INSTANCE;

    static {
       CacheEntry$processingRequest$2.INSTANCE = new CacheEntry$processingRequest$2();
    }
    public void CacheEntry$processingRequest$2(){
       super(0);
    }
    public final PublishSubject invoke(){
       Object obj = PatchProxy.apply(null, this, CacheEntry$processingRequest$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishSubject.g();
    }
    public Object invoke(){
       return this.invoke();
    }
}
