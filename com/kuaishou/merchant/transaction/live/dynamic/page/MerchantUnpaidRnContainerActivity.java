package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantUnpaidRnContainerActivity;
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
import android.view.View;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantUnpaidRnContainerActivity$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.rx.RxBus;
import gu3.b;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.live.dynamic.page.a;
import erd.g;
import crd.b;

public class MerchantUnpaidRnContainerActivity extends GifshowActivity	// class@0007b5
{
    public boolean y;
    public b z;
    public static final int A;

    public void MerchantUnpaidRnContainerActivity(){
       super();
       this.y = false;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MerchantUnpaidRnContainerActivity.class, "4")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantUnpaidRnContainerActivity.class, "10");
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
       int i;
       MerchantUnpaidRnContainerActivity merchantUnpa = MerchantUnpaidRnContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, merchantUnpa, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d08d1);
       Intent intent = this.getIntent();
       String str = PatchProxy.applyOneRefs(intent, this, merchantUnpa, "5");
       if (str != PatchProxyResult.class) {
       }else {
          try{
             str = "";
             if (intent != null) {
                String str1 = "url";
                String stringExtra = (intent.getData() == null || !intent.getData().isHierarchical())? this.getIntent().getStringExtra(str1): x0.a(intent.getData(), str1);
                str = stringExtra;
             }
          }catch(java.lang.Exception e6){
             a.l(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "MerchantUnpaidRnContainerActivity", "parseIntent error", e6);
          }
       }
    }
}
