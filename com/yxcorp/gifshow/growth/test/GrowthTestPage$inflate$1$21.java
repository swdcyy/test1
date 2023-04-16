package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$21$1;

public final class GrowthTestPage$inflate$1$21 extends Lambda implements l	// class@00152c
{
    public static final GrowthTestPage$inflate$1$21 INSTANCE;

    static {
       GrowthTestPage$inflate$1$21.INSTANCE = new GrowthTestPage$inflate$1$21();
    }
    public void GrowthTestPage$inflate$1$21(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestPage$inflate$1$21.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "使用自定义设置", "KEY_EXPLORE_TAB_BUBBLE_CUSTOM_SETTINGS", null, 4, null);
       p0.n("自定义设置参数", false, GrowthTestPage$inflate$1$21$1.INSTANCE);
       return;
    }
}
