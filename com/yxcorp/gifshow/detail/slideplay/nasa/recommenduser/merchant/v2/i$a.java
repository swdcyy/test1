package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o6a.l;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.h;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.entity.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$c;
import o6a.i;
import java.lang.Runnable;
import tca.a;
import o6a.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import uw9.o;
import java.lang.Exception;
import q87.c;

public class i$a extends m	// class@0017a3
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoidWithListener(objArray, tc, i.class, "6")) {
          if (tc.p.d()) {
             s.n(a1.p(R.string.arg_RES_7f10341d), 0);
             PatchProxy.onMethodExit(i.class, "6");
          }else {
             ArrayList uArrayList = new ArrayList(tc.p.c());
             q.c(uArrayList, h.a);
             if (uArrayList.isEmpty()) {
                PatchProxy.onMethodExit(i.class, "6");
             }else {
                b uob = new b();
                uob.a(uArrayList, String.valueOf(224));
                uob.b(new i$c(uArrayList, new i(tc)));
                k ok = k.class;
                if (!PatchProxy.applyVoidOneRefsWithListener(uArrayList, objArray, ok, "1")) {
                   try{
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FOLLOW_ALL_BUTTON";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
                      uContentPack.batchUserPackage = uBatchUserPa;
                      uBatchUserPa.userPackage = k.a(uArrayList);
                      u1.M(null, null, 1, uElementPack, uContentPack, null);
                   }catch(java.lang.Exception e2){
                      Object[] objArray1 = new Object[0];
                      o.C().t("MerchantRecommendUserLoggerV2", e2.toString(), objArray1);
                   }
                   PatchProxy.onMethodExit(ok, "1");
                }
                PatchProxy.onMethodExit(i.class, "6");
             }
          }
       }
       PatchProxy.onMethodExit(i$a.class, "1");
       return;
    }
}
