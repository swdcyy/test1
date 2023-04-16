package mhc.i0;
import mhc.j0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import uo7.h0;
import uo7.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class i0 extends j0	// class@003570
{
    public final String c;

    public void i0(String p0){
       a.p(p0, "elementId");
       super(p0);
       this.c = p0;
    }
    public final c0 W(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, oi0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "conf");
       a.p(p4, "urlMgr");
       return this.b(p0, p1, p2, p3, p4);
    }
    public String a(){
       return this.c;
    }
    public abstract c0 b(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4);
}
