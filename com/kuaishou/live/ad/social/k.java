package com.kuaishou.live.ad.social.k;
import zl9.c;
import com.kuaishou.live.ad.social.l;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import zl0.a1;
import km9.a;
import com.kuaishou.live.ad.social.t$b;
import com.kuaishou.live.ad.social.t;
import java.lang.String;
import fq5.b;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler;
import zl0.g1;
import zl0.a0;
import zl0.r1;
import bi3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lp3.c;
import lp3.i;
import zl0.i1;
import com.kuaishou.live.ad.social.j;
import zl0.q1;

public final class k implements c	// class@000a15
{
    public final l a;

    public void k(l p0){
       this.a = p0;
    }
    public final List a(){
       long l;
       k ta = this.a;
       Objects.requireNonNull(ta);
       ArrayList uArrayList = new ArrayList();
       a1 uoa1 = ta.s.pn();
       uoa1 = (uoa1 != null)? uoa1.b: 0;
       t$b uob = t.a();
       uob.c(uoa1);
       uob.e(true);
       uob.f(ta.p.getLiveStreamId());
       uob.b(ta.p.d());
       uArrayList.add(new LiveAdGetLiveConversionInfoHandler(uob.a()));
       uArrayList.add(new g1(new a0(ta)));
       a uoa = a.class;
       if (!PatchProxy.applyVoid(null, ta, l.class, "8") && ta.q != null) {
          if (!TextUtils.x(ta.u)) {
             ta.q.a(uoa).rl(5);
          }else if(ta.q.a(uoa).ak() == 5){
             ta.q.a(uoa).rl(0);
          }
       }
       uArrayList.add(new i1(j.a));
       return uArrayList;
    }
}
