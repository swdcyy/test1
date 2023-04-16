package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$6;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$6 extends Lambda implements l	// class@0014f1
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$6 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$6.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$6();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$6(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$6.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "冷启计时改为15s", "KEY_NPS_DIALOG_TIME_LIMIT_TEST", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "冷启重置已显示弹窗标记", "KEY_NPS_DIALOG_RESET_SHOW", null, 4, null);
       return;
    }
}
