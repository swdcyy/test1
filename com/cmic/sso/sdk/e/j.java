package com.cmic.sso.sdk.e.j;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.b.b;
import com.cmic.sso.sdk.b.b$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.n;
import android.telephony.TelephonyManager;
import com.cmic.sso.sdk.e.g;
import com.kwai.privacykit.interceptor.ImsiInterceptor;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Integer;

public class j	// class@00041a
{
    public Context a;
    public static j b;

    public void j(Context p0){
       super();
       this.a = p0;
    }
    public static j a(){
       return j.b;
    }
    public static void a(Context p0){
       j.b = new j(p0);
    }
    public final String a(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x2f60c6e:
             if (p0.equals("46000")) {
                i = 0;
             }
             break;
           case 0x2f60c6f:
             if (p0.equals("46001")) {
                i = 1;
             }
             break;
           case 0x2f60c70:
             if (p0.equals("46002")) {
                i = 2;
             }
             break;
           case 0x2f60c71:
             if (p0.equals("46003")) {
                i = 3;
             }
             break;
           case 0x2f60c72:
             if (p0.equals("46004")) {
                i = 4;
             }
             break;
           case 0x2f60c73:
             if (p0.equals("46005")) {
                i = 5;
             }
             break;
           case 0x2f60c74:
             if (p0.equals("46006")) {
                i = 6;
             }
             break;
           case 0x2f60c75:
             if (p0.equals("46007")) {
                i = 7;
             }
             break;
           case 0x2f60c77:
             if (p0.equals("46009")) {
                i = 8;
             }
             break;
           case 0x2f60c8e:
             if (p0.equals("46011")) {
                i = 9;
             }
             break;
           default:
       }
    label_0080 :
       p0 = "SIMUtils";
       switch (i){
           case 0:
           case 2:
           case 4:
           case 7:
             c.a(p0, "中国移动");
             return "1";
           case 1:
           case 6:
           case 8:
             c.a(p0, "中国联通");
             return "2";
           case 3:
           case 9:
           case 5:
             c.a(p0, "中国电信");
             return "3";
           default:
             return "0";
       }
    }
    public String a(boolean p0){
       b$b uob = b.a().b();
       String str = uob.f(uob.d());
       if (TextUtils.isEmpty(str) && n.a(this.a)) {
          TelephonyManager systemServic = this.a.getSystemService("phone");
          if (systemServic != null) {
             str = systemServic.getSimOperator();
             if (TextUtils.isEmpty(str) && (g.a(this.a, "android.permission.READ_PHONE_STATE") && n.d())) {
                String str1 = null;
                try{
                   str1 = ImsiInterceptor.getSubscriberId(systemServic);
                }catch(java.lang.Exception e0){
                   c.a("SIMUtils", "getOperator失败");
                }
                if (!TextUtils.isEmpty(str1) && str1.length() >= 5) {
                   str = str1.substring(0, 5);
                }
             }
          }
       }
       c.b("SIMUtils", "operator: "+str);
       if (TextUtils.isEmpty(str)) {
          if (p0) {
             return "0";
          }else {
             return "";
          }
       }else {
          return this.a(str);
       }
    }
    public String b(){
       try{
          b$b uob = b.a().b();
          return uob.e(uob.d());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return "";
       }
    }
    public String c(){
       try{
          int i = b.a().b().e();
          if (i >= 0) {
             return Integer.toString(i);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return "";
    }
    public String d(){
       String str = "";
       try{
          b$b uob = b.a().b();
          String str1 = uob.e(((uob.d() + 1) % 2));
          if (str1 == null) {
             return str;
          }
          return str1;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public String e(){
       b$b uob = b.a().b();
       return uob.a(uob.d());
    }
    public String f(){
       TelephonyManager systemServic = this.a.getSystemService("phone");
       if (systemServic == null) {
          return "0";
       }
       String simOperator = systemServic.getSimOperator();
       c.b("SIMUtils", "SysOperType = "+simOperator);
       return this.a(simOperator);
    }
}
