package k3a.j;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k3a.l;

public final class j extends a	// class@002bcc
{
    public boolean e;
    public p f;
    public l g;

    public void j(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l();
    }
    public final void g(boolean p0){
       this.e = p0;
    }
}
