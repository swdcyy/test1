package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$e;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import x14.b;
import sp5.b;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerController;

public final class LivePendantRightArea$e implements IMediaPlayer$OnVideoSizeChangedListener	// class@0018a7
{
    public final LivePendantRightArea b;

    public void LivePendantRightArea$e(LivePendantRightArea p0){
       this.b = p0;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(LivePendantRightArea$e.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LivePendantRightArea$e.class, "1")) {
             return;
          }
       }
       if (this.b.b().size() > 0) {
          LivePendantRightArea$e tb = this.b;
          LivePendantRightArea g = tb.g;
          if (g.a != p1 || g.b != p2) {
             i = 1;
          }
          if (i) {
             boolean b = tb.w();
             LivePendantRightArea$e tb1 = this.b;
             if ((b ^ 0x01) != tb1.h) {
                tb1.B(b, "videoSizeChanged");
             }
          }
          tb = this.b;
          LivePendantRightArea f = tb.F;
          a.m(f);
          p1.a = f.getVideoWidth();
          tb = this.b;
          p1.b = tb.F.getVideoHeight();
       }
       return;
    }
}
