package l09.d$g;
import android.view.TextureView$SurfaceTextureListener;
import l09.d;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import yx.j0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import gz.e5;
import android.view.ViewParent;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.View;
import android.view.Surface;
import com.kwai.framework.player.core.b;
import java.lang.Boolean;

public final class d$g implements TextureView$SurfaceTextureListener	// class@002c69
{
    public final d b;

    public void d$g(d p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       Surface surface;
       d uod = d.class;
       if (PatchProxy.isSupport(d$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$g.class, "1")) {
          return;
       }
       a.p(p0, "surface");
       Object[] objArray = new Object[0];
       j0.f("PopPlayVideoPresenter", "onSurfaceTextureAvailable", objArray);
       this.b.W8();
       d$g tb = this.b;
       Objects.requireNonNull(tb);
       d uod1 = PatchProxy.apply(null, tb, uod, "3");
       if (uod1 != PatchProxyResult.class) {
       }else {
          uod1 = tb.p;
          if (uod1 == null) {
             a.S("mEntity");
          }
       }
       PhotoAdvertisement$PopPlayInfo popPlayInfo = c.E(uod1);
       if (popPlayInfo != null) {
          popPlayInfo = popPlayInfo.mPopShowVideoInfo;
          if (popPlayInfo != null) {
             uod1 = this.b.r;
             if (uod1 != null) {
                PhotoAdvertisement$PopShowVideoInfo mVideoWidth = popPlayInfo.mVideoWidth;
                if (mVideoWidth > null) {
                   PhotoAdvertisement$PopShowVideoInfo mVideoHeight = popPlayInfo.mVideoHeight;
                   if (mVideoHeight > null) {
                      ViewParent parent = uod1.getParent();
                      Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                      new e5(uod1, mVideoHeight, mVideoWidth, parent).a();
                   }
                }
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, uod, "11") && p0 != null) {
                   uod1 = tb.s;
                   if (uod1 != null) {
                      tb.V8();
                      surface = new Surface(p0);
                      tb.v = surface;
                      uod1.setSurface(surface);
                   }
                }
             }
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       Object[] objArray = new Object[0];
       j0.f("PopPlayVideoPresenter", "onSurfaceTextureDestroyed", objArray);
       this.b.V8();
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(d$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$g.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$g.class, "3")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
}
