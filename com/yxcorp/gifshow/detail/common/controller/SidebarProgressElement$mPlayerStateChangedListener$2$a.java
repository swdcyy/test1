package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mPlayerStateChangedListener$2$a;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mPlayerStateChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.x0;
import qp7.b;
import kq7.k;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.e;
import de5.a;
import p5a.b;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;

public final class SidebarProgressElement$mPlayerStateChangedListener$2$a implements b$b	// class@0013d1
{
    public final SidebarProgressElement$mPlayerStateChangedListener$2 b;

    public void SidebarProgressElement$mPlayerStateChangedListener$2$a(SidebarProgressElement$mPlayerStateChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       SidebarProgressElement$mPlayerStateChangedListener$2 this$0;
       SidebarProgressElement$mPlayerStateChangedListener$2$a omPlayerStat = SidebarProgressElement$mPlayerStateChangedListener$2$a.class;
       if (PatchProxy.isSupport(omPlayerStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omPlayerStat, "1")) {
          return;
       }
       if (p0 != 2) {
          if (p0 != 3) {
             if (p0 == 4) {
                this.b.this$0.E().i(false);
             }
          }else {
             this$0 = this.b.this$0;
             this$0.K = true;
             this$0.E().i(true);
          }
       }else {
          this$0 = this.b.this$0;
          Objects.requireNonNull(this$0);
          SidebarProgressElement sidebarProgr = SidebarProgressElement.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this$0, sidebarProgr, "6")) {
             this$0.x0();
             if (!PatchProxy.applyVoid(objArray, this$0, sidebarProgr, "7")) {
                sidebarProgr = this$0.t;
                String str = "mPhoto";
                if (sidebarProgr == null) {
                   a.S(str);
                }
                if (sidebarProgr.isVideoType()) {
                   sidebarProgr = this$0.u;
                   if (sidebarProgr == null) {
                      a.S("mPlayModule");
                   }
                   if (sidebarProgr.getPlayer() != null) {
                      sidebarProgr = this$0.t;
                      if (sidebarProgr == null) {
                         a.S(str);
                      }
                      if (b.i(sidebarProgr)) {
                         sidebarProgr = this$0.t;
                         if (sidebarProgr == null) {
                            a.S(str);
                         }
                         if (!b.h(sidebarProgr)) {
                            sidebarProgr = this$0.u;
                            if (sidebarProgr == null) {
                               a.S("mPlayModule");
                            }
                            sidebarProgr.getPlayer().addAwesomeCallBack(this$0.S);
                         }
                      }
                      sidebarProgr = this$0.u;
                      if (sidebarProgr == null) {
                         a.S("mPlayModule");
                      }
                      sidebarProgr.getPlayer().addOnBufferingUpdateListener(this$0.T);
                   }
                }
             }
          label_00ba :
             this$0.K = true;
          }
       }
       return;
    }
}
