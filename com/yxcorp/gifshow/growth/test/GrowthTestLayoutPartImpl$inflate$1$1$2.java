package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import zqa.c;
import java.lang.Comparable;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;

public final class GrowthTestLayoutPartImpl$inflate$1$1$2 extends Lambda implements l	// class@0014fd
{
    public final GrowthTestLayoutPartImpl$inflate$1$1 this$0;

    public void GrowthTestLayoutPartImpl$inflate$1$1$2(GrowthTestLayoutPartImpl$inflate$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayoutPartImpl$inflate$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "常驻通知栏: 开启白名单", "KEY_FEATURE_NOTIFICATION_WHITE", null, 4, null);
       p0.c("设置常驻通知栏刷新间隔（单位分钟：默认30）:", Integer.valueOf(1), new c(Integer.valueOf(0), Integer.valueOf(4)), this.this$0.this$0.this$0.a);
       return;
    }
}
