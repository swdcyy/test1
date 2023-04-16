package ap6.p2;
import erd.g;
import com.kwai.imsdk.group.g;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import lh0.a$c2;
import lh0.a$a2;
import java.util.List;
import yp6.c;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import l85.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.imsdk.group.KwaiGroupGeneralInfo;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import cp6.o;
import pp6.r;
import pp6.a;
import org.greenrobot.eventbus.a;
import xp6.i;
import nq6.s;
import java.util.Map;
import rh0.a$b;

public final class p2 implements g	// class@000360
{
    public final g b;

    public void p2(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p2 tb = this.b;
       Objects.requireNonNull(tb);
       if (x.b(p0) && p0.b() != null) {
          List list = c.d(p0.b().a);
          b.b("KwaiGroupObservables", "syncUserGroup groupGeneralInfoList size = "+b.g(list));
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             KwaiGroupGeneralInfo kwaiGroupGen = iterator.next();
             if (kwaiGroupGen != null) {
                KwaiGroupInfo groupInfo = kwaiGroupGen.getGroupInfo();
                if (groupInfo != null) {
                   tb.U(groupInfo);
                   uArrayList.add(groupInfo);
                }
                uArrayList1.addAll(kwaiGroupGen.getGroupMembers());
             }
          }
          o.a(tb.c).f(uArrayList);
          o.a(tb.c).g(uArrayList1);
          r or = new r(uArrayList);
          or.b(tb.c);
          a.d().k(or);
          if (i.a(tb.c) <= 0) {
             s os = s.t(tb.c);
             os.E(os.x("IMSDK.Fallback.SyncGroup"), 0.00f);
          }
          i.d(tb.c, p0.b().b.a);
          b.b("KwaiGroupObservables", "syncUserGroup syncOffset ="+p0.b().b.a);
       }
    label_00ed :
       return;
    }
}
