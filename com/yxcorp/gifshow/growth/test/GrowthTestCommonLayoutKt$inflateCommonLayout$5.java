package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Long;
import zqa.c;
import java.lang.Comparable;
import ena.i;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$5 extends Lambda implements l	// class@0014f0
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$5 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$5.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$5();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$5(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$5.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "启用 长按垃圾清理", "KEY_CLEANER_LONG_CLICK", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "启用 设置页垃圾清理", "KEY_CLEANER_SETTING", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "启用 清理垃圾通知", "KEY_CLEANER_NOTIFICATION", null, 4, null);
       p0.c("修改垃圾通知剩余空间大小（单位：MB）", Long.valueOf(0), new c(Long.valueOf(0), Long.valueOf(Long.MAX_VALUE)), i.a);
       p0.c("修改垃圾通知时间间隔（单位：秒）", Long.valueOf(0), new c(Long.valueOf(0), Long.valueOf(Long.MAX_VALUE)), i.b);
       return;
    }
}
