package n5.a;
import a5.e;
import java.lang.Object;
import android.view.animation.Interpolator;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;

public class a	// class@0026c0
{
    public final e a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final float e;
    public Float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public float k;
    public float l;
    public PointF m;
    public PointF n;

    public void a(e p0,Object p1,Object p2,Interpolator p3,float p4,Float p5){
       super();
       this.g = -3987645.75f;
       this.h = -3987645.75f;
       this.i = 0x2ec8fb09;
       this.j = 0x2ec8fb09;
       this.k = Float.MIN_VALUE;
       this.l = Float.MIN_VALUE;
       this.m = null;
       this.n = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void a(Object p0){
       super();
       this.g = -3987645.75f;
       this.h = -3987645.75f;
       this.i = 0x2ec8fb09;
       this.j = 0x2ec8fb09;
       this.k = Float.MIN_VALUE;
       this.l = Float.MIN_VALUE;
       this.m = null;
       this.n = null;
       this.a = null;
       this.b = p0;
       this.c = p0;
       this.d = null;
       this.e = Float.MIN_VALUE;
       this.f = Float.valueOf(Float.MAX_VALUE);
    }
    public boolean a(float p0){
       boolean b = (p0 - this.c() >= 0 && p0 - this.b() < 0)? true: false;
       return b;
    }
    public float b(){
       float f = 0x3f800000;
       if (this.a == null) {
          return f;
       }
       if (!this.l - 1) {
          this.l = (this.f == null)? f: this.c() + ((this.f.floatValue() - this.e) / this.a.e());
       }
    label_002c :
       return this.l;
    }
    public float c(){
       a ta = this.a;
       if (ta == null) {
          return 0;
       }
       if (!this.k - 1) {
          this.k = (this.e - ta.l()) / this.a.e();
       }
       return this.k;
    }
    public boolean d(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public String toString(){
       return "Keyframe{startValue="+this.b+", endValue="+this.c+", startFrame="+this.e+", endFrame="+this.f+", interpolator="+this.d+'}';
    }
}
