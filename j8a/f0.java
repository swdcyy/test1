package j8a.f0;
import j8a.d1;
import j8a.f0$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewStub;
import android.view.ViewParent;
import ga5.d;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View$OnTouchListener;

public final class f0 extends d1	// class@002950
{
    public View h;
    public TextView i;
    public final View j;
    public static final f0$a k;

    static {
       f0.k = new f0$a(null);
    }
    public void f0(View p0){
       a.p(p0, "mDetailParentView");
       super(0x7f0f0016);
       this.j = p0;
    }
    public boolean N(){
       Object[] objArray = null;
       ViewStub obj = PatchProxy.apply(objArray, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.P() == null) {
          obj = this.j.findViewById(R.id.like_guide_layout_stub);
          if (obj != null) {
             objArray = obj.getParent();
          }
          if (objArray != null) {
             this.T(d.b(obj));
          }
          View view = this.P();
          if (view == null) {
             view = this.j.findViewById(R.id.like_guide_layout);
          }
          this.T(view);
          view = this.P();
          if (view != null) {
             View view1 = view.findViewById(R.id.guide_text);
             a.o(view1, "findViewById\(R.id.guide_text\)");
             this.i = view1;
             view = view.findViewById(R.id.double_like_anim_view);
             a.o(view, "findViewById\(R.id.double_like_anim_view\)");
             this.U(view);
          }
          this.Q().setRepeatCount(2);
          this.h = this.j.findViewById(0x7f0a11a1);
       }
       boolean b = (this.P() != null && this.h != null)? true: false;
       return b;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       super.O();
       f0 ti = this.i;
       if (ti == null) {
          a.S("mGuideTextView");
       }
       ti.setVisibility(8);
       return;
    }
    public void R(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f0.class, "2")) {
          return;
       }
       super.R();
       f0 th = this.h;
       a.m(th);
       th.setOnTouchListener(objArray);
       th = this.h;
       a.m(th);
       th.setVisibility(8);
       th = this.i;
       if (th == null) {
          a.S("mGuideTextView");
       }
       th.setVisibility(0);
       return;
    }
}
