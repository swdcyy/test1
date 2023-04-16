package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$b;
import z1.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import com.kuaishou.live.lite.tempplay.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import qd3.o;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteTempPlayPresenter$b implements a	// class@000b7f
{
    public final LiveLiteTempPlayPresenter a;
    public final c b;

    public void LiveLiteTempPlayPresenter$b(LiveLiteTempPlayPresenter p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       Boolean value;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$b.class, "1")) {
       }else {
          LiveLiteTempPlayPresenter c = this.a.C;
          if (c != null) {
             LiveData liveData = c.W2();
             if (liveData != null) {
                value = liveData.getValue();
             label_0021 :
                if (a.g(value, Boolean.TRUE)) {
                   this.a.D = p0;
                   b.Z(LiveLiteLogTag.LIVE_LITE_PROFIT_INFO, "ProfitInfoAreaController isDoingEnhanceAnimation; return");
                }else {
                   a.m(p0);
                   this.b.Z2(p0);
                }
             }
          }
          value = null;
          goto label_0021 ;
       }
       return;
    }
}
