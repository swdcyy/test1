package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$a;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.x0;
import qp7.b;
import kq7.k;

public final class SidebarProgressElement$a implements IMediaPlayer$OnBufferingUpdateListener	// class@0013c2
{
    public final SidebarProgressElement a;

    public void SidebarProgressElement$a(SidebarProgressElement p0){
       this.a = p0;
       super();
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       SidebarProgressElement$a uoa = SidebarProgressElement$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       this.a.E().l((int)((float)(p1 * 10000) / 100.00f));
       return;
    }
}
