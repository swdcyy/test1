package com.kwai.sdk.switchconfig.v1.internal.a;
import lo7.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.sdk.switchconfig.v1.internal.a$a;
import com.kwai.sdk.switchconfig.v1.internal.a$b;
import lo7.f;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.Context;
import com.kwai.sdk.switchconfig.v1.internal.b;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.loggerII.b;
import mo7.i;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;
import android.content.Intent;
import lo7.d;
import java.util.HashMap;
import lo7.e;
import no7.a;
import android.app.Application;
import mo7.c;
import java.lang.Runnable;
import am8.d;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import lo7.h;
import mo7.k;
import java.util.ArrayList;
import mo7.d;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import mo7.h;

public class a implements b	// class@000f2f
{
    public Context a;
    public String b;
    public boolean c;
    public i d;
    public boolean e;
    public Map f;
    public Map g;
    public e h;
    public double i;
    public a j;
    public boolean k;

    public void a(){
       super();
       this.c = false;
       this.e = false;
       this.f = new ConcurrentHashMap(8);
       this.g = new ConcurrentHashMap(8);
    }
    public void a(a$a p0){
       super();
       this.c = false;
       this.e = false;
       this.f = new ConcurrentHashMap(8);
       this.g = new ConcurrentHashMap(8);
    }
    public static a d(){
       return a$b.a;
    }
    public boolean a(){
       if (!f.d()) {
          return true;
       }
       if (!f.a()) {
          return false;
       }
       throw new IllegalStateException("function call should be called in main mode!!!");
    }
    public boolean b(){
       if (f.d()) {
          return true;
       }
       if (!f.a()) {
          return false;
       }
       throw new IllegalStateException("function call should be called in subsidiary mode!!!");
    }
    public boolean c(){
       if (this.c != null) {
          return true;
       }
       IllegalStateException illegalState = new IllegalStateException("Please init switchConfig SDK first!!!");
       if (!f.e) {
          return false;
       }
       throw illegalState;
    }
    public Context e(){
       this.c();
       return this.a;
    }
    public b f(String p0){
       return this.f.get(p0);
    }
    public void g(String p0){
       if (this.c() && this.a()) {
          if (TextUtils.equals(this.b, p0)) {
             return;
          }else {
             this.b = p0;
             Iterator iterator = this.f.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().o(p0);
             }
             iterator = this.g.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().r = true;
             }
             this.d.c(p0);
             if (f.c()) {
                this.d.d(this.b);
                if (!f.d()) {
                   Intent intent = new Intent();
                   intent.setPackage(a.d().e().getPackageName());
                   intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                   intent.putExtra("ARG_ACTION_TYPE", true);
                   a.d().e().sendBroadcast(intent);
                }
             }
          }
       }
       return;
    }
    public d h(String p0){
       return this.f(p0);
    }
    public Map i(){
       HashMap hashMap = new HashMap(this.f.size());
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          hashMap.put(key, uEntry.getValue().e());
       }
       return hashMap;
    }
    public Set j(){
       return this.f.keySet();
    }
    public synchronized void k(Context p0,String p1,e p2,double p3,a p4,boolean p5){
       if (this.c != null) {
          return;
       }
       for (; p0 != null && !p0 instanceof Application; p0 = p0.getApplicationContext()) {
       }
       this.a = p0;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.d = new i(p0, p2);
       if (f.d()) {
          d.d(new c(this), "SwitchConfig", 2);
          this.b = this.d.b();
       }else {
          this.b = p1;
          if (f.c()) {
             this.d.d(this.b);
          }
       }
       this.d.c(this.b);
       this.c = true;
       return;
    }
    public void l(JsonObject p0){
       p0.toString();
       Iterator iterator = this.g.entrySet().iterator();
       while (iterator.hasNext()) {
          b value = iterator.next().getValue();
          if (TextUtils.equals(value.b.getString("report_info", ""), p0.toString())) {
             continue ;
          }else {
             g.a(value.b.edit().putString("report_info", p0.toString()));
             value.g(p0);
          }
       }
       return;
    }
    public void o(h p0){
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          b d = iterator.next().getValue().d;
          d.a.add(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void onLaunchFinish(long p0){
       if (!this.c() || (!this.a() || (f.b() && this.e == null))) {
          this.e = true;
          d uod = new d(this);
          if (p0 <= 0) {
             uod.run();
          }else {
             d.a(uod, "switch-onLaunchFinish", 3, p0);
          }
       }
       return;
    }
    public void p(String p0,ConfigPriority[] p1){
       ArrayList uArrayList;
       i c;
       ArrayList uArrayList1;
       a uoa = this;
       Object obj = p0;
       int i = p1;
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       a d = uoa.d;
       if (d.a.containsKey(obj)) {
          if (f.a()) {
             throw new IllegalArgumentException(obj+" sourceType already added!!");
          }
       }else {
          String str = "SOURCE_DEFAULT";
          int i1 = 1;
          int i2 = 8;
          if (TextUtils.equals(str, obj)) {
             if (!i || !i.length) {
                uArrayList = new ArrayList();
                uArrayList.add(ConfigPriority.LOW);
             }else {
                uArrayList = new ArrayList(Arrays.asList(p1));
             }
             ConfigPriority lOW = ConfigPriority.LOW;
             if (!uArrayList.contains(lOW)) {
                uArrayList.add(lOW);
             }
             HashMap hashMap = new HashMap(i2);
             d.a.put(str, hashMap);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                ConfigPriority uConfigPrior = iterator.next();
                if (uConfigPrior == ConfigPriority.LOW) {
                   c = d.c;
                }else {
                   Object[] objArray = new Object[i1];
                   objArray[0] = d.d.getPackageName();
                   c = d.b.a(d.d, String.format("%s_switches", objArray)+"_"+uConfigPrior.getValue(), 0);
                }
                hashMap.put(uConfigPrior, new h(c, uConfigPrior, d.e));
             }
          }else {
             Map map = d.a.get(obj);
             if (map == null) {
                map = new HashMap(i2);
                d.a.put(obj, map);
             }
             if (!i || !i.length) {
                uArrayList1 = new ArrayList();
                uArrayList1.add(ConfigPriority.LOW);
             }else {
                uArrayList1 = Arrays.asList(p1);
             }
             Object[] objArray1 = new Object[]{d.d.getPackageName(),obj};
             String str1 = String.format("%s_switches_%s_", objArray1);
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                ConfigPriority uConfigPrior1 = iterator1.next();
                map.put(uConfigPrior1, new h(d.b.a(d.d, str1+uConfigPrior1.getValue(), 0), uConfigPrior1, d.e));
             }
          }
       }
       b uob = new b(uoa.a, uoa.h, uoa.i, uoa.j, uoa.d, uoa.k);
       uoa.f.put(obj, new b(obj, uoa.b, uoa.d, i));
       uoa.g.put(obj, i);
       return;
    }
    public void v(h p0){
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          b d = iterator.next().getValue().d;
          d.a.remove(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
}
