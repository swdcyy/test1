package j8a.b1;
import j8a.d1;
import j8a.b1$a;
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
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import android.text.TextPaint;
import android.view.ViewPropertyAnimator;
import j8a.b1$b;
import android.animation.Animator$AnimatorListener;
import android.view.View$OnTouchListener;
import android.widget.ImageView;

public final class b1 extends d1	// class@002941
{
    public View h;
    public TextView i;
    public final View j;
    public static final b1$a k;

    static {
       b1.k = new b1$a(null);
    }
    public void b1(View p0){
       a.p(p0, "mDetailParentView");
       super(0x7f0f0089);
       this.j = p0;
    }
    public boolean N(){
       View view;
       Object[] objArray = null;
       ViewStub obj = PatchProxy.apply(objArray, this, b1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.P() == null) {
          obj = this.j.findViewById(R.id.scale_guide_layout_stub);
          if (obj != null) {
             objArray = obj.getParent();
          }
          if (objArray != null) {
             this.T(d.b(obj));
          }
          view = this.P();
          if (view == null) {
             view = this.j.findViewById(R.id.scale_guide_layout);
          }
          this.T(view);
          view = this.P();
          if (view != null) {
             View view1 = view.findViewById(R.id.scale_anim_view);
             a.o(view1, "findViewById\(R.id.scale_anim_view\)");
             this.U(view1);
             view = view.findViewById(R.id.scale_guide_text);
             a.o(view, "findViewById\(R.id.scale_guide_text\)");
             this.i = view;
             if (view == null) {
                a.S("mGuideTextView");
             }
             TextPaint paint = view.getPaint();
             a.o(paint, "mGuideTextView.paint");
             paint.setFakeBoldText(b);
          }
          this.Q().setRepeatCount(2);
          this.h = this.j.findViewById(0x7f0a11a1);
       }
       view = this.P();
       if (view != null) {
          view.setAlpha(0);
       }
       if (this.P() == null || this.h == null) {
          b = false;
       }
       return b;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, b1.class, "3")) {
          return;
       }
       View view = this.P();
       if (view != null && !view.getVisibility()) {
          view = this.P();
          if (view != null && !view.getAlpha() - 0x3f800000) {
             view = 1;
          label_002b :
             if (view) {
                view = this.P();
                a.m(view);
                view.animate().setDuration(200).alpha(0).setListener(new b1$b(this)).start();
             }else {
                this.V();
             }
             return;
          }
       }
       view = null;
       goto label_002b ;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, b1.class, "2")) {
          return;
       }
       super.R();
       b1 th = this.h;
       a.m(th);
       th.setOnTouchListener(null);
       th = this.h;
       a.m(th);
       th.setVisibility(8);
       View view = this.P();
       a.m(view);
       view.setAlpha(0);
       view = this.P();
       a.m(view);
       view.animate().setDuration(200).alpha(0x3f800000).setListener(null).start();
       return;
    }
    public final void V(){
       if (PatchProxy.applyVoid(null, this, b1.class, "4")) {
          return;
       }
       View view = this.P();
       a.m(view);
       view.setVisibility(8);
       view = this.P();
       a.m(view);
       view.setOnTouchListener(null);
       this.Q().f();
       this.Q().t();
       this.Q().setVisibility(8);
       return;
    }
}
