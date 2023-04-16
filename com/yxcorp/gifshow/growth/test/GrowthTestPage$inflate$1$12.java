package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$12;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$12$1;
import msd.a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$12$2;

public final class GrowthTestPage$inflate$1$12 extends Lambda implements l	// class@001521
{
    public static final GrowthTestPage$inflate$1$12 INSTANCE;

    static {
       GrowthTestPage$inflate$1$12.INSTANCE = new GrowthTestPage$inflate$1$12();
    }
    public void GrowthTestPage$inflate$1$12(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestPage$inflate$1$12.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a("清除滚动动画标记", GrowthTestPage$inflate$1$12$1.INSTANCE);
       p0.a("拉起vfc弹窗", GrowthTestPage$inflate$1$12$2.INSTANCE);
       return;
    }
}
