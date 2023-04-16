package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;
import jl4.h;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import jl4.g;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import ml4.a;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import java.util.Objects;
import fl4.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse$SearchInfo;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.kuaishou.merchant.transaction.order.orderlist.search.MerchantOrderSearchActivity;
import android.content.Intent;
import android.net.Uri;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ServiceEntryInfo;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import tkd.b;
import tkd.d;
import vs3.a;
import java.util.Map;
import ekd.q;
import java.util.HashMap;
import ekd.m1;
import com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotViewV2;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$b;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.c$c;

public class c extends b	// class@0008a6
{
    public OrderRedDotViewV2 A;
    public OrderRedDotViewV2 B;
    public OrderRedDotViewV2 C;
    public m x;
    public a y;
    public TextView z;

    public void c(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       super.E8();
       this.A.setVisibility(8);
       this.B.setVisibility(8);
       this.C.setVisibility(8);
       this.J0(this.x.j.h, new h(this));
       this.J0(this.x.l.h, new g(this));
       return;
    }
    public void F8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       super.F8();
       this.x = ViewModelProviders.of(this.P8()).get(m.class);
       this.y = ViewModelProviders.of(this.P8()).get(a.class);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          String str = 8;
          if (this.d9()) {
             if (!PatchProxy.applyVoid(objArray, this, uoc, "14")) {
                this.t.setVisibility(0);
                this.z.setVisibility(str);
             }
          }else if(PatchProxy.applyVoid(objArray, this, uoc, "15")){
             this.z.setText(a1.p(R.string.arg_RES_7f1033aa));
             this.z.setVisibility(0);
             this.t.setVisibility(str);
          }
       }
       m f = this.x.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(objArray, f, d.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SEARCH_BAR";
          u1.y0(f.a(), 1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public a S8(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(this.P8()).get(a.class);
    }
    public String V8(){
       OrderListResponse obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x.j.h.getValue();
       if (obj != null) {
          obj = obj.mSearchInfo;
          if (obj != null) {
             return obj.mOrderPrompt;
          }
       }
       return super.V8();
    }
    public void Y8(View p0){
       Intent intent;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "7")) {
          return;
       }
       m f = this.x.f;
       Objects.requireNonNull(f);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, f, d.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SEARCH_BAR";
          u1.A(f.a(), "", 1, uElementPack, new ClientContent$ContentPackage());
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "12")) {
          Context context = this.getContext();
          Object obj = this.x.g.getValue();
          Object obj1 = this.y.c.getValue();
          if (!PatchProxy.applyVoidThreeRefs(context, obj, obj1, null, MerchantOrderSearchActivity.class, "1")) {
             MerchantOrderSearchActivity merchantOrde = MerchantOrderSearchActivity.class;
             try{
                intent = new Intent(context, merchantOrde);
                intent.setData(Uri.parse(obj));
             }catch(java.lang.NullPointerException e1){
                a.l(MerchantTransactionLogBiz.ORDER, "MerchantOrderSearchActivity", "change url to uri failure", e1);
             }
             SerializableHook.putExtra(intent, "searchParams", obj1);
             context.startActivity(intent);
          }
       }
       return;
    }
    public boolean a9(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.d9() ^ 0x01);
    }
    public final void c9(ServiceEntryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p0.mUrl)) {
          if (!this.R8().isAdded()) {
             return;
          }else if(this.R8().getActivity() == null || this.R8().getActivity().isFinishing()){
             d.a(0x7074b578).XZ(this.R8().getActivity(), p0.mUrl);
          }
       }
       return;
    }
    public final boolean d9(){
       Object obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.y.c.getValue() != null && (!q.h(this.y.c.getValue().mPostParams) && TextUtils.n(this.y.c.getValue().mPostParams.get("enableSearch"), "true")))? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.z = m1.f(p0, 0x7f0a2f19);
       this.A = m1.f(p0, 0x7f0a2f14);
       this.B = m1.f(p0, 0x7f0a2f13);
       this.C = m1.f(p0, 0x7f0a2f16);
       m1.b(p0, new c$a(this), R.id.order_header_right_cs_view);
       m1.b(p0, new c$b(this), R.id.order_header_right_after_sale_view);
       m1.b(p0, new c$c(this), R.id.order_header_right_setting_view);
       return;
    }
}
