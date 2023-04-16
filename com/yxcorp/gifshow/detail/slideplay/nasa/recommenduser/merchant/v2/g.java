package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.g;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import o6a.l;
import jga.f$a;
import jga.c;
import wca.b;
import jga.f;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import o6a.k;

public class g extends m	// class@0017a1
{
    public final e$a c;

    public void g(e$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       g tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, tc, e$a.class, "17")) {
          int i = 3;
          if (!tc.p.isFollowingOrFollowRequesting() && (tc.t.a() == 1 || tc.t.a() == i)) {
             tc.S8();
             e$a p = tc.p;
             if (tc.t.a() == 1) {
                i = 4;
             }
             k.b(p, i, tc.t.a());
          }else if(PatchProxy.applyVoidWithListener(objArray, tc, e$a.class, "18")){
             f$a uoa = new f$a(tc.p, String.valueOf(224));
             uoa.i(b.h(tc.p.getId(), 74));
             uoa.l(String.valueOf(224));
             uoa = uoa.h(tc.p.mFollowActionReasonTextId);
             uoa.q(true);
             FollowHelper.c(uoa.b(), new b(tc));
             f.m(tc.p, User$FollowStatus.FOLLOWING);
             k.b(tc.p, 2, tc.t.a());
             PatchProxy.onMethodExit(e$a.class, "18");
          }
          PatchProxy.onMethodExit(e$a.class, "17");
       }
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
