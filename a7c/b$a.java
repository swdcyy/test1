package a7c.b$a;
import java.lang.Object;
import ok.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import a7c.a;

public class b$a	// class@00008e
{
    public boolean a;
    public boolean b;
    public int c;
    public x d;
    public x e;
    public x f;
    public x g;
    public x h;
    public x i;
    public x j;
    public int k;

    public void b$a(){
       super();
       this.a = false;
       this.b = false;
       this.c = 0;
    }
    public b$a a(x p0){
       this.d = p0;
       return this;
    }
    public b$a b(x p0){
       this.j = p0;
       return this;
    }
    public b$a c(x p0){
       this.h = p0;
       return this;
    }
    public b$a d(x p0){
       this.g = p0;
       return this;
    }
    public b$a e(int p0){
       this.c = p0;
       return this;
    }
    public b$a f(boolean p0){
       this.a = p0;
       return this;
    }
    public b$a g(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e = new a(p0);
       return this;
    }
}
