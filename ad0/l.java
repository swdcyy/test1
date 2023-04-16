package ad0.l;
import qf0.b;
import android.view.View;
import android.animation.ObjectAnimator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import of0.b;
import android.animation.TimeInterpolator;
import android.animation.Keyframe;
import java.util.Arrays;

public final class l	// class@00006b
{
    public static final int a;
    public static final String b;

    static {
       l.a = b.b(0x7f07031f);
       l.b = "PendantAmountAnimManager";
    }
    public static final ObjectAnimator a(View p0,long p1,float p2,float p3){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), null, l.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$getAlphaValueAnim");
       float[] uofloatArray = new float[]{p2,p3};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­Holder\(this, alphaHolder\)");
       objectAnimat.setInterpolator(new b(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
       objectAnimat.setDuration(p1);
       return objectAnimat;
    }
    public static final ObjectAnimator b(View p0,long p1,Keyframe[] p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, null, l.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$getScaleValueAnim");
       a.p(p2, "keyframes");
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, Arrays.copyOf(p2, p2.length)),PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Arrays.copyOf(p2, p2.length))};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­aleXHolder, scaleYHolder\)");
       objectAnimat.setInterpolator(new b(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
       objectAnimat.setDuration(p1);
       return objectAnimat;
    }
}
