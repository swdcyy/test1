package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$3$1;
import msd.a;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$3 extends Lambda implements l	// class@0014ee
{
    public final Context $context;

    public void GrowthTestCommonLayoutKt$inflateCommonLayout$3(Context p0){
       this.$context = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "禁用每日频控", "KEY_DISABLE_NON_RELATION_QUICK_COMMENT_SHOW_COUNT", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "禁用间隔频控", "KEY_DISABLE_NON_RELATION_QUICK_COMMENT_INTERVAL", null, 4, null);
       p0.a("清空最近使用表情", new GrowthTestCommonLayoutKt$inflateCommonLayout$3$1(this));
       return;
    }
}
