package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$k;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ac3.b;
import java.lang.Enum;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$StreamPlay;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$StreamStop;
import ut7.e;

public final class LiveBaseLongConnectionManager$k implements LivePlayerStateChangeListener	// class@000a1d
{
    public final LiveBaseLongConnectionManager b;

    public void LiveBaseLongConnectionManager$k(LiveBaseLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$k.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = b.a[p0.ordinal()];
       b = true;
       if (i != b && i != 2) {
          b = false;
       }
       if (this.b.N().b() != b) {
          i.c = b;
          LiveBaseLongConnectionManager$k tb = this.b;
          LiveBaseLongConnectionManager$StreamPlay streamPlay = (b)? new LiveBaseLongConnectionManager$StreamPlay(): new LiveBaseLongConnectionManager$StreamStop();
          tb.M1(streamPlay);
       }
       return;
    }
}
