package el0.a$a;
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
import bo5.a;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import zf6.l;
import java.lang.Boolean;
import gsa.e0;
import ro5.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import gl0.a;
import q87.c;
import hn5.l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hn5.k;
import com.yxcorp.gifshow.util.l;

public class a$a extends b	// class@0021a6
{

    public void a$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       p1.b(b.e, new a("FIND", true));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.n, uob);
       p1.b(a.s, uob);
       p1.b(a.b, d.a(-683509148).P4(p2, this.b));
       p1.b(b.a, Boolean.valueOf(l.r()));
       p1.b(a.e, b.a(this.b, p2));
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Object[] objArray = new Object[0];
       a.C().w("LifeTabCreator", "createAtomicPage ", objArray);
       BaseFragment uBaseFragmen = d.a(0x255a95ce).Nw();
       l.a(uBaseFragmen);
       return uBaseFragmen;
    }
}
