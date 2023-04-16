package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
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
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.Long;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1$b;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1$c;

public final class GrowthTestPage$inflate$1$21$1 extends Lambda implements l	// class@00152b
{
    public static final GrowthTestPage$inflate$1$21$1 INSTANCE;

    static {
       GrowthTestPage$inflate$1$21$1.INSTANCE = new GrowthTestPage$inflate$1$21$1();
    }
    public void GrowthTestPage$inflate$1$21$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestPage$inflate$1$21$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("设置显示最大次数", Integer.valueOf(1), new c(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE)), new GrowthTestPage$inflate$1$21$1$a());
       p0.c("设置气泡显示Delay间隔（ms）", Long.valueOf(0x2710), new c(Long.valueOf(0), Long.valueOf(Long.MAX_VALUE)), new GrowthTestPage$inflate$1$21$1$b());
       p0.c("设置气泡显示时长（ms）", Long.valueOf(3000), new c(Long.valueOf(1000), Long.valueOf(Long.MAX_VALUE)), new GrowthTestPage$inflate$1$21$1$c());
       return;
    }
}
