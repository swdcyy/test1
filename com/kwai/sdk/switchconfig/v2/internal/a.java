package com.kwai.sdk.switchconfig.v2.internal.a;
import oo7.b;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.sdk.switchconfig.v2.internal.a$a;
import com.kwai.sdk.switchconfig.v2.internal.a$b;
import oo7.f;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.Context;
import po7.g;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import po7.i;
import com.kwai.sdk.switchconfig.v2.logger.a;
import java.lang.StringBuilder;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigUpdateReceiver;
import android.content.Intent;
import oo7.d;
import java.util.HashMap;
import oo7.e;
import qo7.a;
import android.app.Application;
import po7.c;
import java.lang.Runnable;
import am8.d;
import po7.d;
import oo7.h;
import po7.k;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.v2.ConfigPriority;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.content.SharedPreferences;
import po7.h;

public class a implements b	// class@001680
{
    public Context a;
    public String b;
    public boolean c;
    public i d;
    public boolean e;
    public Map f;
    public a g;

    public void a(){
       super();
       this.c = false;
       this.e = false;
       this.f = new ConcurrentHashMap(8);
    }
    public void a(a$a p0){
       super();
       this.c = false;
       this.e = false;
       this.f = new ConcurrentHashMap(8);
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
    public g f(String p0){
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
                iterator.next().getValue().i(p0);
             }
             this.d.c(p0);
             a tg = this.g;
             if (!TextUtils.equals(tg.j, p0)) {
                tg.j = p0;
                tg.i = "user_"+tg.j;
             }
             if (f.c()) {
                this.d.d(this.b);
                if (!f.d()) {
                   Intent intent = new Intent();
                   intent.setPackage(a.d().e().getPackageName());
                   intent.setAction("com.kwai.sdk.switchconfig.internal.SwitchConfigUpdateReceiver");
                   intent.putExtra("ARG_ACTION_TYPE", 1);
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
    public synchronized void l(Context p0,String p1,e p2,double p3,a p4){
       if (this.c != null) {
          return;
       }
       for (; p0 != null && !p0 instanceof Application; p0 = p0.getApplicationContext()) {
       }
       this.a = p0;
       this.d = new i(p0, p2);
       a uoa = new a(this.b, this.a, p2, p3, p4, this.d);
       this.g = p0;
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
    public void q(h p0){
       Iterator iterator = this.f.entrySet().iterator();
       while (iterator.hasNext()) {
          g d = iterator.next().getValue().d;
          d.a.remove(p0);
          p0.toString();
          d.a.size();
       }
       return;
    }
    public void t(h p0){
       Iterator iterator = this.f.entrySet().iterator();
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
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       a td = this.d;
       if (td.a.containsKey(p0)) {
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
             td.a.put(str, hashMap);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                ConfigPriority uConfigPrior = iterator.next();
                if (uConfigPrior == ConfigPriority.LOW) {
                   c = td.c;
                }else {
                   Object[] objArray = new Object[i];
                   objArray[0] = td.d.getPackageName();
                   c = td.b.a(td.d, String.format("%s_switches_v2", objArray)+"_"+uConfigPrior.getValue(), 0);
                }
                hashMap.put(uConfigPrior, new h(c, uConfigPrior, td.e));
             }
          }else {
             Map map = td.a.get(p0);
             if (map == null) {
                map = new HashMap(i1);
                td.a.put(p0, map);
             }
             if (p1 == null || !p1.length) {
                uArrayList1 = new ArrayList();
                uArrayList1.add(ConfigPriority.LOW);
             }else {
                uArrayList1 = Arrays.asList(p1);
             }
             Object[] objArray1 = new Object[]{td.d.getPackageName(),p0};
             String str1 = String.format("%s_switches_v2_%s_", objArray1);
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                ConfigPriority uConfigPrior1 = iterator1.next();
                map.put(uConfigPrior1, new h(td.b.a(td.d, str1+uConfigPrior1.getValue(), 0), uConfigPrior1, td.e));
             }
          }
       }
       this.f.put(p0, new g(p0, this.b, this.d, this.g));
       return;
    }
}
