package com.kwai.sdk.switchconfig.v1.loggerII.b;
import android.content.Context;
import lo7.e;
import no7.a;
import mo7.i;
import java.lang.Object;
import zk.d;
import com.kwai.sdk.switchconfig.v1.loggerII.HoldInfo;
import com.kwai.sdk.switchconfig.v1.loggerII.HoldInfo$HoldInfoAdapter;
import java.lang.reflect.Type;
import com.kwai.sdk.switchconfig.v1.loggerII.ChangeInfo;
import com.kwai.sdk.switchconfig.v1.loggerII.ChangeInfo$ChangeInfoAdapter;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.lang.String;
import java.util.concurrent.ThreadPoolExecutor;
import f97.a;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Collection;
import com.google.gson.JsonArray;
import java.util.Iterator;
import no7.b;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import mo7.e;
import java.lang.Class;
import lo7.f;
import java.lang.Exception;
import android.content.SharedPreferences$Editor;
import oe6.g;
import no7.f;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

public class b	// class@000f3a
{
    public final List a;
    public final SharedPreferences b;
    public final i c;
    public final a d;
    public final Gson e;
    public final double f;
    public final ExecutorService g;
    public final ExecutorService h;
    public final ExecutorService i;
    public final z j;
    public final z k;
    public b l;
    public b m;
    public final ChangeInfo n;
    public final HoldInfo o;
    public boolean p;
    public boolean q;
    public boolean r;

    public void b(Context p0,e p1,double p2,a p3,i p4,boolean p5){
       super();
       d uod = new d();
       uod.j();
       uod.f(HoldInfo.class, new HoldInfo$HoldInfoAdapter());
       uod.f(ChangeInfo.class, new ChangeInfo$ChangeInfoAdapter());
       this.e = uod.b();
       this.f = p2;
       this.d = p3;
       this.c = p4;
       this.p = p5;
       this.q = p5;
       this.a = new ArrayList(200);
       this.g = a.e("report_list_thread");
       ThreadPoolExecutor threadPoolEx = a.e("report_change_events_thread");
       this.h = threadPoolEx;
       ThreadPoolExecutor threadPoolEx1 = a.e("report_hold_events_thread");
       this.i = threadPoolEx1;
       this.j = b.b(threadPoolEx);
       this.k = b.b(threadPoolEx1);
       SharedPreferences sharedPrefer = p1.a(p0, p0.getPackageName(), 0);
       this.b = sharedPrefer;
       this.n = new ChangeInfo();
       this.o = new HoldInfo();
       String str = sharedPrefer.getString("report_info", null);
       if (TextUtils.isEmpty(str)) {
       }else {
          this.g(new c().a(str).r());
       }
       return;
    }
    public void a(){
       if (!this.a.size()) {
          return;
       }
       this.a.clear();
       JsonArray jsonArray = new JsonArray();
       JsonArray jsonArray1 = new JsonArray();
       Iterator iterator = new ArrayList(this.a).iterator();
       String str = "KSWITCH_CONFIG_AFFECT";
       String str1 = "KSWITCH_CONFIG_VALID";
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             b c = uob.c;
             Objects.requireNonNull(c);
             if (!c.equals(str1)) {
                if (!c.equals(str)) {
                   continue ;
                }
             }else {
                JsonObject jsonObject1 = this.c(this.h(uob.a), uob);
                if (jsonObject1 != null) {
                   jsonArray.G(jsonObject1);
                }
             }
             JsonObject jsonObject = this.c("affect_"+uob.a, uob);
             if (jsonObject != null) {
                jsonArray1.G(jsonObject);
             }
          }
       }
       if (jsonArray.size()) {
          this.d.a(str1, new Gson().p(jsonArray));
       }
       if (jsonArray1.size()) {
          this.d.a(str, new Gson().p(jsonArray1));
       }
       return;
    }
    public void b(Map p0){
       JsonArray jsonArray = (this.f - this.o.mHoldSampleRate <= 0)? 1: null;
       if (!jsonArray) {
          return;
       }else {
          jsonArray = new JsonArray();
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             JsonObject jsonObject = this.d(key, uEntry.getValue(), "KSWITCH_CONFIG_HOLD", null);
             if (jsonObject != null) {
                jsonArray.G(jsonObject);
             }
          }
          if (!jsonArray.size()) {
             return;
          }else {
             this.d.a("KSWITCH_CONFIG_HOLD", new Gson().p(jsonArray));
             return;
          }
       }
    }
    public final JsonObject c(String p0,b p1){
       JsonObject jsonObject;
       String str = null;
       String str1 = this.b.getString(p0, str);
       if (TextUtils.isEmpty(str1)) {
       }else {
          try{
             str = e.a.h(str1, SwitchConfig.class);
          }catch(java.lang.Exception e0){
             if (f.a()) {
                e0.getMessage();
             }
          }
       }
    }
    public final JsonObject d(String p0,SwitchConfig p1,String p2,SwitchConfig p3){
       if (p1 == null) {
          return null;
       }
       return new b(p0, p1, p2).b(p3);
    }
    public void e(String p0,SwitchConfig p1){
       b uob = (this.f - this.n.mChangeAffectSampleRate <= 0)? 1: null;
       if (!uob) {
          return;
       }else {
          this.g.submit(new f(this, p0, p1));
          return;
       }
    }
    public final boolean f(){
       boolean b = (this.f - this.n.mChangeValidSampleRate <= 0)? true: false;
       return b;
    }
    public final void g(JsonObject p0){
       HoldInfo holdInfo;
       ChangeInfo uChangeInfo;
       this.n.clearInfo();
       b to = this.o;
       to.mHoldReportKswitches.clear();
       to.mHoldInterval = 0;
       to.mHoldSampleRate = 0;
       b.e.clear();
       b.d.clear();
       if (!p0.size()) {
          return;
       }
       String str = "holdInfo";
       if (p0.s0(str)) {
          try{
             holdInfo = this.e.c(p0.e0(str), HoldInfo.class);
          }catch(java.lang.Exception e0){
             if (f.a()) {
                e0.toString();
             }
             holdInfo = null;
          }
          b to1 = this.o;
          Objects.requireNonNull(to1);
          if (holdInfo != null) {
             to1.mHoldReportKswitches = holdInfo.mHoldReportKswitches;
             to1.mHoldSampleRate = holdInfo.mHoldSampleRate;
             to1.mHoldInterval = holdInfo.mHoldInterval;
          }
          to = this.o;
          b.d = to.mHoldReportKswitches;
          to.toString();
       }
       str = "changeInfo";
       if (p0.s0(str)) {
          try{
             uChangeInfo = this.e.c(p0.e0(str), ChangeInfo.class);
          }catch(java.lang.Exception e6){
             if (f.a()) {
                e6.toString();
             }
          }
          this.n.updateInfo(uChangeInfo);
          b tn = this.n;
          b.e = tn.mChangeBlockReportKswitches;
          tn.toString();
       }
       return;
    }
    public final String h(String p0){
       return "valid_"+p0;
    }
}
