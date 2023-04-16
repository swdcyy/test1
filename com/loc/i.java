package com.loc.i;
import android.content.Context;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import com.loc.i$a;
import com.amap.api.location.AMapLocation;
import java.lang.String;
import org.json.JSONObject;
import com.kuaishou.webkit.WebSettings;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.StringBuilder;
import com.loc.i$1;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Throwable;
import com.loc.fj;

public final class i	// class@001446
{
    public Object a;
    public AMapLocationClientOption b;
    public i$a c;
    public Context d;
    public AMapLocationClient e;
    public WebView f;
    public String g;
    public boolean h;

    public void i(Context p0,WebView p1){
       super();
       this.a = new Object();
       this.e = null;
       this.f = null;
       this.g = "AMap.Geolocation.cbk";
       this.b = null;
       this.h = false;
       this.c = null;
       this.d = p0.getApplicationContext();
       this.f = p1;
       this.c = new i$a(this);
    }
    public static String a(AMapLocation p0){
       return i.b(p0);
    }
    public static String a(i p0){
       return p0.g;
    }
    public static void a(i p0,String p1){
       p0.b(p1);
    }
    public static WebView b(i p0){
       return p0.f;
    }
    public static String b(AMapLocation p0){
       String str2;
       JSONObject jSONObject = new JSONObject();
       String str = "errorInfo";
       String str1 = "errorCode";
       if (p0 == null) {
          jSONObject.put(str1, -1);
          str2 = "unknownError";
       }else if(!p0.getErrorCode()){
          jSONObject.put(str1, 0);
          JSONObject jSONObject1 = new JSONObject();
          jSONObject1.put("x", p0.getLongitude());
          jSONObject1.put("y", p0.getLatitude());
          jSONObject1.put("precision", (double)p0.getAccuracy());
          jSONObject1.put("type", p0.getLocationType());
          jSONObject1.put("country", p0.getCountry());
          jSONObject1.put("province", p0.getProvince());
          jSONObject1.put("city", p0.getCity());
          jSONObject1.put("cityCode", p0.getCityCode());
          jSONObject1.put("district", p0.getDistrict());
          jSONObject1.put("adCode", p0.getAdCode());
          jSONObject1.put("street", p0.getStreet());
          jSONObject1.put("streetNum", p0.getStreetNum());
          jSONObject1.put("floor", p0.getFloor());
          jSONObject1.put("address", p0.getAddress());
          jSONObject.put("result", jSONObject1);
       label_00c0 :
          return jSONObject.toString();
       }else {
          jSONObject.put(str1, p0.getErrorCode());
          jSONObject.put(str, p0.getErrorInfo());
          str = "locationDetail";
          str2 = p0.getLocationDetail();
       }
       jSONObject.put(str, str2);
       goto label_00c0 ;
    }
    public static boolean c(i p0){
       return p0.h;
    }
    public final void a(){
       if (this.f != null && this.d != null) {
          if (this.h != null) {
             return;
          }else {
             this.f.getSettings().setJavaScriptEnabled(true);
             this.f.addJavascriptInterface(this, "AMapAndroidLoc");
             if (!TextUtils.isEmpty(this.f.getUrl())) {
                this.f.reload();
             }
             if (this.e == null) {
                AMapLocationClient uAMapLocatio = new AMapLocationClient(this.d);
                this.e = uAMapLocatio;
                uAMapLocatio.setLocationListener(this.c);
             }
             this.h = true;
          }
       }
       return;
    }
    public final void a(String p0){
       AMapLocationClientOption$AMapLocationMode hight_Accura;
       if (this.b == null) {
          this.b = new AMapLocationClientOption();
       }
       int i = 5;
       int i1 = 1;
       JSONObject jSONObject = new JSONObject(p0);
       long l = jSONObject.optLong("to", 0x7530);
       i oi = (jSONObject.optInt("useGPS", i1) == i1)? 1: null;
       int i2 = (jSONObject.optInt("watch", 0) == i1)? 1: 0;
       i = jSONObject.optInt("interval", i);
       String str = jSONObject.optString("callback", null);
       if (TextUtils.isEmpty(str)) {
          str = "AMap.Geolocation.cbk";
       }
       this.g = str;
       this.b.setHttpTimeOut(l);
       if (oi) {
          oi = this.b;
          hight_Accura = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
       }else {
          oi = this.b;
          hight_Accura = AMapLocationClientOption$AMapLocationMode.Battery_Saving;
       }
       oi.setLocationMode(hight_Accura);
       oi = this.b;
       if (i2) {
          i1 = false;
       }
       oi.setOnceLocation(i1);
       if (i2) {
          this.b.setInterval((long)(i * 1000));
       }
       return;
    }
    public final void b(){
       i ta = this.a;
       _monitor_enter(ta);
       this.h = false;
       i te = this.e;
       if (te != null) {
          te.unRegisterLocationListener(this.c);
          this.e.stopLocation();
          this.e.onDestroy();
          this.e = null;
       }
       this.b = null;
       _monitor_exit(ta);
       return;
    }
    public final void b(String p0){
       i tf = this.f;
       if (tf != null) {
          tf.evaluateJavascript("javascript:"+this.g+"\(\'"+p0+"\'\)", new i$1(this));
       }
       return;
    }
    public final void getLocation(String p0){
       i ta = this.a;
       _monitor_enter(ta);
       if (this.h == null) {
          _monitor_exit(ta);
          return;
       }else {
          this.a(p0);
          i te = this.e;
          if (te != null) {
             te.setLocationOption(this.b);
             this.e.stopLocation();
             this.e.startLocation();
          }
          _monitor_exit(ta);
          return;
       }
    }
    public final void stopLocation(){
       if (this.h == null) {
          return;
       }
       i te = this.e;
       if (te != null) {
          te.stopLocation();
       }
       return;
    }
}
