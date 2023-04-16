package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$7;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vqa.i;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import vqa.h;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$4;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$7 extends Lambda implements l	// class@00151c
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$7(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$7.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$7 t$context$in = this.$context$inlined;
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$context$in, obj, i.class, "1")) {
          a.p(p0, "$this$inflateBubbleLayout");
          a.p(t$context$in, "context");
          p0.l("是否开启本地bundle调试\(重启生效\)", "KEY_K_BUBBLE_TK_BUNDLE_TEST", GrowthTestBubbleLayoutKt$inflateBubbleLayout$1.INSTANCE);
          p0.c("测试ip", "", obj, new h());
          p0.n("mock展示KwaiBubbleTK弹窗", false, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3.INSTANCE);
          p0.n("mock展示KwaiBubbleKrn弹窗", false, GrowthTestBubbleLayoutKt$inflateBubbleLayout$4.INSTANCE);
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$7.class, "1");
       return;
    }
}
