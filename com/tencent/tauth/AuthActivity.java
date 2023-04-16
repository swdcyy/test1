package com.tencent.tauth.AuthActivity;
import android.app.Activity;
import android.net.Uri;
import com.tencent.connect.common.AssistActivity;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.Object;
import android.os.Bundle;
import com.tencent.open.utils.k;
import java.lang.StringBuilder;
import android.content.Intent;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.tauth.IUiListener;
import android.content.pm.PackageManager;
import org.json.JSONObject;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import java.lang.Class;
import com.tencent.open.utils.i;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class AuthActivity extends Activity	// class@000f8c
{
    public static int a;

    public void AuthActivity(){
       super();
    }
    public final void a(Uri p0){
       Intent intent;
       String str5;
       Intent intent1;
       String str = "activityid";
       AssistActivity uAssistActiv = AssistActivity.class;
       String str1 = "openSDK_LOG.AuthActivity";
       SLog.i(str1, "-->handleActionUri--start");
       if (p0 != null && (p0.toString() == null || (p0.toString()).equals(""))) {
          SLog.w(str1, "-->handleActionUri, uri invalid");
          this.finish();
          return;
       }else {
          String str2 = p0.toString();
          int i = 1;
          Bundle uBundle = k.a(str2.substring((str2.indexOf("#") + i)));
          if (uBundle == null) {
             SLog.w(str1, "-->handleActionUri, bundle is null");
             this.finish();
             return;
          }else {
             String str3 = uBundle.getString("action");
             SLog.i(str1, "-->handleActionUri, action: "+str3);
             if (str3 == null) {
                this.finish();
             }else {
                String str4 = "shareToQzone";
                if (!str3.equals("shareToQQ") && (!str3.equals(str4) && (str3.equals("sendToMyComputer") || str3.equals("shareToTroopBar")))) {
                   if (str3.equals(str4) && (i.a(this, "com.tencent.mobileqq") != null && i.c(this, "5.2.0") < 0)) {
                      int i1 = AuthActivity.a + i;
                      AuthActivity.a = i1;
                      if (i1 == 2) {
                         AuthActivity.a = 0;
                         this.finish();
                         return;
                      }
                   }
                   SLog.i(str1, "-->handleActionUri, most share action, start assistactivity");
                   intent = new Intent(this, uAssistActiv);
                   intent.putExtras(uBundle);
                   intent.setFlags(0x24000000);
                   this.startActivity(intent);
                   this.finish();
                }else if(str3.equals("addToQQFavorites")){
                   intent = this.getIntent();
                   intent.putExtras(uBundle);
                   intent.putExtra("key_action", "action_share");
                   IUiListener listnerWithA = UIListenerManager.getInstance().getListnerWithAction(str3);
                   if (listnerWithA != null) {
                      UIListenerManager.getInstance().handleDataToListener(intent, listnerWithA);
                   }
                   this.finish();
                }else if(str3.equals("sharePrize")){
                   Intent launchIntent = this.getPackageManager().getLaunchIntentForPackage(this.getPackageName());
                   str2 = uBundle.getString("response");
                   try{
                      str5 = k.d(str2).getString(str);
                   }catch(java.lang.Exception e11){
                      SLog.e(str1, "sharePrize parseJson has exception.", e11);
                   }
                   if (!TextUtils.isEmpty(str5)) {
                      launchIntent.putExtra("sharePrize", i);
                      uBundle = new Bundle();
                      uBundle.putString(str, str5);
                      launchIntent.putExtras(uBundle);
                   }
                   this.startActivity(launchIntent);
                   this.finish();
                }else if(str3.equals("sdkSetAvatar")){
                   intent1 = new Intent(this, uAssistActiv);
                   intent1.putExtra("key_request_code", 0x277c);
                   intent1.putExtra("stay_back_stack", this.getIntent().getBooleanExtra("stay_back_stack", 0));
                   intent1.putExtras(uBundle);
                   intent1.setFlags(0x24000000);
                   this.startActivity(intent1);
                   this.finish();
                }else if(("sdkSetDynamicAvatar").equals(str3)){
                   intent1 = new Intent(this, uAssistActiv);
                   intent1.putExtra("key_request_code", 0x277e);
                   intent1.putExtra("stay_back_stack", this.getIntent().getBooleanExtra("stay_back_stack", 0));
                   intent1.putExtras(uBundle);
                   intent1.setFlags(0x24000000);
                   this.startActivity(intent1);
                   this.finish();
                }else if(str3.equals("sdkSetEmotion")){
                   intent1 = new Intent(this, uAssistActiv);
                   intent1.putExtra("key_request_code", 0x277d);
                   intent1.putExtra("stay_back_stack", this.getIntent().getBooleanExtra("stay_back_stack", 0));
                   intent1.putExtras(uBundle);
                   intent1.setFlags(0x24000000);
                   this.startActivity(intent1);
                   this.finish();
                }else if(str3.equals("bindGroup")){
                   SLog.i(str1, "-->handleActionUri--bind group callback.");
                   intent1 = new Intent(this, uAssistActiv);
                   intent1.putExtra("key_request_code", 0x2780);
                   intent1.putExtra("stay_back_stack", this.getIntent().getBooleanExtra("stay_back_stack", 0));
                   intent1.putExtras(uBundle);
                   intent1.setFlags(0x24000000);
                   this.startActivity(intent1);
                   this.finish();
                }else if(str3.equals("joinGroup")){
                   SLog.i(str1, "-->handleActionUri--join group callback. ");
                   intent1 = new Intent(this, uAssistActiv);
                   intent1.putExtra("key_request_code", 0x277f);
                   intent1.putExtra("stay_back_stack", this.getIntent().getBooleanExtra("stay_back_stack", 0));
                   intent1.putExtras(uBundle);
                   intent1.setFlags(0x24000000);
                   this.startActivity(intent1);
                   this.finish();
                }else if(("guildOpen").equals(str3)){
                   intent = new Intent(this, uAssistActiv);
                   intent.putExtras(uBundle);
                   intent.putExtra("key_request_code", 0x2781);
                   intent.setFlags(0x24000000);
                   this.startActivity(intent);
                   this.finish();
                }else {
                   this.finish();
                }
             }
             return;
          }
       }
    }
    public void finish(){
       try{
          super.finish();
       }catch(java.lang.Exception e0){
          SLog.e("openSDK_LOG.AuthActivity", "activity finish exception: ", e0);
       }
       return;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       if (this.getIntent() == null) {
          SLog.w("openSDK_LOG.AuthActivity", "-->onCreate, getIntent\(\) return null");
          this.finish();
          return;
       }else {
          Uri uri = null;
          try{
             uri = this.getIntent().getData();
          }catch(java.lang.Exception e2){
             SLog.e("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
          }
          String str = "-->onCreate, uri: "+uri;
          try{
             SLog.v("openSDK_LOG.AuthActivity", str);
             this.a(uri);
          }catch(java.lang.Exception e5){
             SLog.e("openSDK_LOG.AuthActivity", "onCreate exception: ", e5);
             this.finish();
          }
          return;
       }
    }
}
