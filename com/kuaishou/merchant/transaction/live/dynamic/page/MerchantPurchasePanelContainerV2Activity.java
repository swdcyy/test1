package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelContainerV2Activity;
import jj4.a;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin$b;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelContainerV2Activity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import gd4.d;
import gd4.d$a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.CharSequence;
import kj4.a;
import kj4.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.lang.reflect.Type;
import java.util.Collection;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.utility.n;
import et3.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import jj4.d;
import hka.a;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import tkd.b;
import tkd.d;
import fs5.a;
import ue4.w;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantPurchasePanelV2Fragment$a;

public final class MerchantPurchasePanelContainerV2Activity extends MerchantSingleFragmentActivity implements a, MakeActivityHalfScreenPlugin$b	// class@0007b1
{
    public HashMap A;
    public static final MerchantPurchasePanelContainerV2Activity$a B;

    static {
       MerchantPurchasePanelContainerV2Activity.B = new MerchantPurchasePanelContainerV2Activity$a(null);
    }
    public void MerchantPurchasePanelContainerV2Activity(){
       super();
    }
    public final void B3(){
       a$a uoa;
       MerchantPurchasePanelContainerV2Activity merchantPurc = MerchantPurchasePanelContainerV2Activity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantPurc, "10")) {
          return;
       }
       MerchantTransactionLogBiz obj = PatchProxy.apply(objArray, this, merchantPurc, "12");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.w3().isDetached()){
          objArray = d.n.a(this.w3()).s0();
       }
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerV2Activity.class, "11")) {
          return;
       }
       this.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchasePanelContainerV2Activity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://merchant/purchasepanelv2";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchasePanelContainerV2Activity.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerV2Activity.class, "2")) {
          List value = a.t().getValue("mt_purchase_panel_preload_tk_bundle", List.class, null);
          String str = (value == null || value.isEmpty())? 1: null;
          if (!str) {
             BundlePreloadUtil.c(value);
          }
       }
       if (p0 != null) {
          p0.remove("android:support:fragments");
       }
       try{
          if (!PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerV2Activity.class, "4")) {
             Intent intent = this.getIntent();
             if (intent != null) {
                intent.putExtra("absoluteHeight", (int)((float)n.w(this) * a.a));
             }
             intent = this.getIntent();
             if (intent != null) {
                intent.putExtra("isHalf", true);
             }
          }
       }catch(java.lang.Exception e2){
          a.g(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "MerchantPurchasePanelContainerActivity", "initPanelControlParamFailed:"+e2.getMessage());
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerV2Activity.class, "8")) {
          this.F2(new d(this));
       }
       this.i = 0x7f01010d;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerV2Activity.class, "13")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onResume(){
       boolean b;
       MerchantPurchasePanelContainerV2Activity merchantPurc = MerchantPurchasePanelContainerV2Activity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantPurc, "5")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, merchantPurc, "6")) {
          Intent obj = PatchProxy.apply(objArray, this, merchantPurc, "14");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.getIntent();
             if (obj != null) {
                Uri data = obj.getData();
                if (data != null) {
                   String str = x0.a(data, "fromFullPage");
                   if (str != null) {
                      objArray = Boolean.valueOf(Boolean.parseBoolean(str));
                   }
                   if (objArray != null) {
                      b = objArray.booleanValue();
                   }
                }
             }
             b = false;
          }
          int i = -1397441499;
          if (b) {
             d.a(i).Q1(true);
          }else if(d.a(i).h1()){
             d.a(i).Q1(false);
          }
       }
       return;
    }
    public boolean q0(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchasePanelContainerV2Activity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.B3();
       return true;
    }
    public Fragment u3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Intent obj = PatchProxy.apply(null, this, MerchantPurchasePanelContainerV2Activity.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       if (obj != null) {
          Object obj1 = PatchProxy.applyOneRefs(obj, null, w.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             Uri data1 = obj.getData();
             if (data1 != null && data1.isHierarchical() == true) {
                data1 = obj.getData();
                if (data1 != null) {
                   String encodedQuery = data1.getEncodedQuery();
                   if (encodedQuery != null) {
                      encodedQuery = (encodedQuery.length() > 0)? 1: 0;
                      if (encodedQuery == 1) {
                         b = true;
                      }
                   }
                }
             }
             b = false;
          }
          if (b == true) {
             obj = this.getIntent();
             a.m(obj);
             Uri data = obj.getData();
             a.m(data);
             return MerchantPurchasePanelV2Fragment.z.a(data.toString(), null, null, null);
          }
       }
       a.g(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "MerchantPurchasePanelContainerActivity", "createFragmentFailed:uri invalid");
       this.finish();
       return null;
    }
}
