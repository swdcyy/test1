package androidx.transition.ChangeTransform$e;
import android.view.View;
import java.lang.Object;
import android.graphics.Matrix;
import e3.w;
import android.graphics.PointF;
import java.lang.System;

public class ChangeTransform$e	// class@0009ba
{
    public final Matrix a;
    public final View b;
    public final float[] c;
    public float d;
    public float e;

    public void ChangeTransform$e(View p0,float[] p1){
       super();
       this.a = new Matrix();
       this.b = p0;
       float[] uofloatArray = p1.clone();
       this.c = uofloatArray;
       this.d = uofloatArray[2];
       this.e = uofloatArray[5];
       this.b();
    }
    public Matrix a(){
       return this.a;
    }
    public final void b(){
       ChangeTransform$e tc = this.c;
       tc[2] = this.d;
       tc[5] = this.e;
       this.a.setValues(tc);
       w.g(this.b, this.a);
    }
    public void c(PointF p0){
       this.d = p0.x;
       this.e = p0.y;
       this.b();
    }
    public void d(float[] p0){
       System.arraycopy(p0, 0, this.c, 0, p0.length);
       this.b();
    }
}
