package h71.w;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.w$a;
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

public final class w extends AbstractLiveJsCommand	// class@00264d
{

    public void w(){
       super();
    }
    public Class a(){
       return w$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, w.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof w$a) {
          return m.g.c("invalid params");
       }
       String str = p0.a();
       String str1 = 1;
       boolean b = false;
       str = (str == null || !str.length())? 1: null;
       if (!str) {
          str = p0.b();
          if (str != null && str.length()) {
             str1 = null;
          }
          if (!str1) {
             if (b.e().h(p0.a(), p0.b(), p0.source)) {
                return m$a.g(m.g, null, b, 3, null);
             }else {
                return m$a.d(m.g, 501, null, 2, null);
             }
          }
       }
       return m.g.c("param: biz & token  required");
    }
}
