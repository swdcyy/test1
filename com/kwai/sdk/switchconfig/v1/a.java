package com.kwai.sdk.switchconfig.v1.a;
import lo7.b;
import lo7.d;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v1.internal.a;
import com.kwai.sdk.switchconfig.v1.a$a;
import com.kwai.sdk.switchconfig.v1.a$b;
import java.lang.String;
import lo7.c;
import java.util.Map;
import com.kwai.sdk.switchconfig.v1.internal.b;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.loggerII.b;
import mo7.i;
import lo7.f;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;
import android.content.Intent;
import android.content.Context;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.HashMap;
import lo7.e;
import no7.a;
import android.app.Application;
import mo7.c;
import java.lang.Runnable;
import am8.d;
import lo7.a;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import lo7.h;
import mo7.k;
import java.util.ArrayList;
import mo7.d;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.content.SharedPreferences;
import mo7.h;
import lo7.g;

public class a implements b, d	// class@000f29
{
    public a a;

    public void a(){
       super();
       this.a = a.d();
    }
    public void a(a$a p0){
       super();
       this.a = a.d();
    }
    public static a z(){
       return a$b.a;
    }
    public int a(String p0,int p1){
       return c.b(this, p0, p1);
    }
    public long b(String p0,long p1){
       return c.c(this, p0, p1);
    }
    public String c(String p0,String p1){
       return c.d(this, p0, p1);
    }
    public boolean d(String p0,boolean p1){
       return c.a(this, p0, p1);
    }
    public Map e(){
       return this.h("SOURCE_DEFAULT").e();
    }
    public SwitchConfig f(String p0){
       try{
          return this.h("SOURCE_DEFAULT").f(p0);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public void g(String p0){
       a ta = this.a;
       if (ta.c() && (ta.a() && !TextUtils.equals(ta.b, p0))) {
          ta.b = p0;
          Iterator iterator = ta.f.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().o(p0);
          }
          iterator = ta.g.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().r = true;
          }
          ta.d.c(p0);
          if (f.c()) {
             ta.d.d(ta.b);
             if (!f.d()) {
                Intent intent = new Intent();
                intent.setPackage(a.d().e().getPackageName());
                intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                intent.putExtra("ARG_ACTION_TYPE", true);
                a.d().e().sendBroadcast(intent);
             }
          }
       }
       return;
    }
    public Object getValue(String p0,Type p1,Object p2){
       return c.e(this, p0, p1, p2);
    }
    public d h(String p0){
       return this.a.f(p0);
    }
    public Map i(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       HashMap hashMap = new HashMap(ta.f.size());
       Iterator iterator = ta.f.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          hashMap.put(key, uEntry.getValue().e());
       }
       return hashMap;
    }
    public Set j(){
       return this.a.f.keySet();
    }
    public void k(Context p0,String p1,e p2,double p3,a p4,boolean p5){
       a ta = this.a;
       _monitor_enter(ta);
       if (ta.c != null) {
          _monitor_exit(ta);
       }else {
          for (; p0 != null && !p0 instanceof Application; p0 = p0.getApplicationContext()) {
          }
          ta.a = p0;
          ta.h = p2;
          ta.i = p3;
          ta.j = p4;
          ta.k = p5;
          ta.d = new i(p0, p2);
          if (f.d()) {
             d.d(new c(ta), "SwitchConfig", 2);
             ta.b = ta.d.b();
          }else {
             ta.b = p1;
             if (f.c()) {
                ta.d.d(ta.b);
             }
          }
          ta.d.c(ta.b);
          ta.c = true;
          _monitor_exit(ta);
       }
       return;
    }
    public void l(String p0,a p1){
       this.h("SOURCE_DEFAULT").l(p0, p1);
    }
    public void m(String p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").m(p0, p1);
    }
    public void n(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2){
       this.h("SOURCE_DEFAULT").n(p0, p1, p2);
    }
    public void o(h p0){
       Iterator iterator = this.a.f.entrySet().iterator();
       while (iterator.hasNext()) {
          b d = iterator.next().getValue().d;
          d.a.add(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void onLaunchFinish(long p0){
       a ta = this.a;
       if (!ta.c() || (!ta.a() || (f.b() && ta.e == null))) {
          ta.e = true;
          d uod = new d(ta);
          if (p0 - null <= 0) {
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
       Object obj = p0;
       int i = p1;
       a a = this.a;
       Objects.requireNonNull(a);
       if (TextUtils.isEmpty(p0)) {
       }else {
          a d = a.d;
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
          b uob = new b(a.a, a.h, a.i, a.j, a.d, a.k);
          a.f.put(obj, new b(obj, a.b, a.d, i));
          a.g.put(obj, i);
       }
       return;
    }
    public void q(g p0){
       this.h("SOURCE_DEFAULT").q(p0);
    }
    public void r(String p0,a p1){
       this.h("SOURCE_DEFAULT").r(p0, p1);
    }
    public boolean s(String p0,a p1){
       return this.h("SOURCE_DEFAULT").s(p0, p1);
    }
    public void t(List p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").t(p0, p1);
    }
    public void u(g p0){
       this.h("SOURCE_DEFAULT").u(p0);
    }
    public void v(h p0){
       Iterator iterator = this.a.f.entrySet().iterator();
       while (iterator.hasNext()) {
          b d = iterator.next().getValue().d;
          d.a.remove(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void w(String p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").w(p0, p1);
    }
    public void x(JsonObject p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").x(p0, p1);
    }
    public void y(String p0,ConfigPriority p1,boolean p2){
       this.h("SOURCE_DEFAULT").m(p0, p1);
    }
}
