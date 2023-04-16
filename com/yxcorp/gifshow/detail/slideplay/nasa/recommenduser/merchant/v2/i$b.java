package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import o6a.l;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.util.Objects;
import o6a.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import uw9.o;
import java.lang.Exception;
import q87.c;

public class i$b extends m	// class@0017a4
{
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$b.class, "1")) {
          return;
       }
       i$b tc = this.c;
       Object[] objArray = null;
       if (tc.p != null) {
          i t = tc.t;
          if (t != null && !t.isAnimating()) {
             if (this.c.p.e()) {
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10397b), 0);
             }
             t = this.c.p;
             Objects.requireNonNull(t);
             l ol = l.class;
             if (!PatchProxy.applyVoidWithListener(objArray, t, ol, "2")) {
                if (t.e()) {
                   PatchProxy.onMethodExit(ol, "2");
                }else {
                   i = 1;
                   int i1 = t.d + i;
                   t.d = i1;
                   t.f(i1, i);
                   PatchProxy.onMethodExit(ol, "2");
                }
             }
          }
       }
       k ok = k.class;
       if (!PatchProxy.applyVoidWithListener(objArray, objArray, ok, "2")) {
          try{
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CHANGE_RECO_FRIENDS_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.batchUserPackage = new ClientContent$BatchUserPackage();
             u1.M(null, null, 1, uElementPack, uContentPack, null);
          }catch(java.lang.Exception e0){
             Object[] objArray1 = new Object[0];
             o.C().t("MerchantRecommendUserLoggerV2", e0.toString(), objArray1);
          }
          PatchProxy.onMethodExit(ok, "2");
       }
       PatchProxy.onMethodExit(i$b.class, "1");
       return;
    }
}
