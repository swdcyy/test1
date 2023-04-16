package bk7.a;
import bk7.a$a;
import java.lang.Object;
import bk7.a$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class a	// class@000423
{
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;
    public double i;
    public double j;
    public int k;
    public int l;
    public String m;
    public int n;
    public a$b o;

    public void a(a$a p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       this.n = p0.n;
    }
    public abstract a$b a();
    public double b(){
       return this.i;
    }
    public double c(){
       return this.j;
    }
    public int d(){
       return this.l;
    }
    public String e(){
       return this.a;
    }
    public String f(){
       return this.b;
    }
    public a$b g(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o == null) {
          this.o = this.a();
       }
       return this.o;
    }
    public String h(){
       return this.g;
    }
    public int i(){
       return this.f;
    }
    public int j(){
       return this.d;
    }
    public String k(){
       return this.c;
    }
    public String l(){
       return this.e;
    }
}
