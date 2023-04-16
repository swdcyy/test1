package c9d.h;
import java.lang.Runnable;
import c9d.i;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.widget.PopupWindow;
import k2b.e0;
import nfd.m1;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import c9d.h$a;
import android.os.Handler;
import c9d.h$b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import c9d.h$c;

public class h implements Runnable	// class@000509
{
    public final RecommendResponse$CnyPopup b;
    public final i c;

    public void h(i p0,RecommendResponse$CnyPopup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       if (this.c.getActivity() == null || (!this.c.getActivity().isFinishing() && !this.c.getActivity().isDestroyed())) {
          this.c.y.setCameraDistance(50000.00f);
          h tc = this.c;
          tc.K.showAtLocation(tc.m8(), 51, 0, 0);
          tc = this.c;
          m1.f(0, tc.T, "HOME_ACTIVITY_POPUP", tc.M, this.b.mPopTaskId);
          tc = this.c;
          tc.r = ObjectAnimator.ofFloat(tc.y, "scaleX", new float[2]{0x3f4ccccd,0x3f800000});
          this.c.r.setDuration(400);
          tc = this.c;
          tc.s = ObjectAnimator.ofFloat(tc.y, "scaleY", new float[2]{0x3f4ccccd,0x3f800000});
          this.c.s.setDuration(400);
          tc = this.c;
          tc.t = ObjectAnimator.ofFloat(tc.y, "rotationY", new float[2]{0xc3870000,0xc3b40000});
          this.c.t.setDuration(400);
          tc = this.c;
          tc.u = ObjectAnimator.ofFloat(tc.y, "alpha", new float[2]{0,0x3f800000});
          this.c.u.setDuration(600);
          tc = this.c;
          tc.v = ObjectAnimator.ofFloat(tc.J, "alpha", new float[2]{0,0x3f800000});
          this.c.v.setDuration(600);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.play(this.c.r).with(this.c.s).with(this.c.t).with(this.c.u).with(this.c.v);
          uAnimatorSet.start();
          this.c.P.postDelayed(new h$a(this), 400);
          tc = this.c;
          tc.w = ObjectAnimator.ofFloat(tc.y, "rotationY", new float[2]{0,0xc2b40000});
          this.c.w.setDuration(400);
          tc = this.c;
          tc.x = ObjectAnimator.ofFloat(tc.y, "rotationY", new float[2]{0xc3870000,0xc3b40000});
          this.c.x.setDuration(400);
          this.c.z.setOnClickListener(new h$b(this));
          this.c.A.setOnClickListener(new h$c(this));
       }
    label_014f :
       return;
    }
}
