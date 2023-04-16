package com.kwai.component.stargateegg.view.StargateEggPlayerView$f;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import wx4.a;
import java.util.Objects;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import android.view.TextureView;
import wx4.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;
import nc6.d;
import wg5.a;

public final class StargateEggPlayerView$f implements IMediaPlayer$OnPreparedListener	// class@000b56
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$f(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       StargateEggPlayerView b;
       StargateEggPlayerView a;
       IKwaiMediaPlayer iKwaiMediaPl;
       int videoWidth;
       StargateEggPlayerView a1;
       IKwaiMediaPlayer iKwaiMediaPl1;
       int videoHeight;
       int videoSarNum;
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$f.class, "1")) {
          return;
       }
       StargateEggPlayerView$f tb = this.b;
       int i = 1;
       tb.c = i;
       a.o(p0, "mp");
       tb.C = p0.getVideoWidth();
       this.b.D = p0.getVideoHeight();
       this.b.v = p0.getDuration();
       StargateEggPlayerView$f tb1 = this.b;
       if (tb1.C != null && tb1.D != null) {
          b = tb1.B;
          if (b != null) {
             a = tb1.A;
             if (a != null) {
                boolean b1 = false;
                if (b != null) {
                   if (a != null) {
                      iKwaiMediaPl = a.getIKwaiMediaPlayer();
                      if (iKwaiMediaPl != null) {
                         videoWidth = iKwaiMediaPl.getVideoWidth();
                      label_004e :
                         a1 = this.b.A;
                         if (a1 != null) {
                            iKwaiMediaPl1 = a1.getIKwaiMediaPlayer();
                            if (iKwaiMediaPl1 != null) {
                               videoHeight = iKwaiMediaPl1.getVideoHeight();
                            label_0060 :
                               b.setVideoSize(videoWidth, videoHeight);
                            }
                         }
                         videoHeight = 0;
                         goto label_0060 ;
                      }
                   }
                   videoWidth = 0;
                   goto label_004e ;
                }
                a = this.b.B;
                a.m(a);
                b = this.b.A;
                if (b != null) {
                   IKwaiMediaPlayer iKwaiMediaPl2 = b.getIKwaiMediaPlayer();
                   if (iKwaiMediaPl2 != null) {
                      videoSarNum = iKwaiMediaPl2.getVideoSarNum();
                   label_007c :
                      a1 = this.b.A;
                      if (a1 != null) {
                         iKwaiMediaPl1 = a1.getIKwaiMediaPlayer();
                         if (iKwaiMediaPl1 != null) {
                            videoHeight = iKwaiMediaPl1.getVideoSarDen();
                         label_008e :
                            a.setVideoSampleAspectRatio(videoSarNum, videoHeight);
                            tb1 = this.b;
                            b = tb1.B;
                            Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView");
                            a = tb1.A;
                            if (a != null) {
                               iKwaiMediaPl = a.getIKwaiMediaPlayer();
                               if (iKwaiMediaPl != null && !iKwaiMediaPl.getVideoAlphaType()) {
                                  b1 = true;
                               }
                            }
                            b.setOpaque(b1);
                         }
                      }
                      videoHeight = 0;
                      goto label_008e ;
                   }
                }
                videoSarNum = 0;
                goto label_007c ;
             }
          }
       }
       tb1 = this.b;
       Objects.requireNonNull(tb1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb1, StargateEggPlayerView.class, "13")) {
          tb1.u = i;
          tb1.I.c();
          if (!PatchProxy.applyVoid(objArray, tb1, StargateEggPlayerView.class, "19")) {
             if (tb1.O != null) {
                tb1.setPausedModifier(Boolean.valueOf(tb1.n));
             }
             tb1.setVolumeModifier(tb1.p);
             tb1.setResizeModeModifier(tb1.l);
             tb1.setTapForDismiss(tb1.y);
             tb1.setPlayInBackground(tb1.s);
             tb1.setPreventsDisplaySleepDuringVideoPlaybackModifier(tb1.o);
          }
          ClientEvent$UrlPackage urlPackage = u1.k();
          if (urlPackage == null) {
             urlPackage = new ClientEvent$UrlPackage();
          }
          StargateEggPlayerView r = tb1.R;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidOneRefs(urlPackage, r, StargatePlayerLogger.class, "2")) {
             r.b = urlPackage;
          }
          b = tb1.A;
          if (b != null) {
             d uod = b.x();
             if (uod != null) {
                uod.e(tb1.Q);
             }
          }
          a = tb1.W;
          if (a != null) {
             a.onPrepared();
          }
       }
       return;
    }
}
