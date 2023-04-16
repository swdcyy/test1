package com.kuaishou.cover.container.loader.b;
import c30.b;
import java.lang.Object;
import com.kuaishou.cover.Link;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e30.a;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import d30.c;
import a30.b;
import g30.g;
import com.kuaishou.cover.pop.PopItemParams;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.cover.c;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import fv.b;
import java.lang.Long;
import hu4.h;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import android.view.View;
import a30.e;
import android.app.Activity;
import q07.a;
import hu4.j;
import com.kuaishou.cover.container.loader.b$a;
import hu4.f;
import a30.c;
import c30.g;
import e30.b;
import com.kuaishou.cover.b;
import z20.a;
import su.o;
import ev.b;
import gv.h;
import java.lang.StringBuilder;
import com.kuaishou.bowl.data.center.data.model.PageData;
import com.kuaishou.bowl.data.center.data.model.PageBaseInfo;
import c30.h;
import q07.c;
import java.lang.Throwable;
import d30.a;
import ov.b;
import java.lang.System;
import com.kuaishou.bowl.event.utils.StageName;
import g30.a;
import android.content.ComponentName;
import com.kwai.sdk.switchconfig.a;
import g30.d;
import mv.a;
import mv.c;
import android.net.Uri;
import mv.d;
import java.lang.Exception;
import com.kuaishou.cover.container.loader.b$b;
import b30.a;
import b30.b;
import android.view.ViewParent;

public abstract class b implements b	// class@0016dc
{
    public FragmentActivity a;
    public c b;
    public MaterialDataItem c;
    public long d;
    public String e;
    public Map f;
    public b g;
    public int h;
    public Window i;
    public e j;
    public boolean k;
    public ViewGroup l;
    public h m;
    public a n;
    public final a o;
    public PopItemParams p;

    public void b(){
       super();
       Link link = Link.h();
       Objects.requireNonNull(link);
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, link, Link.class, "18");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          link = link.h;
          if (link != null) {
             objArray = link.get();
          }
          objArray1 = objArray;
       }
       this.o = objArray1;
       return;
    }
    public void D2(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "24")) {
          return;
       }
       c.d("UnitLoader: close");
       this.q();
       uob = this.g;
       if (uob != null) {
          uob.onDismiss();
          if (g.a()) {
             this.g.b(p0);
          }
       }
       this.r();
       this.c();
       b to = this.o;
       if (to != null) {
          to.a(3, this.p);
       }
       return;
    }
    public void E2(){
       if (PatchProxy.applyVoid(null, this, b.class, "23")) {
          return;
       }
       this.r();
       this.q();
       this.c();
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "27")) {
          return;
       }
       b tl = this.l;
       if (tl != null && tl.getVisibility() != 8) {
          this.l.setVisibility(8);
       }
       return;
    }
    public void G2(FragmentActivity p0,c p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "1")) {
          return;
       }
       this.a = p0;
       this.b = p1;
       this.d = p1.d();
       this.c = p1.c();
       this.e = p1.e();
       this.f = p1.a();
       this.g = p1.b();
       this.h = p1.e;
       this.i = p1.g;
       this.j = p1.h;
       this.k = true;
       if (!PatchProxy.applyVoid(null, this, uob, "2")) {
          b tf = this.f;
          if (tf != null) {
             String str = "dialogName";
             if (tf.get(str) != null && (this.f.get(str) instanceof String && !TextUtils.isEmpty(this.f.get(str)))) {
                tf = this.f;
                tf.put(str, tf.get(str));
             }else {
                tf = this.c;
                if (tf != null && (!TextUtils.isEmpty(tf.resourceId) && !(b.k).equals(this.c.resourceId))) {
                   this.f.put(str, this.c.resourceId);
                }else {
                   this.f.put(str, Long.valueOf(this.d));
                }
             }
          }
       }
       PopItemParams popItemParam = new PopItemParams();
       this.p = popItemParam;
       popItemParam.a = this.d;
       popItemParam.b = this.e;
       popItemParam.c = this.f;
       return;
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       b tm = this.m;
       if (tm != null) {
          tm.o(p0);
       }
       return;
    }
    public void b(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
       if (this.f() != null) {
          this.f().addContentView(this.l, layoutParams);
       }else {
          Object obj = PatchProxy.apply(objArray, this, uob, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uob = this.j;
             if (uob != null) {
                e a = uob.a;
                if (a != null) {
                   e b1 = uob.b;
                   if (b1 != null) {
                      a.addView(this.l, uob.c, b1);
                   }else {
                      a.addView(this.l, uob.c);
                   }
                   b = true;
                }
             }
             b = false;
          }
          if (!b) {
             this.a.addContentView(this.l, layoutParams);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "22")) {
          return;
       }
       b tn = this.n;
       if (tn != null) {
          tn.a();
          this.n = null;
       }
       return;
    }
    public boolean d(){
       return this.k;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.s();
       h oh = j.a(this.a, this.e, this.f);
       this.m = oh;
       if (oh == null || oh.d() == null) {
          c.a("UnitLoader: RenderEngineCreator.parse failed");
          return;
       }else {
          this.m.k(new b$a(this));
          this.p();
          ViewGroup viewGroup = this.m.d();
          this.l = viewGroup;
          viewGroup.setBackgroundColor(0);
          this.l();
          this.b();
          return;
       }
    }
    public Window f(){
       b obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          return obj;
       }
       obj = this.a;
       if (obj instanceof c) {
          return obj.a();
       }
       return null;
    }
    public ViewGroup g(){
       return this.l;
    }
    public String h(){
       return "";
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.o != null && !this.k()) {
          this.o.b(this.p, new g(this));
       }else {
          this.e();
       }
       return;
    }
    public final boolean j(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (Link.h().m() != null && (Link.h().m().b() != null && Link.h().m().b().a()))? true: false;
       return b;
    }
    public boolean k(){
       boolean b = (this.h == 2)? true: false;
       return b;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       b tg = this.g;
       if (tg != null) {
          tg.a(this.d);
       }
       return;
    }
    public void load(){
       StringBuilder obj;
       int i;
       boolean b;
       String str;
       b obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       try{
          obj = PatchProxy.apply(objArray, this, uob, "4");
          i = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj1 = this.f;
             if (obj1 != null) {
                str = "checkPage";
                if (obj1.containsKey(str) && Boolean.TRUE == this.f.get(str)) {
                   b = o.c().c.a(b.b().c(), this.d);
                }
             }
             b = true;
          }
       }catch(java.lang.Exception e0){
       }
       if (!b) {
          return;
       }else {
          this.o();
          obj = "UnitLoader: load url ";
          str = (TextUtils.isEmpty(this.e))? "is null": this.e;
          c.d(obj+str);
          obj1 = PatchProxy.apply(objArray, this, uob, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.k()){
             b1 = false;
          }else {
             PageData pageData = o.c().g(b.b().c());
             if (pageData != null) {
                pageData = pageData.pageBaseInfo;
                if (pageData != null && ("mainpage").equals(pageData.popEngine)) {
                label_00b1 :
                   b1 = i;
                }
             }
             i = 0;
             goto label_00b1 ;
          }
          if (b1) {
             if (!PatchProxy.applyVoid(objArray, this, uob, "10")) {
                h oh = new h(this, 1234, this.a);
                this.n = oh;
                c.a(oh);
             }
          }else {
             this.i();
          }
          return;
       }
    }
    public void m(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs("load failed", p0, null, c.class, "5") && c.c() != null) {
          c.c().e("Link-Log", "load failed", p0);
       }
       this.E2();
       b tg = this.g;
       if (tg != null) {
          tg.onFailed();
       }
       tg = this.o;
       if (tg != null) {
          tg.a(2, this.p);
       }
       b.o().f(b.b().c(), String.valueOf(this.d), "load failed", null);
       return;
    }
    public void n(){
       boolean b2;
       String str2;
       c a;
       b c;
       boolean b = this;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uob, "11")) {
          return;
       }
       String str = "load success";
       c.d(str);
       if (!PatchProxy.applyVoid(objArray, b, uob, "18")) {
          c.d("UnitLoader: uploadLoadSuccess time: "+System.currentTimeMillis());
          c = b.c;
          if (c == null) {
             c = new MaterialDataItem();
             c.materialId = b.d;
          }
          a.a(StageName.link_render_end, c);
          b.o().f(b.b().c(), String.valueOf(b.d), str, objArray);
       }
       b g = b.g;
       if (g != null) {
          g.onShow();
       }
       Object obj = PatchProxy.apply(objArray, b, uob, "26");
       boolean b1 = false;
       if (obj != PatchProxyResult.class) {
          b2 = obj.booleanValue();
       }else {
          uob = b.a;
          if (uob != null && uob.getComponentName() != null) {
             str2 = "com.yxcorp.gifshow.HomeActivity";
             if (a.t().d("useGetFromActivityContext", true)) {
                uob = b.c;
                if (uob == null || (!(uob.pageCode).equals(b.f) || (!str2.equals(b.a.getComponentName().getClassName()) || this.j()))) {
                label_00b4 :
                   b2 = false;
                }
             }else if(str2.equals(b.a.getComponentName().getClassName()) && !this.j()){
             }
             b2 = true;
          }
       }
       if (b2) {
          b.k = true;
          this.F2();
       }else {
          this.show();
       }
       try{
          uob = b.e;
          String str1 = "";
          str2 = b.d+str1;
          String str3 = this.h();
          if (!PatchProxy.applyVoidThreeRefs(uob, str2, str3, null, d.class, "1")) {
             b uob1 = Link.h().m();
             a f = a.a().f;
             c.d("costTimeEvent t3: "+System.currentTimeMillis());
             f.d = System.currentTimeMillis();
             Link.h().m().d(true);
             Link.h().m().e(b1);
             a = f.a;
             c b3 = f.b;
             long l = 0;
             long l1 = f.b();
             if (f.a() - l > 0) {
                l1 = l1 - f.a();
             }
             long l2 = f.c();
             if (f.a() - l > 0) {
                l2 = l2 - f.a();
             }
             if (f.d() - l > 0) {
                l1 = l1 - f.d();
                l2 = l2 - f.d();
             }
             if (a - l2 <= 0) {
                long l3 = b3 - a;
                l1 = l1 - a;
                l = l2 - a;
                str = "t1: "+l3+" t2: "+l1+" t3: "+l;
                c.d(str);
                Uri uri = Uri.parse(uob);
                String queryParamet = uri.getQueryParameter("bundleId");
                String str4 = queryParamet;
                d.a(l3, l1, l, uob1.i, "Link", str4, uri.getQueryParameter("componentName"), str2+str1, uob, str3);
             }
          }
       label_01e0 :
          uob = b.o;
          if (uob != null) {
             uob.a(true, b.p);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void o(){
    }
    public void p(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "16")) {
          return;
       }
       if (this.k()) {
          String str = "true";
          Object obj = PatchProxy.apply(objArray, this, uob, "19");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.t().d("useLinkGenerateId", true) && !TextUtils.isEmpty(this.e)){
             try{
                b = str.equals(Uri.parse(this.e).getQueryParameter("handleBack"));
                if (!b) {
                   b tf = this.f;
                   if (tf != null && tf.containsKey("handleBack")) {
                      b = str.equals(this.f.get("handleBack"));
                   }
                }
             }catch(java.lang.Exception e0){
                c.d("UnitLoader: "+e0.getMessage());
             }
          }
       label_007e :
          if (!b) {
             return;
          }
       }
       uob = Link.h().m().d;
       if (uob != null) {
          uob.b(this.a, new b$b(this, uob));
       }
       return;
    }
    public final void q(){
       this.k = false;
       this.a = null;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, b.class, "21")) {
          return;
       }
       b tm = this.m;
       if (tm != null) {
          tm.i();
          this.m = null;
       }
       tm = this.l;
       if (tm != null && tm.getParent() != null) {
          this.l.getParent().removeView(this.l);
          this.l = null;
          c.d("UnitLoader: removeView");
       }
       if (this.l != null) {
          this.l = null;
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       c.d("UnitLoader: uploadLoadStart time: "+System.currentTimeMillis());
       b tc = this.c;
       if (tc == null) {
          tc = new MaterialDataItem();
          tc.materialId = this.d;
       }
       a.a(StageName.link_render_start, tc);
       b.o().f(b.b().c(), String.valueOf(this.d), "execute load", null);
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, b.class, "25")) {
          return;
       }
       b tl = this.l;
       if (tl == null) {
          return;
       }
       if (tl.getVisibility()) {
          this.l.setVisibility(0);
       }
       this.k = true;
       return;
    }
}
