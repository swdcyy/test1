package com.kwai.sdk.switchconfig.v2.a;
import oo7.b;
import oo7.d;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v2.internal.a;
import com.kwai.sdk.switchconfig.v2.a$a;
import com.kwai.sdk.switchconfig.v2.a$b;
import java.lang.String;
import oo7.c;
import java.util.Map;
import po7.g;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import po7.i;
import com.kwai.sdk.switchconfig.v2.logger.a;
import java.lang.StringBuilder;
import oo7.f;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigUpdateReceiver;
import android.content.Intent;
import android.content.Context;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.HashMap;
import oo7.a;
import oo7.e;
import qo7.a;
import android.app.Application;
import po7.c;
import java.lang.Runnable;
import am8.d;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import com.google.gson.JsonObject;
import po7.d;
import oo7.h;
import po7.k;
import java.util.ArrayList;
import oo7.g;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.content.SharedPreferences;
import po7.h;

public class a implements b, d	// class@000f3f
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
    public static a x(){
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
             iterator.next().getValue().i(p0);
          }
          ta.d.c(p0);
          a g = ta.g;
          if (!TextUtils.equals(g.j, p0)) {
             g.j = p0;
             g.i = "user_"+g.j;
          }
          if (f.c()) {
             ta.d.d(ta.b);
             if (!f.d()) {
                Intent intent = new Intent();
                intent.setPackage(a.d().e().getPackageName());
                intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                intent.putExtra("ARG_ACTION_TYPE", 1);
                a.d().e().sendBroadcast(intent);
             }
          }
       }
    label_00a2 :
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
    public void k(String p0,a p1){
       this.h("SOURCE_DEFAULT").k(p0, p1);
    }
    public void l(Context p0,String p1,e p2,double p3,a p4){
       a a = this.a;
       _monitor_enter(a);
       if (a.c != null) {
          _monitor_exit(a);
       }else {
          for (Context uContext = p0; uContext != null && !uContext instanceof Application; uContext = uContext.getApplicationContext()) {
          }
          a.a = uContext;
          a.d = new i(uContext, p2);
          a uoa = new a(a.b, a.a, p2, p3, p4, a.d);
          a.g = uContext;
          if (f.d()) {
             d.d(new c(a), "SwitchConfig", 2);
             a.b = a.d.b();
          }else {
             a.b = p1;
             if (f.c()) {
                a.d.d(a.b);
             }
          }
          a.d.c(a.b);
          a.c = true;
          _monitor_exit(a);
       }
       return;
    }
    public void m(String p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").m(p0, p1);
    }
    public void n(String p0,ConfigPriority p1,boolean p2){
       this.h("SOURCE_DEFAULT").m(p0, p1);
    }
    public void o(JsonObject p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").o(p0, p1);
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
    public boolean p(String p0,a p1){
       return this.h("SOURCE_DEFAULT").p(p0, p1);
    }
    public void q(h p0){
       Iterator iterator = this.a.f.entrySet().iterator();
       while (iterator.hasNext()) {
          g d = iterator.next().getValue().d;
          d.a.remove(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void r(String p0,ConfigPriority p1){
       this.h("SOURCE_DEFAULT").r(p0, p1);
    }
    public void s(g p0){
       this.h("SOURCE_DEFAULT").s(p0);
    }
    public void t(h p0){
       Iterator iterator = this.a.f.entrySet().iterator();
       while (iterator.hasNext()) {
          g d = iterator.next().getValue().d;
          d.a.add(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void u(String p0,ConfigPriority[] p1){
       ArrayList uArrayList;
       i c;
       ArrayList uArrayList1;
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (TextUtils.isEmpty(p0)) {
       }else {
          a d = ta.d;
          if (d.a.containsKey(p0)) {
             if (f.a()) {
                throw new IllegalArgumentException(p0+" sourceType already added!!");
             }
          }else {
             String str = "SOURCE_DEFAULT";
             int i = 1;
             int i1 = 8;
             if (TextUtils.equals(str, p0)) {
                if (p1 == null || !p1.length) {
                   uArrayList = new ArrayList();
                   uArrayList.add(ConfigPriority.LOW);
                }else {
                   uArrayList = new ArrayList(Arrays.asList(p1));
                }
                ConfigPriority lOW = ConfigPriority.LOW;
                if (!uArrayList.contains(lOW)) {
                   uArrayList.add(lOW);
                }
                HashMap hashMap = new HashMap(i1);
                d.a.put(str, hashMap);
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   ConfigPriority uConfigPrior = iterator.next();
                   if (uConfigPrior == ConfigPriority.LOW) {
                      c = d.c;
                   }else {
                      Object[] objArray = new Object[i];
                      objArray[0] = d.d.getPackageName();
                      c = d.b.a(d.d, String.format("%s_switches_v2", objArray)+"_"+uConfigPrior.getValue(), 0);
                   }
                   hashMap.put(uConfigPrior, new h(c, uConfigPrior, d.e));
                }
             }else {
                Map map = d.a.get(p0);
                if (map == null) {
                   map = new HashMap(i1);
                   d.a.put(p0, map);
                }
                if (p1 == null || !p1.length) {
                   uArrayList1 = new ArrayList();
                   uArrayList1.add(ConfigPriority.LOW);
                }else {
                   uArrayList1 = Arrays.asList(p1);
                }
                Object[] objArray1 = new Object[]{d.d.getPackageName(),p0};
                String str1 = String.format("%s_switches_v2_%s_", objArray1);
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   ConfigPriority uConfigPrior1 = iterator1.next();
                   map.put(uConfigPrior1, new h(d.b.a(d.d, str1+uConfigPrior1.getValue(), 0), uConfigPrior1, d.e));
                }
             }
          }
          ta.f.put(p0, new g(p0, ta.b, ta.d, ta.g));
       }
       return;
    }
    public void v(String p0,a p1){
       this.h("SOURCE_DEFAULT").v(p0, p1);
    }
    public void w(g p0){
       this.h("SOURCE_DEFAULT").w(p0);
    }
}
