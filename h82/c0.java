package h82.c0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.x;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import h82.l;
import java.lang.Integer;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import h82.d;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import h82.a;
import h82.r0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import h82.e;
import h82.f;
import h82.g;
import h82.f0;
import h82.i;
import h82.c;
import h82.j;
import h82.k;
import h82.g0;

public class c0 extends AnimatorListenerAdapter	// class@002cc9
{
    public boolean a;
    public final k0 b;

    public void c0(k0 p0){
       this.b = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       x.I(this.b.u);
       this.a = true;
       return;
    }
    public void onAnimationEnd(Animator p0){
       k0 e;
       k0 d;
       AnimatorSet uAnimatorSet;
       ObjectAnimator objectAnimat;
       int[] ointArray;
       ValueAnimator valueAnimato;
       ObjectAnimator objectAnimat1;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c0.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (obj.a == null) {
          c0 b = obj.b;
          if (b.u == null) {
             Objects.requireNonNull(b);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             l ol = l.class;
             if (!PatchProxy.applyVoid(null, b, k0.class, "22") && b.u == null) {
                int i = 4;
                int i1 = 1;
                if (b.o != null) {
                   e = b.e;
                   k0 b1 = b.b;
                   d = b.d;
                   k0 f = b.f;
                   int i2 = b.d();
                   int i3 = b.e();
                   k0 w = b.w;
                   if (PatchProxy.isSupport(ol)) {
                      Object[] objArray = new Object[]{e,b1,d,f,Integer.valueOf(i2),Integer.valueOf(i3),w};
                      uAnimatorSet = PatchProxy.apply(objArray, null, ol, "1");
                      if (uAnimatorSet != patchProxyRe) {
                      label_0148 :
                         b.u = uAnimatorSet;
                         uAnimatorSet.addListener(new f0(b));
                      }
                   }
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{j.b(new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
                   objectAnimat = ObjectAnimator.ofPropertyValuesHolder(e, propertyValu);
                   objectAnimat.addListener(new d(e));
                   objectAnimat.setDuration(100);
                   ointArray = new int[]{i3,i2};
                   valueAnimato = ValueAnimator.ofInt(ointArray);
                   valueAnimato.addUpdateListener(new a(b1, w));
                   valueAnimato.addListener(new e(b1, i2, w));
                   valueAnimato.setDuration(300);
                   objectAnimat1 = j.a(d, new float[2]{0x3f800000,0});
                   objectAnimat1.setDuration(200);
                   objectAnimat1.addListener(new f(d));
                   PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(f, propertyValu1);
                   objectAnimat2.setDuration(300);
                   objectAnimat2.addListener(new g(f));
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[]{valueAnimato,objectAnimat1,objectAnimat2};
                   uAnimatorSet1.playTogether(uAnimatorArr);
                   AnimatorSet uAnimatorSet2 = new AnimatorSet();
                   Animator[] uAnimatorArr1 = new Animator[]{objectAnimat,uAnimatorSet1};
                   uAnimatorSet2.playSequentially(uAnimatorArr1);
                   uAnimatorSet = uAnimatorSet2;
                   goto label_0148 ;
                }else {
                   e = b.e;
                   k0 b2 = b.b;
                   k0 d1 = b.d;
                   i1 = b.d();
                   int i4 = b.e();
                   d = b.w;
                   if (PatchProxy.isSupport(ol)) {
                      Object[] objArray1 = new Object[]{e,b2,d1,Integer.valueOf(i1),Integer.valueOf(i4),d};
                      uAnimatorSet = PatchProxy.apply(objArray1, null, ol, "3");
                      if (uAnimatorSet != patchProxyRe) {
                      label_01f7 :
                         b.u = uAnimatorSet;
                         uAnimatorSet.addListener(new g0(b));
                      }
                   }
                   PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{j.b(new float[2]{0x3f800000,0})};
                   objectAnimat = ObjectAnimator.ofPropertyValuesHolder(e, propertyValu2);
                   objectAnimat.addListener(new i(e));
                   objectAnimat.setDuration(200);
                   ointArray = new int[]{i4,i1};
                   valueAnimato = ValueAnimator.ofInt(ointArray);
                   valueAnimato.addUpdateListener(new c(b2, d));
                   valueAnimato.addListener(new j(b2, i1, d));
                   valueAnimato.setDuration(300);
                   objectAnimat1 = j.a(d1, new float[2]{0x3f800000,0});
                   objectAnimat1.setDuration(200);
                   objectAnimat1.addListener(new k(d1));
                   AnimatorSet uAnimatorSet3 = new AnimatorSet();
                   Animator[] uAnimatorArr2 = new Animator[]{objectAnimat,valueAnimato,objectAnimat1};
                   uAnimatorSet3.playTogether(uAnimatorArr2);
                   uAnimatorSet = uAnimatorSet3;
                   goto label_01f7 ;
                }
             }
             obj.b.u.setStartDelay(500);
             obj.b.u.start();
          }
       }
       return;
    }
}
