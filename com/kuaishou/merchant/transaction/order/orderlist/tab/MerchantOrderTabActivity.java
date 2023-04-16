package com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabActivity;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import hl4.a;
import bm4.c;
import lnc.i3;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import hka.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import ekd.i;
import com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment;

public class MerchantOrderTabActivity extends MerchantSingleFragmentActivity	// class@0008ba
{

    public void MerchantOrderTabActivity(){
       super();
    }
    public final String B3(){
       Intent obj = PatchProxy.apply(null, this, MerchantOrderTabActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null && obj.getData() != null) {
          Uri data = obj.getData();
          if (data.isHierarchical() && !TextUtils.isEmpty(data.getEncodedQuery())) {
             return data.toString();
          }
       }
       return "";
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, MerchantOrderTabActivity.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new a();
       obj.a(this.B3());
       String str = PatchProxy.applyOneRefs(obj, objArray, c.class, "1");
       if (str != patchProxyRe) {
       }else {
          i3 oi3 = i3.f();
          if (!TextUtils.isEmpty(obj.a)) {
             oi3.d("carrier_id", obj.a);
          }
          if (!TextUtils.isEmpty(obj.b)) {
             oi3.d("carrier_type", obj.b);
          }
          if (!TextUtils.isEmpty(obj.c)) {
             oi3.d("carrier_entry", obj.c);
          }
          if (!TextUtils.isEmpty(obj.d)) {
             oi3.d("server_exp_tag", obj.d);
          }
          if (!TextUtils.isEmpty(obj.e)) {
             oi3.d("url", obj.e);
          }
          str = oi3.toString();
       }
       return str;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderTabActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "MERCHANT_SINGLE_ORDER_LIST";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderTabActivity.class, "3")) {
          return;
       }
       if (this.w3() instanceof a && this.w3().onBackPressed()) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderTabActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       i.i(this, -1, true, false);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "2";
       String obj = PatchProxy.apply(objArray, this, MerchantOrderTabActivity.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.B3();
       MerchantOrderTabFragment merchantOrde = PatchProxy.applyOneRefs(obj, objArray, MerchantOrderTabFragment.class, str);
       if (merchantOrde != patchProxyRe) {
       }else {
          merchantOrde = new MerchantOrderTabFragment();
          Bundle uBundle = new Bundle();
          uBundle.putString("KEY_MERCHANT_ROUTER_URL", obj);
          merchantOrde.setArguments(uBundle);
       }
       return merchantOrde;
    }
}
