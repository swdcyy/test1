package g19.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.GestureDetector;
import android.content.Context;
import g19.p0$a;
import android.view.GestureDetector$OnGestureListener;
import rf5.u;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.view.View;
import ekd.m1;

public final class p0 extends PresenterV2	// class@0023d2
{
    public ScaleHelpView p;
    public u q;
    public final GestureDetector r;

    public void p0(){
       super();
       this.r = new GestureDetector(this.getContext(), new p0$a(this));
    }
    public static final u P8(p0 p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "3")) {
          return;
       }
       p0 tp = this.p;
       if (tp != null) {
          tp.e(this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "4")) {
          return;
       }
       p0 tp = this.p;
       if (tp != null) {
          tp.j(this.r);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       Object obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj;
       return;
    }
}
