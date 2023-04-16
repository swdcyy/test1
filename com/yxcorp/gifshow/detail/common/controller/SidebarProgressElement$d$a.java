package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d;
import java.lang.Object;
import cs7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;
import qp7.x0;
import qp7.b;
import kq7.k;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Float;
import io.reactivex.subjects.PublishSubject;

public final class SidebarProgressElement$d$a implements g	// class@0013c5
{
    public final SidebarProgressElement$d b;

    public void SidebarProgressElement$d$a(SidebarProgressElement$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$d$a.class, "1")) {
       }else if(p0.b != null && SidebarProgressElement.p0(this.b.b).getPlayer() != null){
          float f = (float)p0.a / (float)0x2710;
          SidebarProgressElement$d b = this.b.b;
          e player = SidebarProgressElement.p0(b).getPlayer();
          a.o(player, "mPlayModule.player");
          b.H = (long)((float)player.getDuration() * f);
          SidebarProgressElement$d b1 = this.b.b;
          this.b.b.E().h(b1.H, b1.L);
          this.b.b.H().B1.onNext(Float.valueOf(f));
       }
       return;
    }
}
