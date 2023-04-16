package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$c;
import tca.a;
import java.util.List;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import yp.l0;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import brd.t;
import o6a.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.j;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Throwable;

public final class i$c implements a	// class@0017a5
{
    public final List a;
    public final WeakReference b;

    public void i$c(List p0,Runnable p1){
       super();
       this.a = p0;
       this.b = new WeakReference(p1);
    }
    public void a(int p0,Map p1){
       if (PatchProxy.isSupport2(i$c.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, i$c.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             User user = iterator.next();
             Integer integer = p1.get(user.getId());
             if (integer == null || integer.intValue() != 1) {
                PatchProxy.onMethodExit(i$c.class, "1");
                return;
             }else if(l0.c(user)){
                uArrayList.add(user);
             }
             f.m(user, User$FollowStatus.FOLLOWING);
          }else {
             String str = "3";
             if (!PatchProxy.applyVoidOneRefsWithListener(uArrayList, this, i$c.class, str)) {
                c.a(uArrayList).subscribe(j.b, e.b);
                PatchProxy.onMethodExit(i$c.class, str);
             }
             if (this.b.get() != null) {
                this.b.get().run();
             }
             p0 = (p0 >= this.a.size())? 0x7f103424: 0x7f10341b;
             break ;
          }
       }
       i.e(R.style.arg_RES_7f11066a, a1.p(p0), 0);
       PatchProxy.onMethodExit(i$c.class, "1");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$c.class, "2")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       PatchProxy.onMethodExit(i$c.class, "2");
       return;
    }
}
