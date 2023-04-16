package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mOnInfoListener$2$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$mOnInfoListener$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class SidebarProgressElement$mOnInfoListener$2$a implements IMediaPlayer$OnInfoListener	// class@0013cf
{
    public final SidebarProgressElement$mOnInfoListener$2 b;

    public void SidebarProgressElement$mOnInfoListener$2$a(SidebarProgressElement$mOnInfoListener$2 p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(SidebarProgressElement$mOnInfoListener$2$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SidebarProgressElement$mOnInfoListener$2$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          PhotoDetailLogger photoDetailL = SidebarProgressElement.o0(this.b.this$0).get();
          if (photoDetailL != null) {
             photoDetailL.putBizParam("video_over_judge", "TRUE");
          }
       }
       return false;
    }
}
