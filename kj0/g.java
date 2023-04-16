package kj0.g;
import kj0.j;
import java.lang.Object;
import kj0.i;
import com.google.gson.Gson;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.pm.PackageInfo;
import android.content.SharedPreferences;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import android.content.Context;
import oe6.o;
import android.content.pm.PackageManager;
import java.lang.Boolean;
import android.content.pm.ApplicationInfo;

public abstract class g implements j	// class@002d49
{
    public PackageInfo a;
    public ApplicationInfo b;

    public void g(){
       super();
       this.a = null;
       this.b = null;
    }
    public boolean a(){
       return false;
    }
    public boolean b(){
       return i.b(this);
    }
    public Gson d(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson();
    }
    public int e(){
       PackageInfo obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i();
       int i = (obj == null)? 0: obj.versionCode;
       return i;
    }
    public boolean f(){
       return i.c(this);
    }
    public String getAppVersion(){
       PackageInfo obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       String str = (obj == null)? "": obj.versionName;
       return str;
    }
    public String getPlatform(){
       return "ANDROID_PHONE";
    }
    public SharedPreferences getSharedPreferences(String p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "DefaultPreferenceHelper";
       }
       return o.c(this.getContext(), p0, p1);
    }
    public String getUserAgent(){
       return "";
    }
    public long h(){
       return i.a(this);
    }
    public PackageInfo i(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (this.a == null) {
             this.a = this.getContext().getPackageManager().getPackageInfo(this.getContext().getPackageName(), 64);
          }
          return this.a;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean isDebugMode(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = PatchProxy.apply(null, this, og, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          og = PatchProxy.apply(null, this, og, "1");
          if (og != patchProxyRe) {
          }else if(this.b == null){
             this.b = this.getContext().getApplicationInfo();
          }
          og = this.b;
       }catch(java.lang.Exception e0){
       }
          boolean b = (og != null && (og.flags & 0x02))? true: false;
          return b;
    }
}
