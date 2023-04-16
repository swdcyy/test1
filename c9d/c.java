package c9d.c;
import dd.b;
import c9d.i;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import c9d.c$a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class c extends b	// class@0004ff
{
    public final RecommendResponse$CnyPopup a;
    public final i b;

    public void c(i p0,RecommendResponse$CnyPopup p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "1")) {
          return;
       }
       d uod = Fresco.newDraweeControllerBuilder();
       uod.s(new c$a(this));
       this.b.C.setController(uod.E(this.a.mPopupPuzzlePics).e());
       c tb = this.b;
       tb.N = true;
       if (tb.O != null) {
          tb.V8(this.a);
       }
       return;
    }
}
