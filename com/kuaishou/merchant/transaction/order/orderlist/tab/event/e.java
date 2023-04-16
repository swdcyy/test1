package com.kuaishou.merchant.transaction.order.orderlist.tab.event.e;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.payload.TabBusinessPayload;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import ll4.b;
import ll4.a;
import java.util.Map;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.OrderCancelReasonResponse;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import wl4.b;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.OrderCancelReasonResponse$CancelInfo;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import xl4.c;
import xl4.c$a;
import com.yxcorp.utility.n;
import lnc.a1;
import w07.n;
import w07.l;
import u07.t$a;
import xl4.c$d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import wl4.d;
import wl4.e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import wl4.f;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.e$a;
import erd.g;
import crd.b;

public class e extends b	// class@0008c4
{
    public Map h;
    public c i;

    public void e(Fragment p0,a p1){
       super(p0, p1);
    }
    public t e(TabBusinessPayload p0){
       HashMap hashMap;
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mParams;
       if (p0 == null) {
          hashMap = new HashMap();
       }
       this.h = hashMap;
       return a.a().i(this.h).map(new e());
    }
    public void f(){
    }
    public void g(Object p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
       }else {
          OrderCancelReasonResponse mCancelInfo = p0.mCancelInfo;
          String str = "BusinessOrderCancelReason";
          if (mCancelInfo == null) {
             a.s(MerchantTransactionLogBiz.ORDER, str, "onRequestSuccess,mCancelInfo is empty ");
             this.b();
          }else if(mCancelInfo.mNeedCancelReason == null){
             this.h(0);
          }else if(q.f(mCancelInfo.mCancelReasonConfigs)){
             a.s(MerchantTransactionLogBiz.ORDER, str, "onRequestSuccess,mCancelReasonConfigs is empty ");
             this.b();
          }else {
             p0 = p0.mCancelInfo.mCancelReasonConfigs;
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "3")) {
                if (this.c.getActivity() == null || this.c.getActivity().isFinishing()) {
                   this.b();
                }else if(this.i == null){
                   FragmentActivity activity = this.c.getActivity();
                   c$a uoa = PatchProxy.applyOneRefs(activity, null, c.class, "6");
                   if (uoa != PatchProxyResult.class) {
                   }else {
                      uoa = new c$a(activity);
                      uoa.F0 = (n.j(activity) * 3) / 5;
                      uoa.E0 = a1.p(0x7f104b0b);
                      uoa.a0(new n());
                      uoa.v0(new c$d(uoa));
                      uoa.X0(a1.p(R.string.arg_RES_7f1033a5));
                      uoa.N0(R.layout.arg_RES_7f0d0f40);
                      uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d0f41));
                   }
                   uoa.C0 = p0;
                   uoa.D0 = new d(this);
                   uoa.J(new e(this));
                   uoa.p();
                   this.i = uoa.k();
                }
                this.i.Z();
             }
          }
       }
       return;
    }
    public final void h(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "4")) {
          return;
       }
       if (this.h == null) {
          this.h = new HashMap();
       }
       this.h.put("cancelReasonCode", String.valueOf(p0));
       this.a(a.a().f(this.h).map(new e()).subscribe(new f(this), new e$a(this)));
       return;
    }
}
