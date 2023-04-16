package com.kuaishou.live.merchant.d0;
import aa1.a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fs3.g;
import fs3.f;
import java.util.List;
import xs5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.kuaishou.live.merchant.e;
import com.kuaishou.live.merchant.f;
import com.kuaishou.live.merchant.g;
import com.kuaishou.live.merchant.h;
import com.kuaishou.live.merchant.i;
import com.kuaishou.live.merchant.v;
import com.kuaishou.live.merchant.j;
import com.kuaishou.live.merchant.w;
import com.kuaishou.live.merchant.k;
import com.kuaishou.live.merchant.l;
import com.kuaishou.live.merchant.m;
import com.kuaishou.live.merchant.x;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kuaishou.live.merchant.n;
import com.kuaishou.live.merchant.o;
import com.kuaishou.live.merchant.p;
import com.kuaishou.live.merchant.y;
import com.kuaishou.live.merchant.q;
import com.kuaishou.live.merchant.z;
import com.kuaishou.live.merchant.a0;
import com.kuaishou.live.merchant.b0;
import com.kuaishou.live.merchant.r;
import com.kuaishou.live.merchant.s;
import com.kuaishou.live.merchant.c0;
import tkd.b;
import tkd.d;
import java.util.Collection;
import fs3.c;
import com.kuaishou.live.merchant.a;
import com.kuaishou.live.merchant.t;
import com.kuaishou.live.merchant.b;
import com.kuaishou.live.merchant.u;
import com.kuaishou.live.merchant.c;
import fs3.a;
import sf3.c;
import com.kuaishou.live.merchant.d;

public class d0 implements a	// class@000ca7
{

    public void d0(){
       super();
    }
    public static PresenterV2 b(){
       return f.a().BW(true);
    }
    public List a(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uod0, "1");
       if (obj != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uod0, "2");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(e.a);
             uArrayList.add(f.a);
             uArrayList.add(g.a);
             uArrayList.add(h.a);
             uArrayList.add(i.a);
             uArrayList.add(v.a);
             uArrayList.add(j.a);
             uArrayList.add(w.a);
             uArrayList.add(k.a);
             uArrayList.add(l.a);
             uArrayList.add(m.a);
             uArrayList.add(x.a);
             if (b.c(p0)) {
                uArrayList.add(n.a);
             }
             uArrayList.add(o.a);
             if (p0.d == null) {
                uArrayList.add(p.a);
             }
             uArrayList.add(y.a);
             uArrayList.add(q.a);
             uArrayList.add(z.a);
             uArrayList.add(a0.a);
             uArrayList.add(b0.a);
             uArrayList.add(r.a);
             uArrayList.add(s.a);
             uArrayList.add(c0.a);
             uArrayList.addAll(d.a(-1695065466).gz(p0.f, p0.d));
             uArrayList.addAll(d.a(-907147194).hj());
             uArrayList.add(a.a);
             uArrayList.add(t.a);
             uArrayList.add(b.a);
             uArrayList.add(u.a);
             uArrayList.add(c.a);
             if (d.a(-1432266865).C60()) {
                uArrayList.add(new c(p0));
             }
             uArrayList.add(d.a);
             obj = uArrayList;
          }
       }
       return obj;
    }
}
