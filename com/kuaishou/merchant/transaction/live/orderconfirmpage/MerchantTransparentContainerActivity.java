package com.kuaishou.merchant.transaction.live.orderconfirmpage.MerchantTransparentContainerActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tj4.b;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import com.kuaishou.merchant.router.b;

public class MerchantTransparentContainerActivity extends GifshowActivity	// class@0007dd
{

    public void MerchantTransparentContainerActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MerchantTransparentContainerActivity.class, "2")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantTransparentContainerActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0;
    }
    public void onCreate(Bundle p0){
       MerchantTransparentContainerActivity merchantTran = MerchantTransparentContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, merchantTran, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       String str = PatchProxy.applyOneRefs(intent, this, merchantTran, "3");
       if (str != PatchProxyResult.class) {
       }else {
          try{
             str = "";
             if (intent != null) {
                String stringExtra = (intent.getData() == null || !intent.getData().isHierarchical())? this.getIntent().getStringExtra("url"): x0.a(intent.getData(), "url");
                str = stringExtra;
             }
          }catch(java.lang.Exception e6){
             a.l(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "MerchantTransparentContainerActivity", "parseIntent error", e6);
          }
       }
    }
}
