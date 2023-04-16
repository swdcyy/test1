package h71.x;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.x$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.watchtimer.b;
import h71.x$b;

public final class x extends AbstractLiveJsCommand	// class@002650
{

    public void x(){
       super();
    }
    public Class a(){
       return x$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, x.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof x$a) {
          return m.g.c("invalid params");
       }
       String str = p0.a();
       String str1 = 1;
       str = (str == null || !str.length())? 1: null;
       if (!str) {
          str = p0.b();
          if (str != null && str.length()) {
             str1 = null;
          }
          if (!str1) {
             long l = b.e().i(p0.a(), p0.b(), p0.source);
             if (l - null < 0) {
                return m.g.a(501, "task does not exist");
             }else {
                return m$a.g(m.g, new x$b(l), false, 2, null);
             }
          }
       }
       return m.g.c("param: biz & token  required");
    }
}
