package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$f;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
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
import java.lang.Long;
import java.lang.Integer;
import wx4.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import xx4.a;
import nc6.d;

public final class TKOlympicPlayerView$f implements IMediaPlayer$OnPreparedListener	// class@000fa0
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$f(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       TKOlympicPlayerView a;
       IKwaiMediaPlayer iKwaiMediaPl;
       int videoWidth;
       TKOlympicPlayerView a1;
       IKwaiMediaPlayer iKwaiMediaPl1;
       int videoHeight;
       int videoSarNum;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$f.class, "1")) {
          return;
       }
       TKOlympicPlayerView$f tb = this.b;
       int i = 1;
       tb.c = i;
       a.o(p0, "mp");
       tb.C = p0.getVideoWidth();
       this.b.D = p0.getVideoHeight();
       tb = this.b;
       if (tb.C != null && tb.D != null) {
          TKOlympicPlayerView b = tb.B;
          if (b != null) {
             a = tb.A;
             if (a != null) {
                boolean b1 = false;
                if (b != null) {
                   if (a != null) {
                      iKwaiMediaPl = a.getIKwaiMediaPlayer();
                      if (iKwaiMediaPl != null) {
                         videoWidth = iKwaiMediaPl.getVideoWidth();
                      label_0046 :
                         a1 = this.b.A;
                         if (a1 != null) {
                            iKwaiMediaPl1 = a1.getIKwaiMediaPlayer();
                            if (iKwaiMediaPl1 != null) {
                               videoHeight = iKwaiMediaPl1.getVideoHeight();
                            label_0058 :
                               b.setVideoSize(videoWidth, videoHeight);
                            }
                         }
                         videoHeight = 0;
                         goto label_0058 ;
                      }
                   }
                   videoWidth = 0;
                   goto label_0046 ;
                }
                a = this.b.B;
                a.m(a);
                b = this.b.A;
                if (b != null) {
                   IKwaiMediaPlayer iKwaiMediaPl2 = b.getIKwaiMediaPlayer();
                   if (iKwaiMediaPl2 != null) {
                      videoSarNum = iKwaiMediaPl2.getVideoSarNum();
                   label_0074 :
                      a1 = this.b.A;
                      if (a1 != null) {
                         iKwaiMediaPl1 = a1.getIKwaiMediaPlayer();
                         if (iKwaiMediaPl1 != null) {
                            videoHeight = iKwaiMediaPl1.getVideoSarDen();
                         label_0086 :
                            a.setVideoSampleAspectRatio(videoSarNum, videoHeight);
                            tb = this.b;
                            b = tb.B;
                            Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView");
                            a = tb.A;
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
                      goto label_0086 ;
                   }
                }
                videoSarNum = 0;
                goto label_0074 ;
             }
          }
       }
       tb = this.b;
       long duration = p0.getDuration();
       TKOlympicPlayerView$f tb1 = this.b;
       a1 = tb1.C;
       TKOlympicPlayerView d = tb1.D;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(TKOlympicPlayerView.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(duration), Integer.valueOf(a1), Integer.valueOf(d), tb, TKOlympicPlayerView.class, "16")) {
          tb.u = i;
          tb.v = duration;
          tb.I.c();
          if (!PatchProxy.applyVoid(null, tb, TKOlympicPlayerView.class, "21")) {
             tb.setRepeatModifier(tb.m);
             tb.setPausedModifier(Boolean.valueOf(tb.n));
             tb.setVolumeModifier(tb.p);
             tb.setResizeModeModifier(tb.l);
             tb.setTapForDismiss(tb.y);
             tb.setPlayInBackground(tb.s);
             tb.setPreventsDisplaySleepDuringVideoPlaybackModifier(tb.o);
             tb.setProgressUpdateInterval(tb.q);
          }
          ClientEvent$UrlPackage urlPackage = u1.k();
          if (urlPackage == null) {
             urlPackage = new ClientEvent$UrlPackage();
          }
          tb.M.e(urlPackage);
          d = tb.A;
          if (d != null) {
             d uod = d.x();
             if (uod != null) {
                uod.e(tb.L);
             }
          }
       }
    label_013b :
       return;
    }
}
