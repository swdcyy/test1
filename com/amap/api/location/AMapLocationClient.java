package com.amap.api.location.AMapLocationClient;
import android.content.Context;
import java.lang.Object;
import com.loc.d;
import android.content.Intent;
import android.os.Looper;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.w;
import com.loc.u;
import com.loc.t;
import com.loc.t$c;
import java.lang.Exception;
import com.loc.o;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.bg;
import android.app.Notification;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import org.json.JSONObject;
import com.loc.fo;
import com.kuaishou.webkit.WebView;

public class AMapLocationClient	// class@000ec8
{
    public Context a;
    public d b;

    public void AMapLocationClient(Context p0){
       super();
       AMapLocationClient.a(p0);
       if (p0 == null) {
          throw new IllegalArgumentException("Context参数不能为null");
       }
       this.a = p0.getApplicationContext();
       this.b = new d(p0, null, null);
       return;
    }
    public void AMapLocationClient(Context p0,Intent p1){
       super();
       AMapLocationClient.a(p0);
       if (p0 == null) {
          throw new IllegalArgumentException("Context参数不能为null");
       }
       this.a = p0.getApplicationContext();
       this.b = new d(this.a, p1, null);
       return;
    }
    public void AMapLocationClient(Looper p0,Context p1){
       super();
       AMapLocationClient.a(p1);
       if (p1 == null) {
          throw new IllegalArgumentException("Context参数不能为null");
       }
       this.a = p1.getApplicationContext();
       this.b = new d(this.a, null, p0);
       return;
    }
    public static void a(Context p0){
       u ou = t.a(p0, fj.c());
       if (ou.a == t$c.a) {
          return;
       }
       throw new Exception(ou.b);
    }
    public static String getDeviceId(Context p0){
       return o.w(p0);
    }
    public static void setApiKey(String p0){
       AMapLocationClientOption.a = p0;
    }
    public static void setHost(String p0){
       if (TextUtils.isEmpty(p0)) {
          bg.a = -1;
          p0 = "";
       }else {
          bg.a = 1;
       }
       bg.b = p0;
       return;
    }
    public static void updatePrivacyAgree(Context p0,boolean p1){
       t.a(p0, p1, fj.c());
    }
    public static void updatePrivacyShow(Context p0,boolean p1,boolean p2){
       t.a(p0, p1, p2, fj.c());
    }
    public void disableBackgroundLocation(boolean p0){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
    public void enableBackgroundLocation(int p0,Notification p1){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.a(p0, p1);
       }
       return;
    }
    public AMapLocation getLastKnownLocation(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          return tb.e();
       }
       return null;
    }
    public String getVersion(){
       return "6.1.0";
    }
    public boolean isStarted(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          return tb.a();
       }
       return false;
    }
    public void onDestroy(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.d();
       }
       return;
    }
    public void setLocationListener(AMapLocationListener p0){
       if (p0 == null) {
          throw new IllegalArgumentException("listener参数不能为null");
       }
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
    public void setLocationOption(AMapLocationClientOption p0){
       if (p0 == null) {
          throw new IllegalArgumentException("LocationManagerOption参数不能为null");
       }
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       if (p0.b != null) {
          p0.b = false;
          JSONObject jSONObject = new JSONObject();
          if (!TextUtils.isEmpty(p0.c)) {
             jSONObject.put("amap_loc_scenes_type", p0.c);
          }
          fo.a(this.a, "O019", jSONObject);
       }
       return;
    }
    public void startAssistantLocation(WebView p0){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
    public void startLocation(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public void stopAssistantLocation(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.f();
       }
       return;
    }
    public void stopLocation(){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.c();
       }
       return;
    }
    public void unRegisterLocationListener(AMapLocationListener p0){
       AMapLocationClient tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       return;
    }
}
