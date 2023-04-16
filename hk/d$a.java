package hk.d$a;
import hk.d$c;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Path;

public class d$a extends d$c	// class@002139
{
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public static final RectF h;

    static {
       d$a.h = new RectF();
    }
    public void d$a(float p0,float p1,float p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void a(Matrix p0,Path p1){
       d$c ta = this.a;
       p0.invert(ta);
       p1.transform(ta);
       RectF h = d$a.h;
       h.set(this.b, this.c, this.d, this.e);
       p1.arcTo(h, this.f, this.g, false);
       p1.transform(p0);
    }
}
