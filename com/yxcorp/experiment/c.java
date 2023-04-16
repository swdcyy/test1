package com.yxcorp.experiment.c;
import java.lang.Object;
import java.util.HashMap;
import zu8.b;
import wu8.u;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.yxcorp.experiment.ABManager$1;
import com.yxcorp.experiment.c$b;
import wu8.f;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.experiment.ABConfig;
import java.util.Map;
import com.yxcorp.experiment.logger.a;
import wu8.b;
import xu8.a;
import com.yxcorp.experiment.exception.ParseABConfigException;
import java.lang.System;
import java.util.Iterator;
import java.util.Map$Entry;
import wu8.a;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.google.gson.Gson;
import wu8.q;
import zu8.a;
import wu8.d;
import java.util.List;
import wu8.t;
import java.lang.Runnable;
import yb7.p;
import android.content.SharedPreferences;
import wu8.v;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import wu8.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.yxcorp.experiment.ABConfigUpdateReceiver;
import wu8.j;
import wu8.i;
import wu8.o;
import wu8.k;

public class c	// class@001014
{
    public final Map a;
    public final b b;
    public final u c;
    public long d;
    public String e;
    public boolean f;
    public boolean g;
    public v h;
    public b i;
    public d j;
    public q k;
    public boolean l;
    public boolean m;
    public a n;
    public Set o;

    public void c(){
       super();
       this.a = new HashMap(16);
       this.b = new b();
       this.c = new u();
       this.d = -1;
       this.f = false;
       this.g = false;
       this.l = false;
       this.m = false;
       this.o = Collections.synchronizedSet(new HashSet());
    }
    public void c(ABManager$1 p0){
       super();
       this.a = new HashMap(16);
       this.b = new b();
       this.c = new u();
       this.d = -1;
       this.f = false;
       this.g = false;
       this.l = false;
       this.m = false;
       this.o = Collections.synchronizedSet(new HashSet());
    }
    public static c h(){
       return c$b.a;
    }
    public final boolean a(){
       if (!f.c()) {
          return true;
       }
       if (!f.a()) {
          return false;
       }
       throw new IllegalStateException("function call should be called in main mode!!!");
    }
    public final boolean b(){
       if (f.c()) {
          return true;
       }
       if (!f.a()) {
          return false;
       }
       throw new IllegalStateException("function call should be called in subsidiary mode!!!");
    }
    public final void c(){
       this.m(Boolean.FALSE);
    }
    public ABConfig d(String p0){
       this.c();
       this.o.add(p0);
       c ta = this.a;
       _monitor_enter(ta);
       ABConfig uABConfig = this.a.get(p0);
       if (uABConfig != null) {
          this.n.c(uABConfig, Boolean.FALSE);
          _monitor_exit(ta);
          return uABConfig;
       }else {
          _monitor_exit(ta);
          c ta1 = this.a;
          _monitor_enter(ta1);
          c uoc = null;
          if (!this.a.containsKey(p0)) {
             ABConfig uABConfig1 = this.i.a(p0);
             if (uABConfig1 != null) {
                this.a.put(p0, uABConfig1);
                this.l(p0, uABConfig1);
                uoc = uABConfig1;
             }else {
                ParseABConfigException parseABConfi = a.a.get(p0);
                if (parseABConfi == null) {
                   this.a.put(p0, uoc);
                }else {
                   throw parseABConfi;
                }
             }
          }
          this.n.c(uoc, Boolean.FALSE);
          _monitor_exit(ta1);
          return uoc;
       }
    }
    public Map e(){
       Map$Entry uEntry;
       Object key;
       System.currentTimeMillis();
       this.c();
       c ta = this.a;
       _monitor_enter(ta);
       HashMap hashMap = new HashMap(this.a.size());
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          key = uEntry.getKey();
          hashMap.put(key, uEntry.getValue());
       }
       _monitor_exit(ta);
       HashMap hashMap1 = new HashMap(hashMap.size());
       iterator = hashMap.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          if (uEntry.getValue() != null) {
             key = uEntry.getValue().getParsedValue();
             if (key == null) {
                key = a.a.c(uEntry.getValue().getValueJsonElement(), Object.class);
             }
             hashMap1.put(uEntry.getKey(), key);
          }
       }
       iterator = this.i.b().entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          if (uEntry.getValue() != null && !hashMap.containsKey(uEntry.getKey())) {
             key = uEntry.getValue().getParsedValue();
             if (key == null) {
                key = a.a.c(uEntry.getValue().getValueJsonElement(), Object.class);
             }
             hashMap1.put(uEntry.getKey(), key);
          }
       }
       return hashMap1;
    }
    public boolean f(){
       return this.l;
    }
    public q g(){
       return this.k;
    }
    public a i(){
       return this.b;
    }
    public final void j(String p0){
       this.e = p0;
       c ta = this.a;
       _monitor_enter(ta);
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() != null && (!uEntry.getValue().getWorldType() || (uEntry.getValue().getWorldType() == 2 && uEntry.getValue().getPolicyType()))) {
             iterator.remove();
          }
       }
       _monitor_exit(ta);
       c te = this.e;
       ta.b = te;
       ta = this.j;
       ta.b = te;
       Map map = ta.b();
       if (map != null && map.size() > 0) {
          int[] ointArray = new int[]{0};
          Iterator iterator1 = map.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             int i = 0;
             while (i < 1) {
                if (uEntry1.getValue().getPolicyType() == ointArray[i]) {
                   iterator1.remove();
                }
                i = i + 1;
             }
          }
          this.o(map);
       }
       return;
    }
    public boolean k(){
       return this.g;
    }
    public final void l(String p0,ABConfig p1){
       c tc = this.c;
       _monitor_enter(tc);
       List list = tc.a.get(p0);
       if (list != null) {
          p.d(new t(list, p0, p1));
       }
       _monitor_exit(tc);
       return;
    }
    public void m(Boolean p0){
       if (this.g == null) {
          throw new IllegalStateException("Please init ABTest SDK first!!!");
       }
       if (this.f != null) {
          return;
       }
       _monitor_enter(this);
       if (this.f != null) {
          _monitor_exit(this);
          return;
       }else {
          c tj = this.j;
          SharedPreferences sharedPrefer = tj.c.b();
          HashMap hashMap = (sharedPrefer == null || !sharedPrefer.contains("device"))? new HashMap(): tj.a(sharedPrefer, "device");
          if (hashMap != null && hashMap.size() > 0) {
             this.o(hashMap);
          }
          Map map = this.j.b();
          if (map != null && map.size() > 0) {
             this.o(map);
          }
          this.f = true;
          _monitor_exit(this);
          if (!f.c()) {
             if (!p0.booleanValue()) {
                this.p(true, ApiRequestTiming.COLD_START);
             }
             p.d(new g(this));
          }
          this.b.f();
          return;
       }
    }
    public void n(String p0,Map p1,Boolean p2){
       String valueRawStri;
       if (!this.a()) {
          return;
       }
       if (!TextUtils.equals(p0, this.e)) {
          return;
       }
       try{
          this.q(p1);
          this.n.i(p1);
       }catch(java.lang.Exception e9){
          c.h().i().c(e9);
       }
       if (p2 != null && p2.booleanValue()) {
          c ti = this.i;
          Objects.requireNonNull(ti);
          HashMap hashMap = new HashMap();
          HashMap hashMap1 = new HashMap();
          SharedPreferences sharedPrefer = ti.a.a();
          if (sharedPrefer != null) {
             g.a(sharedPrefer.edit().clear());
          }
          SharedPreferences sharedPrefer1 = ti.a.c(ti.b);
          if (sharedPrefer1 != null) {
             g.a(sharedPrefer1.edit().clear());
          }
          Iterator iterator = p1.entrySet().iterator();
          ABConfig uABConfig = 1;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             int worldType = uEntry.getValue().getWorldType();
             if (!worldType || worldType == 2) {
                if (sharedPrefer1 != null) {
                   valueRawStri = uEntry.getValue().getValueRawString();
                   if (!TextUtils.isEmpty(valueRawStri)) {
                      g.a(sharedPrefer1.edit().putString(uEntry.getKey(), valueRawStri));
                   }else {
                      g.a(sharedPrefer1.edit().putString(uEntry.getKey(), uEntry.getValue().toString()));
                   }
                   hashMap1.put(uEntry.getKey(), uEntry.getValue());
                }
             }else if(worldType == uABConfig && sharedPrefer != null){
                valueRawStri = uEntry.getValue().getValueRawString();
                if (!TextUtils.isEmpty(valueRawStri)) {
                   g.a(sharedPrefer.edit().putString(uEntry.getKey(), valueRawStri));
                }else {
                   g.a(sharedPrefer.edit().putString(uEntry.getKey(), uEntry.getValue().toString()));
                }
                hashMap.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          c.h().i().g(hashMap, ti.b, hashMap1);
          SharedPreferences sharedPrefer2 = this.j.c.b();
          if (sharedPrefer2 != null) {
             g.a(sharedPrefer2.edit().remove("device"));
          }
          c tj = this.j;
          if (!TextUtils.isEmpty(tj.b)) {
             SharedPreferences sharedPrefer3 = tj.c.b();
             if (sharedPrefer3 != null) {
                Object[] objArray = new Object[uABConfig];
                objArray[0] = tj.b;
                g.a(sharedPrefer3.edit().remove(String.format("user%s", objArray)));
             }
          }
       }
    label_0177 :
       if (f.b()) {
          ABConfigUpdateReceiver.b(Azeroth2.B.d(), false);
       }
       return;
    }
    public final void o(Map p0){
       c ta = this.a;
       _monitor_enter(ta);
       this.a.putAll(p0);
       _monitor_exit(ta);
       p.d(new j(this, p0));
    }
    public final void p(boolean p0,ApiRequestTiming p1){
       i oi = new i(this, p1);
       o oo = this.k.j();
       if (oo != null) {
          oo.b(p0, oi);
       }else {
          oi.run();
       }
       return;
    }
    public final void q(Map p0){
       ABConfig uABConfig;
       HashMap hashMap = new HashMap(p0.size());
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          String key = iterator.next().getKey();
          if (!this.a.containsKey(key)) {
             uABConfig = this.i.a(key);
             if (uABConfig != null) {
                hashMap.put(key, uABConfig);
             }
          }
       }
       HashMap hashMap1 = new HashMap(p0.size());
       c ta = this.a;
       _monitor_enter(ta);
       Iterator iterator1 = p0.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          String key1 = uEntry.getKey();
          uABConfig = uEntry.getValue();
          if (!this.a.containsKey(key1)) {
             ABConfig uABConfig1 = hashMap.get(key1);
             int policyType = uABConfig.getPolicyType();
             if (policyType && policyType != 1) {
                if (policyType != 2) {
                   continue ;
                }else {
                   this.a.put(key1, uABConfig);
                   if (this.c.a(key1)) {
                      hashMap1.put(key1, uABConfig);
                   }
                }
             }else if(uABConfig1 != null){
                this.a.put(key1, uABConfig1);
                if (this.c.a(key1)) {
                   hashMap1.put(key1, uABConfig1);
                }
             }else {
                this.a.put(key1, null);
             }
          }else if(uABConfig.getPolicyType() == 2){
             this.a.put(key1, uABConfig);
             if (this.c.a(key1)) {
                hashMap1.put(key1, uABConfig);
             }
          }
       }
       _monitor_exit(ta);
       if (!hashMap1.isEmpty()) {
          p.d(new k(this, hashMap1));
       }
       return;
    }
}
