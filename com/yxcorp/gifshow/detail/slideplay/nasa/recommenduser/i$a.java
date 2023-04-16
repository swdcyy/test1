package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import qvb.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.h;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.entity.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i$b;
import k6a.k;
import java.lang.Runnable;
import tca.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import k6a.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.User;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.Iterator;

public class i$a extends m	// class@00176f
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       Iterator obj = this;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, i$a.class, "1")) {
          return;
       }
       i$a c = obj.c;
       Objects.requireNonNull(c);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, c, i.class, "5")) {
          List items = c.q.getItems();
          q.c(items, h.a);
          b uob = new b();
          uob.a(items, String.valueOf(187));
          uob.b(new i$b(items, new k(c)));
          String str = c.q.V1();
          if (!PatchProxy.applyVoidTwoRefsWithListener(items, str, objArray, u.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FOLLOW_ALL_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             uContentPack.batchUserPackage = uBatchUserPa;
             String str1 = "4";
             ClientContent$UserPackage[] userPackageA = PatchProxy.applyOneRefsWithListener(items, objArray, u.class, str1);
             if (userPackageA != PatchProxyResult.class) {
             }else {
                i = items.size();
                ClientContent$UserPackage[] userPackageA1 = new ClientContent$UserPackage[i];
                int i1 = 0;
                while (i1 < i) {
                   userPackageA1[i1] = new ClientContent$UserPackage();
                   int i2 = items.get(i1).mPosition + 1;
                   userPackageA1[i1].index = i2;
                   userPackageA1[i1].identity = items.get(i1).getId();
                   i1 = i1 + 1;
                   i2 = this;
                }
                PatchProxy.onMethodExit(u.class, str1);
                userPackageA = userPackageA1;
             }
             uBatchUserPa.userPackage = userPackageA;
             u1.M(null, null, 1, uElementPack, uContentPack, null);
             obj = items.iterator();
             while (obj.hasNext()) {
                u.i(str, obj.next());
             }
             PatchProxy.onMethodExit(u.class, "3");
          }
          PatchProxy.onMethodExit(i.class, "5");
       }
       PatchProxy.onMethodExit(i$a.class, "1");
       return;
    }
}
