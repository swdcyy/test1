package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;

public final class BasePlayPauseElement$c implements g	// class@0013a6
{
    public final BasePlayPauseElement b;

    public void BasePlayPauseElement$c(BasePlayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayPauseElement$c.class, "1")) {
       }else if(this.b.s0().getPlayer() != null){
          p0 = this.b.s0().getPlayer();
          String str = "mPlayModule.player";
          a.o(p0, str);
          if (p0.isPrepared()) {
             p0 = this.b.s0().getPlayer();
             a.o(p0, str);
             if (p0.isPaused()) {
                this.b.G0(1, "PlayElementClick", 1);
             }else {
                this.b.E0(1, "PlayElementClick");
             }
          }
       }
       if (this.b.w0() && this.b.p0()) {
          this.b.y0();
       }
       return;
    }
}
