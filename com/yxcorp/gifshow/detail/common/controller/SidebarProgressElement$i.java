package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$i;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;
import java.util.Objects;
import java.lang.Integer;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import kq7.k;

public final class SidebarProgressElement$i implements g	// class@0013cd
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$i(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a uoa;
       SidebarProgressElement t;
       SidebarProgressElement sidebarProgr = SidebarProgressElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$i.class, "1")) {
       }else if(SidebarProgressElement.p0(this.b).getPlayer() != null){
          p0 = SidebarProgressElement.p0(this.b).getPlayer();
          String str = "mPlayModule.player";
          a.o(p0, str);
          if (p0.isPrepared()) {
             p0 = SidebarProgressElement.p0(this.b).getPlayer();
             a.o(p0, str);
             str = "mPhoto";
             if (p0.isPaused()) {
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.isSupport(sidebarProgr) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), p0, sidebarProgr, "13")) {
                   uoa = a.d();
                   t = p0.t;
                   if (t == null) {
                      a.S(str);
                   }
                   uoa.k(new PlayEvent(t, PlayEvent$Status.RESUME, 1));
                   p0.E().i(1);
                }
             }else {
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.isSupport(sidebarProgr) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), p0, sidebarProgr, "12")) {
                   uoa = a.d();
                   t = p0.t;
                   if (t == null) {
                      a.S(str);
                   }
                   uoa.k(new PlayEvent(t, PlayEvent$Status.PAUSE, 1, "SidebarProgressElement"));
                   p0.E().i(false);
                }
             }
          }
       }
       return;
    }
}
