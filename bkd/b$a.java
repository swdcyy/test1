package bkd.b$a;
import java.lang.Object;
import bkd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b$a	// class@000271
{
    public boolean a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public long m;
    public long n;
    public boolean o;
    public long p;
    public int q;

    public void b$a(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public b$a b(boolean p0){
       this.a = p0;
       return this;
    }
    public b$a c(boolean p0){
       this.b = p0;
       return this;
    }
    public b$a d(String p0,int p1){
       this.f = p0;
       this.g = p1;
       return this;
    }
    public b$a e(boolean p0){
       this.o = p0;
       return this;
    }
    public b$a f(String p0,String p1,int p2){
       this.i = p0;
       this.k = p1;
       this.l = p2;
       return this;
    }
    public b$a g(String p0,String p1){
       this.d = p0;
       this.e = p1;
       return this;
    }
    public b$a h(String p0){
       this.j = p0;
       return this;
    }
}
