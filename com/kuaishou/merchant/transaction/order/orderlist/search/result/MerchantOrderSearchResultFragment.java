package com.kuaishou.merchant.transaction.order.orderlist.search.result.MerchantOrderSearchResultFragment;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import v99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.viewbinder.OrderSearchResultHeaderViewBinder;
import androidx.fragment.app.Fragment;
import tl4.c;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.f;
import tl4.a;
import java.util.List;
import im8.c;
import java.util.Map;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import sl4.b;
import com.kuaishou.merchant.transaction.order.orderlist.search.result.MerchantOrderSearchResultFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ul4.d;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.a;
import sl4.a;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import vl4.i;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;

public class MerchantOrderSearchResultFragment extends MerchantRecycleFragment	// class@0008b4
{
    public a I;
    public b J;
    public a K;
    public SearchParams L;
    public a M;
    public static final int N;

    public void MerchantOrderSearchResultFragment(){
       super();
       this.M = new a();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MerchantOrderSearchResultFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new OrderSearchResultHeaderViewBinder(this));
       obj.U7(new c(this));
       obj.U7(new f(this));
       obj.U7(new a(this));
       PatchProxy.onMethodExit(MerchantOrderSearchResultFragment.class, "6");
       return obj;
    }
    public String C1(){
       return "MERCHANT_ORDER_SEARCH_RESULT";
    }
    public String D1(){
       return "电商订单搜索结果页";
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return true;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, MerchantOrderSearchResultFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("LIVE_ORDER_CHECK_ORDER_VIEW_MODEL", this.I));
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d0f01;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantOrderSearchResultFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantOrderSearchResultFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "MERCHANT_ORDER_SEARCH_RESULT";
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderSearchResultFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, MerchantOrderSearchResultFragment.class, "3")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             this.L = SerializableHook.getSerializable(arguments, "searchParams");
          }
          if (this.L == null) {
             this.L = new SearchParams();
          }
       }
       this.J = new b(this.L.mInputText);
       this.I = ViewModelProviders.of(this, new MerchantOrderSearchResultFragment$a(this)).get(d.class);
       this.K = new a(this.I, this.M, this);
       p0.m = this.I;
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderSearchResultFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K == null) {
          this.K = new a(this.I, this.M, this);
       }
       return this.K;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderSearchResultFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h0().addItemDecoration(new i());
       return i.f();
    }
    public i yh(){
       return this.J;
    }
}
