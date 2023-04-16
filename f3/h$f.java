package f3.h$f;
import f3.h$e;
import f3.h$a;
import p1.d$b;
import p1.d;
import f3.h$b;
import android.graphics.Path;
import java.lang.String;

public abstract class h$f extends h$e	// class@001fca
{
    public d$b[] a;
    public String b;
    public int c;
    public int d;

    public void h$f(){
       super(null);
       this.a = null;
       this.c = 0;
    }
    public void h$f(h$f p0){
       super(null);
       this.a = null;
       this.c = 0;
       this.b = p0.b;
       this.d = p0.d;
       this.a = d.f(p0.a);
    }
    public boolean c(){
       return this instanceof h$b;
    }
    public void d(Path p0){
       p0.reset();
       h$f ta = this.a;
       if (ta != null) {
          d$b.e(ta, p0);
       }
       return;
    }
    public d$b[] getPathData(){
       return this.a;
    }
    public String getPathName(){
       return this.b;
    }
    public void setPathData(d$b[] p0){
       if (!d.b(this.a, p0)) {
          this.a = d.f(p0);
       }else {
          d.j(this.a, p0);
       }
       return;
    }
}
