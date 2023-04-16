package com.kuaishou.merchant.transaction.live.orderconfirmpage.MerchantPurchasePanelContainerActivity;
import gu3.d;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import android.content.Intent;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ue4.t;
import android.content.Context;
import com.yxcorp.utility.n;
import et3.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import gu3.b;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.live.orderconfirmpage.a;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import ekd.x0;
import tkd.b;
import tkd.d;
import fs5.a;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpage.fragment.MerchantPurchasePanelContainerFragment;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.os.Parcelable;
import org.parceler.b;

public class MerchantPurchasePanelContainerActivity extends MerchantSingleFragmentActivity implements d	// class@0007dc
{
    public boolean A;
    public b B;
    public static final int C;

    public void MerchantPurchasePanelContainerActivity(){
       super();
       this.A = false;
    }
    public final Uri B3(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantPurchasePanelContainerActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.getData() != null) {
          Uri data = p0.getData();
          if (data.isHierarchical() && !TextUtils.x(data.getEncodedQuery())) {
             return data;
          }
       }
       return null;
    }
    public boolean E1(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerActivity.class, "13")) {
          return;
       }
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchasePanelContainerActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://merchant/purchasepanel";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       MerchantPurchasePanelContainerActivity merchantPurc = MerchantPurchasePanelContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, merchantPurc, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, merchantPurc, "2") && t.b()) {
          this.overridePendingTransition(false, false);
          this.o3(false);
          Intent intent = this.getIntent();
          if (!PatchProxy.applyVoidTwoRefs(intent, this, objArray, t.class, "4")) {
             t.d(intent, this, "kwai://merchant/purchasepanel", "kwai://merchant/purchasepanelv2");
          }
          this.finish();
       }
       try{
          this.getIntent().putExtra("absoluteHeight", (int)((float)n.w(this) * a.a));
       }catch(java.lang.Exception e0){
       }
       if (p0 != null) {
          p0.remove("android:support:fragments");
       }
       try{
          if (!PatchProxy.applyVoid(objArray, this, e0, "4") && this.getIntent() != null) {
             this.getIntent().putExtra("isHalf", true);
          }
       label_006e :
          this.B = RxBus.f.k(b.class, false).observeOn(d.a).subscribe(new a(this));
          super.onCreate(p0);
          this.i = 0x7f01010d;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerActivity.class, "5")) {
          return;
       }
       super.onDestroy();
       RxBus.f.d(b.class);
       b9.a(this.B);
       return;
    }
    public void onResume(){
       boolean b;
       MerchantPurchasePanelContainerActivity merchantPurc = MerchantPurchasePanelContainerActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantPurc, "10")) {
          return;
       }
       super.onResume();
       Object obj = PatchProxy.apply(objArray, this, merchantPurc, "11");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(Boolean.parseBoolean(x0.a(Uri.parse(this.getIntent().getData().toString()), "fromFullPage"))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          d.a(-1397441499).Q1(true);
       }else if(d.a(-1397441499).h1()){
          d.a(-1397441499).Q1(false);
       }
       return;
    }
    public final Fragment u3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantPurchasePanelContainerActivity merchantPurc = MerchantPurchasePanelContainerActivity.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, merchantPurc, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (t.b()) {
          return objArray;
       }
       obj = this.getIntent();
       Object obj1 = PatchProxy.applyOneRefs(obj, this, merchantPurc, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.B3(obj) == null){
          b = false;
       }else {
          b = true;
       }
       if (!b) {
          a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "MerchantPurchasePanelActivity", "handle intent failed");
          this.finish();
          return objArray;
       }else {
          String obj2 = PatchProxy.apply(objArray, this, merchantPurc, "9");
          if (obj2 != patchProxyRe) {
          }else {
             String str = "1";
             obj2 = TextUtils.c(this.getIntent().getData().toString(), "hideBackIcon", str);
             Bundle obj3 = PatchProxy.applyOneRefs(obj2, objArray, MerchantPurchasePanelContainerFragment.class, str);
             if (obj3 != patchProxyRe) {
                obj2 = obj3;
             }else {
                MerchantPurchasePanelContainerFragment merchantPurc1 = new MerchantPurchasePanelContainerFragment();
                obj3 = new Bundle();
                obj3.putParcelable("MERCHANT_BASE_CONTEXT", b.c(new LiveMerchantBaseContext$Builder().setMerchantSessionId("").build()));
                obj3.putString("KEY_MERCHANT_ROUTER_URL", obj2);
                merchantPurc1.setArguments(obj3);
                obj2 = merchantPurc1;
             }
          }
          return obj2;
       }
    }
}
