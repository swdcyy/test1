package com.kuaishou.krn.experiment.ExpConfigKt$maxKrnLayoutCacheCount$2;
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

public final class ExpConfigKt$maxKrnLayoutCacheCount$2 extends Lambda implements a	// class@0008ad
{
    public static final ExpConfigKt$maxKrnLayoutCacheCount$2 INSTANCE;

    static {
       ExpConfigKt$maxKrnLayoutCacheCount$2.INSTANCE = new ExpConfigKt$maxKrnLayoutCacheCount$2();
    }
    public void ExpConfigKt$maxKrnLayoutCacheCount$2(){
       super(0);
    }
    public final int invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$maxKrnLayoutCacheCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = KrnInternalManager.c.a().c();
       int i = 3;
       if (obj != null) {
          i = obj.getInt("krnLayoutCacheMaxCount", i);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
