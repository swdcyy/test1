package androidx.transition.f$a;
import android.animation.TypeEvaluator;
import java.lang.Object;
import android.graphics.Matrix;

public class f$a implements TypeEvaluator	// class@0009f7
{
    public final float[] a;
    public final float[] b;
    public final Matrix c;

    public void f$a(){
       super();
       float[] uofloatArray = new float[9];
       this.a = uofloatArray;
       float[] uofloatArray1 = new float[9];
       this.b = uofloatArray1;
       this.c = new Matrix();
    }
    public Matrix a(float p0,Matrix p1,Matrix p2){
       p1.getValues(this.a);
       p2.getValues(this.b);
       for (int i = 0; i < 9; i++) {
          f$a tb = this.b;
          f$a ta = this.a;
          float f = tb[i] - ta[i];
          f = f * p0;
          float f1 = ta[i] + f;
          tb[i] = f1;
       }
       this.c.setValues(this.b);
       return this.c;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.a(p0, p1, p2);
    }
}
