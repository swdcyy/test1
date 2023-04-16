package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class BasePlayPauseElement$b implements g	// class@0013a5
{
    public final BasePlayPauseElement b;

    public void BasePlayPauseElement$b(BasePlayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayPauseElement$b.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.v0();
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, BasePlayPauseElement.class, "25")) {
                BasePlayPauseElement x = p0.x;
                String str = "mPlayModule";
                if (x == null) {
                   a.S(str);
                }
                if (x.getPlayer() != null) {
                   x = p0.x;
                   if (x == null) {
                      a.S(str);
                   }
                   e player = x.getPlayer();
                   a.o(player, "mPlayModule.player");
                   if (player.isPrepared()) {
                      x = p0.x;
                      if (x == null) {
                         a.S(str);
                      }
                      player = x.getPlayer();
                      a.o(player, "mPlayModule.player");
                      if (player.isPaused()) {
                         p0.G0(1, "PlayElementDrag", 1);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
