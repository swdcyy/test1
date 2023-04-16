package b2b.e;
import java.lang.Object;
import android.content.Context;
import java.util.List;
import x1b.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.LocalLifeWeakStyleRecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import rkd.b;
import usd.q;
import java.lang.Integer;
import java.lang.Math;
import lnc.a1;

public final class e	// class@000353
{
    public final float a;

    public void e(){
       super();
       this.a = 88.00f;
    }
    public final void a(Context p0,List p1,a p2,LocalLifeWeakStyleRecyclerView p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "3")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "items");
       a.p(p2, "adapter");
       a.p(p3, "recyclerView");
       Activity uActivity = p0;
       int i = n.k(uActivity);
       if (b.g()) {
          int i1 = n.j(uActivity);
          i1 = (b.e())? q.n(i, i1): q.u(i, i1);
          i = i1;
       }
       this.b(p0, p1, p2, p3, i);
       return;
    }
    public final void b(Context p0,List p1,a p2,LocalLifeWeakStyleRecyclerView p3,int p4){
       e uoe = e.class;
       int i = 0;
       int i1 = 2;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
             return;
          }
       }
       a.p(p0, "context");
       a.p(p1, "items");
       a.p(p2, "adapter");
       a.p(p3, "recyclerView");
       int i2 = Math.min(p1.size(), 4);
       int i3 = a1.e(19.00f) * 2;
       int i4 = ((p4 - i3) - (a1.e(8.00f) * (i2 - 1))) / i2;
       if (i2 > 4 && i4 < a1.e(this.a)) {
          i4 = a1.e(this.a);
       }
       i2 = Math.max(i4, a1.e(74.00f));
       p2.w = i2;
       int i5 = p1.size() * i2;
       if (((i5 + (a1.e(8.00f) * (p1.size() - 1))) + i3) > p4) {
          i = true;
       }
       p3.q = i;
       return;
    }
}
