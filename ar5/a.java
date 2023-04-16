package ar5.a;
import lnc.a1;
import java.lang.Object;
import ar5.b;
import android.view.View;
import android.animation.AnimatorSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public class a	// class@000397
{
    public long a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public int g;
    public int h;
    public static final int i;

    static {
       a.i = a1.e(12.00f);
    }
    public void a(){
       super();
       this.a = 600;
       this.b = 1600;
       this.c = 200;
       this.d = new b(0, 0, 0.40f, 0x3f800000);
       this.e = new b(0.40f, 0, 0x3f19999a, 0x3f800000);
       this.f = new b(0.40f, 0, 0x3f800000, 0x3f800000);
       this.g = a.i;
       this.h = 70;
    }
    public AnimatorSet a(View p0){
       float[] uofloatArray;
       float f;
       float[] uofloatArray1;
       AnimatorSet obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       a tg = this.g;
       int i = (a1.h() - p0.getMeasuredWidth()) - tg;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
       uofloatArray = new float[]{(float)p0.getMeasuredWidth(),f};
       f = (float)(- (((a1.h() - p0.getMeasuredWidth()) - this.g) - this.h));
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setInterpolator(this.d);
       objectAnimat.setDuration(this.a);
       PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray1),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0x3f800000})};
       uofloatArray1 = new float[]{f,f};
       f = (float)(- i);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
       objectAnimat1.setInterpolator(this.e);
       objectAnimat1.setDuration(this.b);
       propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray1),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0})};
       uofloatArray1 = new float[]{f,(float)(- ((tg + i) + p0.getMeasuredWidth()))};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
       objectAnimat2.setInterpolator(this.f);
       objectAnimat2.setDuration(this.c);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       obj.playSequentially(uAnimatorArr);
       return obj;
    }
    public a b(long p0){
       this.a = p0;
       return this;
    }
    public a c(long p0){
       this.b = p0;
       return this;
    }
    public a d(int p0){
       this.h = p0;
       return this;
    }
    public a e(long p0){
       this.c = p0;
       return this;
    }
    public a f(int p0){
       this.g = p0;
       return this;
    }
}
