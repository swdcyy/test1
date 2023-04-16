package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2$2$1;
import msd.a;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$2$2$3;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$2$2 extends Lambda implements l	// class@001516
{
    public final GrowthTestPage$inflate$$inlined$apply$lambda$2 this$0;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$2$2(GrowthTestPage$inflate$$inlined$apply$lambda$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$2$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a("清除应用数据", new GrowthTestPage$inflate$$inlined$apply$lambda$2$2$1(this));
       p0.a("手机垃圾清理", new GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2(this));
       p0.a("清空免流缓存", GrowthTestPage$inflate$1$2$2$3.INSTANCE);
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$2$2.class, "1");
       return;
    }
}
