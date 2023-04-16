package eja.c1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.b0;
import java.lang.Object;
import dha.l$a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.stagger.data.m;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import hn5.z;
import y99.i;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import yga.c;
import pia.d;
import rja.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o26.d;
import com.yxcorp.gifshow.follow.stagger.data.j;
import java.util.Map;
import com.google.common.collect.ImmutableList;
import java.lang.Boolean;
import xl8.b;
import jb5.d;
import qvb.a;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import pia.a;
import qia.a;

public final class c1 implements g	// class@0026b8
{
    public final b0 b;

    public void c1(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m z;
       c1 tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0.a()) {
          if (tb.r.hi() != null) {
             m om = tb.r.hi();
             if (!z.a() && tb.q.c()) {
                om.k3();
                if (tb.r.h0() != null) {
                   tb.r.h0().scrollToPosition(i);
                }
                tb.r.J3(RefreshType.INIT);
             }else {
                om.W = true;
                if (p0.c() || p0.b == null) {
                   if (!tb.q.c()) {
                      tb.w = true;
                   }else if(tb.r.h0() != null){
                      tb.r.h0().scrollToPosition(i);
                   }
                   tb.r.J3(RefreshType.INIT);
                }
             }
          }
       }else if(p0.c()){
          p0 = KsLogFollowTag.FOLLOW_ACCOUNT;
          p0.appendTag("HomeFollowLoginStatusPr");
          c.i(p0, "switchAccount");
          tb.r.ii().b3();
          c.i(p0.appendTag("HomeFollowLoginStatusPr"), "switch2DefaultTab");
          tb.u.n(RefreshType.INIT, i);
       }else {
          Object[] objArray = null;
          if (tb.r.hi() != null) {
             p0 = tb.r.hi();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, m.class, "2")) {
                c.i(KsLogFollowTag.FOLLOW_POST.appendTag("NewPublishHomeFollowPageList"), "onLogout");
                p0.U0.clear();
                p0.U.clear();
                z = p0.Z;
                Objects.requireNonNull(z);
                if (!PatchProxy.applyVoid(objArray, z, j.class, "6")) {
                   j.a.clear();
                }
                p0.n3(ImmutableList.of());
             }
             tb.s.d(Boolean.FALSE);
          }
          if (tb.r.Qh() != null && z.a()) {
             tb.r.ji();
             if (tb.r.h0() != null) {
                tb.r.h0().scrollToPosition(i);
             }
             p0 = tb.r.ii();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, d.class, "9")) {
                c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("FollowStaggerPageListDelegate"), "clearAll");
                p0.E.clear();
                if (!p0.G.isEmpty()) {
                   p0 = p0.G.entrySet().iterator();
                   while (p0.hasNext()) {
                      Map$Entry uEntry = p0.next();
                      if (uEntry.getValue() != null) {
                         uEntry.getValue().clear();
                      }
                   }
                }
             }
             tb.r.ii().invalidate();
             if (tb.v.a().booleanValue()) {
                tb.u.m(RefreshType.INIT);
             }else {
                tb.r.J3(RefreshType.INIT);
             }
          }
       }
       return;
    }
}
