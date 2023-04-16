package hd9.j0;
import lnc.q9;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.Surface;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.widget.ImageView;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class j0 extends q9	// class@002616
{
    public final d b;

    public void j0(d p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j0.class, "1")) {
          return;
       }
       p1.y = new Surface(p0);
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "F texture available", objArray);
       j0 tb = this.b;
       if (tb.z == null && (tb.r2() && this.b.w != null)) {
          this.b.q.getImageView().setVisibility(8);
          this.b.r.getImageView().setVisibility(8);
          this.b.w.setSurface(this.b.y);
          if (!this.b.w.isPlaying()) {
             tb = this.b;
             tb.E2(tb.w.getCurrentPosition());
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j0.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "F texture destroy", objArray);
       p0.y = null;
       return true;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       j0 tb = this.b;
       if (tb.y == null) {
          tb.y = new Surface(p0);
          Object[] objArray = new Object[0];
          a.D().A("UseSampleController", "F texture available", objArray);
          j0 tb1 = this.b;
          if (tb1.z == null && (tb1.r2() && this.b.w != null)) {
             this.b.q.getImageView().setVisibility(8);
             this.b.r.getImageView().setVisibility(8);
             this.b.w.setSurface(this.b.y);
             if (!this.b.w.isPlaying()) {
                tb1 = this.b;
                tb1.E2(tb1.w.getCurrentPosition());
             }
          }
       }
       return;
    }
}
