package com.kuaishou.krn.experiment.ExpConfigKt$maxCodeCacheStorageSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import java.lang.Integer;

public final class ExpConfigKt$maxCodeCacheStorageSize$2 extends Lambda implements a	// class@0008ac
{
    public static final ExpConfigKt$maxCodeCacheStorageSize$2 INSTANCE;

    static {
       ExpConfigKt$maxCodeCacheStorageSize$2.INSTANCE = new ExpConfigKt$maxCodeCacheStorageSize$2();
    }
    public void ExpConfigKt$maxCodeCacheStorageSize$2(){
       super(0);
    }
    public final int invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$maxCodeCacheStorageSize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = KrnInternalManager.c.a().c();
       int i = 100;
       if (obj != null) {
          i = obj.getInt("KdsMaxCodeCacheStorageSize", i);
       }
       return ((i * 1024) * 1024);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
