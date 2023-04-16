package k3a.s;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.t;

public final class s extends a	// class@002bd5
{
    public int e;

    public void s(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t();
    }
    public final void g(int p0){
       this.e = p0;
    }
}
