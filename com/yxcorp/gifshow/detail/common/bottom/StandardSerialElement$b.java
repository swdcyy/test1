package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n8a.a;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.System;
import uw9.o;
import q87.c;

public final class StandardSerialElement$b implements g	// class@00139a
{
    public final StandardSerialElement b;

    public void StandardSerialElement$b(StandardSerialElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, StandardSerialElement$b.class, "1")) {
       }else if(this.b.t0() != null){
          StandardSerialElement h = this.b.H;
          if (h == null) {
             a.S("mPlayModule");
          }
          e player = h.getPlayer();
          a.o(player, "mPlayModule.player");
          long duration = player.getDuration();
          if ((System.currentTimeMillis() - this.b.G) - 3000 >= 0) {
             a.o(p0, "currentPosition");
             if ((duration - p0.longValue()) - 0x2710 <= 0 && (!this.b.v0() && this.b.y == null)) {
                Object[] objArray = new Object[0];
                o.C().w("NasaSerialAutoPlayPageList", "preloadEpisode when < 10s", objArray);
                p0.G = System.currentTimeMillis();
                p0 = this.b.t0();
                if (p0 != null) {
                   p0.d();
                }
             }
          }
       }
    label_007b :
       PatchProxy.onMethodExit(StandardSerialElement$b.class, "1");
       return;
    }
}
