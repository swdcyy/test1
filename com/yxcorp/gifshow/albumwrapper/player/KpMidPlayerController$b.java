package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$b;
import erd.g;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.preview.a;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout;

public final class KpMidPlayerController$b implements g	// class@001b73
{
    public final KpMidPlayerController b;
    public final Runnable c;

    public void KpMidPlayerController$b(KpMidPlayerController p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$b.class, "1")) {
       }else {
          p0 = this.b.a;
          a.o(p0, "mPlayerContainer");
          p0.setVisibility(0);
          this.b.j();
          p0 = this.c;
          if (p0 != null) {
             p0.run();
          }
       }
       return;
    }
}
