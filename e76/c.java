package e76.c;
import h97.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import com.kuaishou.weapon.i.WeaponHI;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.utility.AbiUtil;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import ob6.p;
import ob6.f;
import ib.b;
import android.util.Base64;
import android.app.Application;
import android.content.Context;
import ekd.u0;
import android.net.Uri;
import android.content.Intent;
import nf6.i;
import android.app.Activity;
import zf6.k;
import qe6.b;
import com.kwai.framework.cache.CacheManager;
import android.os.PowerManager;
import h30.a;
import oe6.a;
import java.util.Locale;
import lnc.f4;
import qe6.d;
import java.lang.Number;
import hyb.d;
import sid.e0;
import android.content.SharedPreferences;
import java.lang.Integer;
import km8.b;
import ekd.e0;
import xf6.l;

public class c extends b	// class@00151b
{
    public static final String h;

    static {
       String str = ".";
       String str1 = PatchProxy.apply(null, null, c.class, "18");
       if (str1 != PatchProxyResult.class) {
       }else {
          try{
             str1 = a.m;
             int i = str1.indexOf(str, (str1.indexOf(str) + 1));
             str1 = (a.m).substring(0, i);
          }catch(java.lang.Exception e0){
             str1 = a.m;
          }
       }
    }
    public void c(){
       super();
    }
    public String N(){
       Object obj = PatchProxy.apply(null, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return WeaponHI.getT();
       }catch(java.lang.Exception e0){
          Azeroth2.B.h().c(e0);
          return "";
       }
    }
    public Boolean O(){
       Object obj = PatchProxy.apply(null, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(AbiUtil.c());
    }
    public String P(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME == null) {
          return "";
       }
       return QCurrentUser.ME.getApiServiceToken();
    }
    public boolean R(){
       Object obj = PatchProxy.apply(null, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("activityH5CrashFailOver", false);
    }
    public String S(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME == null) {
          return "";
       }
       return QCurrentUser.ME.getToken();
    }
    public boolean T(){
       Object obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.a(0x36463d96).i().o() ^ 0x01);
    }
    public String U(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME == null) {
          return "";
       }
       return QCurrentUser.ME.getPassToken();
    }
    public String W(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME == null) {
          return "";
       }
       return Base64.encodeToString(b.a(QCurrentUser.ME.getTokenClientSalt()), 2);
    }
    public String X(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u0.f(a.b());
    }
    public Intent Y(Context p0,Uri p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, c.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Intent intent = b.a(0x66dce92a).c(p0, p1, p2, p3);
       if (intent != null && !p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       return intent;
    }
    public boolean Z(){
       Object obj = PatchProxy.apply(null, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("activityISLPForH5", false);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a();
    }
    public String b0(){
       return "kuaishou.api";
    }
    public Boolean c(){
       Object obj = PatchProxy.apply(null, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf((b.a(0x5f2ddeb4).h() ^ 0x01));
    }
    public boolean c0(){
       PowerManager obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getContext().getSystemService("power");
       if (obj == null) {
          return false;
       }
       return obj.isPowerSaveMode();
    }
    public Boolean d(){
       Object obj = PatchProxy.apply(null, this, c.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(AbiUtil.b());
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (QCurrentUser.ME == null) {
          return false;
       }
       return QCurrentUser.ME.isLogined();
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return a.d();
       }catch(java.lang.Exception e0){
          Azeroth2.B.h().c(e0);
          return "";
       }
    }
    public String getAppVersion(){
       return a.m;
    }
    public String getChannel(){
       return a.k;
    }
    public Application getContext(){
       return a.B;
    }
    public String getDeviceId(){
       return a.a;
    }
    public String getGlobalId(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.j();
    }
    public String getLanguage(){
       Object obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(f4.a());
    }
    public double getLatitude(){
       d obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = e0.d();
       double latitude = (obj != null)? obj.getLatitude(): 0;
       return latitude;
    }
    public double getLongitude(){
       d obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = e0.d();
       double longitude = (obj != null)? obj.getLongitude(): 0;
       return longitude;
    }
    public String getManufacturerAndModel(){
       return a.j;
    }
    public String getProductName(){
       return a.x;
    }
    public SharedPreferences getSharedPreferences(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.c(p0, p1);
    }
    public String getSysRelease(){
       return a.p;
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (QCurrentUser.ME == null) {
          return "";
       }
       return QCurrentUser.ME.getId();
    }
    public String getVersion(){
       return c.h;
    }
    public String i(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.h();
    }
    public boolean isDebugMode(){
       return e0.a;
    }
    public boolean isTestMode(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.c("key_azeroth_debug", false);
    }
}
