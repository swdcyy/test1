package kd9.p0;
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
import com.yxcorp.gifshow.camera.record.video.gauss.HoleImageView;
import u36.b;
import u36.b$a;
import ca9.a;
import ca9.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Rect;
import sh9.c;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.Animator;
import com.kwai.gifshow.post.api.core.model.TakePictureType;

public class p0 implements d	// class@002c63
{
    public Activity a;
    public boolean b;

    public void p0(Activity p0){
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
       return this.b;
    }
    public void d(int p0,int p1){
       p0 op0 = p0.class;
       if (PatchProxy.isSupport(op0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, op0, "1")) {
          return;
       }
       p0 = b.m(p1, this.a);
       int i = 0x7f0a0612;
       View view = this.a.findViewById(i);
       View view1 = this.a.findViewById(R.id.shader_layout);
       if (view1 == null) {
          view1 = this.a.findViewById(R.id.camera_sidebar_layout);
       }
       View view2 = this.a.findViewById(R.id.side_bar_right_shader);
       if (view != null && view1 != null) {
          p0 = p0 - view.getLayoutParams().topMargin;
          b.y(view, p0);
          b.y(view1, p0);
          if (view2 != null) {
             b.y(view2, p0);
          }
          HoleImageView holeImageVie = this.a.findViewById(R.id.camera_gauss_layout);
          if (holeImageVie != null) {
             p0 ta = this.a;
             holeImageVie.setHoleRect(b.r(b.class, b$a.b).HU(ta, ta.findViewById(i)));
          }
          c.f2(this.a);
       }
       return;
    }
    public void e(int p0,int p1){
       p0 op0 = p0.class;
       if (PatchProxy.isSupport(op0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, op0, "2")) {
          return;
       }
       p0 = b.m(p1, this.a);
       View view = this.a.findViewById(R.id.camera_flash_bar_root);
       View view1 = this.a.findViewById(R.id.camera_sidebar_layout);
       if (view != null && view1 != null) {
          p0 = p0 - view.getLayoutParams().topMargin;
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ValueAnimator valueAnimato = b.b(view, p0);
          Animator[] uAnimatorArr = new Animator[]{valueAnimato,b.b(view1, p0)};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
       }
       return;
    }
    public void v1(TakePictureType p0){
       boolean b = (p0 == TakePictureType.SHOOT_IMAGE || p0 == TakePictureType.SHARE)? true: false;
       this.b = b;
       return;
    }
}
