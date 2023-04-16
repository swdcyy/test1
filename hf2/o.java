package hf2.o;
import java.lang.Object;
import android.widget.TextView;
import android.animation.AnimatorSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gf2.a;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import hf2.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;

public class o	// class@002d8b
{
    public int a;

    public void o(){
       super();
    }
    public AnimatorSet a(TextView p0,int p1,int p2,int p3,int p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, oo, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d(p0, p1, p2, p3, p4);
    }
    public AnimatorSet b(TextView p0,int p1,int p2,boolean p3){
       ValueAnimator obj;
       View view = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, o.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       int[] ointArray = new int[]{p1,p2};
       long l = 200;
       ObjectAnimator objectAnimat = ObjectAnimator.ofInt(new a(view), a.b, ointArray).setDuration(l);
       if (PatchProxy.isSupport(oo)) {
          obj = PatchProxy.applyTwoRefs(view, Boolean.valueOf(p3), this, oo, "2");
          if (obj != patchProxyRe) {
          label_00a0 :
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,obj};
             uAnimatorSet.playTogether(uAnimatorArr);
             return uAnimatorSet;
          }
       }else {
          int i = this;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.setDuration(l);
       n on = new n(this, p3, new ArgbEvaluator(), ContextCompat.getColor(p0.getContext(), 0x7f060751), ContextCompat.getColor(p0.getContext(), 0x7f061523), a.r(p0.getBackground()), p0);
       valueAnimato.addUpdateListener(oo);
       obj = valueAnimato;
       goto label_00a0 ;
    }
    public AnimatorSet c(TextView p0,int p1,int p2,int p3,int p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, oo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d(p0, p1, p2, p3, p4);
    }
    public final AnimatorSet d(TextView p0,int p1,int p2,int p3,int p4){
       AnimatorSet obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, oo, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AnimatorSet();
       a uoa = new a(p0);
       int[] ointArray = new int[]{p1,p2};
       int[] ointArray1 = new int[]{p3,p4};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofInt(uoa, a.b, ointArray).setDuration(200),ObjectAnimator.ofInt(uoa, a.c, ointArray1).setDuration(200)};
       obj.playTogether(uAnimatorArr);
       return obj;
    }
}
