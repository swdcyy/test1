package com.kuaishou.commercial.splash.playable.j$b;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.commercial.splash.playable.j;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yx.j0;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import gz.e5;
import android.view.ViewParent;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bz.c;
import io.reactivex.subjects.PublishSubject;

public class j$b implements TextureView$SurfaceTextureListener	// class@0015c3
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(j$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayablePopupVideoPre", "onSurfaceTextureAvailable", objArray);
       j$b tb = this.b;
       j x = tb.x;
       if (x != null) {
          SplashInfo$PlayablePopupInfo mPlayableVid = x.mPlayableVideoWidth;
          if (mPlayableVid > null) {
             SplashInfo$PlayablePopupInfo mPlayableVid1 = x.mPlayableVideoHeight;
             if (mPlayableVid1 > null) {
                j s = tb.s;
                new e5(s, mPlayableVid1, mPlayableVid, s.getParent()).a();
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "9") || (p0 != null && tb.z != null)) {
          tb.S8();
          Surface surface = new Surface(p0);
          tb.C = surface;
          tb.z.setSurface(surface);
       }
    label_006b :
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$b.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayablePopupVideoPre", "onSurfaceTextureDestroyed", objArray);
       this.b.S8();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "3")) {
          return;
       }
       j$b tb = this.b;
       if (tb.E != null) {
          return;
       }
       if (!tb.z.isPrepared() || (!this.b.z.isVideoRenderingStart() || (!this.b.z.isBuffering() && !this.b.z.isPaused()))) {
          Object[] objArray = new Object[0];
          j0.f("SplashPlayablePopupVideoPre", "onSurfaceTextureUpdated", objArray);
          this.b.r.onNext(new c(3, 0));
          tb.E = true;
       }
    label_0055 :
       return;
    }
}
