package com.kuaishou.merchant.transaction.order.orderlist.search.previous.MerchantOrderSearchPreviousFragment;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import v99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ql4.g;
import androidx.fragment.app.Fragment;
import ql4.c;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.f;
import ql4.a;
import java.util.List;
import im8.c;
import java.util.Map;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.a;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.MerchantOrderSearchPreviousFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import rl4.n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import y8c.g;
import ol4.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import vl4.i;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;

public class MerchantOrderSearchPreviousFragment extends MerchantRecycleFragment	// class@0008b0
{
    public a I;
    public a J;
    public n K;
    public int L;
    public SearchParams M;
    public a N;
    public static final int O;

    public void MerchantOrderSearchPreviousFragment(){
       super();
       this.N = new a();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MerchantOrderSearchPreviousFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new g(this));
       obj.U7(new c(this));
       obj.U7(new f(this));
       obj.U7(new a(this));
       PatchProxy.onMethodExit(MerchantOrderSearchPreviousFragment.class, "4");
       return obj;
    }
    public String C1(){
       return "MERCHANT_ORDER_SEARCH_HOME";
    }
    public String D1(){
       return "电商订单搜索首页";
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, MerchantOrderSearchPreviousFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("LIVE_ORDER_CHECK_ORDER_VIEW_MODEL", this.K));
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d0f00;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantOrderSearchPreviousFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantOrderSearchPreviousFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "MERCHANT_ORDER_SEARCH_HOME";
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderSearchPreviousFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, MerchantOrderSearchPreviousFragment.class, "7")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             this.M = SerializableHook.getSerializable(arguments, "searchParams");
             this.L = arguments.getInt("searContainerId", -1);
          }
          if (this.M == null) {
             this.M = new SearchParams();
          }
       }
       this.I = new a();
       n on = ViewModelProviders.of(this, new MerchantOrderSearchPreviousFragment$a(this)).get(n.class);
       this.K = on;
       this.I.m = on;
       on.J.setValue(this.M);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderSearchPreviousFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J == null) {
          this.J = new a(this, this.N, this.K);
       }
       return this.J;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderSearchPreviousFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h0().addItemDecoration(new i());
       return i.f();
    }
    public i yh(){
       return this.I;
    }
}
