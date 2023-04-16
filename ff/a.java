package ff.a;
import com.facebook.react.uimanager.layoutanimation.InterpolatorType;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.Object;
import java.util.Map;
import vd.d;
import android.view.View;
import android.view.animation.Animation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.layoutanimation.AnimatedPropertyType;
import java.lang.Enum;
import ff.k;
import java.lang.Number;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public abstract class a	// class@001fee
{
    public Interpolator a;
    public int b;
    public AnimatedPropertyType c;
    public int d;
    public static final Map e;

    static {
       a.e = d.g(InterpolatorType.LINEAR, new LinearInterpolator(), InterpolatorType.EASE_IN, new AccelerateInterpolator(), InterpolatorType.EASE_OUT, new DecelerateInterpolator(), InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    }
    public void a(){
       super();
    }
    public final Animation a(View p0,int p1,int p2,int p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.d()) {
          return null;
       }else {
          Animation uAnimation = this.b(p0, p1, p2, p3, p4);
          if (uAnimation != null) {
             uAnimation.setDuration((long)(this.d * 1));
             uAnimation.setStartOffset((long)(this.b * 1));
             uAnimation.setInterpolator(this.a);
          }
          return uAnimation;
       }
    }
    public abstract Animation b(View p0,int p1,int p2,int p3,int p4);
    public void c(ReadableMap p0,int p1){
       float f;
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, str)) {
          return;
       }
       String str1 = "property";
       AnimatedPropertyType uAnimatedPro = (p0.hasKey(str1))? AnimatedPropertyType.fromString(p0.getString(str1)): null;
       this.c = uAnimatedPro;
       str1 = "duration";
       if (p0.hasKey(str1)) {
          p1 = p0.getInt(str1);
       }
       this.d = p1;
       String str2 = "delay";
       str2 = (p0.hasKey(str2))? p0.getInt(str2): 0;
       this.b = str2;
       str2 = "type";
       if (p0.hasKey(str2)) {
          InterpolatorType interpolator = InterpolatorType.fromString(p0.getString(str2));
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          k ok = PatchProxy.applyTwoRefs(interpolator, p0, null, uoa, "3");
          if (ok != patchProxyRe) {
          }else if(interpolator.equals(InterpolatorType.SPRING)){
             Object obj = PatchProxy.applyOneRefs(p0, null, k.class, str);
             if (obj != patchProxyRe) {
                f = obj.floatValue();
             }else {
                str1 = "springDamping";
                f = (p0.getType(str1).equals(ReadableType.Number))? (float)p0.getDouble(str1): 0x3f000000;
             }
             ok = new k(f);
          }else {
             ok = a.e.get(interpolator);
          }
          if (ok == null) {
             throw new IllegalArgumentException("Missing interpolator for type : "+interpolator);
          }
          this.a = ok;
          if (this.d()) {
             return;
          }else {
             throw new IllegalViewOperationException("Invalid layout animation : "+p0);
          }
       }else {
          throw new IllegalArgumentException("Missing interpolation type.");
       }
    }
    public abstract boolean d();
    public void e(){
       this.c = null;
       this.d = 0;
       this.b = 0;
       this.a = null;
    }
}
