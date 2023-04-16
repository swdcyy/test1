package bc9.i$a;
import cc9.i;
import bc9.i;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.d;
import bc9.c0;
import java.util.HashMap;
import java.lang.Integer;
import cc9.p;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;

public final class i$a implements i	// class@0003ef
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          i w = this.a.w;
          p0 = p0.i().get(Integer.valueOf(this.a.W8().get()));
          Music music = null;
          if (!p0 instanceof p) {
             p0 = music;
          }
          if (p0 != null && !a.g(p0, w)) {
             this.a.w = p0;
             int b = p0.e();
             int i = 0;
             if (w == null || b != w.e()) {
                if (p0.e()) {
                   n.Y(this.a.V8(), i, i);
                }else {
                   n.Y(this.a.V8(), 8, i);
                }
             }
             Music music1 = p0.b();
             if (w != null) {
                music = w.b();
             }
             int i1 = 1;
             if (a.g(music1, music) ^ i1) {
                music1 = p0.b().mImageUrls;
                if (music1 != null) {
                   if (!music1.length) {
                      i = 1;
                   }
                   if (i == i1) {
                      this.a.S8().L(p0.b().mImageUrl);
                   }
                }
                this.a.S8().U(p0.b().mImageUrls);
             }
             b = p0.d();
             if (w == null || b != w.d()) {
                if (p0.d() >= 0) {
                   this.a.S8().setProgress((float)p0.d());
                }else {
                   this.a.S8().p0();
                }
             }
          }
       }
    label_00d4 :
       return;
    }
}
