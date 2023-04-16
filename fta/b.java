package fta.b;
import zq6.t;
import java.lang.Object;
import wq6.h;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import on5.b;
import as6.a;
import com.kwai.kcube.TabIdentifier;

public final class b implements t	// class@0029ea
{

    public void b(){
       super();
    }
    public Object a(h p0,Object p1){
       TabIdentifier b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (p1 != patchProxyRe) {
       }else {
          a.p(p0, "tab");
          p1 = HomeActionBarSkinHelper.a.g(p0);
          if (p1 != null) {
             p1 = p1.mLightStatusBar;
             if (p1 != null) {
                b = b.B;
                a.o(b, "HomeTabIdentifier.HOME");
                Object obj = PatchProxy.applyTwoRefs(b, p0, null, a.class, "15");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   a.p(b, "container");
                   a.p(p0, "target");
                   p0 = a.m(p0);
                   while (true) {
                      if (p0 != null) {
                         if (a.g(p0.M2(), b)) {
                            b1 = true;
                         }else {
                            p0 = a.m(p0);
                         }
                      }else {
                         b1 = false;
                      }
                   }
                }
                if (b1) {
                   p1 = Boolean.valueOf((p1.booleanValue() ^ 1));
                }
             }
          }
          p1 = null;
       }
       return p1;
    }
}
