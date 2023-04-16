package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailActivity;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import hx3.n;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment;
import java.util.Objects;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$a;

public final class MerchantMicroDetailActivity extends MerchantSingleFragmentActivity	// class@001759
{
    public HashMap A;

    public void MerchantMicroDetailActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantMicroDetailActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       List list = PatchProxy.apply(null, null, n.class, str);
       if (list != PatchProxyResult.class) {
       }else {
          list = a.t().getValue("merchantMicroDetailTKBundlePreload", List.class, n.a());
       }
       if (list != null) {
          BundlePreloadUtil.c(list);
       }
       return;
    }
    public Fragment u3(){
       MerchantMicroDetailActivity merchantMicr = MerchantMicroDetailActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, merchantMicr, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.apply(objArray, this, merchantMicr, "3");
       if (str != patchProxyRe) {
       }else if(this.getIntent() != null && this.getIntent().getData() != null){
          Uri data = this.getIntent().getData();
          if (data != null && (data.isHierarchical() == true && !TextUtils.x(data.getEncodedQuery()))) {
             str = data.toString();
          }
       }
    label_004b :
       str = objArray;
       if (str != null) {
          MerchantMicroDetailFragment$a u = MerchantMicroDetailFragment.u;
          Objects.requireNonNull(u);
          objArray = PatchProxy.applyOneRefs(str, u, MerchantMicroDetailFragment$a.class, "1");
          if (objArray != patchProxyRe) {
          }else {
             objArray = new MerchantMicroDetailFragment();
             Bundle uBundle = new Bundle();
             uBundle.putString("pageUrl", str);
             objArray.setArguments(uBundle);
          }
       }
       return objArray;
    }
}
