package fia.c0;
import erd.g;
import fia.z;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dia.a;
import cia.w;
import k2b.e0;
import bia.d;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import bia.f;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.view.View;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class c0 implements g	// class@0028f2
{
    public final z b;

    public void c0(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.B != null && (p0.D != null && (p0.H != null && p0.E != null))) {
             p0.J = 3;
             a.a.b(z.P8(p0).N(), z.R8(this.b).b(), Integer.valueOf(this.b.J));
             p0 = this.b.B;
             a.m(p0);
             z d = this.b.D;
             a.m(d);
             z e = this.b.E;
             a.m(e);
             z h = this.b.H;
             a.m(h);
             AnimatorSet uAnimatorSet = PatchProxy.applyFourRefs(p0, d, e, h, null, f.class, "16");
             if (uAnimatorSet != PatchProxyResult.class) {
             }else {
                a.p(p0, "tipsGuide");
                a.p(d, "fullyGuideText");
                a.p(e, "fullyGuideUserNameText");
                a.p(h, "simpleGuideText");
                uAnimatorSet = new AnimatorSet();
                float[] uofloatArray = new float[]{p0.getX(),p0.getX() + (float)(p0.getWidth() - a1.e(66.00f))};
                p0 = ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray);
                a.o(p0, "translationX");
                p0.setDuration(300);
                p0.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(d, View.ALPHA, new float[2]{0x3f800000,0});
                a.o(objectAnimat, "alphaFully");
                objectAnimat.setDuration(300);
                objectAnimat.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(e, View.ALPHA, new float[2]{0x3f800000,0});
                a.o(objectAnimat1, "alphaFullyUserName");
                objectAnimat1.setDuration(300);
                objectAnimat1.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(h, View.ALPHA, new float[2]{0,0x3f800000});
                a.o(objectAnimat2, "alphaSimple");
                objectAnimat2.setDuration(300);
                objectAnimat2.setInterpolator(new DecelerateInterpolator());
                Animator[] uAnimatorArr = new Animator[]{p0,objectAnimat,objectAnimat1,objectAnimat2};
                uAnimatorSet.playTogether(uAnimatorArr);
             }
             uAnimatorSet.start();
          }
       }
       return;
    }
}
