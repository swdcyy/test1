package com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter$a;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.activity.web.presenter.WebFullScreenVideoPresenter;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import tra.b;
import q87.c;
import java.util.Objects;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;

public class WebFullScreenVideoPresenter$a implements TextureView$SurfaceTextureListener	// class@0014c2
{
    public boolean b;
    public final WebFullScreenVideoPresenter c;

    public void WebFullScreenVideoPresenter$a(WebFullScreenVideoPresenter p0){
       this.c = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(WebFullScreenVideoPresenter$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, WebFullScreenVideoPresenter$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("WebFullScreenVideoPresenter", "onSurfaceTextureAvailable", objArray);
       this.c.P8();
       WebFullScreenVideoPresenter$a tc = this.c;
       Objects.requireNonNull(tc);
       if (PatchProxy.applyVoidOneRefs(p0, tc, WebFullScreenVideoPresenter.class, "10") || (p0 != null && tc.x != null)) {
          tc.Y8();
          Surface surface = new Surface(p0);
          tc.w = surface;
          tc.x.setSurface(surface);
          if (tc.y != null) {
             tc.x.start();
             tc.y = false;
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, WebFullScreenVideoPresenter$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = new Object[0];
       b.C().w("WebFullScreenVideoPresenter", "onSurfaceTextureDestroyed", objArray);
       this.c.Y8();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebFullScreenVideoPresenter$a.class, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       if (this.c.x.isVideoRenderingStart()) {
          Object[] objArray = new Object[0];
          b.C().w("WebFullScreenVideoPresenter", "onSurfaceTextureUpdated isVideoRenderingStart", objArray);
          this.b = true;
          this.c.u.setVisibility(8);
       }
       return;
    }
}
