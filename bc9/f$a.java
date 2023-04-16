package bc9.f$a;
import cc9.i;
import bc9.f;
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
import cc9.j;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class f$a implements i	// class@0003e7
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          f w = this.a.w;
          Object obj = p0.i().get(Integer.valueOf(this.a.W8().get()));
          KSTemplateDetailInfo kSTemplateDe = null;
          if (!obj instanceof j) {
             obj = kSTemplateDe;
          }
          if (obj != null) {
             if (p0.b() != this.a.W8().get()) {
                n.Y(this.a.S8(), 0, 0);
             }
             if (!a.g(obj, w)) {
                p0.w = obj;
                int b = obj.e();
                if (w == null || b != w.e()) {
                   if (obj.e()) {
                      n.Y(this.a.V8(), 0, 0);
                   }else {
                      n.Y(this.a.V8(), 8, 0);
                   }
                }
                b = obj.b();
                if (w != null) {
                   kSTemplateDe = w.b();
                }
                if (a.g(b, kSTemplateDe) ^ 0x01) {
                   b = obj.b().mIconUrls;
                   if (b != null) {
                      this.a.S8().P(b);
                   }
                }
                b = obj.c();
                if (w == null || b != w.c()) {
                   if (obj.c() >= 0) {
                      this.a.S8().setProgress((float)obj.c());
                   }else {
                      this.a.S8().p0();
                   }
                }
             }
          }
       }
    label_00d1 :
       return;
    }
}
