package com.tencent.connect.auth.AuthAgent;
import com.tencent.connect.common.BaseApi;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Build;
import java.lang.Object;
import com.tencent.open.log.SLog;
import com.tencent.connect.auth.QQToken;
import java.lang.ref.WeakReference;
import android.os.Bundle;
import android.app.Activity;
import com.tencent.tauth.IUiListener;
import androidx.fragment.app.Fragment;
import java.util.Map;
import android.content.Context;
import com.tencent.open.utils.f;
import com.kuaishou.webkit.CookieSyncManager;
import java.lang.System;
import com.tencent.open.utils.i;
import java.lang.Boolean;
import com.tencent.open.utils.h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.connect.auth.AuthAgent$c;
import com.tencent.connect.auth.AuthAgent$1;
import java.lang.Runnable;
import com.tencent.open.utils.j;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.k;
import com.tencent.tauth.IRequestListener;
import android.content.Intent;
import com.tencent.connect.auth.AuthAgent$b;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.b.e;
import android.os.SystemClock;
import java.lang.Long;
import java.lang.Integer;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.connect.auth.AuthAgent$a;
import com.tencent.open.utils.g;

public class AuthAgent extends BaseApi	// class@000e1f
{
    public IUiListener a;
    public String d;
    public WeakReference e;
    public static String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_NAME;

    static {
       AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
       String cPU_ABI = Build.CPU_ABI;
       String str = "is arm\(default\) architecture";
       String str1 = "libwbsafeedit";
       if (cPU_ABI != null && !cPU_ABI.equals("")) {
          if (cPU_ABI.equalsIgnoreCase("arm64-v8a")) {
             AuthAgent.SECURE_LIB_FILE_NAME = "libwbsafeedit_64";
             AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
             SLog.i("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
          }else if(cPU_ABI.equalsIgnoreCase("x86")){
             AuthAgent.SECURE_LIB_FILE_NAME = "libwbsafeedit_x86";
             AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
             SLog.i("openSDK_LOG.AuthAgent", "is x86 architecture");
          }else if(cPU_ABI.equalsIgnoreCase("x86_64")){
             AuthAgent.SECURE_LIB_FILE_NAME = "libwbsafeedit_x86_64";
             AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
             SLog.i("openSDK_LOG.AuthAgent", "is x86_64 architecture");
          }else {
             AuthAgent.SECURE_LIB_FILE_NAME = str1;
             AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
             SLog.i("openSDK_LOG.AuthAgent", str);
          }
       }else {
          AuthAgent.SECURE_LIB_FILE_NAME = str1;
          AuthAgent.SECURE_LIB_NAME = AuthAgent.SECURE_LIB_FILE_NAME+".so";
          SLog.i("openSDK_LOG.AuthAgent", str);
       }
    }
    public void AuthAgent(QQToken p0){
       super(p0);
    }
    public static QQToken a(AuthAgent p0){
       return p0.c;
    }
    public static String a(AuthAgent p0,String p1){
       return p0.a(p1);
    }
    public static QQToken b(AuthAgent p0){
       return p0.c;
    }
    public static QQToken c(AuthAgent p0){
       return p0.c;
    }
    public static QQToken d(AuthAgent p0){
       return p0.c;
    }
    public static WeakReference e(AuthAgent p0){
       return p0.e;
    }
    public static QQToken f(AuthAgent p0){
       return p0.c;
    }
    public static QQToken g(AuthAgent p0){
       return p0.c;
    }
    public static QQToken h(AuthAgent p0){
       return p0.c;
    }
    public static QQToken i(AuthAgent p0){
       return p0.c;
    }
    public static Bundle j(AuthAgent p0){
       return p0.b();
    }
    public static QQToken k(AuthAgent p0){
       return p0.c;
    }
    public int a(Activity p0,String p1,IUiListener p2,boolean p3,Fragment p4,boolean p5){
       return this.doLogin(p0, p1, p2, p3, p4, p5, null);
    }
    public final int a(boolean p0,IUiListener p1,boolean p2,Map p3){
       CookieSyncManager.createInstance(f.a());
       Bundle uBundle = this.a();
       String str = "1";
       if (p0) {
          uBundle.putString("isadd", str);
       }
       uBundle.putString("scope", this.d);
       uBundle.putString("client_id", this.c.getAppId());
       String str1 = "pf";
       if (BaseApi.isOEM) {
          uBundle.putString(str1, "desktop_m_qq-"+BaseApi.installChannel+"-"+"android"+"-"+BaseApi.registerChannel+"-"+BaseApi.businessId);
       }else {
          uBundle.putString(str1, "openmobile_android");
       }
       String str2 = (System.currentTimeMillis() / 1000)+"";
       uBundle.putString("sign", i.b(f.a(), str2));
       uBundle.putString("time", str2);
       uBundle.putString("display", "mobile");
       uBundle.putString("response_type", "token");
       uBundle.putString("redirect_uri", "auth://tauth.qq.com/");
       uBundle.putString("cancel_display", str);
       uBundle.putString("switch", str);
       uBundle.putString("compat_v", str);
       if (p2) {
          uBundle.putString("style", "qr");
       }
       str2 = this.a(p3);
       uBundle.putString("show_download_ui", Boolean.toString(str2));
       SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start, isShowDownloadUi="+str2);
       AuthAgent$c uoc = new AuthAgent$c(this, f.a(), p1, true, false);
       SLog.d("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
       j.b(new AuthAgent$1(this, h.a().a(f.a(), "https://openmobile.qq.com/oauth2.0/m_authorize?")+HttpUtils.encodeUrl(uBundle), HttpUtils.encodeUrl(uBundle)));
       SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
       return 2;
    }
    public final String a(Bundle p0){
       String str = p0.getString("status_os");
       String str1 = p0.getString("status_machine");
       String str2 = p0.getString("status_version");
       String str3 = p0.getString("sdkv");
       String str4 = p0.getString("client_id");
       String str5 = p0.getString("need_pay");
       String str6 = p0.getString("pf");
       SLog.d("openSDK_LOG.AuthAgent", "os="+str+", machine="+str1+", version="+str2+", sdkv="+str3+", appId="+str4+", needPay="+str5+", pf="+str6);
       StringBuilder str7 = "";
       if (str == null) {
          str = "";
       }
       str7 = str7+str;
       if (str1 == null) {
          str1 = "";
       }
       str7 = str7+str1;
       if (str2 == null) {
          str2 = "";
       }
       str7 = str7+str2;
       if (str3 == null) {
          str3 = "";
       }
       str7 = str7+str3;
       if (str4 == null) {
          str4 = "";
       }
       str7 = str7+str4;
       if (str5 == null) {
          str5 = "";
       }
       str7 = str7+str5;
       if (str6 == null) {
          str6 = "";
       }
       return str7+str6;
    }
    public final void a(Bundle p0,Map p1){
    }
    public void a(IUiListener p0){
       SLog.i("openSDK_LOG.AuthAgent", "reportDAU\(\) -- start");
       String accessToken = this.c.getAccessToken();
       String openId = this.c.getOpenId();
       String appId = this.c.getAppId();
       accessToken = (!TextUtils.isEmpty(accessToken) && (!TextUtils.isEmpty(openId) && !TextUtils.isEmpty(appId)))? k.g("tencent&sdk&qazxc***14969%%"+accessToken+appId+openId+"qzone3.4"): "";
       if (TextUtils.isEmpty(accessToken)) {
          SLog.e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
          return;
       }else {
          Bundle uBundle = this.a();
          uBundle.putString("encrytoken", accessToken);
          HttpUtils.requestAsync(this.c, f.a(), "https://openmobile.qq.com/user/user_login_statis", uBundle, "POST", null);
          SLog.i("openSDK_LOG.AuthAgent", "reportDAU\(\) -- end");
          return;
       }
    }
    public final boolean a(Activity p0,Fragment p1,Map p2,boolean p3,Object[] p4){
       int i;
       BaseApi uBaseApi = this;
       Activity uActivity = p0;
       Fragment uFragment = p1;
       Map map = p2;
       SLog.i("openSDK_LOG.AuthAgent", "startActionActivity\(\) -- start");
       Intent intent = uBaseApi.b("com.tencent.open.agent.AgentActivity");
       if (intent != null) {
          Bundle uBundle = this.a();
          String str = "1";
          if (p3) {
             uBundle.putString("isadd", str);
          }
          uBundle.putString("scope", uBaseApi.d);
          uBundle.putString("client_id", uBaseApi.c.getAppId());
          String str1 = "pf";
          if (BaseApi.isOEM) {
             uBundle.putString(str1, "desktop_m_qq-"+BaseApi.installChannel+"-"+"android"+"-"+BaseApi.registerChannel+"-"+BaseApi.businessId);
          }else {
             uBundle.putString(str1, "openmobile_android");
          }
          uBundle.putString("need_pay", str);
          uBaseApi.a(uBundle, map);
          uBundle.putString("oauth_app_name", i.a(f.a()));
          intent.putExtra("key_action", "action_login");
          intent.putExtra("key_params", uBundle);
          intent.putExtra("appid", uBaseApi.c.getAppId());
          uBundle.putString("ppsts", i.a(uActivity, uBaseApi.a(uBundle)));
          if (uBaseApi.a(intent)) {
             uBaseApi.a = new AuthAgent$b(uBaseApi, uBaseApi.a);
             i = 0x2b5d;
             UIListenerManager.getInstance().setListenerWithRequestcode(i, uBaseApi.a);
             if (uFragment) {
                SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                uBaseApi.a(uFragment, intent, i, map);
             }else {
                SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                uBaseApi.a(uActivity, intent, i, map);
             }
             SLog.i("openSDK_LOG.AuthAgent", "startActionActivity\(\) -- end, found activity for loginIntent");
             e.a().a(0, "LOGIN_CHECK_SDK", "1000", uBaseApi.c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
             p4[0] = "0";
             p4[1] = Integer.valueOf(1);
             return 1;
          }
       }
       e.a().a(1, "LOGIN_CHECK_SDK", "1000", uBaseApi.c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
       SLog.i("openSDK_LOG.AuthAgent", "startActionActivity\(\) -- end, no target activity for loginIntent");
       return 0;
    }
    public final boolean a(Map p0){
       boolean b = true;
       if (p0 != null && !p0.isEmpty()) {
          p0 = p0.get(Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL);
          if (p0 instanceof Boolean) {
             b = p0.booleanValue();
          }
       }
       return b;
    }
    public void b(IUiListener p0){
       Bundle uBundle = this.a();
       uBundle.putString("reqType", "checkLogin");
       HttpUtils.requestAsync(this.c, f.a(), "https://openmobile.qq.com/v3/user/get_info", uBundle, "GET", new BaseApi$TempRequestListener(this, new AuthAgent$a(this, p0)));
    }
    public int doLogin(Activity p0,String p1,IUiListener p2,boolean p3,Fragment p4,boolean p5,Map p6){
       BaseApi uBaseApi = this;
       Object obj = p0;
       uBaseApi.d = p1;
       uBaseApi.e = new WeakReference(obj);
       uBaseApi.a = p2;
       Object[] objArray = new Object[2];
       boolean booleanExtra = p0.getIntent().getBooleanExtra("KEY_FORCE_QR_LOGIN", false);
       boolean b = g.a(obj, uBaseApi.c.getAppId()).b("C_LoginWeb");
       SLog.i("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin="+booleanExtra+", toWebLogin="+b);
       if (!booleanExtra && (!b && this.a(p0, p4, p6, p3, objArray))) {
          SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
          e.a().a(uBaseApi.c.getOpenId(), uBaseApi.c.getAppId(), "2", "1", "5", objArray[0], "0", "0");
          return objArray[1].intValue();
       }else {
          e.a().a(uBaseApi.c.getOpenId(), uBaseApi.c.getAppId(), "2", "1", "5", "1", "0", "0");
          SLog.w("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
          AuthAgent$b uob = new AuthAgent$b(uBaseApi, uBaseApi.a);
          uBaseApi.a = uob;
          return uBaseApi.a(p3, uob, p5, p6);
       }
    }
    public void releaseResource(){
       this.a = null;
    }
}
