package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jga.f$a;
import com.kwai.framework.model.user.User;
import jga.c;
import wca.b;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import y8c.d;
import k6a.u;

public class g$a$e extends m	// class@00176b
{
    public final g$a c;

    public void g$a$e(g$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$a$e.class, "1")) {
          return;
       }
       g$a$e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidWithListener(null, tc, g$a.class, "8")) {
          f$a uoa = new f$a(tc.p, String.valueOf(187));
          uoa.i(b.h(tc.p.getId(), 74));
          uoa.l(String.valueOf(187));
          uoa = uoa.h(tc.p.mFollowActionReasonTextId);
          uoa.q(true);
          FollowHelper.b(uoa.b());
          f.m(tc.p, User$FollowStatus.FOLLOWING);
          u.b(tc.p, tc.q.get(), "follow");
          PatchProxy.onMethodExit(g$a.class, "8");
       }
       PatchProxy.onMethodExit(g$a$e.class, "1");
       return;
    }
}
