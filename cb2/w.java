package cb2.w;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.AnimatorSet;
import ekd.k1;
import cb2.w$c;
import java.lang.Long;
import d61.h;
import android.widget.TextView;
import java.lang.CharSequence;
import cb2.r;
import android.view.View$OnClickListener;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import cb2.w$a;
import android.animation.Animator$AnimatorListener;
import cb2.w$b;
import android.animation.Animator;
import cb2.s;
import cb2.u;
import java.lang.Runnable;

public class w	// class@00051f
{
    public final View a;
    public final Object b;
    public View c;
    public LottieAnimationView d;
    public View e;
    public LottieAnimationView f;
    public AnimatorSet g;
    public w$c h;

    public void w(View p0){
       super();
       this.b = new Object();
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, w.class, "6")) {
          return;
       }
       w te = this.e;
       if (te == null) {
          return;
       }
       te.setVisibility(8);
       if (this.f.p()) {
          this.f.f();
       }
       te = this.g;
       if (te != null) {
          if (te.isRunning()) {
             this.g.cancel();
          }
          this.g = null;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, w.class, "7")) {
          return;
       }
       k1.n(this.b);
       w tc = this.c;
       if (tc == null) {
          return;
       }
       if (!tc.getVisibility()) {
          tc = this.h;
          if (tc != null) {
             tc.a();
          }
          this.c.setVisibility(8);
       }
       if (this.d.p()) {
          this.d.f();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, w.class, "5")) {
          return;
       }
       this.a();
       this.b();
       return;
    }
    public void d(long p0,String p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ow, "4")) {
          return;
       }
       View view = h.f(this.a, R.id.live_square_bottom_slide_guide_view_stub, 0x7f0a25c3);
       this.e = view;
       TextView textView = view.findViewById(R.id.live_square_bottom_guide_title_text_view);
       if (textView != null) {
          textView.setText(p1);
       }
       this.e.setOnClickListener(new r(this));
       this.f = this.e.findViewById(0x7f0a25c2);
       this.g = new AnimatorSet();
       ObjectAnimator objectAnimat = j.a(this.e, new float[2]{0,0x3f800000});
       objectAnimat.setDuration(300);
       objectAnimat.addListener(new w$a(this));
       ObjectAnimator objectAnimat1 = j.a(this.e, new float[2]{0x3f800000,0});
       objectAnimat1.setDuration(300);
       objectAnimat1.setStartDelay(p0);
       objectAnimat1.addListener(new w$b(this));
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.g.playTogether(uAnimatorArr);
       this.g.start();
       return;
    }
    public void e(String p0,long p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ow, "2")) {
          return;
       }
       View view = h.f(this.a, R.id.live_square_fullscreen_slide_guide_view_stub, 0x7f0a25cc);
       this.c = view;
       view.setVisibility(0);
       this.c.findViewById(R.id.live_square_fullscreen_slide_guide_hint_text_view).setText(p0);
       this.c.setOnClickListener(new s(this));
       LottieAnimationView lottieAnimat = this.c.findViewById(R.id.live_square_fullscreen_slide_guide_animation_view);
       this.d = lottieAnimat;
       lottieAnimat.setAnimation(R.raw.arg_RES_7f0f0052);
       this.d.setRepeatCount(-1);
       this.d.s();
       if (p1 - null > 0) {
          k1.s(new u(this), this.b, p1);
       }
       return;
    }
}
