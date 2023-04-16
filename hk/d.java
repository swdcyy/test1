package hk.d;
import java.lang.Object;
import java.util.ArrayList;
import hk.d$a;
import java.util.List;
import java.lang.Math;
import android.graphics.Matrix;
import android.graphics.Path;
import hk.d$c;
import hk.d$b;

public class d	// class@00213c
{
    public float a;
    public float b;
    public float c;
    public float d;
    public final List e;

    public void d(){
       super();
       this.e = new ArrayList();
       this.d(0, 0);
    }
    public void a(float p0,float p1,float p2,float p3,float p4,float p5){
       d$a uoa = new d$a(p0, p1, p2, p3);
       uoa.f = p4;
       uoa.g = p5;
       this.e.add(uoa);
       double d = (double)(p4 + p5);
       this.c = ((p0 + p2) * 0x3f000000) + (((p2 - p0) / 2.00f) * (float)Math.cos(Math.toRadians(d)));
       this.d = ((p1 + p3) * 0x3f000000) + (((p3 - p1) / 2.00f) * (float)Math.sin(Math.toRadians(d)));
    }
    public void b(Matrix p0,Path p1){
       int i = this.e.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.e.get(i1).a(p0, p1);
       }
       return;
    }
    public void c(float p0,float p1){
       d$b uob = new d$b();
       uob.b = p0;
       uob.c = p1;
       this.e.add(uob);
       this.c = p0;
       this.d = p1;
    }
    public void d(float p0,float p1){
       this.a = p0;
       this.b = p1;
       this.c = p0;
       this.d = p1;
       this.e.clear();
    }
}
