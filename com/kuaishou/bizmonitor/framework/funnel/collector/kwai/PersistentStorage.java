package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Number;
import java.lang.System;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;
import java.util.Arrays;

public class PersistentStorage	// class@001150
{
    public final SharedPreferences a;
    public final int b;
    public static final PersistentStorage$b[] c;

    static {
       PersistentStorage$b[] uobArray = new PersistentStorage$b[0];
       PersistentStorage.c = uobArray;
    }
    public void PersistentStorage(SharedPreferences p0){
       super();
       this.a = p0;
       int i = p0.getInt("__launchid", 0) + 1;
       g.a(p0.edit().putInt("__launchid", i));
       this.b = i;
    }
    public static List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, PersistentStorage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isEmpty()) {
          return Collections.emptyList();
       }
       obj = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().value);
       }
       return obj;
    }
    public static long e(){
       Object obj = PatchProxy.apply(null, null, PersistentStorage.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() / 1000);
    }
    public PersistentStorage$b b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PersistentStorage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.d(p0, 0, 0, 1);
       if (list.isEmpty()) {
          return null;
       }
       return list.get(0);
    }
    public Object c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PersistentStorage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PersistentStorage$b uob = this.b(p0);
       uob = (uob == null)? null: uob.value;
       return uob;
    }
    public List d(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(PersistentStorage.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PersistentStorage.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = this.a.getString(p0, null);
       if (p0 == null) {
          return Collections.emptyList();
       }else {
          try{
             PersistentStorage$b[] uobArray = this.h(a.a.h(p0, PersistentStorage$b[].class), p1, p2, p3);
             if (!uobArray.length) {
                return Collections.emptyList();
             }else {
                return Arrays.asList(uobArray);
             }
          }catch(java.lang.Exception e0){
             return Collections.emptyList();
          }
       }
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PersistentStorage.class, "5")) {
          return;
       }
       g.a(this.a.edit().remove(p0));
       return;
    }
    public void g(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PersistentStorage.class, "8")) {
          return;
       }
       if (p1 == null) {
          this.f(p0);
       }else {
          PersistentStorage$b uob = new PersistentStorage$b();
          uob.time = PersistentStorage.e();
          uob.launch = this.b;
          uob.value = p1;
          p1 = new PersistentStorage$b[]{uob};
          g.a(this.a.edit().putString(p0, a.a.q(p1)));
       }
       return;
    }
    public PersistentStorage$b[] h(PersistentStorage$b[] p0,int p1,int p2,int p3){
       int this;
       if (PatchProxy.isSupport(PersistentStorage.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PersistentStorage.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int len = p0.length;
       p3 = (p3 > 0 && p3 < len)? len - p3: 0;
       if (p1 > 0 || p2 > 0) {
          long l = PersistentStorage.e() - (long)p1;
          int i = this.b - p2;
          this = p3;
          while (true) {
             if (p3 < len) {
                object oobject = p0[p3];
                if (p1 > 0 && (oobject.time - l < 0 || (p2 > 0 && oobject.launch <= i))) {
                   this = p3 + 1;
                   p3++;
                }else {
                label_0056 :
                   p3 = this;
                }
             }else {
                goto label_0056 ;
             }
          }
          len = len - p3;
          PersistentStorage$b[] uobArray = new PersistentStorage$b[len];
          System.arraycopy(p0, p3, uobArray, 0, len);
          return uobArray;
       }
       if (!p3) {
          return p0;
       }else if(p3 == len){
          return PersistentStorage.c;
       }else {
          goto label_005f ;
       }
    }
}
