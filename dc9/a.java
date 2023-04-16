package dc9.a;
import pi9.r$b;
import android.animation.TimeInterpolator;
import pi9.r$a;
import nsd.u;
import th0.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fc9.a;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import dc9.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import dc9.a$b;
import pi9.e;

public final class a implements r$b	// class@0020b4
{
    public final boolean a;
    public final boolean b;
    public final long c;
    public final TimeInterpolator d;
    public final r$a e;
    public final long f;
    public final TimeInterpolator g;

    public void a(){
       super(false, false, 0, null, null, 0, null, 127, null);
    }
    public void a(boolean p0,boolean p1,long p2,TimeInterpolator p3,r$a p4,long p5,TimeInterpolator p6,int p7,u p8){
       e uoe;
       if (p7 & 0x01) {
          p0 = false;
       }
       if (p7 & 0x02) {
          p1 = true;
       }
       if (p7 & 0x04) {
          p2 = 100;
       }
       if (p7 & 0x08) {
          uoe = new e();
       }
       e uoe1 = null;
       if (p7 & 0x10) {
          p4 = uoe1;
       }
       if (p7 & 0x20) {
          p5 = 300;
       }
       if (p7 & 0x40) {
          uoe1 = new e();
       }
       a.p(uoe, "alphaInterpolator");
       a.p(uoe1, "moveInterpolator");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = uoe;
       this.e = p4;
       this.f = p5;
       this.g = uoe1;
       return;
    }
    public Animator a(a p0,float p1,float p2,boolean p3,boolean p4){
       float[] obj1;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       ValueAnimator valueAnimato;
       Animator[] this;
       Object obj = this;
       object oobject = p0;
       int i = p4;
       a uoa = a.class;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),Float.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       a.p(oobject, "btn");
       View view = p0.c();
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator uAnimator = null;
       if (p3 != i) {
          objectAnimat = (i)? ObjectAnimator.ofFloat(view, "alpha", new float[2]{0,0x3f800000}): ObjectAnimator.ofFloat(view, "alpha", new float[2]{0x3f800000,0});
          a.o(objectAnimat, "alphaAnimator");
          objectAnimat.setDuration(obj.c);
          objectAnimat.setInterpolator(obj.d);
          objectAnimat1 = objectAnimat;
       }else {
          objectAnimat1 = uAnimator;
       }
       obj1 = null;
       float f = (obj.a != null)? p1: 0;
       if (f - obj1 || p2 - obj1) {
          valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
          a$a uoa1 = v5;
          a$a uoa2 = v5;
          uoa1 = new a$a(valueAnimato, this, view, f, p2);
          valueAnimato.addUpdateListener(uoa2);
          a.o(valueAnimato, "moveAnimator");
          valueAnimato.setDuration(obj.f);
          valueAnimato.setInterpolator(obj.g);
       }else {
          valueAnimato = uAnimator;
       }
       if (valueAnimato == null && objectAnimat1 == null) {
          return uAnimator;
       }else if(p0.b() != null){
          objectAnimat = (p2 - (float)0 > 0)? ObjectAnimator.ofFloat(p0.b(), "alpha", new float[2]{0x3f800000,0}): ObjectAnimator.ofFloat(p0.b(), "alpha", new float[2]{0,0x3f800000});
          a.o(objectAnimat, "assistantBtnColorBgAnimator");
          objectAnimat.setDuration(obj.c);
          objectAnimat.setInterpolator(new LinearInterpolator());
       }else {
          Animator uAnimator1 = uAnimator;
       }
       if (p0.d() != null && p0.f() != null) {
          ValueAnimator valueAnimato1 = (p2 - (float)0 > 0)? ValueAnimator.ofFloat(new float[2]{0,0x3f800000}): ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
          uAnimator = valueAnimato1;
          uAnimator.addUpdateListener(new a$b(uAnimator, oobject));
          a.o(uAnimator, "assistantBtnViewAnimator");
          uAnimator.setDuration(obj.f);
          uAnimator.setInterpolator(obj.g);
       }
       if (valueAnimato != null) {
          this = new Animator[]{valueAnimato};
          uAnimatorSet.playTogether(this);
       }
       if (objectAnimat1 != null) {
          this = new Animator[]{objectAnimat1};
          uAnimatorSet.playTogether(this);
       }
       if (e.e() && objectAnimat != null) {
          this = new Animator[]{objectAnimat};
          uAnimatorSet.playTogether(this);
       }
       if (e.e() && uAnimator != null) {
          Animator[] uAnimatorArr = new Animator[]{uAnimator};
          uAnimatorSet.playTogether(uAnimatorArr);
       }
       return uAnimatorSet;
    }
    public r$a b(){
       return this.e;
    }
}
