package j8a.a;
import j8a.d1;
import j8a.a$a;
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
import j8a.a$b;
import android.animation.Animator$AnimatorListener;
import android.view.View$OnTouchListener;
import android.widget.ImageView;

public class a extends d1	// class@00293d
{
    public View h;
    public TextView i;
    public final View j;
    public static final a$a k;

    static {
       a.k = new a$a(null);
    }
    public void a(View p0){
       a.p(p0, "mDetailParentView");
       super(0x7f0f0082);
       this.j = p0;
    }
    public boolean N(){
       View view;
       Object[] objArray = null;
       ViewStub obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.P() == null) {
          obj = this.j.findViewById(R.id.collect_guide_layout_stub);
          if (obj != null) {
             objArray = obj.getParent();
          }
          if (objArray != null) {
             this.T(d.b(obj));
          }
          view = this.P();
          if (view == null) {
             view = this.j.findViewById(R.id.collect_guide_layout);
          }
          this.T(view);
          view = this.P();
          if (view != null) {
             View view1 = view.findViewById(R.id.collect_anim_view);
             a.o(view1, "findViewById\(R.id.collect_anim_view\)");
             this.U(view1);
             view = view.findViewById(R.id.collect_guide_text);
             a.o(view, "findViewById\(R.id.collect_guide_text\)");
             this.i = view;
             if (view == null) {
                a.S("mGuideTextView");
             }
             TextPaint paint = view.getPaint();
             a.o(paint, "mGuideTextView.paint");
             paint.setFakeBoldText(b);
          }
          this.Q().setRepeatCount(0);
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
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
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
                view.animate().setDuration(200).alpha(0).setListener(new a$b(this)).start();
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
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.R();
       a th = this.h;
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
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
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
    public final TextView W(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("mGuideTextView");
       }
       return obj;
    }
}
