package k3a.m;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.n;

public final class m extends a	// class@002bcf
{
    public int e;
    public int f;
    public int g;

    public void m(){
       super();
       this.g = 1;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n();
    }
    public final void g(int p0){
       this.f = p0;
    }
    public final void h(int p0){
       this.e = p0;
    }
}
