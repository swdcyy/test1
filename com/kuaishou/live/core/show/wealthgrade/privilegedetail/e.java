package com.kuaishou.live.core.show.wealthgrade.privilegedetail.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.h;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import g9c.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Iterable;
import qk.m;
import qm2.l;
import ok.o;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.f;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qm2.m;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.g;

public final class e implements Observer	// class@00126e
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "5")) {
       }else if(p0 == null || p0.mLiveWealthGradeInfo == null){
          if (q.f(p0.mPrivilegeList)) {
             tb.s.M0();
             tb.t.M0();
             tb.r.setVisibility(8);
             tb.u.setVisibility(8);
             tb.q.setVisibility(8);
             tb.v.setVisibility(8);
          }else {
             ImmutableList immutableLis = m.s(p0.mPrivilegeList).p(new l(tb)).E(f.b);
             if (q.f(immutableLis)) {
                tb.r.setVisibility(8);
                tb.u.setVisibility(8);
             }else {
                tb.u.setVisibility(0);
                tb.r.setVisibility(0);
                tb.t.W0(immutableLis);
                tb.t.k0();
             }
             p0 = m.s(p0.mPrivilegeList).p(new m(tb)).E(g.b);
             if (q.f(p0)) {
                tb.q.setVisibility(8);
                tb.v.setVisibility(8);
             }else {
                tb.v.setVisibility(0);
                tb.q.setVisibility(0);
                tb.s.W0(p0);
                tb.s.k0();
             }
          }
       }
       return;
    }
}
