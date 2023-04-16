package gv2.c;
import msd.p;
import fe3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oe3.p;
import fe3.a;
import usd.k;
import fe3.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import java.lang.Integer;
import java.util.Collection;
import java.util.Set;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import gv2.b;
import nsd.u;

public final class c implements p	// class@002bac
{
    public final List b;
    public final a c;
    public final b d;

    public void c(b p0){
       g og1;
       a.p(p0, "stageBiz");
       super();
       this.d = p0;
       int i = (int)1078.26f;
       this.c = new a(720, p.a(i));
       int i1 = 0;
       k ok = new k(i1, 5);
       g[] ogArray = new g[1];
       g og = PatchProxy.apply(null, this, c.class, "2");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(i1, i1, (int)539.13f, i);
       }
       ogArray[i1] = og;
       List list = CollectionsKt__CollectionsKt.P(ogArray);
       Iterator iterator = ok.iterator();
       while (iterator.hasNext()) {
          i1 = iterator.b();
          if (PatchProxy.isSupport(c.class)) {
             og1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, c.class, "3");
             if (og1 != PatchProxyResult.class) {
             label_0087 :
                list.add(og1);
             }
          }
          float f = (float)i1 * 0x42f8cccd;
          f = f * 0x3fde9bd3;
          og1 = new g((int)0x4407a6f5, (int)f, (int)177.39f, (int)212.87f);
          goto label_0087 ;
       }
       this.b = list;
       return;
    }
    public Object invoke(Object p0,Object p1){
       LayoutConfig layoutConfig = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (layoutConfig != PatchProxyResult.class) {
       }else {
          a.p(p0, "stateInterfaceList");
          a.p(p1, "openCameraUsers");
          LayoutConfig layoutConfig1 = new LayoutConfig(this.d, this.c, b.a(p0, p1, this.b), 0, 8, null);
       }
       return layoutConfig;
    }
}
