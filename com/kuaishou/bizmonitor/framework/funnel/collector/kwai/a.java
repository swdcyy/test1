package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a;
import com.kuaishou.bizmonitor.framework.funnel.a$b;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import mn.g;
import nu.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import mn.e;
import nn.f;
import pu.g;
import pu.a;
import pu.c;
import pu.d;
import pu.b;
import pu.h;
import pu.e;
import pu.f;
import nu.b;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import ou.a;
import ou.b;
import ou.i;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.util.Objects;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c0;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.d0;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.e0;
import ou.j;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.f0;
import ou.k;
import ou.l;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.g0;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.util.Iterator;
import qu.c;
import qu.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister$Type;
import java.lang.ref.WeakReference;
import ou.d;
import java.lang.Runnable;
import ou.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import ou.g;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.n;
import on.c$c;
import on.c;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.p;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.d;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.o;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.u;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.v;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.w;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.q;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.x;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.y;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.z;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a0;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.b0;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.e;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.f;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.r;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.g;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.s;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.h;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.i;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.t;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.j;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.k;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.l;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.m;
import java.util.ArrayList;
import ou.h;
import mn.b$a;
import mn.b;
import android.util.Base64;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import zsd.d;
import java.nio.charset.Charset;
import java.io.ByteArrayOutputStream;
import mn.h;
import mn.a;
import java.util.HashMap;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.KSUEventRegister;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a$a;
import java.lang.Enum;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a$b;
import on.b;
import android.os.Handler;
import ou.c;
import com.kuaishou.bizmonitor.framework.funnel.a;
import java.lang.Boolean;
import java.util.Collection;
import android.app.Activity;
import android.os.Bundle;
import android.os.Build$VERSION;

public class a implements a$b, Application$ActivityLifecycleCallbacks	// class@001155
{
    public final g b;
    public a$b c;
    public List d;
    public Map e;
    public Map f;
    public final PersistentStorage g;
    public boolean h;
    public boolean i;
    public static boolean j;
    public static a k;

    public void a(){
       super();
       this.d = Collections.emptyList();
       this.e = Collections.emptyMap();
       this.f = Collections.emptyMap();
       g og = new g(g.d);
       this.b = og;
       String str = "1";
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(og, obj, a.class, str)) {
       }else if(PatchProxy.applyVoidOneRefs(og, obj, a.class, "2")){
          og.b(a.c);
          og.b(a.a);
          og.b(a.b);
          og.b(a.d);
          og.b(a.e);
          og.b(a.f);
       }
       f[] uofArray1 = new f[]{g.g,a.c,c.c,d.d,b.d,h.c,e.d,f.c};
       og.c(uofArray1);
       if (!PatchProxy.applyVoidOneRefs(og, obj, b.class, str)) {
          og.b(b.a);
          og.b(b.b);
          og.b(b.c);
          og.b(b.d);
          og.b(b.e);
       }
       if (!PatchProxy.applyVoidOneRefs(og, obj, c.class, "4")) {
          uofArray1 = new f[]{a.d,b.b,i.c};
          og.c(uofArray1);
          og.b(c.c);
          og.b(c.d);
          og.b(c.g);
          og.b(c.e);
          og.b(c.f);
          og.b(c.j);
          og.b(c.h);
          og.b(c.i);
          og.b(c.n);
          og.b(c.k);
          og.b(c.l);
          og.b(c.m);
       }
       PersistentStorage persistentSt = new PersistentStorage(o.c(a.b(), "pstore", 0));
       this.g = persistentSt;
       Objects.requireNonNull(persistentSt);
       if (!PatchProxy.applyVoidOneRefs(og, persistentSt, PersistentStorage.class, "10")) {
          og.b(new c0(persistentSt, "addPValue", 5));
          og.b(new d0(persistentSt, "getPValues", 4));
          og.b(new e0(persistentSt, "getPItems", 4));
          og.b(new j(persistentSt, "getPValue", 1));
          og.b(new f0(persistentSt, "getPItem", 1));
          og.b(new k(persistentSt, "setPValue", 2));
          og.b(new l(persistentSt, "removePKey", 1));
          f[] uofArray = new f[]{new g0(persistentSt)};
          og.c(uofArray);
       }
       return;
    }
    public static a c(){
       a obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.k == null) {
          obj = a.class;
          _monitor_enter(obj);
          a.k = new a();
          _monitor_exit(obj);
       }
       return a.k;
    }
    public void a(String p0,JsonObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       List list = this.e.get(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             try{
                uoc.a(p1);
             }catch(java.lang.Exception e1){
                this.f(uoc.b()+" eval fail", e1);
                goto label_0019 ;
             }
          }
       }
       return;
    }
    public final void b(AppEventRegister$Type p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       Objects.toString(p0);
       List list = this.f.get(p0);
       if (list != null) {
          p1 = (p1 == null)? null: new WeakReference(p1);
          this.h(new d(this, p1, list));
       }
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0.isEmpty()) {
          this.d = p0;
          _monitor_enter(this);
          this.g();
          this.e = Collections.emptyMap();
          this.j(false);
          this.f = Collections.emptyMap();
          this.i(false);
          _monitor_exit(this);
          return;
       }else {
          this.h(new e(this, p0));
          return;
       }
    }
    public Object e(List p0){
       ClientEvent$ElementPackage obj2;
       int i;
       String str;
       a uoa1;
       List list1;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       List list = this;
       HashMap obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClientEvent$CustomEvent obj1 = PatchProxy.applyOneRefs(obj, list, a.class, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       this.g();
       Object[] objArray = null;
       h oh = 1;
       if (!PatchProxy.applyVoid(objArray, list, a.class, "18") && !a.j) {
          obj1 = ClientEvent$CustomEvent.class;
          ClientEvent$UrlPackage urlPackage = ClientEvent$UrlPackage.class;
          obj2 = ClientEvent$ElementPackage.class;
          ClientEvent$ClickEvent uClickEvent = ClientEvent$ClickEvent.class;
          ClientEvent$ShowEvent showEvent = ClientEvent$ShowEvent.class;
          if (!PatchProxy.applyVoid(objArray, objArray, g.class, "1")) {
             str = "name";
             c.b(Class.class, str, n.a);
             c.b(Class.class, "simpleName", p.a);
             String str1 = "elementPackage";
             c.b(uClickEvent, str1, d.a);
             String str2 = "contentPackage";
             c.b(uClickEvent, str2, o.a);
             String str3 = "urlPackage";
             c.b(uClickEvent, str3, u.a);
             String str4 = "referUrlPackage";
             c.b(uClickEvent, str4, v.a);
             c.b(uClickEvent, "referElementPackage", w.a);
             String str5 = "action";
             c.b(showEvent, str5, q.a);
             c.b(showEvent, str1, x.a);
             c.b(showEvent, str2, y.a);
             c.b(showEvent, str3, z.a);
             c.b(showEvent, str4, a0.a);
             c.b(showEvent, "referElementPackage", b0.a);
             c.b(obj1, "key", e.a);
             c.b(obj1, "value", f.a);
             c.b(obj2, "type", r.a);
             c.b(obj2, str, g.a);
             c.b(obj2, str5, s.a);
             c.b(obj2, "action2", h.a);
             c.b(obj2, "params", i.a);
             c.b(urlPackage, "page", t.a);
             c.b(urlPackage, "subPages", j.a);
             c.b(urlPackage, "params", k.a);
             c.b(urlPackage, "page2", l.a);
             c.b(urlPackage, "topPage", m.a);
          }
          a.j = oh;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       obj2 = null;
       i = 0;
       while (iterator.hasNext()) {
          h oh1 = iterator.next();
          b uob = new b$a().a();
          uob.f("__registers__", uArrayList);
          Objects.requireNonNull(oh1);
          h oh2 = h.class;
          Object[] objArray1 = null;
          h oh3 = PatchProxy.apply(objArray1, oh1, oh2, "2");
          if (oh3 != patchProxyRe) {
          }else if(oh1.c == null){
             oh3 = oh1.b;
             byte[] obj3 = PatchProxy.applyOneRefs(oh3, objArray1, oh2, "5");
             if (obj3 != patchProxyRe) {
                oh3 = obj3;
             }else if(oh3 != null && oh3.startsWith("H4s")){
                try{
                   obj3 = Base64.decode(oh3, i);
                   if (obj3.length > 2 && (obj3[i] == 31 && obj3[oh] == -117)) {
                      GZIPInputStream gZIPInputStr = new GZIPInputStream(new ByteArrayInputStream(obj3));
                      obj3 = new byte[4096];
                      int i2 = gZIPInputStr.read(obj3);
                      if (i2 < 0) {
                         gZIPInputStr.close();
                         str = "";
                      }else if(!gZIPInputStr.available()){
                         gZIPInputStr.close();
                         str = new String(obj3, i, i2, d.a);
                      }else {
                         ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(8192);
                         uByteArrayOu.write(obj3, i, i2);
                         int i3 = gZIPInputStr.read(obj3);
                         while (i3 != -1) {
                            uByteArrayOu.write(obj3, i, i3);
                         }
                         uByteArrayOu.close();
                         gZIPInputStr.close();
                         str = new String(uByteArrayOu.toByteArray(), d.a);
                      }
                   }
                }catch(java.lang.Exception e0){
                }
             }
             oh1.c = oh3;
          }
          int i1 = oh3.length();
          a b = list.b;
          try{
             oh = new h(oh3, i, i1, b);
             obj2 = a.b(oh, oh1.a).a(uob, oh1.a);
          }catch(java.lang.Exception e0){
          }
          oh = 1;
       }
       list.d = obj;
       obj = new HashMap();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       hashMap1 = new HashMap();
       hashMap1 = new HashMap();
       Iterator iterator1 = uArrayList.iterator();
       boolean b1 = false;
       while (iterator1.hasNext()) {
          a uoa = iterator1.next();
          if (uoa instanceof c) {
             uoa1 = uoa;
             list1 = obj.get(uoa1.c);
             if (list1 == null) {
                uArrayList1 = new ArrayList();
                obj.put(uoa1.c, uArrayList1);
                list1 = uArrayList1;
             }
             list1.add(uoa1);
          }
          if (uoa instanceof KSUEventRegister) {
             uoa1 = uoa;
             list1 = hashMap.get(uoa1.c);
             if (list1 == null) {
                uArrayList1 = new ArrayList();
                hashMap.put(uoa1.c, uArrayList1);
                uArrayList2 = uArrayList1;
             }
             uArrayList2.add(uoa1);
          }
          if (uoa instanceof AppEventRegister) {
             List list2 = hashMap1.get(uoa.c);
             if (list2 == null) {
                uArrayList2 = new ArrayList();
                hashMap1.put(uoa.c, uArrayList2);
                list2 = uArrayList2;
             }
             list2.add(uoa);
             switch (a$a.a[uoa.c.ordinal()]){
                 case 3:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 4:
                   break;
                 default:
             }
             b1 = true;
          }
       }
       _monitor_enter(this);
       list.e = obj;
       if (!obj.isEmpty()) {
          i = true;
       }
       list.j(i);
       list.f = hashMap1;
       list.i(b1);
       _monitor_exit(this);
       if (!null) {
          return obj2;
       }else {
          throw null;
       }
    }
    public void f(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.a(p0, p1);
       }
       return;
    }
    public synchronized void g(){
       Handler a;
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       b.d();
       _monitor_enter(c.class);
       if (PatchProxy.applyVoid(null, null, c.class, "1")) {
          _monitor_exit(c.class);
       }else {
          a = c.a;
          if (a != null) {
             a.removeCallbacksAndMessages(null);
             c.a = null;
          }
          _monitor_exit(c.class);
       }
       b.e();
       return;
    }
    public void h(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       a.c(new c(this, p0), false);
       return;
    }
    public synchronized void i(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "7")) {
          return;
       }
       if (p0 != this.i) {
          if (p0) {
             a.b().registerActivityLifecycleCallbacks(this);
          }else {
             a.b().unregisterActivityLifecycleCallbacks(this);
          }
          this.i = p0;
       }
       return;
    }
    public synchronized void j(boolean p0){
       a uoa1;
       ArrayList uArrayList;
       a uoa = a.class;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "6")) {
          return;
       }
       if (p0 != this.h) {
          if (p0) {
             uoa1 = a.f();
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.applyVoidOneRefs(this, uoa1, uoa, "1") && !uoa1.f.contains(this)) {
                uArrayList = new ArrayList(uoa1.f);
                uArrayList.add(this);
                uoa1.f = uArrayList;
             }
          }else {
             uoa1 = a.f();
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.applyVoidOneRefs(this, uoa1, uoa, "2")) {
                uArrayList = new ArrayList(uoa1.f);
                if (uArrayList.remove(this)) {
                   uoa1.f = uArrayList;
                }
             }
          }
          this.h = p0;
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 29) {
          this.b(AppEventRegister$Type.onActivityCreate, p0);
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       this.b(AppEventRegister$Type.onActivityDestroy, p0);
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       this.b(AppEventRegister$Type.onActivityPause, p0);
       return;
    }
    public void onActivityPostCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 29) {
          this.b(AppEventRegister$Type.onActivityCreate, p0);
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       this.b(AppEventRegister$Type.onActivityResume, p0);
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       this.b(AppEventRegister$Type.onActivityStart, p0);
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       this.b(AppEventRegister$Type.onActivityStop, p0);
       return;
    }
}
