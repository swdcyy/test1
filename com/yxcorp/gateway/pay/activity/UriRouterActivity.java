package com.yxcorp.gateway.pay.activity.UriRouterActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.lang.Exception;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import android.net.Uri;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import android.content.Context;

public class UriRouterActivity extends BaseActivity	// class@00120a
{

    public void UriRouterActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, UriRouterActivity.class, "3")) {
          return;
       }
       try{
          super.finish();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public String getPageName(){
       return "GATEWAY_URI_ROUTER";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UriRouterActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void handleIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UriRouterActivity.class, "2")) {
          return;
       }
       Uri data = p0.getData();
       String str = (data != null)? TextUtils.I(data.getPath()): "";
       if (str.equals("/agreement/alipay")) {
          this.startGatewayPay(data);
       }
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UriRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       if (intent == null) {
          this.finish();
          return;
       }else {
          this.handleIntent(intent);
          return;
       }
    }
    public final void startGatewayPay(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UriRouterActivity.class, "4")) {
          return;
       }
       Intent intent = new Intent(this, GatewayPayActivity.class);
       intent.setFlags(0x24000000);
       intent.setData(p0);
       this.startActivity(intent);
       return;
    }
}
