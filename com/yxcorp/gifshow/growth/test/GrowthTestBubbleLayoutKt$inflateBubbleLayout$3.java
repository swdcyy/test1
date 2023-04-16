package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$b;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4;
import msd.a;

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$3 extends Lambda implements l	// class@0014e4
{
    public static final GrowthTestBubbleLayoutKt$inflateBubbleLayout$3 INSTANCE;

    static {
       GrowthTestBubbleLayoutKt$inflateBubbleLayout$3.INSTANCE = new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3();
    }
    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("bundleId\(*\)", "", null, new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$a());
       p0.c("viewKey", "dialog", null, new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$b());
       p0.c("参数\(json格式\)", "{}", null, new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$c());
       p0.a("使用KwaiBubble容器加载", GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4.INSTANCE);
       return;
    }
}
