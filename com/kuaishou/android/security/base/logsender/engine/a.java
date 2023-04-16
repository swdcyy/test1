package com.kuaishou.android.security.base.logsender.engine.a;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.android.security.base.cloudconfig.c;
import com.kuaishou.android.security.base.logsender.engine.b;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.security.base.logsender.info.a;
import org.json.JSONObject;
import com.kuaishou.android.security.base.util.n;
import com.kuaishou.android.security.base.logsender.info.b;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import java.util.HashMap;
import org.json.JSONArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Bundle;
import com.kuaishou.android.security.base.logsender.db.a;
import java.util.Set;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.logsender.a;
import x38.a;
import java.lang.System;
import android.os.Message;
import android.os.Handler;
import java.lang.Boolean;
import android.os.HandlerThread;
import com.kuaishou.android.security.base.logsender.engine.a$a;
import android.os.Looper;
import com.kuaishou.android.security.base.logsender.receiver.a;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class a	// class@000ee4
{
    public a$a a;
    public c b;
    public Context c;
    public b d;
    public a e;

    public void a(Context p0){
       super();
       this.c = p0;
       this.d();
       this.b = new c(this.c);
       this.d = new b(this.c);
    }
    public static c a(a p0){
       return p0.b;
    }
    public static void a(a p0,int p1,int p2,int p3){
       p0.a(p1, p2, p3);
    }
    public static void a(a p0,String p1,boolean p2){
       p0.a(p1, p2);
    }
    public static void b(a p0){
       p0.g();
    }
    public static Context c(a p0){
       return p0.c;
    }
    public static b d(a p0){
       return p0.d;
    }
    public static void e(a p0){
       p0.a();
    }
    public final int a(List p0,int p1,long p2,int p3){
       a obj;
       int this;
       int i2;
       JSONArray jSONArray1;
       a uoa = this;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), Integer.valueOf(p3), this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = uoa.b.j();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       this = 0;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             try{
                String str = n.a(uoa.c, new JSONObject(obj.d), p3).toString();
                try{
                   JSONObject jSONObject = new JSONObject(str);
                   int i3 = str.length() + i1;
                   int i4 = 0x100000 * i;
                   if (i3 >= i4) {
                   label_0095 :
                      HashMap hashMap = new HashMap();
                      HashMap hashMap1 = new HashMap();
                      JSONArray jSONArray = new JSONArray();
                      ArrayList uArrayList2 = new ArrayList();
                      i3 = 0;
                      while (i3 < uArrayList1.size()) {
                         b uob = uArrayList1.get(i3);
                         if (uob != null) {
                            String str1 = uob.c();
                            if (TextUtils.isEmpty(str1)) {
                               jSONArray.put(uob.b());
                               uArrayList2.add(Integer.valueOf(uob.a()));
                            }else if(hashMap.containsKey(str1)){
                               jSONArray1 = hashMap.get(str1);
                               if (jSONArray1 == null) {
                                  jSONArray1 = new JSONArray();
                               }
                            }else {
                               jSONArray1 = new JSONArray();
                            }
                            jSONArray1.put(uob.b());
                            hashMap.put(str1, jSONArray1);
                            ArrayList uArrayList3 = hashMap1.get(str1);
                            if (uArrayList3 == null) {
                               uArrayList3 = new ArrayList();
                            }
                            uArrayList3.add(Integer.valueOf(uob.a()));
                            hashMap1.put(str1, uArrayList3);
                         }
                         i3 = i3 + 1;
                      }
                      if (jSONArray.length() > 0) {
                         this = uoa.d.a(jSONArray.toString(), null, Integer.toString(p3), false, null);
                         if (this == 1) {
                            d.b("reportDetailData success");
                            a.a(uoa.c).a(uArrayList2);
                         }
                      }
                      if (hashMap.size() > 0) {
                         Iterator iterator1 = hashMap.keySet().iterator();
                         while (iterator1.hasNext()) {
                            String str2 = iterator1.next();
                            JSONArray jSONArray2 = hashMap.get(str2);
                            if (jSONArray2 != null && jSONArray2.length() > 0) {
                               d.b("try to send local yun logs"+jSONArray2.length());
                               d.b("try to send local yun logs"+jSONArray2.toString());
                               this = uoa.d.a(jSONArray2.toString(), str2, Integer.toString(p3), false, null);
                               if (this == 1) {
                                  a.a(uoa.c).a(hashMap1.get(str2));
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                      a.a(uoa.c).a();
                      if (2 != p1) {
                         uoa.b.d(((long)i1 + p2));
                      }
                   }else {
                      uArrayList.add(Integer.valueOf(obj.a));
                      uArrayList1.add(new b(jSONObject, obj.j, obj.a));
                      i1 = i3;
                   }
                }catch(java.lang.Exception e0){
                }
                d.a(e0);
                goto label_0043 ;
             }catch(java.lang.Exception e0){
                i2 = p3;
                goto label_008f ;
             }
          }else {
             i2 = p3;
             goto label_0095 ;
          }
       }
       return this;
    }
    public final List a(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return null;
       }else if(p1 != 2){
          return null;
       }else {
          return a.a(this.c).b(p1);
       }
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a uoa = a.a(this.c).a();
       if (uoa != null) {
          uoa.a(0x11000b);
       }
       return;
    }
    public final void a(int p0,int p1,int p2){
       List list;
       int i5;
       a uoa = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "7")) {
          return;
       }
       if (!i1) {
          return;
       }
       String str = null;
       int i2 = 3;
       int i3 = 1;
       if (i == i3) {
          list = a.a(uoa.c).d();
       }else if(i == i2){
          list = a.a(uoa.c).a(str, i1);
       }else if(i == 4){
          list = a.a(uoa.c).a(i3, i1);
       }else {
          list = a.a(uoa.c).b(i1);
       }
       if (list == null || list.size() <= 0) {
          d.b("tbq none");
          return;
       }else {
          String str1 = " ";
          d.b("try to report "+list.size()+str1+p2+str1+i);
          long l = uoa.b.n();
          long l1 = System.currentTimeMillis();
          long l2 = uoa.b.m();
          int i4 = uoa.b.f();
          List list1 = list;
          a uoa1 = null;
          if (!l2 - uoa1) {
             uoa.b.c(l1);
             l2 = l1;
          }
          if ((l1 - l2) - 0x5265c00 < 0) {
             if (i == i2) {
                i5 = uoa.b.g();
                if (i5 >= 5) {
                   return;
                }else {
                   uoa.b.i((i5 + i3));
                }
             }
             if (l - (long)(i4 * 0x100000) > 0) {
                return;
             }
          }else {
             uoa.b.d(uoa1);
             uoa.b.c(l1);
             if (i == i2) {
                uoa.b.i(0);
             }
          }
          i5 = this.a(list1, p1, l, p2);
          if (i == i3 && i5 != -2) {
             this.f();
          }
          if (i5 == -3) {
             return;
          }else {
             list = this.a(p0, p1);
             while (list == null || (!list.size() || (i2 > 0 && this.a(list, p1, l, p2) != -3))) {
                list = this.a(p0, p1);
                i2 = i2 - 1;
             }
             return;
          }
       }
    }
    public void a(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       this.a.sendMessage(p0);
       return;
    }
    public final void a(String p0,boolean p1){
       Object obj = this;
       JSONObject obj1 = p0;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, uoa, "5")) {
          return;
       }
       int i = 3;
       String str = "1";
       String str1 = "0";
       String str2 = "Header_section";
       String str3 = "100111";
       if (!p1) {
          JSONArray jSONArray = new JSONArray(obj1);
          int i1 = jSONArray.length();
          if (i1 > 0) {
             int i2 = 0;
             while (i2 < i1) {
                obj1 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject = obj1.optJSONObject(str2);
                long l = jSONObject.optLong(str1, System.currentTimeMillis());
                String str4 = jSONObject.optString(str);
                a uoa1 = new a();
                uoa1.d = obj1.toString();
                uoa1.b = str4;
                uoa1.g = 0;
                uoa1.c = i;
                uoa1.e = l;
                uoa1.f = 1;
                uoa1.h = 0;
                uoa1.i = 5;
                str3 = str3;
                uoa1.j = (str3.equals(str4))? str3: "";
                a.a(obj.c).a(uoa1);
                i2 = i2 + 1;
             }
          }
       }else if(p1){
          JSONObject jSONObject1 = new JSONObject(obj1).optJSONObject(str2);
          str = jSONObject1.optString(str);
          a uoa2 = new a();
          uoa2.d = obj1;
          uoa2.b = str;
          uoa2.g = 0;
          uoa2.c = i;
          uoa2.e = jSONObject1.optLong(str1, System.currentTimeMillis());
          uoa2.f = 1;
          uoa2.h = 0;
          uoa2.i = 5;
          uoa2.j = (str3.equals(str))? str3: "";
          a.a(obj.c).a(uoa2);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       int i = this.b.l();
       long l = System.currentTimeMillis() - this.b.i();
       d.b("set ACTION_REPORT_POLL");
       if (l - (long)(0x36ee80 * i) >= 0) {
          a.a(this.c).a(1);
          n.a(this.c, "com.kw.r.p", 101, ((long)i * 0x36ee80));
          this.b.b(System.currentTimeMillis());
       }else {
          n.a(this.c, "com.kw.r.p", 101, (((long)i * 0x36ee80) - l));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.b();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("ks_rpp", 10);
       handlerThrea.start();
       this.a = new a$a(this, handlerThrea.getLooper());
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.e == null) {
          this.e = new a();
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("com.kw.r.p");
          intentFilter.addAction("com.kw.pp.action");
          UniversalReceiver.e(this.c, this.e, intentFilter);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a uoa = a.a(this.c).a();
       if (uoa != null) {
          uoa.a(0x11000c);
       }
       return;
    }
    public final void g(){
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       this.e();
       return;
    }
}
