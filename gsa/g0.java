package gsa.g0;
import jo5.a;
import wq6.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import lnc.w2;

public final class g0 extends a	// class@002beb
{
    public final h c;

    public void g0(h p0){
       super();
       this.c = p0;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w2.a(a.a(this.c.M2()));
    }
    public h b(){
       return this.c;
    }
}
