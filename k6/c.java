package k6.c;
import android.content.Context;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Date;
import java.util.UUID;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.StringBuilder;
import k6.a$e;
import k6.a$d;
import s6.b;
import t6.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Locale;
import android.os.Build$VERSION;
import android.os.Build;
import u6.b;
import java.util.Objects;
import com.alipay.sdk.m.q.f;
import android.content.pm.Signature;
import s6.a;
import com.alipay.sdk.m.q.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import java.lang.StringBuffer;
import java.lang.Class;
import java.lang.StackTraceElement;
import org.json.JSONObject;
import u6.c;

public class c	// class@00248f
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public void c(Context p0,boolean p1){
       String str2;
       long l;
       super();
       this.h = "";
       this.i = "";
       if (p0 != null) {
          p0 = p0.getApplicationContext();
       }
       String str = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
       Object[] objArray = new Object[2];
       String str1 = UUID.randomUUID().toString();
       objArray[0] = str1;
       objArray[1] = str;
       this.a = String.format("%s,%s", objArray);
       str = "-";
       if (p0 != null) {
          Context applicationC = p0.getApplicationContext();
          String packageName = applicationC.getPackageName();
          PackageInfo packageInfo = applicationC.getPackageManager().getPackageInfo(packageName, 64);
          str2 = packageInfo.versionName+"|"+c.a(packageInfo);
          str = packageName;
       }else {
          str2 = str;
       }
       Object[] objArray1 = new Object[]{c.f(str),c.f(str2)};
       this.c = String.format("%s,%s,-,-,-", objArray1);
       if (p1) {
          l = 0;
       }else {
          a$e uoe = a$e.class;
          _monitor_enter(uoe);
          l = a$d.a(p0, "alipay_cashier_statistic_v");
          _monitor_exit(uoe);
       }
       Object[] objArray2 = new Object[]{c.f("15.8.05"),c.f("h.a.3.8.05"),"~"+l};
       this.d = String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", objArray2);
       objArray1 = new Object[]{c.f(a.a(b.d().b()).e()),c.f(b.d().c())};
       this.e = String.format("%s,%s,-,-,-", objArray1);
       String str3 = "";
       if (p0 != null) {
          str3 = p0.getResources().getConfiguration().locale.toString();
       }
       Objects.requireNonNull(b.a(p0));
       Objects.requireNonNull(b.a(p0));
       Object[] objArray3 = new Object[9];
       objArray3[0] = c.f(str3);
       objArray3[1] = "android";
       objArray3[2] = c.f(Build$VERSION.RELEASE);
       objArray3[3] = c.f(Build.MODEL);
       objArray3[4] = "-";
       objArray3[5] = c.f("000000000000000");
       objArray3[6] = c.f(b.b(p0).b());
       objArray3[7] = "gw";
       objArray3[8] = c.f("000000000000000");
       this.f = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", objArray3);
       this.g = "-";
       this.j = "-";
       return;
    }
    public static String a(PackageInfo p0){
       PackageInfo signatures = p0.signatures;
       if (signatures == null || !signatures.length) {
          return "0";
       }
       StringBuilder str = p0.signatures.length;
       p0 = p0.signatures;
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          String str1 = b.e(null, p0[i].toByteArray());
          str1 = (TextUtils.isEmpty(str1))? "?": (b.t(str1)).substring(0, 8);
          str = str+"-"+str1;
       }
       return str;
    }
    public static String c(Throwable p0){
       if (p0 == null) {
          return "";
       }
       StringBuffer str = p0.getClass().getName()+":"+p0.getMessage()+" ¡· ";
       StackTraceElement[] stackTrace = p0.getStackTrace();
       if (stackTrace != null) {
          int len = stackTrace.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             str = str+stackTrace[i].toString()+" ¡· ";
             i1 = i1 + 1;
             if (i1 <= 5) {
                i = i + 1;
             }
          }
       }
       return str;
    }
    public static String e(){
       return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }
    public static String f(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       return ((((((p0.replace("[", "¡¾")).replace("]", "¡¿")).replace("\(", "£¨")).replace("\)", "£©")).replace(",", "£¬")).replace("^", "~")).replace("#", "££");
    }
    public static String h(String p0){
       if (TextUtils.isEmpty(p0)) {
          p0 = "-";
       }
       return p0;
    }
    public String b(String p0){
       CharSequence uCharSequenc;
       CharSequence uCharSequenc1;
       c uoc = this;
       String str = "";
       String str1 = (p0 == null)? str: p0;
       String[] stringArray = str1.split("&");
       a uoa = null;
       String str2 = 2;
       if (stringArray != null) {
          int len = stringArray.length;
          uCharSequenc = uoa;
          uCharSequenc1 = uCharSequenc;
          int i = uCharSequenc1;
          int i1 = 0;
          while (i1 < len) {
             String[] stringArray1 = (stringArray[i1]).split("=");
             if (stringArray1 != null && stringArray1.length == str2) {
                if ((stringArray1[0]).equalsIgnoreCase("partner")) {
                   uCharSequenc = (stringArray1[1]).replace("\"", str);
                }else if((stringArray1[0]).equalsIgnoreCase("out_trade_no")){
                   uCharSequenc1 = (stringArray1[1]).replace("\"", str);
                }else if((stringArray1[0]).equalsIgnoreCase("trade_no")){
                   i = (stringArray1[1]).replace("\"", str);
                }else if((stringArray1[0]).equalsIgnoreCase("biz_content")){
                   JSONObject jSONObject = new JSONObject(b.p(uoa, stringArray1[1]));
                   if (TextUtils.isEmpty(uCharSequenc1)) {
                      uCharSequenc1 = jSONObject.getString("out_trade_no");
                   }
                }else if((stringArray1[0]).equalsIgnoreCase("app_id") && TextUtils.isEmpty(uCharSequenc)){
                   uCharSequenc = stringArray1[1];
                }
             }
             i1 = i1 + 1;
             str2 = 2;
          }
          uoa = i;
       }else {
          uCharSequenc = uoa;
          uCharSequenc1 = uCharSequenc;
       }
       Object[] objArray = new Object[]{c.f(uoa),c.f(uCharSequenc1),c.f(uCharSequenc)};
       str = String.format("%s,%s,-,%s,-,-,-", objArray);
       uoc.b = str;
       Object[] objArray1 = new Object[10];
       objArray1[0] = uoc.a;
       objArray1[1] = str;
       objArray1[2] = uoc.c;
       objArray1[3] = uoc.d;
       objArray1[4] = uoc.e;
       objArray1[5] = uoc.f;
       objArray1[6] = uoc.g;
       objArray1[7] = c.h(uoc.h);
       objArray1[8] = c.h(uoc.i);
       objArray1[9] = uoc.j;
       return String.format("[\(%s\),\(%s\),\(%s\),\(%s\),\(%s\),\(%s\),\(%s\),\(%s\),\(%s\),\(%s\)]", objArray1);
    }
    public void d(String p0,String p1,Throwable p2){
       this.i(p0, p1, c.c(p2));
    }
    public synchronized final void g(String p0,String p1,String p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       c.f("mspl", String.format("event %s %s %s", objArray));
       String str = "";
       if (!TextUtils.isEmpty(this.h)) {
          str = "^";
       }
       StringBuilder str1 = str;
       Object[] objArray1 = new Object[4];
       p0 = (TextUtils.isEmpty(p0))? "-": c.f(p0);
       objArray1[0] = p0;
       objArray1[1] = c.f(p1);
       objArray1[2] = c.f(p2);
       objArray1[3] = c.f(c.e());
       this.h = this.h+str1+String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArray1);
       return;
    }
    public synchronized final void i(String p0,String p1,String p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       c.b(c.a("mspl", String.format("err %s %s %s", objArray)));
       String str = "";
       if (!TextUtils.isEmpty(this.i)) {
          str = "^";
       }
       StringBuilder str1 = str;
       Object[] objArray1 = new Object[4];
       objArray1[0] = p0;
       objArray1[1] = p1;
       p0 = (TextUtils.isEmpty(p2))? "-": c.f(p2);
       objArray1[2] = p0;
       objArray1[3] = c.f(c.e());
       this.i = this.i+str1+String.format("%s,%s,%s,%s", objArray1);
       return;
    }
}
