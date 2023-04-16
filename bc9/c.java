package bc9.c;
import android.view.TextureView$SurfaceTextureListener;
import bc9.b;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.Surface;
import com.kwai.video.player.KsMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;

public final class c implements TextureView$SurfaceTextureListener	// class@0003e0
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "1")) {
          return;
       }
       a.p(p0, "surfaceTexture");
       p2 = 0;
       Object[] objArray = new Object[p2];
       a.D().s(this.b.b, "onSurfaceTextureAvailable: width="+p1+' '+"height="+p2+' ', objArray);
       c tb = this.b;
       if (tb.k == null) {
          Object[] objArray1 = new Object[p2];
          a.D().w(this.b.b, "setupPlayerSurface: is unbinded ignore this", objArray1);
          return;
       }else if(tb.x == null){
          tb.j();
       }
       this.b.y();
       tb.w = new Surface(p0);
       c tb1 = this.b;
       b x = tb1.x;
       if (x != null) {
          x.setSurface(tb1.w);
       }
       tb1 = this.b;
       if (tb1.u != null) {
          tb1.r();
       }else {
          tb1.i();
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.b.b, " onSurfaceTextureDestroyed index="+this.b.F, objArray);
       if (this.b.x != null) {
          Object[] objArray1 = new Object[i];
          a.D().A(this.b.b, "onSurfaceTextureDestroyed: mMediaPlayer is not released", objArray1);
       }
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "2")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "surface");
       b m = this.b.m;
       if (m != null) {
          a.m(m);
          if (!m.getVisibility()) {
             m = this.b.m;
             a.m(m);
             m.setVisibility(4);
          }
       }
       m = this.b.l;
       if (m != null) {
          a.m(m);
          if (!m.getVisibility()) {
             m = this.b.x;
             if (m != null) {
                a.m(m);
                if (m.isPlaying()) {
                   this.b.w(false, false);
                }
             }
          }
       }
       return;
    }
}
