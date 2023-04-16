package com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$1$a;
import ai7.e;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$1;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import ug5.b;
import yb6.d;
import wx4.c;
import xx6.k;
import java.util.Objects;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger$onLogVes$1;
import msd.a;

public final class StargateEggPlayerView$releasePlayer$1$a implements e	// class@000b60
{
    public final StargateEggPlayerView$releasePlayer$1 a;

    public void StargateEggPlayerView$releasePlayer$1$a(StargateEggPlayerView$releasePlayer$1 p0){
       this.a = p0;
       super();
    }
    public final void onRelease(KwaiPlayerResultQos p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, StargateEggPlayerView$releasePlayer$1$a.class, "1")) {
          return;
       }
       b.b("TKOlympicPlayer", obj.a.this$0.P+"  mediaPlayer released async.\n");
       long l = d.a() - obj.a.this$0.I.b();
       StargateEggPlayerView$releasePlayer$1 this$0 = obj.a.this$0;
       StargateEggPlayerView r = this$0.R;
       StargateEggPlayerView v = this$0.v;
       long l1 = 0;
       if (this$0.N.e() - l1 > 0) {
          l1 = obj.a.this$0.N.e();
       }
       this$0 = obj.a.this$0;
       StargateEggPlayerView p = this$0.P;
       StargateEggPlayerView f = this$0.f;
       StargateEggPlayerView q = this$0.Q;
       Objects.requireNonNull(r);
       StargatePlayerLogger stargatePlay = StargatePlayerLogger.class;
       if (PatchProxy.isSupport(stargatePlay)) {
          Object[] objArray = new Object[]{obj1,Long.valueOf(v),Long.valueOf(l),Long.valueOf(l1),p,f,Integer.valueOf(q)};
          if (!PatchProxy.applyVoid(objArray, r, stargatePlay, "4")) {
          label_00a0 :
             a.p(p, "bizType");
             a.p(f, "uri");
             if (obj1 != null && r.a != null) {
                StargatePlayerLogger$onLogVes$1 oonLogVes$1 = new StargatePlayerLogger$onLogVes$1(r, p0, v, l, l1, p, f, q);
                r.a(v14);
             }
          }
       }else {
          goto label_00a0 ;
       }
       return;
    }
}
