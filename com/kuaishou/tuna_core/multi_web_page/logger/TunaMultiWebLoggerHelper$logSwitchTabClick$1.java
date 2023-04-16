package com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$logSwitchTabClick$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import android.app.Activity;
import java.lang.Object;
import g05.a;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;

public final class TunaMultiWebLoggerHelper$logSwitchTabClick$1 extends Lambda implements l	// class@0010eb
{
    public final String $active;
    public final Activity $aty;
    public final TunaMultiWebConfigInfo$TabInfo $tabInfo;

    public void TunaMultiWebLoggerHelper$logSwitchTabClick$1(String p0,TunaMultiWebConfigInfo$TabInfo p1,Activity p2){
       this.$active = p0;
       this.$tabInfo = p1;
       this.$aty = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebLoggerHelper$logSwitchTabClick$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       Pair[] pairArray = new Pair[2];
       pairArray[0] = new Pair("switch_type", this.$active);
       int i = 1;
       TunaMultiWebConfigInfo$TabInfo actionLogNam = this.$tabInfo.actionLogName;
       if (actionLogNam == null) {
          actionLogNam = "";
       }
       pairArray[i] = new Pair("tab_name", actionLogNam);
       p0.d(t0.W(pairArray));
       TunaMultiWebLoggerHelper$logSwitchTabClick$1 t$aty = this.$aty;
       if (t$aty instanceof GifshowActivity) {
          p0.b(t$aty);
       }
       return;
    }
}
