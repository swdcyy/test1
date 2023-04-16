package com.yxcorp.gifshow.profile.presenter.profile.g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.l;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.r0;
import com.kwai.framework.model.user.User;
import qvb.i;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.constant.ProfileTab;
import k2b.e0;
import t3c.c;
import l3c.a0;
import j4c.j;
import lkd.b;
import j4c.m;
import com.yxcorp.gifshow.profile.presenter.profile.a;
import j4c.i;
import com.yxcorp.gifshow.profile.presenter.profile.b;

public final class g implements g	// class@001493
{
    public final l b;
    public final int c;

    public void g(l p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       p0 = tb.u;
       if (p0 != null) {
          tb.y = p0.mLike;
       }
       if (!PatchProxy.applyVoid(null, tb, l.class, "10")) {
          p0 = tb.t.b;
          if (p0 != null) {
             User mOwnerCount = p0.mOwnerCount;
             if (mOwnerCount != null) {
                mOwnerCount.mLike = l.V8(tb.q);
                tb.v = true;
                p0.notifyChanged();
             }
          }
       }
       c.d(tb.r, tc, ProfileTab.TAB_LIKE);
       p0 = tb.s;
       if (tb.q.isEmpty()) {
          p0.C(new j(tb));
          p0.B(new m(tb));
          if (tb.p != null) {
             p0.A(a.a);
          }
          p0.i();
       }else {
          p0.H(new i(tc));
          p0.G(b.a);
          p0.p();
       }
       return;
    }
}
