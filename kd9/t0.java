package kd9.t0;
import tm6.d;
import android.app.Activity;
import java.lang.Object;
import tm6.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import sm6.b;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;
import java.lang.Number;
import java.lang.Math;
import com.kwai.gifshow.post.api.core.model.TakePictureType;

public class t0 implements d	// class@002c6b
{
    public final Activity a;

    public void t0(Activity p0){
       super();
       this.a = p0;
    }
    public void a(int p0){
       c.a(this, p0);
    }
    public void b(boolean p0){
       c.b(this, p0);
    }
    public boolean c(){
       return true;
    }
    public void d(int p0,int p1){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ot0, "1")) {
          return;
       }
       p0 = b.m(p1, this.a);
       View view = this.a.findViewById(R.id.camera_flash_bar_root);
       View view1 = this.a.findViewById(R.id.shader_layout);
       View view2 = this.a.findViewById(R.id.fold_button_lay);
       View view3 = this.f();
       View view4 = this.a.findViewById(R.id.side_bar_right_shader);
       if (view == null || (view1 != null && view2 != null)) {
          int i = p0 - view.getLayoutParams().topMargin;
          b.y(view, i);
          b.y(view1, i);
          b.y(view2, i);
          b.y(view3, i);
          if (view4 != null) {
             b.y(view4, this.g(p1, p0));
          }
       }
       return;
    }
    public void e(int p0,int p1){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ot0, "2")) {
          return;
       }
       p0 = b.m(p1, this.a);
       View view = this.a.findViewById(R.id.camera_flash_bar_root);
       View view1 = this.a.findViewById(R.id.shader_layout);
       View view2 = this.a.findViewById(R.id.side_bar_right_shader);
       View view3 = this.a.findViewById(R.id.fold_button_lay);
       View view4 = this.f();
       if (view == null || (view1 == null || (view3 != null && view2 != null))) {
          int i = p0 - view.getLayoutParams().topMargin;
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ValueAnimator valueAnimato = b.b(view, i);
          ValueAnimator valueAnimato1 = b.b(view1, i);
          ValueAnimator valueAnimato2 = b.b(view2, this.g(p1, p0));
          ValueAnimator valueAnimato3 = b.b(view3, i);
          if (view4 != null) {
             Animator[] uAnimatorArr = new Animator[]{b.b(view4, i)};
             uAnimatorSet.playTogether(uAnimatorArr);
          }
          Animator[] uAnimatorArr1 = new Animator[]{valueAnimato,valueAnimato1,valueAnimato2,valueAnimato3};
          uAnimatorSet.playTogether(uAnimatorArr1);
          uAnimatorSet.start();
       }
    label_0095 :
       return;
    }
    public final View f(){
       View obj = PatchProxy.apply(null, this, t0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.findViewById(R.id.lyric_container);
       ViewStub viewStub = this.a.findViewById(R.id.lyric_container_stub);
       if (obj != null) {
          return obj;
       }
       return viewStub;
    }
    public final int g(int p0,int p1){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ot0, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (Math.min(p0, p1) - this.a.findViewById(0x7f0a3965).getLayoutParams().topMargin);
    }
    public void v1(TakePictureType p0){
       c.c(this, p0);
    }
}
