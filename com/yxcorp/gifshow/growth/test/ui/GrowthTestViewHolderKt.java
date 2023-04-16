package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderKt;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderKt$allType$2;
import msd.a;
import qrd.p;
import qrd.s;
import vsd.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.List;

public final class GrowthTestViewHolderKt	// class@001580
{
    public static final p a;

    static {
       GrowthTestViewHolderKt.a = s.c(GrowthTestViewHolderKt$allType$2.INSTANCE);
    }
    public static final int a(d p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthTestViewHolderKt growthTestVi = GrowthTestViewHolderKt.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, growthTestVi, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "$this$holderType");
       Object obj1 = PatchProxy.apply(null, null, growthTestVi, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = GrowthTestViewHolderKt.a.getValue();
       }
       return obj1.indexOf(p0);
    }
}
