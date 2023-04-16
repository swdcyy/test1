package dn9.a$a;
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
import in9.c;
import q87.c;
import com.kwai.component.kcube.model.model.TabConfig;
import com.yxcorp.gifshow.commontab.HomeUniveralTabFragment;
import android.os.Bundle;
import java.util.Objects;
import com.yxcorp.gifshow.commontab.HomeUniveralTabFragment$a;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.util.l;

public class a$a extends b	// class@001fcf
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
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       Object[] objArray = new Object[0];
       c.C().w("FeedUniversalTabCreator", "createAtomicPage ", objArray);
       TabConfig tabConfig = this.b.q("KEY_UNIVERSAL_TAB_PARAM");
       objArray = PatchProxy.applyOneRefs(tabConfig, null, HomeUniveralTabFragment.class, "25");
       if (objArray != patchProxyRe) {
       }else {
          HomeUniveralTabFragment$a a1 = HomeUniveralTabFragment.a1;
          Objects.requireNonNull(a1);
          Bundle uBundle = PatchProxy.applyOneRefs(tabConfig, a1, HomeUniveralTabFragment$a.class, "1");
          if (uBundle != patchProxyRe) {
          }else {
             a.p(tabConfig, "tabConfig");
             uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "UNIVERSAL_TAB_PARAM", tabConfig);
          }
       }
       HomeUniveralTabFragment homeUniveral = new HomeUniveralTabFragment();
       homeUniveral.setArguments(objArray);
       l.a(homeUniveral);
       return homeUniveral;
    }
}
