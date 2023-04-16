package gf.e;
import gf.a;
import gf.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.facebook.react.uimanager.a;
import java.lang.Boolean;

public class e extends h implements a	// class@0020a6
{
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    public int o;

    public void e(){
       super();
       this.n = false;
       this.o = 0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LCP"+","+this.h+","+this.j+","+this.k+","+this.l+","+this.m+","+this.e+","+this.a+","+this.b+","+this.c+","+this.d;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.m = p0.m;
       this.e = p0.e;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.f = a.c();
       return;
    }
    public boolean d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((p0.c * p0.d) <= (this.c * this.d)) {
          return false;
       }
       this.c(p0);
       return true;
    }
    public boolean hasValue(){
       boolean b = (this.m != null && this.e != null)? true: false;
       return b;
    }
}
