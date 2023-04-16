package com.kuaishou.cover.Link;
import android.app.Application$ActivityLifecycleCallbacks;
import su.c;
import java.lang.Object;
import java.util.HashMap;
import z20.h;
import java.util.concurrent.ConcurrentHashMap;
import z20.d;
import com.kuaishou.cover.Link$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import android.util.LongSparseArray;
import java.lang.Long;
import com.kuaishou.cover.Link$b;
import java.lang.Runnable;
import ekd.k1;
import d30.c;
import java.lang.StringBuilder;
import a30.d;
import java.lang.Exception;
import com.kuaishou.cover.Link$c;
import android.app.Activity;
import java.lang.System;
import androidx.fragment.app.FragmentActivity;
import com.kwai.sdk.switchconfig.a;
import z20.a;
import com.kuaishou.cover.b;
import java.lang.ref.WeakReference;
import android.content.ComponentName;
import ev.b;
import c30.b;
import android.os.Bundle;
import k2b.e0;
import z20.g;
import z20.f;
import java.lang.Number;
import com.kuaishou.cover.c;
import android.net.Uri;
import com.kuaishou.cover.container.loader.ArkLoader;
import com.kuaishou.cover.container.loader.a;
import c30.a;
import mv.d;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import g30.a;
import a30.b;
import f30.k;
import f30.k$c;
import f30.i;
import android.util.Pair;
import f30.j;
import java.util.Queue;
import f30.n;
import com.kuaishou.bowl.data.center.data.model.RenderInfo;
import com.kuaishou.cover.c$a;
import f30.h;
import android.content.Intent;
import android.util.Base64;
import ov.b;
import z20.b;
import com.kuaishou.cover.Link$a;
import z20.c;

public class Link implements Application$ActivityLifecycleCallbacks, c	// class@0016d1
{
    public WeakReference b;
    public d c;
    public Map d;
    public b e;
    public final h f;
    public Map g;
    public WeakReference h;

    public void Link(){
       super();
       this.d = new HashMap();
       this.f = new h();
       this.g = new ConcurrentHashMap();
    }
    public void Link(d p0){
       super();
    }
    public static Link h(){
       return Link$d.a;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, Link.class, "31")) {
          return;
       }
       String str = this.l();
       if (!TextUtils.isEmpty(str)) {
          Link tg = this.g;
          if (tg != null) {
             tg.put(str, Boolean.FALSE);
          }
       }
       return;
    }
    public boolean b(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Link obj = PatchProxy.applyOneRefs(p0, this, Link.class, "29");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.f;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, h.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.isEmpty(p0) || TextUtils.isEmpty(obj.c)){
          b = false;
       }else {
          b = (obj.c).contains(p0);
       }
       return b;
    }
    public List c(){
       Object[] objArray = null;
       Link obj = PatchProxy.apply(objArray, this, Link.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null || !obj.size()) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.d.values().iterator();
       while (iterator.hasNext()) {
          LongSparseArray longSparseAr = iterator.next();
          for (int i = 0; i < longSparseAr.size(); i = i + 1) {
             uArrayList.add(Long.valueOf(longSparseAr.keyAt(i)));
          }
       }
       return uArrayList;
    }
    public boolean d(){
       String obj = PatchProxy.apply(null, this, Link.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l();
       boolean b = false;
       if (!TextUtils.isEmpty(obj)) {
          Link tg = this.g;
          if (tg == null || (tg.get(obj) != null && this.g.get(obj) == Boolean.TRUE)) {
             b = true;
          }
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, Link.class, "6")) {
          return;
       }
       k1.o(new Link$b(this));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, Link.class, "8")) {
          return;
       }
       c.d("Link-closeCurrentPageWidget");
       Link td = this.d;
       if (td != null && (!td.size() || TextUtils.isEmpty(this.l()))) {
          c.d("Link-closeCurrentPageWidget widgetMap is null");
          return;
       }else {
          LongSparseArray longSparseAr = this.d.get(this.l());
          if (longSparseAr == null) {
             c.d("Link-closeCurrentPageWidget "+this.l()+" has not widget ");
             return;
          }else {
             try{
                LongSparseArray longSparseAr1 = new LongSparseArray();
                boolean b = false;
                int i = 0;
                while (i < longSparseAr.size()) {
                   Link tf = this.f;
                   Long longx = Long.valueOf(longSparseAr.keyAt(i));
                   Objects.requireNonNull(tf);
                   Object obj = PatchProxy.applyOneRefs(longx, tf, h.class, "5");
                   boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): tf.a.contains(longx);
                   if (!b1) {
                      d uod = longSparseAr.valueAt(i);
                      if (uod != null) {
                         uod.a(b);
                      }
                   }else {
                      longSparseAr1.append(longSparseAr.keyAt(i), longSparseAr.valueAt(i));
                   }
                   i = i + 1;
                }
                longSparseAr.clear();
                for (; b < longSparseAr1.size(); b = b + 1) {
                   longSparseAr.append(longSparseAr1.keyAt(b), longSparseAr1.valueAt(b));
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             return;
          }
       }
    }
    public void g(long p0){
       if (PatchProxy.isSupport(Link.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, Link.class, "7")) {
          return;
       }
       c.d("Link-closeWidget: "+p0);
       k1.o(new Link$c(this, p0));
       return;
    }
    public String i(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Link.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return String.valueOf(System.identityHashCode(p0));
    }
    public final FragmentActivity j(){
       FragmentActivity obj = PatchProxy.apply(null, this, Link.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k();
       if (a.t().d("useGetFromActivityContext", true) && obj == null) {
          Link te = this.e;
          if (te != null && te.b() != null) {
             obj = this.e.b().c();
             this.r(obj);
          }
       }
       return obj;
    }
    public FragmentActivity k(){
       Object[] objArray = null;
       Link obj = PatchProxy.apply(objArray, this, Link.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public String l(){
       Object obj = PatchProxy.apply(null, this, Link.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k() == null || this.k().getComponentName() == null) {
          return null;
       }
       return this.i(this.k());
    }
    public b m(){
       return this.e;
    }
    public final String n(){
       Object obj = PatchProxy.apply(null, this, Link.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().c();
    }
    public boolean o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Link obj = PatchProxy.apply(objArray, this, Link.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, d.class, "11");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             d c = obj.c;
             if (c != null) {
                b = c.d();
             }
          }
       }
       return b;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Link.class, "22")) {
          return;
       }
       if (p0 instanceof FragmentActivity && p0 instanceof e0) {
          this.r(p0);
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Link.class, "34")) {
          return;
       }
       if (this.k() == p0 && !PatchProxy.applyVoidOneRefs(p0, this, Link.class, "20")) {
          if (this.k() != null) {
             FragmentActivity uFragmentAct = this.b.get();
             this.b = null;
          }
          k1.o(new g(this));
          this.c = null;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, Link.class, "11")) {
          k1.o(new f(this, p0));
          Link tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, h.class, "8")) {
             tf.b = null;
             tf.c = null;
             tf.d = false;
             tf.a.clear();
          }
       }
       if (!TextUtils.isEmpty(this.l())) {
          this.g.remove(this.l());
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       String str6;
       String str7;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, Link.class, "33")) {
          return;
       }
       if (p0 instanceof e0 && p0.getComponentName() != null) {
          String str = this.i(p0);
          if (Link.h().m().j != null && (!TextUtils.isEmpty(str) && (str.equals(Link.h().m().g) && (Link.h().m().h == null && this.c != null)))) {
             str = "Link";
             String str1 = "";
             Link tc = this.c;
             Objects.requireNonNull(tc);
             Link obj = PatchProxy.apply(null, tc, uod, "5");
             long l = (obj != patchProxyRe)? obj.longValue(): tc.b.d();
             String str2 = "";
             str1 = str1+l+str2;
             obj = this.c;
             Objects.requireNonNull(obj);
             String str3 = PatchProxy.apply(null, obj, uod, "7");
             if (str3 != patchProxyRe) {
             }else {
                str3 = obj.b.e();
             }
             obj = this.c;
             Objects.requireNonNull(obj);
             String str4 = "8";
             String str5 = PatchProxy.apply(null, obj, uod, str4);
             if (str5 != patchProxyRe) {
             }else {
                str6 = "bundleId";
                str5 = (!TextUtils.isEmpty(obj.b.e()))? Uri.parse(obj.b.e()).getQueryParameter(str6): str2;
                if (TextUtils.isEmpty(str5) && (obj.b.a() != null && obj.b.a().get(str6) != null)) {
                   str5 = obj.b.a().get(str6).toString();
                }
             }
          label_00ea :
             obj = this.c;
             Objects.requireNonNull(obj);
             str6 = PatchProxy.apply(null, obj, uod, "9");
             if (str6 != patchProxyRe) {
             }else {
                String str8 = "componentName";
                str6 = (!TextUtils.isEmpty(obj.b.e()))? Uri.parse(obj.b.e()).getQueryParameter(str8): str2;
                if (TextUtils.isEmpty(str6) && (obj.b.a() != null && obj.b.a().get(str8) != null)) {
                   str6 = obj.b.a().get(str8).toString();
                }
             }
          label_0141 :
             d c = this.c.c;
             if (c instanceof ArkLoader) {
                str7 = "ARK";
             }else if(c instanceof a){
                str7 = "TK";
             }else if(c instanceof a){
                str7 = "H5";
             }else {
                str7 = "KRN";
             }
             d uod1 = d.class;
             if (PatchProxy.isSupport(uod1)) {
                Object[] objArray = new Object[]{str,str1,str3,str5,str6,str7};
                if (PatchProxy.applyVoid(objArray, null, uod1, str4)) {
                label_01ae :
                   StageName dynamic_jump = StageName.dynamic_jump_loss_event;
                   Link tc1 = this.c;
                   Objects.requireNonNull(tc1);
                   MaterialDataItem materialData = PatchProxy.apply(null, tc1, uod, "6");
                   if (materialData != patchProxyRe) {
                   }else {
                      materialData = tc1.b.c();
                   }
                   a.a(dynamic_jump, materialData);
                }
             }
             Map map = d.b();
             map.put("dynamic_type", str);
             if (str1 == null) {
                str1 = str2;
             }
             map.put("material_id", str1);
             if (str3 != null) {
                str2 = str3;
             }
             map.put("router_url", str2);
             map.put("bundle_id", str5);
             map.put("component_name", str6);
             map.put("container_type", str7);
             d.m("DYNAMIC_JUMP_LOSS_EVENT", map);
             goto label_01ae ;
          }
       }
    label_01c9 :
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Link.class, "32")) {
          return;
       }
       if (p0 instanceof FragmentActivity && p0 instanceof e0) {
          c.d("Link-onActivityResumed: "+p0.getComponentName());
          this.b = new WeakReference(p0);
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
    public boolean p(b p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k obj = PatchProxy.applyTwoRefs(p0, p1, this, Link.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = k.a();
       Objects.requireNonNull(obj);
       String str = "2";
       Object[] obj1 = PatchProxy.applyTwoRefs(p1, p0, obj, k.class, str);
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          k$c uoc = obj.a.get(p1);
          if (uoc != null) {
             uoc = uoc.c;
             if (uoc != null) {
                c.d("RenderManager-handleStay");
                i oi = i.class;
                obj1 = PatchProxy.applyOneRefs(p0, uoc, oi, "1");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   c.d("LeaveRender-handleStay");
                   obj1 = null;
                   Object[] objArray = PatchProxy.apply(obj1, uoc, oi, str);
                   if (objArray != patchProxyRe) {
                   }else {
                      j a = uoc.a;
                      if (a != null && a.size()) {
                         n on = uoc.a.poll();
                         if (on != null) {
                            n e = on.e;
                            if (e != null && e.size()) {
                               Pair pair = new Pair(on.e.get(b), on.a);
                               uoc.a.clear();
                            }
                         }
                      }
                      objArray = obj1;
                   }
                   if (objArray == null) {
                      c.d("LeaveRender-handleStay no data");
                   }else {
                      Pair first = objArray.first;
                      if (first != null) {
                         MaterialDataItem renderInfo = first.renderInfo;
                         if (renderInfo != null && !TextUtils.isEmpty(renderInfo.renderUrl)) {
                            c$a uoa = new c$a();
                            uoa.e(first.materialId);
                            uoa.d(first);
                            uoa.f(first.renderInfo.renderUrl);
                            uoa.b(first.materialMap);
                            uoa.c(new h(uoc, first, objArray, p0));
                            Link.h().s(uoa.a());
                            b = true;
                         }
                      }
                   }
                }
             }
          }
       }
       return b;
    }
    public void q(FragmentActivity p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(Link.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, Link.class, "24")) {
          return;
       }
       if (p2 && p0 != null) {
          this.r(p0);
       }
       String str = this.i(p0);
       if (!PatchProxy.isSupport(Link.class) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(p1), this, Link.class, "26")) {
          Link td = this.d;
          if (td != null && td.size()) {
             LongSparseArray longSparseAr = this.d.get(str);
             if (longSparseAr != null && longSparseAr.size()) {
                int i = 0;
                while (i < longSparseAr.size()) {
                   d uod = longSparseAr.valueAt(i);
                   if (uod != null) {
                      if (p1) {
                         uod.b().show();
                      }else {
                         uod.b().F2();
                      }
                   }
                   i++;
                }
             }
          }
       }
       return;
    }
    public final void r(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Link.class, "23")) {
          return;
       }
       if (p0 == null) {
          c.e("Link-onNewActivity activity is null");
          return;
       }else {
          this.b = new WeakReference(p0);
          Link tf = this.f;
          Objects.requireNonNull(tf);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tf, h.class, "1")) {
             try{
                tf.b = objArray;
                tf.c = objArray;
                boolean b = false;
                tf.d = b;
                if (tf.a() != null && tf.a().getIntent() != null) {
                   boolean b1 = (tf.a().getComponentName() != null && ("com.kuaishou.merchant.basic.MerchantYodaWebViewActivity").equals(tf.a().getComponentName().getClassName()))? true: false;
                   tf.d = b1;
                   String str = tf.c(tf.a().getIntent().getData());
                   Bundle extras = tf.a().getIntent().getExtras();
                   if (TextUtils.isEmpty(str) && extras != null) {
                      str = extras.getString("KEY_URL");
                      if (!TextUtils.isEmpty(str)) {
                         str = tf.c(Uri.parse(str));
                      }
                   }
                   if (!TextUtils.isEmpty(str)) {
                      String str1 = new String(Base64.decode(str, b));
                      if (!TextUtils.isEmpty(str1)) {
                         tf.b = str1;
                      }
                   }
                }
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
          }
       }
    }
    public void s(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Link.class, "2")) {
          return;
       }
       if (p0 == null) {
          c.b("Link-loaderParams can not be null");
          return;
       }else {
          String str = p0.e();
          long l = p0.d();
          StringBuilder str1 = "link open, url: ";
          if (str == null) {
             str = "";
          }
          c.d(str1+str+" materialId: "+l);
          b.o().f(this.n(), String.valueOf(l), "open", null);
          FragmentActivity uFragmentAct = this.j();
          b uob = p0.b();
          if (uFragmentAct == null) {
             if (uob != null) {
                uob.onFailed();
             }
             return;
          }else {
             c.d("Link-open activity: "+uFragmentAct.getComponentName());
             p0.f(1);
             Link tc = this.c;
             if (tc == null) {
                this.c = new d(uFragmentAct, p0);
             }else {
                tc.a = uFragmentAct;
                tc.b = p0;
             }
             this.c.d(uob);
             k1.o(new b(this, uob));
             return;
          }
       }
    }
    public void t(long p0,String p1,Map p2,b p3,boolean p4){
       if (PatchProxy.isSupport(Link.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, Link.class, "3")) {
             return;
          }
       }
       c$a uoa = new c$a();
       uoa.e(p0);
       uoa.f(p1);
       uoa.b(p2);
       uoa.c(p3);
       this.u(uoa.a(), b.b().c(), p4);
       return;
    }
    public void u(c p0,String p1,boolean p2){
       long this;
       Link tf;
       b obj;
       d c;
       if (PatchProxy.isSupport(Link.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, Link.class, "4")) {
          return;
       }
       if (p0 == null) {
          c.b("Link-loaderParams can not be null");
          return;
       }else {
          String str = p0.e();
          this = p0.d();
          StringBuilder str1 = "link openWidget, url: ";
          if (str == null) {
             str = "";
          }
          c.d(str1+str+" materialId: "+this);
          Map map = null;
          b.o().f(this.n(), String.valueOf(this), "open widget", map);
          FragmentActivity uFragmentAct = this.j();
          if (uFragmentAct == null) {
             return;
          }else {
             c.d("Link-openWidget activity: "+uFragmentAct.getComponentName());
             Map map1 = p0.a();
             if (!p2) {
                tf = this.f;
                if (tf.d != null) {
                   return;
                }else if(TextUtils.isEmpty(tf.b())){
                   return;
                }else {
                   tf = this.f;
                   Long longx = Long.valueOf(this);
                   Objects.requireNonNull(tf);
                   if (!PatchProxy.applyVoidOneRefs(longx, tf, h.class, "4")) {
                      tf.a.add(longx);
                   }
                   if (map1 == null) {
                      map1 = new HashMap();
                   }
                   map1.put("widget", this.f.b());
                }
             }
             if (PatchProxy.isSupport(Link.class)) {
                obj = PatchProxy.applyOneRefs(Long.valueOf(this), this, Link.class, "5");
                if (obj != PatchProxyResult.class) {
                   map = obj;
                }else {
                label_00db :
                   tf = this.d;
                   if (tf == null || (tf.size() && (!TextUtils.isEmpty(this.l()) && a.t().b("mallResumeThreshold", -1) >= 0))) {
                      LongSparseArray longSparseAr = this.d.get(this.l());
                      if (longSparseAr != null) {
                         int i = 0;
                         while (i < longSparseAr.size()) {
                            if (!longSparseAr.keyAt(i) - this) {
                               map = longSparseAr.valueAt(i);
                               break ;
                            }
                            i = i + 1;
                         }
                      }
                   }
                }
             }else {
                goto label_00db ;
             }
             if (map != null) {
                if (!PatchProxy.applyVoidOneRefs(map1, map, d.class, "1")) {
                   c = map.c;
                   if (c != null) {
                      c.a(map1);
                   }
                }
                return;
             }else {
                obj = p0.b();
                p0.f(2);
                d uod = new d(uFragmentAct, p0);
                uod.d = p1;
                Link$a uoa = new Link$a(this, obj, this, uod, uFragmentAct);
                uod.d(p0);
                k1.o(new c(this, uod, obj));
                return;
             }
          }
       }
    }
}
