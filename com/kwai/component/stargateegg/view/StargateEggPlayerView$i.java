package com.kwai.component.stargateegg.view.StargateEggPlayerView$i;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import wx4.a;

public final class StargateEggPlayerView$i implements IMediaPlayer$OnVideoSizeChangedListener	// class@000b59
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$i(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       StargateEggPlayerView a;
       IKwaiMediaPlayer iKwaiMediaPl;
       int i = 0;
       if (PatchProxy.isSupport(StargateEggPlayerView$i.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, StargateEggPlayerView$i.class, "1")) {
             return;
          }
       }
       a.o(p0, "mp");
       p1.C = p0.getVideoWidth();
       p1.D = p0.getVideoHeight();
       StargateEggPlayerView$i tb = this.b;
       if (tb.C != null && tb.D != null) {
          StargateEggPlayerView b = tb.B;
          if (b != null) {
             a = tb.A;
             if (a != null) {
                if (b != null) {
                   if (a != null) {
                      iKwaiMediaPl = a.getIKwaiMediaPlayer();
                      if (iKwaiMediaPl != null) {
                         iKwaiMediaPl = iKwaiMediaPl.getVideoWidth();
                      label_006a :
                         StargateEggPlayerView a1 = this.b.A;
                         if (a1 != null) {
                            IKwaiMediaPlayer iKwaiMediaPl1 = a1.getIKwaiMediaPlayer();
                            if (iKwaiMediaPl1 != null) {
                               i = iKwaiMediaPl1.getVideoHeight();
                            }
                         }
                         b.setVideoSize(iKwaiMediaPl, i);
                      }
                   }
                   iKwaiMediaPl = 0;
                   goto label_006a ;
                }
                a = this.b.B;
                if (a != null) {
                   a.setVideoSampleAspectRatio(p0.getVideoSarNum(), p0.getVideoSarDen());
                }
             }
          }
          this.b.requestLayout();
       }
       return;
    }
}
