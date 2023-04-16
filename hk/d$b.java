package hk.d$b;
import hk.d$c;
import android.graphics.Matrix;
import android.graphics.Path;

public class d$b extends d$c	// class@00213a
{
    public float b;
    public float c;

    public void d$b(){
       super();
    }
    public void a(Matrix p0,Path p1){
       d$c ta = this.a;
       p0.invert(ta);
       p1.transform(ta);
       p1.lineTo(this.b, this.c);
       p1.transform(p0);
    }
}
