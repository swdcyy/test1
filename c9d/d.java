package c9d.d;
import dd.b;
import c9d.i;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.facebook.drawee.view.SimpleDraweeView;

public class d extends b	// class@000500
{
    public final RecommendResponse$CnyPopup a;
    public final i b;

    public void d(i p0,RecommendResponse$CnyPopup p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "1")) {
          return;
       }
       this.b.D.setImageURI(this.a.mPopupAnswerPics);
       d tb = this.b;
       tb.O = true;
       if (tb.N != null) {
          tb.V8(this.a);
       }
       return;
    }
}
