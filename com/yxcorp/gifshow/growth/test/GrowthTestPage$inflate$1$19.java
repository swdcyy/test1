package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$19;
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

public final class GrowthTestPage$inflate$1$19 extends Lambda implements l	// class@001526
{
    public static final GrowthTestPage$inflate$1$19 INSTANCE;

    static {
       GrowthTestPage$inflate$1$19.INSTANCE = new GrowthTestPage$inflate$1$19();
    }
    public void GrowthTestPage$inflate$1$19(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestPage$inflate$1$19.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "不限频控", "KEY_KPOP_NO_COUNT_LIMIT", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "不限降级", "KEY_KPOP_NO_DEMOTE_LIMIT", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "展示测试信息", "KEY_KPOP_SHOW_DEBUG_INFO", null, 4, null);
       return;
    }
}
