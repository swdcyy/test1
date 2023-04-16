package gv2.a;
import msd.p;
import fe3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fe3.a;
import usd.k;
import usd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import trd.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import fe3.g;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import gv2.b;
import nsd.u;

public final class a implements p	// class@002baa
{
    public final List b;
    public final a c;
    public final b d;

    public void a(b p0){
       g og;
       a.p(p0, "stageBiz");
       super();
       this.d = p0;
       this.c = new a(718, 628);
       k ok = q.n1(0, 9);
       ArrayList uArrayList = new ArrayList(u.Y(ok, 10));
       Iterator iterator = ok.iterator();
       while (iterator.hasNext()) {
          int i = iterator.b();
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             og = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoa, "2");
             if (og != PatchProxyResult.class) {
             label_0063 :
                uArrayList.add(og);
             }
          }
          int i1 = i % 3;
          i = i / 3;
          i1 = i1 * 240;
          i = i * 210;
          og = new g(i1, i, 238, 208);
          goto label_0063 ;
       }
       this.b = uArrayList;
       return;
    }
    public Object invoke(Object p0,Object p1){
       LayoutConfig layoutConfig = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (layoutConfig != PatchProxyResult.class) {
       }else {
          a.p(p0, "stateInterfaceList");
          a.p(p1, "openCameraUsers");
          LayoutConfig layoutConfig1 = new LayoutConfig(this.d, this.c, b.a(p0, p1, this.b), 0, 8, null);
       }
       return layoutConfig;
    }
}
