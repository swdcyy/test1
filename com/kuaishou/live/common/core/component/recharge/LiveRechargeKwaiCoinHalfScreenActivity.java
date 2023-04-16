package com.kuaishou.live.common.core.component.recharge.LiveRechargeKwaiCoinHalfScreenActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import com.kuaishou.live.common.core.component.recharge.LiveRechargeKwaiCoinHalfScreenDialogFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.recharge.d;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import wkd.b;
import ad5.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import kq3.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import rw1.g;

public class LiveRechargeKwaiCoinHalfScreenActivity extends SingleFragmentActivity	// class@001744
{

    public void LiveRechargeKwaiCoinHalfScreenActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, LiveRechargeKwaiCoinHalfScreenActivity.class, "3")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f01010d);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveRechargeKwaiCoinHalfScreenActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRechargeKwaiCoinHalfScreenActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Window window = this.getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.gravity = 80;
       attributes.flags = 2048;
       attributes.height = a1.e(0x43fa0000);
       window.setAttributes(attributes);
       this.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.setFinishOnTouchOutside(true);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRechargeKwaiCoinHalfScreenActivity.class, "4")) {
          return;
       }
       p0.clear();
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, LiveRechargeKwaiCoinHalfScreenActivity.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent().getBundleExtra("LIVE_RECHARGE_KWAI_COIN_LIST_PAGE");
       if (obj == null) {
          return objArray;
       }
       String str = obj.getString("LIVE_RECHARGE_SOURCE");
       String str1 = obj.getString("LIVE_RECHARGE_LIVE_STREAM_ID");
       String str2 = obj.getString("LIVE_RECHARGE_ANCHOR_USER_ID");
       LiveRechargeKwaiCoinHalfScreenDialogFragment obj1 = PatchProxy.applyFourRefs(str, this, str1, str2, null, LiveRechargeKwaiCoinHalfScreenDialogFragment.class, "1");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(TextUtils.x(str1) || TextUtils.x(str2)){
          obj1 = new LiveRechargeKwaiCoinHalfScreenDialogFragment();
          b.c0(LiveLogTag.LIVE_RECHARGE, "Go to Recharge_Kwai_Coin_List_Page", "source", str);
          ImmutableMap immutableMap = PatchProxy.applyThreeRefs(str1, str2, "halfScreen", null, d.class, "9");
          if (immutableMap != patchProxyRe) {
          }else {
             immutableMap = ImmutableMap.of("live_stream_id", str1, "anchor_user_id", str2, "scene", "halfScreen");
          }
          str2 = PatchProxy.applyTwoRefs(str, immutableMap, objArray, d.class, "13");
          if (str2 != patchProxyRe) {
          }else {
             String str3 = WebEntryUrls.l0+"?balance="+b.a(0x4c90014d).q()+"&type="+str;
             if (!q.h(immutableMap)) {
                Iterator iterator = immutableMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   str3 = str3+"&"+uEntry.getKey()+"="+uEntry.getValue();
                }
             }
             str2 = str3;
          }
          a uoa = a.b(this);
          uoa.b.setLayoutType("5").setProgressBarColor("#00000000").setEnableLoading(true);
          obj1.A = a.c().b(str2, uoa);
          objArray = obj1;
       }
       if (objArray != null) {
          objArray.B = new g(this);
       }
       return objArray;
    }
}
