package com.kuaishou.krn.experiment.ExpConfigKt$useKrnViewFromRootTag$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;

public final class ExpConfigKt$useKrnViewFromRootTag$2 extends Lambda implements a	// class@0008b6
{
    public static final ExpConfigKt$useKrnViewFromRootTag$2 INSTANCE;

    static {
       ExpConfigKt$useKrnViewFromRootTag$2.INSTANCE = new ExpConfigKt$useKrnViewFromRootTag$2();
    }
    public void ExpConfigKt$useKrnViewFromRootTag$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$useKrnViewFromRootTag$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = true;
       if (obj != null) {
          b = obj.getBoolean("useKrnViewFromRootTag", b);
       }
       return b;
    }
}