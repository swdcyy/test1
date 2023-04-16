package androidx.transition.ChangeTransform$f;
import android.view.View;
import java.lang.Object;
import a2.i0;
import androidx.transition.ChangeTransform;
import java.lang.Float;

public class ChangeTransform$f	// class@0009bb
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public void ChangeTransform$f(View p0){
       super();
       this.a = p0.getTranslationX();
       this.b = p0.getTranslationY();
       this.c = i0.O(p0);
       this.d = p0.getScaleX();
       this.e = p0.getScaleY();
       this.f = p0.getRotationX();
       this.g = p0.getRotationY();
       this.h = p0.getRotation();
    }
    public void a(View p0){
       ChangeTransform.p0(p0, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof ChangeTransform$f) {
          return b;
       }
       if (!p0.a - this.a && (!p0.b - this.b && (!p0.c - this.c && (!p0.d - this.d && (!p0.e - this.e && (!p0.f - this.f && (!p0.g - this.g && !p0.h - this.h))))))) {
          b = true;
       }
    label_0049 :
       return b;
    }
    public int hashCode(){
       ChangeTransform$f ta = this.a;
       int i = 0;
       int i1 = 0;
       int i2 = (ta - i1)? Float.floatToIntBits(ta): 0;
       i2 = i2 * 31;
       ChangeTransform$f tb = this.b;
       int i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.c;
       i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.d;
       i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.e;
       i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.f;
       i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.g;
       i3 = (tb - i1)? Float.floatToIntBits(tb): 0;
       i2 = (i2 + i3) * 31;
       tb = this.h;
       if (tb - i1) {
          i = Float.floatToIntBits(tb);
       }
       return (i2 + i);
    }
}
