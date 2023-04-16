package a2.r0$e;
import android.view.animation.Interpolator;
import java.lang.Object;

public class r0$e	// class@0000a2
{
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;
    public float e;

    public void r0$e(int p0,Interpolator p1,long p2){
       super();
       this.a = p0;
       this.c = p1;
       this.d = p2;
    }
    public long a(){
       return this.d;
    }
    public float b(){
       return this.b;
    }
    public float c(){
       r0$e tc = this.c;
       if (tc != null) {
          return tc.getInterpolation(this.b);
       }
       return this.b;
    }
    public void d(float p0){
       this.b = p0;
    }
}
