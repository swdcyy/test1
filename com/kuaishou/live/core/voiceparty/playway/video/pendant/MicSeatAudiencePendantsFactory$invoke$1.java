package com.kuaishou.live.core.voiceparty.playway.video.pendant.MicSeatAudiencePendantsFactory$invoke$1;
import androidx.lifecycle.LifecycleObserver;
import mt2.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import crd.b;

public final class MicSeatAudiencePendantsFactory$invoke$1 implements LifecycleObserver	// class@0018e0
{
    public final k b;

    public void MicSeatAudiencePendantsFactory$invoke$1(k p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MicSeatAudiencePendantsFactory$invoke$1.class, "1")) {
          return;
       }
       MicSeatAudiencePendantsFactory$invoke$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, k.class, "1")) {
          k g = tb.g;
          if (g != null) {
             g.dispose();
          }
       }
       return;
    }
}
