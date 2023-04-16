package com.tencent.connect.common.AssistActivity;
import android.app.Activity;
import com.tencent.connect.common.AssistActivity$1;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import com.tencent.open.utils.k;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.tencent.open.b.e;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import android.os.Handler;
import android.os.Looper;
import com.tencent.connect.common.AssistActivity$2;
import java.lang.Runnable;
import android.view.Window;
import com.tencent.connect.common.Constants;
import android.os.Parcelable;
import android.net.Uri;
import android.content.IntentFilter;
import com.tencent.connect.common.AssistActivity$QQStayReceiver;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Exception;
import android.os.Message;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public class AssistActivity extends Activity	// class@000e42
{
    public boolean a;
    public Handler b;
    public boolean c;
    public String d;
    public AssistActivity$QQStayReceiver e;
    public boolean f;

    public void AssistActivity(){
       super();
       this.c = false;
       this.a = false;
       this.b = new AssistActivity$1(this);
    }
    public static Intent getAssistActivityIntent(Context p0){
       return new Intent(p0, AssistActivity.class);
    }
    public final void a(Bundle p0){
       String str6;
       String str7;
       String str = p0.getString("viaShareType");
       String str1 = p0.getString("callbackAction");
       String str2 = p0.getString("url");
       String str3 = p0.getString("openId");
       String str4 = p0.getString("appId");
       String str5 = "";
       if (("shareToQQ").equals(str1)) {
          str6 = "ANDROIDQQ.SHARETOQQ.XX";
          str5 = "10";
       }else if(("shareToQzone").equals(str1)){
          str6 = "ANDROIDQQ.SHARETOQZ.XX";
          str5 = "11";
       }else {
          str7 = str5;
       label_003d :
          if (!k.a(this, str2)) {
             IUiListener listnerWithA = UIListenerManager.getInstance().getListnerWithAction(str1);
             if (listnerWithA != null) {
                listnerWithA.onError(new UiError(-6, "´ò¿ªä¯ÀÀÆ÷Ê§°Ü!", null));
             }
             e.a().a(str3, str4, str5, str7, "3", "1", str, "0", "2", "0");
             this.finish();
          }else {
             e.a().a(str3, str4, str5, str7, "3", "0", str, "0", "2", "0");
          }
          this.getIntent().removeExtra("shareH5");
          return;
       }
       str7 = str5;
       str5 = str6;
       goto label_003d ;
    }
    public Resources getResources(){
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       StringBuilder str = "--onActivityResult--requestCode: "+p0+" | resultCode: "+p1+"data = null ? ";
       boolean b = (p2 == null)? true: false;
       SLog.i("openSDK_LOG.AssistActivity", str+b);
       super.onActivityResult(p0, p1, p2);
       if (!p0) {
          return;
       }else if(p2 != null){
          p2.putExtra("key_action", "action_login");
       }
       this.setResultData(p0, p2);
       if (this.f == null) {
          SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
          this.finish();
       }else {
          new Handler(Looper.getMainLooper()).postDelayed(new AssistActivity$2(this), 200);
       }
       return;
    }
    public void onCreate(Bundle p0){
       this.getWindow().addFlags(0x4000000);
       this.requestWindowFeature(1);
       super.onCreate(p0);
       boolean b = false;
       this.f = this.getIntent().getBooleanExtra(Constants.KEY_RESTORE_LANDSCAPE, b);
       SLog.i("openSDK_LOG.AssistActivity", "--onCreate-- mRestoreLandscape="+this.f);
       if (this.getIntent() == null) {
          SLog.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent\(\) returns null");
          this.finish();
       }
       Intent parcelableEx = this.getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
       int i = (parcelableEx == null)? 0: parcelableEx.getIntExtra("key_request_code", b);
       String str = (parcelableEx == null)? "": parcelableEx.getStringExtra("appid");
       this.d = str;
       Bundle bundleExtra = this.getIntent().getBundleExtra("h5_share_data");
       if (p0 != null) {
          this.c = p0.getBoolean("RESTART_FLAG");
          this.a = p0.getBoolean("RESUME_FLAG", b);
       }
       if (this.c == null) {
          if (bundleExtra == null) {
             if (parcelableEx != null) {
                String str1 = "--onCreate--activityIntent not null, will start activity, reqcode = "+i;
                try{
                   SLog.i("openSDK_LOG.AssistActivity", str1);
                   IntentFilter intentFilter = new IntentFilter("com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_"+parcelableEx.getData().getQueryParameter("share_id"));
                   if (this.e == null) {
                      this.e = new AssistActivity$QQStayReceiver(this, null);
                   }
                   UniversalReceiver.e(this, this.e, intentFilter);
                }catch(java.lang.Exception e8){
                   SLog.i("openSDK_LOG.AssistActivity", "registerReceiver exception : "+e8.getMessage());
                }
                if (parcelableEx.getBooleanExtra("for_result", 1)) {
                   this.startActivityForResult(parcelableEx, i);
                }else {
                   this.startActivity(parcelableEx);
                }
             }else {
                SLog.e("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
                this.finish();
             }
          }else {
             SLog.w("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
             this.a(bundleExtra);
          }
       }else {
          SLog.d("openSDK_LOG.AssistActivity", "is restart");
       }
       return;
    }
    public void onDestroy(){
       SLog.i("openSDK_LOG.AssistActivity", "-->onDestroy");
       super.onDestroy();
       AssistActivity te = this.e;
       if (te != null) {
          UniversalReceiver.f(this, te);
       }
       return;
    }
    public void onNewIntent(Intent p0){
       String str = "openSDK_LOG.AssistActivity";
       SLog.i(str, "--onNewIntent");
       super.onNewIntent(p0);
       int intExtra = p0.getIntExtra("key_request_code", -1);
       boolean b = true;
       boolean b1 = false;
       if (intExtra == 0x277c) {
          p0.putExtra("key_action", "action_request_avatar");
          if (p0.getBooleanExtra("stay_back_stack", b1)) {
             this.moveTaskToBack(b);
          }
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             this.finish();
          }
       }else if(intExtra == 0x277d){
          p0.putExtra("key_action", "action_request_set_emotion");
          if (p0.getBooleanExtra("stay_back_stack", b1)) {
             this.moveTaskToBack(b);
          }
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             this.finish();
          }
       }else if(intExtra == 0x277e){
          p0.putExtra("key_action", "action_request_dynamic_avatar");
          if (p0.getBooleanExtra("stay_back_stack", b1)) {
             this.moveTaskToBack(b);
          }
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             this.finish();
          }
       }else if(intExtra == 0x277f){
          p0.putExtra("key_action", "joinGroup");
          if (p0.getBooleanExtra("stay_back_stack", b1)) {
             this.moveTaskToBack(b);
          }
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             this.finish();
          }
       }else if(intExtra == 0x2780){
          p0.putExtra("key_action", "bindGroup");
          if (p0.getBooleanExtra("stay_back_stack", b1)) {
             this.moveTaskToBack(b);
          }
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             this.finish();
          }
       }else if(intExtra == 0x2781){
          p0.putExtra("key_action", p0.getStringExtra("action"));
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             SLog.i(str, "--onNewIntent--activity not finished, finish now");
             this.finish();
          }
       }else {
          p0.putExtra("key_action", "action_share");
          this.setResult(-1, p0);
          if (!this.isFinishing()) {
             SLog.i(str, "--onNewIntent--activity not finished, finish now");
             this.finish();
          }
       }
       return;
    }
    public void onPause(){
       SLog.i("openSDK_LOG.AssistActivity", "-->onPause");
       this.b.removeMessages(0);
       super.onPause();
    }
    public void onResume(){
       SLog.i("openSDK_LOG.AssistActivity", "-->onResume");
       super.onResume();
       Intent intent = this.getIntent();
       if (intent.getBooleanExtra("is_login", false)) {
          return;
       }
       if (!intent.getBooleanExtra("is_qq_mobile_share", false) && (this.c != null && !this.isFinishing())) {
          this.finish();
       }
    label_002d :
       if (this.a != null) {
          this.b.sendMessage(this.b.obtainMessage(false));
          return;
       }else {
          this.a = true;
          return;
       }
    }
    public void onSaveInstanceState(Bundle p0){
       SLog.i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
       p0.putBoolean("RESTART_FLAG", true);
       p0.putBoolean("RESUME_FLAG", this.a);
       super.onSaveInstanceState(p0);
    }
    public void onStart(){
       SLog.i("openSDK_LOG.AssistActivity", "-->onStart");
       super.onStart();
    }
    public void onStop(){
       SLog.i("openSDK_LOG.AssistActivity", "-->onStop");
       super.onStop();
    }
    public void setResultData(int p0,Intent p1){
       int i = 0;
       String str = "openSDK_LOG.AssistActivity";
       if (p1 == null) {
          SLog.w(str, "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
          this.setResult(i);
          if (p0 == 0x2b5d) {
             e.a().a("", this.d, "2", "1", "7", "2");
          }
          return;
       }else {
          try{
             String stringExtra = p1.getStringExtra("key_response");
             SLog.d(str, "--setResultDataForLogin-- ");
             int i1 = -1;
             if (!TextUtils.isEmpty(stringExtra)) {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String str1 = jSONObject.optString("openid");
                stringExtra = jSONObject.optString("access_token");
                String str2 = jSONObject.optString("proxy_code");
                long l = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(stringExtra)) {
                   SLog.i(str, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                   this.setResult(i1, p1);
                   e.a().a(str1, this.d, "2", "1", "7", "0");
                }else if(!TextUtils.isEmpty(str2) && l - null){
                   SLog.i(str, "--setResultData--proxy_code and proxy_expires_in are valid");
                   this.setResult(i1, p1);
                }else {
                   SLog.w(str, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                   this.setResult(i, p1);
                   e.a().a("", this.d, "2", "1", "7", "1");
                }
             }else {
                SLog.w(str, "--setResultData--response is empty, setResult ACTIVITY_OK");
                this.setResult(i1, p1);
             }
          }catch(java.lang.Exception e12){
             SLog.e(str, "--setResultData--parse response failed");
             e12.printStackTrace();
          }
          return;
       }
    }
}
