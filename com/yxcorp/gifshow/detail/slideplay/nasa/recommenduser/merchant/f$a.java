package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.e;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.entity.b;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.f$b;
import java.lang.Runnable;
import android.os.Handler;
import tca.a;
import m6a.w;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class f$a extends m	// class@001793
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       int i2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, f$a.class, "1")) {
          return;
       }
       f$a c = obj.c;
       Objects.requireNonNull(c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, c, f.class, "4")) {
          f p = c.p;
          if (p == null) {
             PatchProxy.onMethodExit(f.class, "4");
          }else {
             MerchantRecommendUserManager merchantReco = MerchantRecommendUserManager.class;
             String str = "6";
             ClientContent$BatchUserPackage obj1 = PatchProxy.applyWithListener(objArray, p, merchantReco, str);
             int i = 0;
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator = p.b.iterator();
                while (iterator.hasNext()) {
                   Object obj2 = iterator.next();
                   i2 = obj2.isFollowingOrFollowRequesting() ^ 1;
                   if (i2) {
                      uArrayList1.add(obj2);
                   }
                }
                if (uArrayList1.isEmpty()) {
                   MerchantRecommendUserManager a = p.a;
                   a = (a == null || a.isEmpty())? 1: 0;
                   if (a) {
                      b = true;
                   label_007b :
                      PatchProxy.onMethodExit(merchantReco, str);
                   }
                }
                b = false;
                goto label_007b ;
             }
             if (b) {
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10397b), i);
                PatchProxy.onMethodExit(f.class, "4");
             }else {
                ArrayList uArrayList = new ArrayList(c.p.b());
                q.c(uArrayList, e.a);
                if (uArrayList.isEmpty()) {
                   PatchProxy.onMethodExit(f.class, "4");
                }else {
                   b uob = new b();
                   uob.a(uArrayList, String.valueOf(224));
                   uob.b(new f$b(uArrayList, objArray, c.s));
                   w ow = w.class;
                   if (!PatchProxy.applyVoidOneRefsWithListener(uArrayList, objArray, ow, "4")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FOLLOW_ALL_BUTTON";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      obj1 = new ClientContent$BatchUserPackage();
                      uContentPack.batchUserPackage = obj1;
                      String str1 = "5";
                      ClientContent$UserPackage[] userPackageA = PatchProxy.applyOneRefsWithListener(uArrayList, objArray, ow, str1);
                      if (userPackageA != patchProxyRe) {
                      }else {
                         int i1 = uArrayList.size();
                         userPackageA = new ClientContent$UserPackage[i1];
                         for (; i < i1; i = i + 1) {
                            userPackageA[i] = new ClientContent$UserPackage();
                            i2 = uArrayList.get(i).mPosition + 1;
                            userPackageA[i].index = i2;
                            userPackageA[i].identity = uArrayList.get(i).getId();
                         }
                         PatchProxy.onMethodExit(ow, str1);
                      }
                      obj1.userPackage = userPackageA;
                      u1.M(null, null, 1, uElementPack, uContentPack, null);
                      PatchProxy.onMethodExit(ow, "4");
                   }
                   PatchProxy.onMethodExit(f.class, "4");
                }
             }
          }
       }
       PatchProxy.onMethodExit(f$a.class, "1");
       return;
    }
}
