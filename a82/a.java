package a82.a;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import android.animation.AnimatorSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;

public class a	// class@00007c
{
    public int a;
    public static final int b;

    static {
       a.b = a1.e(80.00f);
    }
    public void a(){
       super();
       this.a = a.b;
    }
    public AnimatorSet a(View p0){
       float[] uofloatArray;
       AnimatorSet obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       int i = a1.h();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray),j.b(new float[2]{0x3f800000,0x3f800000})};
       uofloatArray = new float[]{(float)p0.getMeasuredWidth(),(float)(- i)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setInterpolator(new LinearInterpolator());
       objectAnimat.setDuration((long)(((p0.getMeasuredWidth() + i) / this.a) * 1000));
       obj.play(objectAnimat);
       return obj;
    }
}
