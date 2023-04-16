package fja.g;
import y0b.t;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import fja.f;
import com.yxcorp.gifshow.listcomponent.module.b;
import qvb.n0;
import y0b.u;
import o0b.a;
import y0b.h;
import java.lang.Long;
import a7c.h;
import com.yxcorp.gifshow.pymk.f;

public class g extends t	// class@002952
{
    public final String y;
    public h z;

    public void g(){
       super();
       this.y = "HomeFollowFooterSection";
    }
    public List G(){
       ArrayList obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new f());
       return obj;
    }
    public ArrayList t(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.t();
    }
    public n0 v(){
       h obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F().c().a(this.F().l(), "PymkParams", h.class);
       this.z = obj;
       return obj.s();
    }
}
