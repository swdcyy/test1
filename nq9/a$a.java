package nq9.a$a;
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
import zf6.l;
import java.lang.Boolean;
import zr6.j;
import wq6.h;
import wn5.b;
import rn5.a;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import bo5.a;
import com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import gsa.e0;
import ro5.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import ul5.e;
import vl5.b;
import vl5.e;
import vl5.c;
import cm5.a;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import com.kwai.framework.model.channel.HotChannel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cm5.c;
import com.yxcorp.gifshow.util.l;

public class a$a extends b	// class@0031ee
{

    public void a$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       p1.b(b.e, new a("CORONA_PAGE", false, true));
       p1.b(b.a, Boolean.valueOf(l.r()));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.n, uob);
       p1.b(a.b, d.a(-683509148).P4(p2, this.b));
       p1.b(a.r, TopTabViewType.NORMAL);
       p1.b(a.s, uob);
       p1.b(a.e, b.a(this.b, p2));
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       boolean b;
       String str = "1";
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, str);
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       e uoe = new e(this.b.s());
       String str1 = uoe.a();
       if (!PatchProxy.applyVoidOneRefs(str1, null, b.class, str) && str1 != null) {
          e.b(str1, "TV_TAB", "CORONA_MONITOR_EVENT_DETAIL_TIME", "TV_STATION", "tvTabFullTime");
          if (e.a(str1) != null) {
             b.c(str1, "START_TV_TAB");
          }
       }
       a uoa = d.a(0x5f78d73);
       b = true;
       String str2 = uob.d(b);
       if (!p1.M2().equals(b.z) && !p1.M2().equals(b.A)) {
          b = false;
       }
       BaseFragment uBaseFragmen = uoa.XR(null, str2, b, uoe);
       l.a(uBaseFragmen);
       b.c(uoe.a(), "CREATE_ATOMIC_PAGE_FINISH");
       return uBaseFragmen;
    }
}
