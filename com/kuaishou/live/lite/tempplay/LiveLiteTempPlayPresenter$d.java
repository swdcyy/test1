package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import com.kuaishou.live.lite.tempplay.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.util.List;

public final class LiveLiteTempPlayPresenter$d implements Observer	// class@000b81
{
    public final LiveLiteTempPlayPresenter b;
    public final c c;

    public void LiveLiteTempPlayPresenter$d(LiveLiteTempPlayPresenter p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$d.class, "1")) {
       }else {
          b.c0(LiveLiteLogTag.LIVE_LITE_PROFIT_INFO, "ProfitInfoAreaController, isDoingEnhanceAnimation changed", "isDoingAnimation", p0);
          if (!p0.booleanValue()) {
             p0 = this.b.D;
             if (p0 != null) {
                a.m(p0);
                this.c.Z2(p0);
                p0.D = null;
             }
          }
       }
       return;
    }
}
