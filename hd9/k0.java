package hd9.k0;
import lnc.q9;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import j8c.a;
import q87.c;
import android.view.Surface;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.widget.ImageView;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import android.widget.RelativeLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class k0 extends q9	// class@002618
{
    public final d b;

    public void k0(d p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(k0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, k0.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "B texture available", objArray);
       p1.x = new Surface(p0);
       k0 tb = this.b;
       if (tb.z != null && (tb.r2() && this.b.w != null)) {
          this.b.q.getImageView().setVisibility(8);
          this.b.r.getImageView().setVisibility(8);
          this.b.w.setSurface(this.b.x);
          if (!this.b.w.isPlaying()) {
             tb = this.b;
             tb.E2(tb.w.getCurrentPosition());
          }
       }
       this.b.r.setAlpha(0x3f800000);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, k0.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "B texture destroy", objArray);
       p0.x = null;
       return true;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "2")) {
          return;
       }
       k0 tb = this.b;
       if (tb.x != null) {
          tb.x = new Surface(p0);
          k0 tb1 = this.b;
          if (tb1.z != null && (tb1.r2() && this.b.w != null)) {
             this.b.q.getImageView().setVisibility(8);
             this.b.r.getImageView().setVisibility(8);
             this.b.w.setSurface(this.b.x);
             if (!this.b.w.isPlaying()) {
                tb1 = this.b;
                tb1.E2(tb1.w.getCurrentPosition());
             }
          }
       }
       return;
    }
}
