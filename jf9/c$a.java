package jf9.c$a;
import kf9.b;
import jf9.c;
import java.lang.Object;
import kf9.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.d;
import jf9.a;
import java.util.HashMap;
import java.lang.Integer;
import kf9.e;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import s0d.f;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import vb5.c;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import qrd.l1;
import jd.c;
import s0d.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class c$a implements b	// class@002a7a
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          c u = this.a.u;
          p0 = p0.g().get(Integer.valueOf(this.a.V8().get()));
          Object[] objArray = null;
          if (!p0 instanceof e) {
             p0 = objArray;
          }
          if (p0 != null && !a.g(p0, u)) {
             this.a.u = p0;
             int b = p0.e();
             c$a uoa = 8;
             if (u == null || b != u.e()) {
                int i = 0;
                if (p0.e()) {
                   n.Y(this.a.S8(), i, i);
                }else {
                   n.Y(this.a.S8(), uoa, i);
                }
             }
             MagicEmoji$MagicFace magicFace = p0.c();
             MagicEmoji$MagicFace magicFace1 = (u != null)? u.c(): objArray;
             if (a.g(magicFace, magicFace1) ^ 0x01) {
                f uof = f.x().t(p0.c().mImage).r(p0.c().mImages);
                c$a ta = this.a;
                Objects.requireNonNull(ta);
                c uoc = PatchProxy.apply(objArray, ta, c.class, "5");
                if (uoc != PatchProxyResult.class) {
                }else {
                   CoverPicRecommendedCropWindow uCoverPicRec = new CoverPicRecommendedCropWindow();
                   uCoverPicRec.mCropWidth = 100;
                   uCoverPicRec.mCropHeight = 100;
                   uCoverPicRec.mBeginX = uoa;
                   uCoverPicRec.mBeginY = uoa;
                   uCoverPicRec.mPhotoHeight = 116;
                   uCoverPicRec.mPhotoWidth = 116;
                   uoc = new c(uCoverPicRec);
                }
                d uod = Fresco.newDraweeControllerBuilder();
                uod.y(this.a.R8().getController());
                uod.u(uof.l(uoc).w());
                AbstractDraweeController uAbstractDra = uod.e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­quest\)\n          .build\(\)");
                this.a.R8().setController(uAbstractDra);
             }
             b = p0.d();
             if (u == null || b != u.d()) {
                if (p0.d() >= 0) {
                   this.a.R8().setProgress((float)p0.d());
                }else {
                   this.a.R8().p0();
                }
             }
          }
       }
    label_0122 :
       return;
    }
}
