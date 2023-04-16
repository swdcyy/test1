package com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$logRuleButtonClick$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.Object;
import g05.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;

public final class TunaMultiWebLoggerHelper$logRuleButtonClick$1 extends Lambda implements l	// class@0010ea
{
    public final Activity $aty;

    public void TunaMultiWebLoggerHelper$logRuleButtonClick$1(Activity p0){
       this.$aty = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebLoggerHelper$logRuleButtonClick$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       TunaMultiWebLoggerHelper$logRuleButtonClick$1 t$aty = this.$aty;
       if (t$aty instanceof GifshowActivity) {
          p0.b(t$aty);
       }
       return;
    }
}
