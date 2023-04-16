package com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthTestLoginLayoutKt$inflateLoginLayout$1 extends Lambda implements l	// class@001502
{
    public static final GrowthTestLoginLayoutKt$inflateLoginLayout$1 INSTANCE;

    static {
       GrowthTestLoginLayoutKt$inflateLoginLayout$1.INSTANCE = new GrowthTestLoginLayoutKt$inflateLoginLayout$1();
    }
    public void GrowthTestLoginLayoutKt$inflateLoginLayout$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLoginLayoutKt$inflateLoginLayout$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "不限制登录弹窗出现次数", "KEY_STOP_LIMIT_DIALOG_TIMES", null, 4, null);
       return;
    }
}
