package com.tencent.connect.auth.c;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import com.tencent.open.log.SLog;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.connect.a.a;
import com.tencent.open.utils.f;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.tencent.tauth.IUiListener;
import java.util.Map;
import com.tencent.open.utils.i;
import java.io.File;
import com.tencent.open.utils.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.utils.k;
import androidx.fragment.app.FragmentActivity;

public class c	// class@000e2d
{
    public AuthAgent a;
    public QQToken b;

    public void c(String p0,Context p1){
       super();
       SLog.i("openSDK_LOG.QQAuth", "new QQAuth\(\) --start");
       this.b = new QQToken(p0);
       this.a = new AuthAgent(this.b);
       a.c(p1, this.b);
       c.a(p1, "3.5.4.lite");
       SLog.i("openSDK_LOG.QQAuth", "new QQAuth\(\) --end");
    }
    public static c a(String p0,Context p1){
       f.a(p1.getApplicationContext());
       SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance\(\) --start");
       SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance\(\)  --end");
       return new c(p0, p1);
    }
    public static void a(Context p0,String p1){
       SharedPreferences$Editor uEditor = o.c(p0, "BuglySdkInfos", 0).edit();
       uEditor.putString("bcb3903995", p1);
       g.a(uEditor);
    }
    public final int a(Activity p0,Fragment p1,String p2,IUiListener p3,String p4){
       return this.a(p0, p1, p2, p3, p4, false);
    }
    public final int a(Activity p0,Fragment p1,String p2,IUiListener p3,String p4,boolean p5){
       return this.a(p0, p1, p2, p3, p4, p5, null);
    }
    public final int a(Activity p0,Fragment p1,String p2,IUiListener p3,String p4,boolean p5,Map p6){
       String str = "openSDK_LOG.QQAuth";
       String str1 = i.a(p0);
       if (str1 != null) {
          String str2 = b.a(new File(str1));
          if (!TextUtils.isEmpty(str2)) {
             SLog.v(str, "-->login channelId: "+str2);
             return this.a(p0, p2, p3, p5, str2, str2, "");
          }
       }
       SLog.d(str, "-->login channelId is null ");
       BaseApi.isOEM = false;
       return this.a.doLogin(p0, p2, p3, false, p1, p5, p6);
    }
    public int a(Activity p0,IUiListener p1,Map p2){
       SLog.i("openSDK_LOG.QQAuth", "login--params");
       return this.a(p0, null, k.a(p2, Constants.KEY_SCOPE, "all"), p1, "", k.a(p2, Constants.KEY_QRCODE, false), p2);
    }
    public int a(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.QQAuth", "login\(\)");
       return this.a(p0, p1, p2, "");
    }
    public int a(Activity p0,String p1,IUiListener p2,String p3){
       SLog.i("openSDK_LOG.QQAuth", "-->login activity: "+p0);
       return this.a(p0, null, p1, p2, p3);
    }
    public int a(Activity p0,String p1,IUiListener p2,boolean p3){
       SLog.i("openSDK_LOG.QQAuth", "login\(\)");
       return this.a(p0, null, p1, p2, "", p3);
    }
    public int a(Activity p0,String p1,IUiListener p2,boolean p3,String p4,String p5,String p6){
       SLog.i("openSDK_LOG.QQAuth", "loginWithOEM");
       BaseApi.isOEM = true;
       String str = "";
       String str1 = "null";
       if (p4.equals(str)) {
          p4 = str1;
       }
       if (p5.equals(str)) {
          p5 = str1;
       }
       if (p6.equals(str)) {
          p6 = str1;
       }
       BaseApi.installChannel = p5;
       BaseApi.registerChannel = p4;
       BaseApi.businessId = p6;
       return this.a.a(p0, p1, p2, false, null, p3);
    }
    public int a(Fragment p0,String p1,IUiListener p2,String p3){
       FragmentActivity activity = p0.getActivity();
       SLog.i("openSDK_LOG.QQAuth", "-->login activity: "+activity);
       return this.a(activity, p0, p1, p2, p3);
    }
    public int a(Fragment p0,String p1,IUiListener p2,String p3,boolean p4){
       FragmentActivity activity = p0.getActivity();
       SLog.i("openSDK_LOG.QQAuth", "-->login activity: "+activity);
       return this.a(activity, p0, p1, p2, p3, p4);
    }
    public void a(){
       this.a.a(null);
    }
    public void a(IUiListener p0){
       this.a.b(p0);
    }
    public void a(String p0,String p1){
       SLog.i("openSDK_LOG.QQAuth", "setAccessToken\(\), validTimeInSecond = "+p1+"");
       this.b.setAccessToken(p0, p1);
    }
    public int b(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.QQAuth", "reAuth\(\)");
       return this.a.a(p0, p1, p2, true, null, false);
    }
    public QQToken b(){
       return this.b;
    }
    public void b(Context p0,String p1){
       SLog.i("openSDK_LOG.QQAuth", "setOpenId\(\) --start");
       this.b.setOpenId(p1);
       a.d(p0, this.b);
       SLog.i("openSDK_LOG.QQAuth", "setOpenId\(\) --end");
    }
    public boolean c(){
       StringBuilder str = "isSessionValid\(\), result = ";
       String str1 = (this.b.isSessionValid())? "true": "false";
       SLog.i("openSDK_LOG.QQAuth", str+str1);
       return this.b.isSessionValid();
    }
}
