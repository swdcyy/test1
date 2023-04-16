package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$h;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import ss7.r;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;

public final class MusicWheelElement$h implements g	// class@0014bc
{
    public final MusicWheelElement b;

    public void MusicWheelElement$h(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicWheelElement$h.class, "1")) {
       }else if(!this.b.q0() || this.b.E().h()){
          e player = MusicWheelElement.n0(this.b).getPlayer();
          a.o(player, "mDetailPlayModule.player");
          a.o(p0, "it");
          if ((((long)100 * p0.longValue()) / player.getDuration()) - (long)70 >= 0) {
             this.b.w0();
          }
       }
       return;
    }
}
