package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$8;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$8$1;
import msd.a;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$8 extends Lambda implements l	// class@0014f4
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$8 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$8.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$8();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$8(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$8.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a("重置引导手势开关", GrowthTestCommonLayoutKt$inflateCommonLayout$8$1.INSTANCE);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "禁用强化引导频控", "KEY_INTENSIFY_DISABLE_SHOW_COUNT", null, 4, null);
       return;
    }
}
