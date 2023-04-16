package dl9.y0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import lnc.a1;
import ekd.m1;

public final class y0 extends PresenterV2	// class@001fc4
{
    public CommentConfig p;
    public View q;

    public void y0(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y0.class, "3")) {
          return;
       }
       y0 tq = this.q;
       if (tq == null) {
          a.S("mGuidelineView");
       }
       ViewGroup$LayoutParams layoutParams = tq.getLayoutParams();
       if (layoutParams instanceof ConstraintLayout$LayoutParams) {
          objArray = layoutParams;
       }
       if (objArray != null) {
          tq = this.p;
          if (tq == null) {
             a.S("mCommentConfig");
          }
          int i = (tq.mEnableNewLikeDislikeUi != null)? a1.d(R.dimen.arg_RES_7f0702ab): a1.d(R.dimen.arg_RES_7f07032a);
          objArray.b = i;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.guide_line);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.guide_line\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "1")) {
          return;
       }
       Object obj = this.q8(CommentConfig.class);
       a.o(obj, "inject\(CommentConfig::class.java\)");
       this.p = obj;
       return;
    }
}
