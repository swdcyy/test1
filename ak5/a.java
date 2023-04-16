package ak5.a;
import ak5.a$a;
import java.lang.Object;
import ak5.a$b;
import ak5.a$d;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ak5.a$c;

public final class a	// class@0000bc
{
    public a$c a;
    public final int b;
    public final int c;
    public a$b d;
    public a$d e;
    public k f;
    public q g;
    public boolean h;
    public boolean i;
    public k j;
    public e k;
    public b l;

    public void a(a$a p0){
       super();
       this.a = p0.b;
       this.d = p0.c;
       this.e = p0.d;
       this.b = p0.e;
       this.c = p0.f;
       this.f = p0.g;
       this.g = p0.h;
       this.j = p0.i;
       this.h = p0.j;
       this.i = p0.k;
       this.k = p0.l;
       this.l = p0.m;
    }
    public a$b a(){
       return this.d;
    }
    public a$d b(){
       return this.e;
    }
    public String c(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       String str = (obj != null)? obj.d(): "null";
       return str;
    }
}
