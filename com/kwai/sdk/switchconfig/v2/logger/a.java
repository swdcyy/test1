package com.kwai.sdk.switchconfig.v2.logger.a;
import java.lang.String;
import android.content.Context;
import oo7.e;
import qo7.a;
import po7.i;
import java.lang.Object;
import zk.d;
import com.kwai.sdk.switchconfig.v2.logger.HoldInfo;
import com.kwai.sdk.switchconfig.v2.logger.HoldInfo$HoldInfoAdapter;
import java.lang.reflect.Type;
import com.kwai.sdk.switchconfig.v2.logger.ChangeInfo;
import com.kwai.sdk.switchconfig.v2.logger.ChangeInfo$ChangeInfoAdapter;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.kwai.sdk.switchconfig.v2.internal.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import po7.e;
import java.lang.Class;
import oo7.f;
import java.lang.Exception;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.sdk.switchconfig.v2.logger.a$a;
import java.util.List;
import com.google.gson.JsonArray;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v2.logger.a$b;
import crd.b;
import c97.d;
import q97.c;

public class a	// class@00168b
{
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final SharedPreferences c;
    public final double d;
    public final a e;
    public final i f;
    public b g;
    public z h;
    public String i;
    public String j;
    public HoldInfo k;
    public ChangeInfo l;
    public final Gson m;

    public void a(String p0,Context p1,e p2,double p3,a p4,i p5){
       b a;
       super();
       d uod = new d();
       uod.j();
       uod.f(HoldInfo.class, new HoldInfo$HoldInfoAdapter());
       uod.f(ChangeInfo.class, new ChangeInfo$ChangeInfoAdapter());
       this.m = uod.b();
       this.j = p0;
       this.i = "user_"+this.j;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       if (p2 == null) {
          a = b.a;
       }
       Object[] objArray = new Object[]{p1.getPackageName()};
       SharedPreferences sharedPrefer = a.a(p1, String.format("%s_report_info", objArray), 0);
       this.a = sharedPrefer;
       Object[] objArray1 = new Object[]{p1.getPackageName()};
       this.b = a.a(p1, String.format("%s_valid_reported_switch", objArray1), 0);
       Object[] objArray2 = new Object[]{p1.getPackageName()};
       this.c = a.a(p1, String.format("%s_affect_reported_switch", objArray2), 0);
       objArray2 = sharedPrefer.getString("report_info", null);
       if (!TextUtils.isEmpty(objArray2)) {
          this.e(new c().a(objArray2).r());
       }
       return;
    }
    public final ChangeInfo a(){
       a tl = this.l;
       if (tl == null) {
          tl = new ChangeInfo();
       }
       return tl;
    }
    public final JsonObject b(SharedPreferences p0,String p1,SwitchConfig p2){
       String str;
       try{
          str = p0.getString(this.k(p1), null);
          if (!TextUtils.isEmpty(str)) {
             SwitchConfig switchConfig = e.a.h(str, SwitchConfig.class);
          label_0027 :
             if (str != null && (TextUtils.equals(str.getVersion(), p2.getVersion()) && TextUtils.equals(str.getVarTag(), p2.getVarTag()))) {
                return null;
             }else {
                g.a(p0.edit().putString(this.k(p1), p2.toString()));
                return new a$a(p1, p2, null).a();
             }
          }
       }catch(java.lang.Exception e0){
          if (f.a()) {
             e0.getMessage();
          }
       }
       str = null;
       goto label_0027 ;
    }
    public final HoldInfo c(){
       a tk = this.k;
       if (tk == null) {
          tk = new HoldInfo();
       }
       return tk;
    }
    public final boolean d(String p0){
       return this.a().mChangeBlockReportKswitches.contains(p0);
    }
    public final void e(JsonObject p0){
       String str = "changeInfo";
       String str1 = "holdInfo";
       if (!p0.size()) {
          return;
       }
       ChangeInfo uChangeInfo = null;
       try{
          this.l = uChangeInfo;
          this.k = uChangeInfo;
          if (p0.s0(str1)) {
             this.k = this.m.c(p0.e0(str1), HoldInfo.class);
             this.c().toString();
          label_002d :
             if (p0.s0(str)) {
                this.l = this.m.c(p0.e0(str), ChangeInfo.class);
                this.a().toString();
             }
          }else {
             goto label_002d ;
          }
       }catch(java.lang.Exception e5){
          if (f.a()) {
             e5.toString();
          }
       }
       return;
    }
    public synchronized void f(String p0,SwitchConfig p1){
       try{
          JsonArray jsonArray = (this.d - this.a().mChangeAffectSampleRate <= 0)? 1: null;
          if (!jsonArray) {
             return;
          }else {
             jsonArray = new JsonArray();
             if (this.d(p0)) {
                return;
             }else {
                JsonObject jsonObject = this.b(this.c, p0, p1);
                if (jsonObject == null) {
                   return;
                }else {
                   jsonArray.G(jsonObject);
                   this.e.a("KSWITCH_CONFIG_AFFECT", new Gson().p(jsonArray));
                }
             }
          }
       }catch(java.lang.Exception e6){
          "Failed to report affect event: "+e6;
       }
       return;
    }
    public void g(Map p0){
       try{
          JsonArray jsonArray = (this.d - this.c().mHoldSampleRate <= 0)? 1: null;
          if (!jsonArray) {
             return;
          }else {
             jsonArray = new JsonArray();
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                SwitchConfig value = uEntry.getValue();
                if (!this.c().mHoldReportKswitches.contains(key) || value == null) {
                   continue ;
                }
                a$b uob = new a$b(key, value);
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("name", uob.a);
                jsonObject.c0("version", uob.b);
                jsonObject.c0("vartag", uob.c);
                jsonArray.G(jsonObject);
             }
             if (!jsonArray.size()) {
                return;
             }else {
                this.e.a("KSWITCH_CONFIG_HOLD", new Gson().p(jsonArray));
             }
          }
       }catch(java.lang.Exception e6){
          e6.toString();
       }
       return;
    }
    public synchronized void h(String p0,SwitchConfig p1){
       try{
          if (!this.i()) {
             return;
          }else {
             JsonArray jsonArray = new JsonArray();
             if (this.d(p0)) {
                return;
             }else {
                JsonObject jsonObject = this.b(this.b, p0, p1);
                if (jsonObject == null) {
                   return;
                }else {
                   jsonArray.G(jsonObject);
                   this.e.a("KSWITCH_CONFIG_VALID", new Gson().p(jsonArray));
                }
             }
          }
       }catch(java.lang.Exception e3){
          e3.toString();
       }
       return;
    }
    public final boolean i(){
       boolean b = (this.d - this.a().mChangeValidSampleRate <= 0)? true: false;
       return b;
    }
    public void j(){
       a tg = this.g;
       if (tg != null && !tg.isDisposed()) {
          d.a().f().d("SwitchConfig", "stopHoldNormalLog");
          this.g.dispose();
       }
       return;
    }
    public final String k(String p0){
       return this.i+p0;
    }
}
