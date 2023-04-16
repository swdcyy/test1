package com.kwai.sdk.switchconfig.v1.internal.b;
import lo7.d;
import java.lang.String;
import mo7.i;
import com.kwai.sdk.switchconfig.v1.loggerII.b;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import mo7.a;
import mo7.k;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import lo7.c;
import java.util.Map;
import com.kwai.sdk.switchconfig.v1.internal.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Objects;
import mo7.h;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import lo7.f;
import java.util.ArrayList;
import lo7.h;
import no7.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.List;
import lo7.a;
import java.lang.reflect.Type;
import lo7.g;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;
import com.kwai.sdk.switchconfig.UpdateConfigMode;
import com.kwai.sdk.switchconfig.v1.loggerII.ChangeInfo;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import no7.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import c97.d;
import q97.c;
import java.lang.Integer;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import mo7.e;
import java.util.Collection;
import no7.b;
import com.google.gson.c;
import java.lang.Exception;
import java.util.Arrays;
import android.util.Base64;
import com.kwai.sdk.switchconfig.proto.KswitchGroupProtos$KswitchGroup;

public class b implements d	// class@000f30
{
    public final Map a;
    public final ReadWriteLock b;
    public final a c;
    public final k d;
    public final List e;
    public final String f;
    public final i g;
    public final Map h;
    public String i;
    public Set j;
    public b k;

    public void b(String p0,String p1,i p2,b p3){
       super();
       this.a = new HashMap(16);
       this.b = new ReentrantReadWriteLock();
       this.c = new a();
       this.d = new k();
       this.e = new CopyOnWriteArrayList();
       this.h = new HashMap(4);
       this.j = Collections.synchronizedSet(new HashSet());
       this.f = p0;
       this.i = p1;
       this.g = p2;
       this.k = p3;
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
       if (!a.d().c()) {
          return new HashMap();
       }
       this.b.readLock().lock();
       HashMap hashMap = new HashMap(this.a);
       this.b.readLock().unlock();
       b tg = this.g;
       Objects.requireNonNull(tg);
       HashMap hashMap1 = new HashMap();
       Map map = tg.a.get(this.f);
       if (map != null && !map.isEmpty()) {
          i f = tg.f;
          int len = f.length;
          int i = 0;
          while (i < len) {
             h oh = map.get(f[i]);
             if (oh != null) {
                hashMap1.putAll(oh.c());
             }
             i = i + 1;
          }
       }
       Iterator iterator = hashMap1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!hashMap.containsKey(uEntry.getKey())) {
             hashMap.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return hashMap;
    }
    public SwitchConfig f(String p0){
       SwitchConfig switchConfig = null;
       if (!a.d().c()) {
          return switchConfig;
       }
       if (f.b) {
          b tf = this.f;
          Iterator iterator = this.d.a.iterator();
          while (iterator.hasNext()) {
             h oh = iterator.next();
             if (oh != null) {
                oh.a(tf, p0);
             }
          }
       }
       this.j.add(p0);
       this.b.readLock().lock();
       SwitchConfig switchConfig1 = this.a.get(p0);
       if (switchConfig1 == null && !this.a.containsKey(p0)) {
          switchConfig1 = switchConfig;
       }
       this.b.readLock().unlock();
       if (switchConfig1 != null) {
          this.k.e(p0, switchConfig1);
          return switchConfig1;
       }else {
          SwitchConfig switchConfig2 = this.g.a(this.f, p0);
          this.b.writeLock().lock();
          if (switchConfig2 != null) {
             if (!this.a.containsKey(p0) || switchConfig2.getPolicyType()) {
                this.a.put(p0, switchConfig2);
                switchConfig1 = switchConfig2;
             }
          }else {
             this.a.put(p0, switchConfig);
          }
          this.b.writeLock().unlock();
          if (switchConfig1 != null) {
             this.g(p0, switchConfig2);
             b tk = this.k;
             if (tk.f()) {
                tk.g.submit(new e(tk, p0, switchConfig1));
             }
             this.k.e(p0, switchConfig1);
          }
          return switchConfig1;
       }
    }
    public final void g(String p0,SwitchConfig p1){
       List list = this.c.a.get(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                try{
                   uoa.a(p0, p1);
                }catch(java.lang.Exception e0){
                   goto label_0010 ;
                }
             }
          }
       }
       return;
    }
    public Object getValue(String p0,Type p1,Object p2){
       return c.e(this, p0, p1, p2);
    }
    public final void h(){
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          try{
             og.a();
          }catch(java.lang.Exception e0){
             goto label_0006 ;
          }
       }
       return;
    }
    public final void i(){
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          try{
             og.b();
          }catch(java.lang.Exception e0){
             goto label_0006 ;
          }
       }
       return;
    }
    public final void j(ConfigPriority p0){
       if (f.c()) {
          b tf = this.f;
          if (f.d() || (!TextUtils.isEmpty(tf) && p0 != null)) {
             Intent intent = new Intent();
             intent.setPackage(a.d().e().getPackageName());
             intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
             intent.putExtra("ARG_ACTION_TYPE", 2);
             intent.putExtra("ARG_SOURCE_TYPE", tf);
             intent.putExtra("config_priority_value", p0.getValue());
             a.d().e().sendBroadcast(intent);
          }
       }
       return;
    }
    public final void k(Map p0,ConfigPriority p1,boolean p2,UpdateConfigMode p3){
       String str3;
       object oobject;
       boolean b3;
       b uob = this;
       Map map = p0;
       ConfigPriority uConfigPrior = p1;
       this.i();
       b k = uob.k;
       b f = uob.f;
       boolean b = false;
       if (k.p != null) {
          k.p = b;
       }else if(k.r != null){
          k.r = b;
       }else if(k.f - k.n.mChangeUpdateSampleRate <= 0){
          b3 = true;
       }else {
          b3 = false;
       }
       if (b3) {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator1 = p0.entrySet().iterator();
          String str6 = "KSWITCH_CONFIG_UPDATE";
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             String key = uEntry1.getKey();
             JsonObject jsonObject = k.d(key, uEntry1.getValue(), str6, k.c.a(f, uEntry1.getKey()));
             if (jsonObject != null) {
                jsonArray.G(jsonObject);
             }
          }
          if (jsonArray.size()) {
             k.d.a(str6, new Gson().p(jsonArray));
          }
       }
       this.p(p0);
       if (p2) {
          f = uob.f;
          Map map1 = uob.g.a.get(f);
          if (map1 == null || map1.isEmpty()) {
             if (f.a()) {
                throw new IllegalArgumentException("不存在对应的sourceType： "+f);
             }
          }else {
             h oh = map1.get(uConfigPrior);
             if (oh == null) {
                if (f.a()) {
                   throw new IllegalArgumentException("不存在对应的configPriority： "+uConfigPrior);
                }
             }else {
                d.a().f().i("SwitchConfig", "[Source:"+f+"] saveConfigToFile invoke");
                String[] stringArray = oh.b();
                c uoc = d.a().f();
                StringBuilder str = "[Priority:"+oh.d()+"] saveConfigToFile begin count = ";
                String str1 = "0";
                String str2 = (stringArray == null)? str1: Integer.valueOf(stringArray.length);
                uoc.i("SwitchConfig", str+str2);
                if (p3.isUpdateAll()) {
                   stringArray = oh.b();
                   if (stringArray != null && stringArray.length) {
                      SharedPreferences$Editor uEditor1 = oh.c.edit();
                      int len = stringArray.length;
                      int i = 0;
                      int i1 = 0;
                      while (i < len) {
                         oobject = stringArray[i];
                         str3 = "device_";
                         if (oobject.startsWith(str3)) {
                            str3 = oobject.replace(str3, "");
                            if (str3 != null && !map.containsKey(str3)) {
                               uEditor1.remove(oobject);
                               i1 = 1;
                            }
                         }
                         i = i + 1;
                         str3 = null;
                      }
                      h b2 = oh.b;
                      if (b2 != null && !b2.isEmpty()) {
                         str3 = "user_"+oh.b;
                         len = stringArray.length;
                         i = 0;
                         while (i < len) {
                            oobject = stringArray[i];
                            if (oobject.startsWith(str3)) {
                               String str5 = oobject.replace(str3, "");
                               if (str5 != null && !map.containsKey(str5)) {
                                  uEditor1.remove(oobject);
                                  i1 = 1;
                               }
                            }
                            i = i + 1;
                         }
                      }
                      if (i1) {
                         g.a(uEditor1);
                      }
                   }
                }
                SharedPreferences$Editor uEditor = oh.c.edit();
                Iterator iterator = p0.entrySet().iterator();
                str3 = null;
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   int worldType = uEntry.getValue().getWorldType();
                   if (!worldType || worldType == 2) {
                      h b1 = oh.b;
                      if (b1 != null && !b1.isEmpty()) {
                         uEditor.putString(oh.f(uEntry.getKey()), uEntry.getValue().toString());
                      }
                   }else if(worldType == 1){
                      uEditor.putString(oh.a(uEntry.getKey()), uEntry.getValue().toString());
                   }
                   str3 = 1;
                }
                if (str3 != null) {
                   g.a(uEditor);
                }
                String[] stringArray1 = oh.b();
                c uoc1 = d.a().f();
                StringBuilder str4 = "[Priority:"+oh.d()+"] saveConfigToFile end count = ";
                if (stringArray1 != null) {
                   str1 = Integer.valueOf(stringArray1.length);
                }
                uoc1.i("SwitchConfig", str4+str1);
             }
          }
       }
       this.h();
       uob.j(uConfigPrior);
       return;
    }
    public void l(String p0,a p1){
       b tc = this.c;
       List list = tc.a.get(p0);
       if (list == null) {
          list = new ArrayList();
          tc.a.put(p0, list);
       }
       list.add(p1);
       return;
    }
    public void m(String p0,ConfigPriority p1){
       this.y(p0, p1, false);
    }
    public void n(JsonObject p0,ConfigPriority p1,UpdateConfigMode p2){
       try{
          if (a.d().c() && a.d().a()) {
             Map map = e.a(p0);
             Map map1 = map;
             if (!map1.isEmpty()) {
                Iterator iterator = map1.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().setConfigPriority(p1);
                }
             }
             this.k(map, p1, true, p2);
          }
       }catch(java.lang.Exception e3){
          if (f.a()) {
             "onSwitchConfigUpdate exception:"+e3;
          }
       }
       return;
    }
    public void o(String p0){
       if (TextUtils.equals(this.i, p0)) {
          return;
       }
       this.i = p0;
       this.b.readLock().lock();
       this.b.readLock().unlock();
       this.k.b(new HashMap(this.a));
       this.b.writeLock().lock();
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() != null && (!uEntry.getValue().getWorldType() || (uEntry.getValue().getWorldType() == 2 && uEntry.getValue().getPolicyType()))) {
             iterator.remove();
          }
       }
       this.b.writeLock().unlock();
       return;
    }
    public void p(Map p0){
       String key;
       HashMap hashMap = new HashMap(p0.size());
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          key = iterator.next().getKey();
          if (!this.a.containsKey(key)) {
             SwitchConfig switchConfig = this.g.a(this.f, key);
             if (switchConfig != null) {
                hashMap.put(key, switchConfig);
             }
          }
       }
       HashMap hashMap1 = new HashMap(p0.size());
       this.b.writeLock().lock();
       Iterator iterator1 = p0.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          String key1 = uEntry.getKey();
          SwitchConfig value = uEntry.getValue();
          Object obj = 2;
          if (!this.a.containsKey(key1)) {
             int policyType = value.getPolicyType();
             if (policyType && policyType != 1) {
                if (policyType != obj) {
                   continue ;
                }
             }else {
                value = hashMap.get(key1);
                this.a.put(key1, value);
                hashMap1.put(key1, value);
             }
          }else if(value.getPolicyType() == obj){
             SwitchConfig switchConfig1 = this.a.get(key1);
             if (switchConfig1 != null && switchConfig1.getConfigPriority() != null) {
                if (value.getConfigPriority() != null && value.getConfigPriority().getValue() >= switchConfig1.getConfigPriority().getValue()) {
                   this.a.put(key1, value);
                   hashMap1.put(key1, value);
                }
             }else {
                this.a.put(key1, value);
                hashMap1.put(key1, value);
             }
          }
          this.a.put(key1, value);
          hashMap1.put(key1, value);
       }
       this.b.writeLock().unlock();
       iterator1 = hashMap1.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          key = uEntry1.getKey();
          this.g(key, uEntry1.getValue());
       }
       b tk = this.k;
       if (tk.q != null) {
          b b = tk.b;
          _monitor_enter(b);
          SharedPreferences$Editor uEditor = tk.b.edit();
          Iterator iterator2 = hashMap1.entrySet().iterator();
          while (iterator2.hasNext()) {
             Map$Entry uEntry2 = iterator2.next();
             if (uEntry2.getValue() == null) {
                continue ;
             }
             uEditor.putString(tk.h(uEntry2.getKey()), uEntry2.getValue().toString());
          }
          g.a(uEditor);
          _monitor_exit(b);
          tk.q = false;
       }
       if (tk.f()) {
          JsonArray jsonArray = new JsonArray();
          b b1 = tk.b;
          _monitor_enter(b1);
          iterator = hashMap1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry3 = iterator.next();
             if (uEntry3.getValue() == null) {
                continue ;
             }else {
                JsonObject jsonObject = tk.c(tk.h(uEntry3.getKey()), new b(uEntry3.getKey(), uEntry3.getValue(), "KSWITCH_CONFIG_VALID"));
                if (jsonObject != null) {
                   jsonArray.G(jsonObject);
                }
             }
          }
          _monitor_exit(b1);
          if (jsonArray.size()) {
             tk.d.a("KSWITCH_CONFIG_VALID", new Gson().p(jsonArray));
          }
       }
       return;
    }
    public void q(g p0){
       this.e.add(p0);
    }
    public void r(String p0,a p1){
       List list = this.c.a.get(p0);
       if (list != null) {
          list.remove(p1);
       }
       return;
    }
    public boolean s(String p0,a p1){
       List list = this.c.a.get(p0);
       boolean b = (list != null && list.contains(p1))? true: false;
       return b;
    }
    public void t(List p0,ConfigPriority p1){
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       this.i();
       b tf = this.f;
       Map map = this.g.a.get(tf);
       String str = null;
       if (map == null || map.isEmpty()) {
          if (f.a()) {
             throw new IllegalArgumentException("不存在对应的sourceType： "+tf);
          }
       }else {
          h oh = map.get(p1);
          if (oh == null) {
             if (f.a()) {
                throw new IllegalArgumentException("不存在对应的configPriority： "+p1);
             }
          }else {
             str = oh;
          }
       }
       if (str == null) {
          d.a().f().i("SwitchConfig", "deleteFromFile\(\):configStorage==null,mSourceType="+this.f+",configPriority="+p1);
       }else {
          SharedPreferences$Editor uEditor = str.c.edit();
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             String str2 = iterator1.next();
             if (TextUtils.isEmpty(str2)) {
                continue ;
             }else if(!TextUtils.isEmpty(str.b)){
                uEditor.remove(str.f(str2));
             }
             uEditor.remove(str.a(str2));
          }
          g.a(uEditor);
       }
       this.b.writeLock().lock();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!TextUtils.isEmpty(str1)) {
             this.a.remove(str1);
          }
       }
       this.b.writeLock().unlock();
       this.h();
       this.j(p1);
       return;
    }
    public void u(g p0){
       this.e.remove(p0);
    }
    public void w(String p0,ConfigPriority p1){
       String str = "switchesPb";
       if (a.d().c() && a.d().a()) {
          try{
             JsonObject jsonObject = new c().a(p0).r();
             if (jsonObject.s0(str)) {
                this.m(jsonObject.e0(str).w(), p1);
             }else if(jsonObject.s0("switches")){
                this.x(jsonObject.m0("switches"), p1);
             }
          }catch(java.lang.Exception e4){
             if (f.a()) {
                e4.getMessage();
             }
          }
       }
    }
    public void x(JsonObject p0,ConfigPriority p1){
       this.n(p0, p1, UpdateConfigMode.ALL);
    }
    public void y(String p0,ConfigPriority p1,boolean p2){
       List list;
       int i1;
       try{
          if (a.d().c() && a.d().a()) {
             int i = 1;
             if (f.b() && a.d().e == null) {
                list = Collections.singletonList(Integer.valueOf(2));
                i1 = 0;
             }else {
                Integer[] integerArray1 = new Integer[]{Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(i),Integer.valueOf(3)};
                list = Arrays.asList(integerArray1);
                i1 = 1;
             }
             if (p2) {
                Integer[] integerArray = new Integer[]{Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(i),Integer.valueOf(3)};
                list = Arrays.asList(integerArray);
             }else {
                i = i1;
             }
             KswitchGroupProtos$KswitchGroup kswitchGroup = KswitchGroupProtos$KswitchGroup.parseFrom(Base64.decode(p0, 0));
             this.h.put(p1, kswitchGroup);
             Map map = e.b(kswitchGroup, list);
             Map map1 = map;
             if (!map1.isEmpty()) {
                Iterator iterator = map1.values().iterator();
                while (iterator.hasNext()) {
                   iterator.next().setConfigPriority(p1);
                }
             }
             this.k(map, p1, i, UpdateConfigMode.ALL);
          }
       }catch(java.lang.Exception e8){
          if (f.a()) {
             "onSwitchConfigUpdate exception:"+e8;
          }
       }
       return;
    }
}
