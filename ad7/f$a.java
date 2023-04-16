package ad7.f$a;
import zr6.b;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import un5.b;
import wn5.a;
import zq6.p;
import zr6.j;
import wq6.h;
import wn5.b;
import rn5.a;
import un5.c;
import bo5.a;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import java.lang.Boolean;
import hn5.n;
import hn5.m;
import ad7.e;
import msd.a;
import ad7.d;
import ad7.c;
import zf6.l;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import gsa.e0;
import ro5.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import mc7.e;
import com.kwai.nearby.local.HomeLocalFragment;
import com.yxcorp.gifshow.util.l;
import zr6.e;
import ad7.b;

public class f$a extends b	// class@0000ae
{

    public void f$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f$a.class, "2")) {
          return;
       }
       p1.b(b.e, new a("NEARBY", true));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.n, uob);
       p1.b(b.b, c.b);
       p1.b(a.s, uob);
       p1.b(a.r, TopTabViewType.NORMAL_WITH_AVATAR);
       p1.b(a.v, Boolean.TRUE);
       if (m.a().s6()) {
          p1.a(b.a, e.b);
          p1.a(a.b, new d(this, p2));
          p1.a(a.e, new c(this, p2));
       }else {
          p1.b(b.a, Boolean.valueOf(l.r()));
          p1.b(a.b, d.a(-683509148).P4(p2, this.b));
          p1.b(a.e, b.a(this.b, p2));
       }
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, f$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (b.z.equals(p1.M2())) {
          e uoe = new e();
          HomeLocalFragment homeLocalFra = PatchProxy.apply(null, uoe, e.class, "1");
          if (homeLocalFra != PatchProxyResult.class) {
          }else {
             homeLocalFra = new HomeLocalFragment();
             uoe.a = homeLocalFra;
          }
          if (homeLocalFra != null) {
             l.a(homeLocalFra);
          }
          return homeLocalFra;
       }else {
          HomeLocalFragment homeLocalFra1 = new HomeLocalFragment();
          l.a(homeLocalFra1);
          return homeLocalFra1;
       }
    }
    public e d(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(p0);
    }
}
