package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.s$a;
import re4.f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oi4.a;
import oi4.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import z1.k;
import kc4.c$a;
import qk4.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nk4.e1;
import kc4.c$b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.UpgradeAddressGuideModel;
import lnc.i3;

public class s$a implements f	// class@00083e
{
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
    }
    public void A7(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "3")) {
          return;
       }
       s$a tb = this.b;
       if (tb.v == null) {
          tb.v = true;
          a uoa = b.a(tb.getActivity());
          s u = this.b.u;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(u, uoa, a.class, "16") && u != null) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "UPGRADE_GUIDE_BAR";
             u1.y0(uoa.e(u), 3, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public void Y6(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "2")) {
          return;
       }
       s$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, s.class, "3")) {
          c$a uoa = tb.t.get();
          d uod = tb.s.get();
          if (uoa != null && (uod != null && (tb.getActivity() != null && !TextUtils.x(p0)))) {
             uoa.a(tb.getActivity(), p0, new e1(tb));
          }
       }
    label_0047 :
       return;
    }
    public void a1(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "1")) {
          return;
       }
       s$a tb = this.b;
       tb.P8(true, tb.p.mAddressId);
       return;
    }
    public void a2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "4")) {
          return;
       }
       a uoa = b.a(this.b.getActivity());
       s u = this.b.u;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidTwoRefs(u, p0, uoa, a.class, "17") && u != null) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UPGRADE_GUIDE_BAR";
          i3 oi3 = i3.f();
          oi3.d("button_name", TextUtils.k(p0));
          uElementPack.params = oi3.e();
          u1.A(uoa.e(u), "", 1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
}
