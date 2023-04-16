package com.kuaishou.merchant.transaction.live.orderconfirmpage.fragment.MerchantPurchasePanelFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xj4.f;
import androidx.fragment.app.Fragment;
import xj4.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.util.Map;
import vj4.a;
import lnc.i3;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import ne4.a;
import java.lang.Integer;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import y8c.g;
import uj4.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import wj4.b;

public class MerchantPurchasePanelFragment extends MerchantLivePurchasePanelFragment	// class@0007e0
{
    public static final int V;

    public void MerchantPurchasePanelFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MerchantPurchasePanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new f(this));
       obj.U7(new h());
       PatchProxy.onMethodExit(MerchantPurchasePanelFragment.class, "2");
       return obj;
    }
    public ClientEvent$ExpTagTrans I1(){
       return null;
    }
    public ClientEvent$ExpTagTrans K5(){
       return null;
    }
    public int M(){
       return 1;
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelFragment.class, "6")) {
          return;
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return;
    }
    public void Nh(){
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MerchantPurchasePanelFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MerchantLivePurchasePanelFragment obj = PatchProxy.apply(objArray, this, MerchantPurchasePanelFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.J;
       String str = PatchProxy.applyOneRefs(obj, objArray, a.class, "25");
       if (str != patchProxyRe) {
       }else {
          i3 oi3 = i3.f();
          String str1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "26");
          if (str1 != patchProxyRe) {
          }else {
             str1 = a.d(obj.x, "serverExpTag");
          }
          oi3.d("server_exp_tag", str1);
          oi3.d("item_id", obj.y);
          oi3.d("carrier_id", obj.G);
          oi3.d("carrier_entry", a.d(obj.x, "carrierEntry"));
          oi3.c("carrier_type", Integer.valueOf(obj.F));
          if (!TextUtils.x(obj.L)) {
             oi3.d("ext_type", obj.L);
          }
          if (!TextUtils.x(obj.J)) {
             oi3.d("campaign_type", obj.J);
          }
          if (!TextUtils.x(obj.K)) {
             oi3.d("ad_action_type", obj.K);
          }
          if (!TextUtils.x(obj.T)) {
             oi3.d("error_text", obj.T);
          }
          if (!q.h(obj.S)) {
             Iterator iterator = obj.S.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (!TextUtils.x(uEntry.getKey()) && !TextUtils.x(uEntry.getValue())) {
                   oi3.d(uEntry.getKey(), uEntry.getValue());
                }
             }
          }
          str = oi3.e();
       }
       return str;
    }
    public String o(){
       return "MERCHANT_SIMPL_PURCHASE_HALF_PAGE";
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, MerchantPurchasePanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.J);
       obj.n1("ADAPTER", obj);
       obj.n1("LIVE_AUDIENCE_ORDER_CONFIRM_RECYCLER_VIEW", this.h0());
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchasePanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.J);
    }
}
