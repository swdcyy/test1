package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$g;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import cra.w;
import q87.c;
import java.util.Objects;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;

public final class FSVideoPresenter$g implements TextureView$SurfaceTextureListener	// class@001405
{
    public boolean b;
    public final FSVideoPresenter c;

    public void FSVideoPresenter$g(FSVideoPresenter p0){
       this.c = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       FSVideoPresenter w;
       Surface surface;
       if (PatchProxy.isSupport(FSVideoPresenter$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FSVideoPresenter$g.class, "1")) {
          return;
       }
       a.p(p0, "surface");
       Object[] objArray = new Object[0];
       w.C().w("FSVideoPresenter", "onSurfaceTextureAvailable", objArray);
       this.c.P8();
       FSVideoPresenter$g tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, FSVideoPresenter.class, "5") && p0 != null) {
          w = tc.w;
          if (w != null) {
             tc.S8();
             surface = new Surface(p0);
             tc.y = surface;
             w.setSurface(surface);
             if (tc.x != null) {
                w.start();
                tc.x = false;
             }
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, FSVideoPresenter$g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       obj = new Object[0];
       w.C().w("FSVideoPresenter", "onSurfaceTextureDestroyed", obj);
       this.c.S8();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(FSVideoPresenter$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FSVideoPresenter$g.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FSVideoPresenter$g.class, "4")) {
          return;
       }
       a.p(p0, "surface");
       if (this.b != null) {
          return;
       }
       FSVideoPresenter w = this.c.w;
       if (w != null) {
          boolean b = true;
          if (w.isVideoRenderingStart() == b) {
             Object[] objArray = new Object[0];
             w.C().w("FSVideoPresenter", "onSurfaceTextureUpdated isVideoRenderingStart", objArray);
             this.b = b;
             w = this.c.t;
             if (w != null) {
                w.setVisibility(8);
             }
          }
       }
       return;
    }
}
