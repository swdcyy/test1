package com.kuaishou.live.audience.component.gift.gift.audience.v2.k$c;
import ds5.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.activity.x;
import com.kwai.framework.model.user.UserInfo;
import mk1.b;
import e92.a;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Throwable;

public class k$c implements c	// class@000b20
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
          return;
       }
       k$c tb = this.b;
       k w = tb.w;
       if (w.o != null) {
          k k = tb.K;
          if (k != null && (k.mOpenPanelType == 2 && w.R().v0())) {
             tb = this.b;
             tb.K.mOpenPanelType = 0;
             tb.V8(a.c(null, -1, tb.w));
          label_0044 :
             return;
          }
       }
       tb = this.b;
       tb.O.postDelayed(tb.P, 10);
       goto label_0044 ;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
