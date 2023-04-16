package dg.e;
import dg.c;
import java.lang.Object;
import dg.e$b;
import dg.e$a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.StringBuilder;
import java.lang.String;
import dg.f;
import java.lang.IllegalArgumentException;
import dg.h;
import java.lang.Math;
import java.util.Iterator;

public class e	// class@001e63
{
    public f a;
    public boolean b;
    public final String c;
    public final e$b d;
    public final e$b e;
    public final e$b f;
    public double g;
    public double h;
    public boolean i;
    public double j;
    public double k;
    public CopyOnWriteArraySet l;
    public double m;
    public final c n;
    public static int o;

    public void e(c p0){
       super();
       e$a uoa = null;
       this.d = new e$b(uoa);
       this.e = new e$b(uoa);
       this.f = new e$b(uoa);
       this.i = true;
       this.j = 0x3f747ae147ae147b;
       this.k = 0x3f747ae147ae147b;
       this.l = new CopyOnWriteArraySet();
       this.m = 0;
       if (p0 == null) {
          throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
       }
       this.n = p0;
       int o = e.o;
       e.o = o + 1;
       this.c = "spring:"+o;
       this.g(f.c);
       return;
    }
    public e a(h p0){
       if (p0 == null) {
          throw new IllegalArgumentException("newListener is required");
       }
       this.l.add(p0);
       return this;
    }
    public double b(){
       return this.d.a;
    }
    public String c(){
       return this.c;
    }
    public boolean d(){
       boolean b = (Math.abs(this.d.b) - this.j <= 0 && (Math.abs((this.h - this.d.a)) - this.k <= 0 || !this.a.b))? true: false;
       return b;
    }
    public e e(double p0){
       this.g = p0;
       this.d.a = p0;
       this.n.a(this.c());
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this);
       }
       e td = this.d;
       e$b a = td.a;
       this.h = a;
       this.f.a = a;
       td.b = 0;
       return this;
    }
    public e f(double p0){
       if (!this.h - p0 && this.d()) {
          return this;
       }
       this.g = this.b();
       this.h = p0;
       this.n.a(this.c());
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this);
       }
       return this;
    }
    public e g(f p0){
       if (p0 == null) {
          throw new IllegalArgumentException("springConfig is required");
       }
       this.a = p0;
       return this;
    }
}
