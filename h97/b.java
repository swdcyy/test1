package h97.b;
import h97.g;
import java.lang.Object;
import java.lang.String;
import h97.f;
import java.lang.Boolean;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import android.telephony.TelephonyManager;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.Locale;
import ca7.t;
import java.lang.StringBuilder;
import android.os.Build;
import android.content.SharedPreferences;
import oe6.o;
import android.os.Build$VERSION;
import tb7.b;
import android.content.pm.ApplicationInfo;

public abstract class b implements g	// class@001733
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public PackageInfo f;
    public ApplicationInfo g;

    public void b(){
       super();
       this.f = null;
       this.g = null;
    }
    public String N(){
       return f.c(this);
    }
    public Boolean O(){
       return Boolean.TRUE;
    }
    public Intent Q(Context p0,Uri p1){
       return this.Y(p0, p1, true, false);
    }
    public boolean R(){
       return false;
    }
    public String S(){
       return f.b(this);
    }
    public boolean T(){
       return true;
    }
    public float V(){
       return f.a(this);
    }
    public String X(){
       if (TextUtils.isEmpty(this.e)) {
          TelephonyManager systemServic = this.getContext().getSystemService("phone");
          String simOperator = (systemServic != null)? systemServic.getSimOperator(): "";
       }
       return this.e;
    }
    public boolean Z(){
       return false;
    }
    public boolean a(){
       return false;
    }
    public boolean a0(){
       return false;
    }
    public Boolean c(){
       return Boolean.FALSE;
    }
    public boolean c0(){
       return false;
    }
    public Boolean d(){
       return Boolean.TRUE;
    }
    public String getAppVersion(){
       try{
          if (this.f == null) {
             this.f = this.getContext().getPackageManager().getPackageInfo(this.getContext().getPackageName(), 64);
          }
          b tf = this.f;
          String str = (tf == null)? "": tf.versionName;
          return str;
       }catch(java.lang.Exception e0){
       }
    }
    public String getHotFixPatchVersion(){
       return "";
    }
    public String getLanguage(){
       if (TextUtils.isEmpty(this.c)) {
          String str = t.d().getLanguage();
          String country = Locale.getDefault().getCountry();
          if (!TextUtils.isEmpty(country)) {
             str = str+'-'+country;
          }
          this.c = (str).toLowerCase();
       }
       return this.c;
    }
    public double getLatitude(){
       return 0;
    }
    public double getLongitude(){
       return 0;
    }
    public String getManufacturerAndModel(){
       if (TextUtils.isEmpty(this.a)) {
          this.a = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       }
       return this.a;
    }
    public String getPlatform(){
       return "ANDROID_PHONE";
    }
    public SharedPreferences getSharedPreferences(String p0,int p1){
       return o.c(this.getContext(), p0, p1);
    }
    public String getSysRelease(){
       if (TextUtils.isEmpty(this.b)) {
          this.b = "ANDROID_"+Build$VERSION.RELEASE;
       }
       return this.b;
    }
    public String getVersion(){
       String str = ".";
       String appVersion = this.getAppVersion();
       try{
          return appVersion.substring(0, appVersion.indexOf(str, (appVersion.indexOf(str) + 1)));
       }catch(java.lang.Exception e0){
          return appVersion;
       }
    }
    public String i(){
       if (TextUtils.isEmpty(this.d)) {
          this.d = b.c(this.getContext());
       }
       return this.d;
    }
    public boolean isDebugMode(){
       try{
          if (this.g == null) {
             this.g = this.getContext().getApplicationInfo();
          }
          b tg = this.g;
          boolean b = (tg != null && (tg.flags & 0x02))? true: false;
          return b;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean isTestMode(){
       return false;
    }
}
