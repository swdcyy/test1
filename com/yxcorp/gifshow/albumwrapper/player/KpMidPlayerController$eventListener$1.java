package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$a;
import z1.a;
import com.yxcorp.gifshow.album.widget.preview.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.widget.ImageView;
import gp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.wayne.player.main.PlayerState;
import a89.a;
import java.lang.Enum;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.lang.Long;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$b;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$onStateChanged$6;
import a89.c;
import msd.l;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$onStateChanged$3;
import java.util.Objects;
import ekd.y0;
import a89.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$onStateChanged$2;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$onStateChanged$1;
import android.view.ViewParent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public final class KpMidPlayerController$eventListener$1 implements IMediaPlayer$OnErrorListener, OnPlayerStateChangedListener, IMediaPlayer$OnVideoSizeChangedListener, IMediaPlayer$OnInfoListener	// class@001b7c
{
    public final KpMidPlayerController b;

    public void KpMidPlayerController$eventListener$1(KpMidPlayerController p0){
       this.b = p0;
       super();
    }
    public boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KpMidPlayerController$eventListener$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KpMidPlayerController$eventListener$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b.a(new KpMidPlayerController$eventListener$1$a(p0, p1, p2));
       return true;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(KpMidPlayerController$eventListener$1.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KpMidPlayerController$eventListener$1.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 3) {
          a a = this.b.a;
          String str = "mPlayerContainer";
          a.o(a, str);
          if (a.getCoverView() != null) {
             a = this.b.a;
             a.o(a, str);
             CompatImageView coverView = a.getCoverView();
             a.o(coverView, "mPlayerContainer.coverView");
             if (coverView.isShown()) {
                Object[] objArray = new Object[0];
                a.C().s(this.b.d, "player on first frame render, hide cover "+this, objArray);
                a = this.b.a;
                a.o(a, str);
                coverView = a.getCoverView();
                a.o(coverView, "mPlayerContainer.coverView");
                coverView.setVisibility(8);
             }
          }
       }
       return true;
    }
    public void onStateChanged(PlayerState p0){
       KpMidPlayerController$eventListener$1 tb;
       c uoc;
       KpMidPlayerController$eventListener$1$onStateChanged$1 uoeventListe1;
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$eventListener$1.class, "2")) {
          return;
       }
       a.p(p0, "state");
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s(this.b.d, "onStateChanged\(\) called with: state = ["+p0+']', objArray);
       KpMidPlayerController$eventListener$1$onStateChanged$1 uoeventListe = null;
       switch (a.a[p0.ordinal()]){
           case 3:
             tb = this.b;
             uoeventListe = KpMidPlayerController$eventListener$1$onStateChanged$1.INSTANCE;
             if (uoeventListe != null) {
                uoc = new c(uoeventListe);
             }
             tb.a(uoc);
             break;
           case 4:
             this.b.s();
             tb = this.b;
             KpMidPlayerController$eventListener$1$onStateChanged$2 iNSTANCE = KpMidPlayerController$eventListener$1$onStateChanged$2.INSTANCE;
             if (iNSTANCE != null) {
                iNSTANCE = new c(iNSTANCE);
             }
             tb.a(iNSTANCE);
             break;
           case 5:
             this.b.s();
             break;
           case 6:
             this.b.s();
             break;
           case 7:
             tb = this.b;
             KpMidPlayerController$eventListener$1$onStateChanged$3 iNSTANCE1 = KpMidPlayerController$eventListener$1$onStateChanged$3.INSTANCE;
             if (iNSTANCE1 != null) {
                iNSTANCE1 = new c(iNSTANCE1);
             }
             tb.a(iNSTANCE1);
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(uoeventListe, tb, KpMidPlayerController.class, "14")) {
                Object[] objArray1 = new Object[i];
                a.C().s(tb.d, "startProgressSchedule\(\) called mProgressUpdateHandler="+tb.g, objArray1);
                if (tb.g == null) {
                   tb.g = new y0(33, new b(tb));
                }
                KpMidPlayerController g = tb.g;
                if (g != null) {
                   g.d();
                }
             }
             break;
           case 8:
             a uoa = a.C();
             KpMidPlayerController d = this.b.d;
             StringBuilder str = "state=Completion currentPosition=";
             KpMidPlayerController e = this.b.e;
             Long longx = (e != null)? Long.valueOf(e.getCurrentPosition()): uoeventListe;
             str = str+longx+",duration=";
             e = this.b.e;
             longx = (e != null)? Long.valueOf(e.getDuration()): uoeventListe;
             str = str+longx+",calcPosition=";
             e = this.b.e;
             if (e != null) {
                uoeventListe = Long.valueOf((e.getLastVideoPts() - e.getFirstVideoPts()));
             }
             Object[] objArray2 = new Object[i];
             uoa.s(d, str+uoeventListe, objArray2);
             this.b.a(new KpMidPlayerController$eventListener$1$b(this));
             this.b.s();
             tb = this.b;
             KpMidPlayerController$eventListener$1$onStateChanged$6 iNSTANCE2 = KpMidPlayerController$eventListener$1$onStateChanged$6.INSTANCE;
             if (iNSTANCE2 != null) {
                iNSTANCE2 = new c(iNSTANCE2);
             }
             tb.a(iNSTANCE2);
             break;
           default:
       }
    label_0152 :
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       KpMidPlayerController$eventListener$1 uoeventListe = KpMidPlayerController$eventListener$1.class;
       if (PatchProxy.isSupport(uoeventListe)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoeventListe, "3")) {
             return;
          }
       }
       KpMidPlayerController f = this.b.f;
       if (f != null) {
          ViewParent parent = f.getParent();
          if (!parent instanceof View) {
             parent = null;
          }
          if (parent != null && (parent.getWidth() > 0 && (parent.getHeight() > 0 && (p1 > 0 && p2 > 0)))) {
             if ((parent.getWidth() * p2) > (parent.getHeight() * p1)) {
                p4 = parent.getHeight();
                parent = (parent.getHeight() * p1) / p2;
             }else {
                parent = parent.getWidth();
                p4 = (parent.getWidth() * p2) / p1;
             }
             if (p4 != f.getHeight() || parent != f.getWidth()) {
                ViewGroup$LayoutParams layoutParams = f.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.width = parent;
                }
                if (layoutParams) {
                   layoutParams.height = p4;
                }
                f.setLayoutParams(layoutParams);
             }
          }
       }
    label_0099 :
       return;
    }
}
