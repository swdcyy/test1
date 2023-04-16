package e3.c;
import android.animation.TypeEvaluator;
import java.lang.Object;

public class c implements TypeEvaluator	// class@001edf
{
    public float[] a;

    public void c(float[] p0){
       super();
       this.a = p0;
    }
    public float[] a(float p0,float[] p1,float[] p2){
       c ta = this.a;
       if (ta == null) {
          ta = new float[p1.length];
       }
       for (int i = 0; i < ta.length; i = i + 1) {
          int i1 = p1[i];
          float f = p2[i] - i1;
          f = f * p0;
          float f1 = i1 + f;
          ta[i] = f1;
       }
       return ta;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.a(p0, p1, p2);
    }
}
