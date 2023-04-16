package bc9.h$a;
import cc9.i;
import bc9.h;
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
import cc9.n;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.ChildMagicFace;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.f;
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

public final class h$a implements i	// class@0003ed
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          h w = this.a.w;
          p0 = p0.i().get(Integer.valueOf(this.a.W8().get()));
          Object[] objArray = null;
          if (!p0 instanceof n) {
             p0 = objArray;
          }
          if (p0 != null && !a.g(p0, w)) {
             this.a.w = p0;
             int b = p0.e();
             h$a uoa = 8;
             int i = 0;
             if (w == null || b != w.e()) {
                if (p0.e()) {
                   n.Y(this.a.V8(), i, i);
                }else {
                   n.Y(this.a.V8(), uoa, i);
                }
             }
             MagicEmoji$MagicFace magicFace = p0.c();
             MagicEmoji$MagicFace magicFace1 = (w != null)? w.c(): objArray;
             int i1 = 1;
             if (a.g(magicFace, magicFace1) ^ i1) {
                SimpleMagicFace mImage = p0.c().mImage;
                SimpleMagicFace mImages = p0.c().mImages;
                SimpleMagicFace mChildId = p0.c().mChildId;
                MagicEmoji$MagicFace magicFace2 = (mChildId == null || !mChildId.length())? 1: null;
                if (!magicFace2 && p0.c().mChildMagicFace != null) {
                   ChildMagicFace mIcons = p0.c().mChildMagicFace.mIcons;
                   if (mIcons != null) {
                      mIcons = (!mIcons.length)? 1: 0;
                      if (!mIcons) {
                         i1 = 0;
                      }
                   }
                   if (!i1) {
                      mImage = p0.c().mChildMagicFace.mIcons[i].mUrl;
                      mImages = p0.c().mChildMagicFace.mIcons;
                   }
                }
             label_00d1 :
                f uof = f.x().t(mImage).r(mImages);
                h$a ta = this.a;
                Objects.requireNonNull(ta);
                c uoc = PatchProxy.apply(objArray, ta, h.class, "5");
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
                uod.y(this.a.S8().getController());
                uod.u(uof.l(uoc).w());
                AbstractDraweeController uAbstractDra = uod.e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­est\)\n            .build\(\)");
                this.a.S8().setController(uAbstractDra);
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
    label_0168 :
       return;
    }
}
