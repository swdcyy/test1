package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vqa.n;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$1;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$5 extends Lambda implements l	// class@00151a
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$5(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$5.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$5 t$context$in = this.$context$inlined;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$context$in, null, n.class, "1")) {
          a.p(p0, "$this$inflateLoginLayout");
          a.p(t$context$in, "context");
          p0.n("»¶Ó­»ØÀ´-µÇÂ¼µ¯´°", false, GrowthTestLoginLayoutKt$inflateLoginLayout$1.INSTANCE);
          p0.n("Ò»¼üµÇÂ¼&Ò»¼üÑéÖ¤", false, new GrowthTestLoginLayoutKt$inflateLoginLayout$2(t$context$in));
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$5.class, "1");
       return;
    }
}
