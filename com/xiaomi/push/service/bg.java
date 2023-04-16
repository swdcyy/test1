package com.xiaomi.push.service.bg;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.lang.String;
import com.xiaomi.push.service.bg$b;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import android.content.Context;
import com.xiaomi.push.service.bg$c;
import com.xiaomi.push.service.bg$a;
import java.lang.StringBuilder;
import rs8.c;

public class bg	// class@001164
{
    public ConcurrentHashMap a;
    public List b;
    public static bg c;

    public void bg(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ArrayList();
    }
    public static synchronized bg c(){
       _monitor_enter(bg.class);
       if (bg.c == null) {
          bg.c = new bg();
       }
       _monitor_exit(bg.class);
       return bg.c;
    }
    public synchronized int a(){
       return this.a.size();
    }
    public synchronized bg$b b(String p0,String p1){
       HashMap hashMap = this.a.get(p0);
       if (hashMap == null) {
          return null;
       }
       return hashMap.get(this.d(p1));
    }
    public final String d(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       int i = p0.indexOf("@");
       if (i > 0) {
          p0 = p0.substring(0, i);
       }
       return p0;
    }
    public synchronized ArrayList e(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          uArrayList.addAll(iterator.next().values());
       }
       return uArrayList;
    }
    public synchronized Collection f(String p0){
       if (!this.a.containsKey(p0)) {
          return new ArrayList();
       }
       return this.a.get(p0).clone().values();
    }
    public synchronized List g(String p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().values().iterator();
          while (iterator1.hasNext()) {
             bg$b uob = iterator1.next();
             if (p0.equals(uob.a)) {
                uArrayList.add(uob.h);
             }
          }
       }
       return uArrayList;
    }
    public synchronized void h(){
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       this.a.clear();
       return;
    }
    public synchronized void i(Context p0){
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().values().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().k(bg$c.a, 1, 3, null, null);
          }
       }
       return;
    }
    public synchronized void j(Context p0,int p1){
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().values().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().k(bg$c.a, 2, p1, null, null);
          }
       }
       return;
    }
    public synchronized void k(bg$a p0){
       this.b.add(p0);
    }
    public synchronized void l(bg$b p0){
       HashMap hashMap = this.a.get(p0.h);
       if (hashMap == null) {
          hashMap = new HashMap();
          this.a.put(p0.h, hashMap);
       }
       hashMap.put(this.d(p0.b), p0);
       c.l("add active client. "+p0.a);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public synchronized void m(String p0){
       HashMap hashMap = this.a.get(p0);
       if (hashMap != null) {
          Iterator iterator = hashMap.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().f();
          }
          hashMap.clear();
          this.a.remove(p0);
       }
       Iterator iterator1 = this.b.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().a();
       }
       return;
    }
    public synchronized void n(String p0,String p1){
       HashMap hashMap = this.a.get(p0);
       if (hashMap != null) {
          bg$b uob = hashMap.get(this.d(p1));
          if (uob != null) {
             uob.f();
          }
          hashMap.remove(this.d(p1));
          if (hashMap.isEmpty()) {
             this.a.remove(p0);
          }
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public synchronized void o(){
       this.b.clear();
    }
}
