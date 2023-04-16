package com.kuaishou.krn.experiment.ExpConfigKt$isEmptyBundleFileCheckEnabled$2;
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

public final class ExpConfigKt$isEmptyBundleFileCheckEnabled$2 extends Lambda implements a	// class@00089b
{
    public static final ExpConfigKt$isEmptyBundleFileCheckEnabled$2 INSTANCE;

    static {
       ExpConfigKt$isEmptyBundleFileCheckEnabled$2.INSTANCE = new ExpConfigKt$isEmptyBundleFileCheckEnabled$2();
    }
    public void ExpConfigKt$isEmptyBundleFileCheckEnabled$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$isEmptyBundleFileCheckEnabled$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = true;
       if (obj != null) {
          b = obj.getBoolean("krn_empty_bundle_file_check", b);
       }
       return b;
    }
}
