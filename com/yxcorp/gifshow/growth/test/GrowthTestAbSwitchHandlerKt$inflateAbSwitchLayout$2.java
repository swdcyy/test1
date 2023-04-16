package com.yxcorp.gifshow.growth.test.GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vqa.b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$b;

public final class GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2 extends Lambda implements l	// class@0014d1
{
    public static final GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2 INSTANCE;

    static {
       GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2.INSTANCE = new GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2();
    }
    public void GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.g("查询线上ABTest", b.b);
       p0.g("查询线上Switch", b.c);
       return;
    }
}
