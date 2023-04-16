package k71.h;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.h$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import k71.h$b;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import o63.m$a;
import java.lang.StringBuilder;

public final class h extends AbstractLiveJsCommand	// class@002cb5
{

    public void h(){
       super();
    }
    public Class a(){
       return h$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (p0 instanceof h$a) {
          m$a g = m.g;
          h$b uob = PatchProxy.applyOneRefs(p0, this, oh, "1");
          if (uob != patchProxyRe) {
          }else {
             h$a type = p0.type;
             String str = "";
             if (type.hashCode() == 0x11d36527 && type.equals("material")) {
                p0 = LiveMaterialResourceManager.h.b(p0.resPackId, p0.iconPath);
                if (p0 != null) {
                   str = p0;
                }
                uob = new h$b(str);
             }else {
                uob = new h$b(str);
             }
          }
          p0 = m$a.g(g, uob, false, 2, null);
       }else {
          p0 = m.g.c(oh.getName()+"£º params is "+"not "+h$a.class.getName());
       }
       return p0;
    }
}
