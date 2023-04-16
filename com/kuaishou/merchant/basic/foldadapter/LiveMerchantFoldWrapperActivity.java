package com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldWrapperActivity;
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
import com.kuaishou.merchant.basic.util.FoldUtils;
import android.view.Window;
import ekd.i;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import ekd.j0;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldWrapperActivity$FoldWrapperFragment;

public class LiveMerchantFoldWrapperActivity extends MerchantSingleFragmentActivity	// class@0015b3
{

    public void LiveMerchantFoldWrapperActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantFoldWrapperActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantFoldWrapperActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (FoldUtils.a(this)) {
          this.getWindow().setBackgroundDrawableResource(R.color.arg_RES_7f06202f);
       }
       i.i(this, 0, true, true);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantFoldWrapperActivity.class, "3")) {
          return;
       }
       p0.clear();
       return;
    }
    public Fragment u3(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, LiveMerchantFoldWrapperActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j0.f(this.getIntent(), "fragment_tag");
       LiveMerchantFoldWrapperActivity$FoldWrapperFragment uFoldWrapper = PatchProxy.applyOneRefs(obj, objArray, LiveMerchantFoldWrapperActivity$FoldWrapperFragment.class, "1");
       if (uFoldWrapper != PatchProxyResult.class) {
       }else {
          uFoldWrapper = new LiveMerchantFoldWrapperActivity$FoldWrapperFragment();
          uFoldWrapper.j = obj;
       }
       return uFoldWrapper;
    }
}
