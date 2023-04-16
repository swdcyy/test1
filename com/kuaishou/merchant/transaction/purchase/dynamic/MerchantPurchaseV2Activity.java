package com.kuaishou.merchant.transaction.purchase.dynamic.MerchantPurchaseV2Activity;
import je.a;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import hka.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Collection;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import ekd.i;
import com.kuaishou.merchant.transaction.purchase.dynamic.MerchantPurchaseV2Fragment;

public final class MerchantPurchaseV2Activity extends MerchantSingleFragmentActivity implements a	// class@0008fa
{
    public HashMap A;

    public void MerchantPurchaseV2Activity(){
       super();
    }
    public boolean A3(){
       return true;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseV2Activity.class, "5")) {
          return;
       }
       this.onBackPressed();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchaseV2Activity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseV2Activity.class, "4")) {
          return;
       }
       if (this.w3() instanceof a) {
          Fragment uFragment = this.w3();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.fragment.component.BackPressable");
          if (uFragment.onBackPressed()) {
             return;
          }
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       MerchantPurchaseV2Activity merchantPurc = MerchantPurchaseV2Activity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, merchantPurc, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, merchantPurc, "2")) {
          List value = a.t().getValue("mtp_preload_tk_bundle_list", List.class, objArray);
          objArray = (value == null || value.isEmpty())? 1: 0;
          if (!objArray) {
             BundlePreloadUtil.c(value);
          }
       }
       super.onCreate(p0);
       i.i(this, 0, true, 0);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchaseV2Activity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantPurchaseV2Fragment();
    }
}
