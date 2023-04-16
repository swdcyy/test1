package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthTestLayoutPartImpl$inflate$1$1$3 extends Lambda implements l	// class@0014fe
{
    public static final GrowthTestLayoutPartImpl$inflate$1$1$3 INSTANCE;

    static {
       GrowthTestLayoutPartImpl$inflate$1$1$3.INSTANCE = new GrowthTestLayoutPartImpl$inflate$1$1$3();
    }
    public void GrowthTestLayoutPartImpl$inflate$1$1$3(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayoutPartImpl$inflate$1$1$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "忽略首次启动限制", "KEY_PRIVACY_BTN_TEXT_IGNORE_FIRST_LAUNCH", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "忽略实验", "KEY_PRIVACY_BTN_TEXT_IGNORE_EXP", null, 4, null);
       return;
    }
}
