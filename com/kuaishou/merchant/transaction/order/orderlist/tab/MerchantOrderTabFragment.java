package com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment;
import bb4.c;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import v99.a;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import yl4.m0;
import androidx.fragment.app.Fragment;
import yl4.b;
import yl4.n0;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.f;
import com.kuaishou.merchant.transaction.base.detail.newguesslike.autoplay.MerchantAutoPlayPagePresenter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Map;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderCommodityResponse;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.HashMap;
import java.lang.Boolean;
import brd.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import xm4.a;
import java.util.List;
import im8.c;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.order.orderlist.tab.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import lnc.o5;
import zl4.a;
import g9c.d;
import yl4.k0;
import xk4.e;
import vl4.f;
import android.content.Context;
import vl4.j;
import com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import y8c.g;
import vl4.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import vl4.i;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;

public class MerchantOrderTabFragment extends MerchantRecycleFragment implements c	// class@0008bc
{
    public a I;
    public String J;
    public OrderCommodityResponse K;
    public a L;
    public PresenterV2 M;
    public ClientEvent$UrlPackage N;
    public j O;
    public HashMap P;
    public boolean Q;
    public boolean R;
    public a S;
    public c T;
    public t U;
    public c V;
    public t W;
    public static final int X;

    public void MerchantOrderTabFragment(){
       super();
       this.S = new a();
       PublishSubject publishSubje = PublishSubject.g();
       this.T = publishSubje;
       this.U = publishSubje.hide();
       publishSubje = PublishSubject.g();
       this.V = publishSubje;
       this.W = publishSubje.hide();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MerchantOrderTabFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new m0(this));
       obj.U7(new b(this));
       obj.U7(new n0(this));
       obj.U7(new f(this));
       obj.U7(new MerchantAutoPlayPagePresenter(this, this.h0()));
       PatchProxy.onMethodExit(MerchantOrderTabFragment.class, "13");
       return obj;
    }
    public String C1(){
       return null;
    }
    public String D1(){
       return null;
    }
    public boolean S1(){
       return true;
    }
    public void W3(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderTabFragment.class, "22")) {
          return;
       }
       OrderCommodityResponse orderCommodi = p0.get("KEY_ORDER_TAB_DATA");
       this.N = p0.get("KEY_ORDER_LIST_URL_PACKAGE");
       this.P = p0.get("key_kwai_order_list_link_query_params");
       if (this.K == null) {
          this.K = orderCommodi;
       }
       return;
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "15")) {
          return;
       }
       if (this.Q != null) {
          super.a();
       }
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "17")) {
          return;
       }
       super.c0();
       this.Q = false;
       this.T.onNext(Boolean.TRUE);
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantOrderTabFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d0f02, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, MerchantOrderTabFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("LIVE_ORDER_CHECK_ORDER_VIEW_MODEL", this.I));
       obj.add(new c("LOAD_MORE_OFFSET", Integer.valueOf(6)));
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantOrderTabFragment.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "7")) {
          a uoa = new a();
          this.L = uoa;
          MerchantOrderTabFragment tI = this.I;
          tI.c = uoa;
          MerchantOrderTabFragment tK = this.K;
          if (!PatchProxy.applyVoidTwoRefs(tK, tI, uoa, a.class, "1")) {
             uoa.n = tK;
             uoa.m = tI;
             OrderCommodityResponse mTab = (tK != null)? tK.mTab: o5.b(tI.e.get("tabId"), 0);
             uoa.o = mTab;
          }
          this.I.K = this.K;
       }
       super.fh(p0, p1);
       this.ia().R0(this.h0());
       if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderTabFragment.class, "19")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.M = presenterV2;
          presenterV2.U7(new k0(this));
          this.M.f(p0);
          Object[] objArray = new Object[true];
          objArray[0] = new e();
          this.M.i(objArray);
       }
       this.R = true;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantOrderTabFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MerchantOrderTabFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MerchantOrderTabFragment.class, new f());
       }else {
          obj.put(MerchantOrderTabFragment.class, null);
       }
       return obj;
    }
    public boolean i0(){
       MerchantOrderTabFragment tK = this.K;
       boolean b = (tK == null || tK.mEnableFetchOrderList != null)? true: false;
       return b;
    }
    public boolean lh(){
       return true;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderTabFragment.class, "4")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "21") && this.getArguments() != null) {
          this.J = this.getArguments().getString("KEY_MERCHANT_ROUTER_URL", "");
       }
       j oj = new j();
       this.O = oj;
       oj.b(this);
       this.L = new a();
       this.I = ViewModelProviders.of(this, new MerchantOrderTabFragment$a(this)).get(a.class);
       if (!PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "5") && this.I.C0()) {
          this.u();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "10")) {
          return;
       }
       MerchantOrderTabFragment tM = this.M;
       if (tM != null) {
          tM.destroy();
       }
       this.R = false;
       super.onDestroyView();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MerchantOrderTabFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantOrderTabFragment.class, "18")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.T.onNext(Boolean.valueOf(p0));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderTabFragment.class, "16")) {
          return;
       }
       super.u();
       this.Q = true;
       if (this.R != null) {
          this.a();
       }
       this.V.onNext(Boolean.TRUE);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderTabFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.I, this, this.S);
    }
    public boolean x0(){
       return false;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderTabFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h0().addItemDecoration(new i());
       return i.f();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderTabFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.L == null) {
          this.L = new a();
       }
       return this.L;
    }
}
