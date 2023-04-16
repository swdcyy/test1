package com.gifshow.kanim.a;
import bh.o;
import com.gifshow.kanim.a$a;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import com.gifshow.kanim.a$d;
import com.gifshow.kanim.a$e;
import bh.r;
import ih.c;
import bh.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import gh.d;
import android.animation.AnimatorSet;
import bh.c;
import java.lang.Integer;
import com.gifshow.kanim.SampleRateInfo;
import f3b.s;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.util.Map;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.gifshow.kanim.a$f;
import com.kwai.robust.PatchProxyResult;
import com.gifshow.kanim.a$b;
import java.util.concurrent.Callable;
import android.content.Context;
import com.gifshow.kanim.b;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.gifshow.kanim.a$c;
import com.gifshow.kanim.d;
import dh.a;
import bh.i;
import com.gifshow.kanim.c;
import bh.j;
import bh.n;
import bh.k;
import java.util.HashMap;
import java.util.Set;

public class a implements o	// class@0015b4
{
    public g a;
    public View b;
    public String c;
    public String d;
    public r e;
    public boolean f;
    public i g;
    public boolean h;
    public List i;
    public AnimatorSet j;
    public int k;
    public boolean l;
    public Map m;
    public List n;
    public boolean o;
    public final List p;
    public n q;
    public final Set r;
    public final n s;
    public final n t;
    public static final n u;

    static {
       a.u = new a$a();
    }
    public void a(View p0,String p1,String p2){
       super();
       this.f = false;
       this.h = true;
       this.i = new ArrayList();
       this.k = 1;
       this.l = false;
       this.n = new ArrayList();
       this.o = false;
       this.p = new ArrayList();
       this.r = new HashSet();
       this.s = new a$d(this);
       this.t = new a$e(this);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = r.a(p0);
       this.i();
       if (c.e(p1)) {
          this.j(this.h(p1, false));
       }else {
          this.j(this.g(p1));
       }
       return;
    }
    public void a(View p0,String p1,String p2,boolean p3){
       super();
       this.f = false;
       this.h = true;
       this.i = new ArrayList();
       this.k = 1;
       this.l = false;
       this.n = new ArrayList();
       this.o = false;
       this.p = new ArrayList();
       this.r = new HashSet();
       this.s = new a$d(this);
       this.t = new a$e(this);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = r.a(p0);
       this.i();
       if (c.e(p1)) {
          this.j(this.h(p1, p3));
       }else {
          this.j(this.g(p1));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.f(1);
       return;
    }
    public synchronized void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       if (this.i.isEmpty()) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a().pause();
       }
       return;
    }
    public synchronized void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.i.isEmpty()) {
          return;
       }
       this.k = 1;
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod.a().isRunning()) {
             uod.a().cancel();
          }
       }
       return;
    }
    public synchronized void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       this.c();
       this.n.clear();
       a ti = this.i;
       if (ti != null) {
          ti.clear();
       }
       ti = this.j;
       if (ti != null) {
          ti.removeAllListeners();
       }
       this.b = null;
       return;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       if (this.i.isEmpty()) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a().resume();
       }
       return;
    }
    public void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       this.n.add(p0);
       return;
    }
    public void f(int p0){
       float f;
       a tg;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       try{
          f = (float)c.d().merchant_animation;
       }catch(java.lang.Exception e0){
          f = 0x3a83126f;
       }
       if (s.c(f) && this.m != null) {
          boolean i = 0x4b316083;
          try{
             b.a(i).j1("merchant_animation_event", c.c(this.m), 7, null);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final g g(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Context obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.b.isInEditMode()) {
          return new g(new a$b(this, p0));
       }
       g obj1 = null;
       if (this.h != null) {
          obj = this.b.getContext();
          obj1 = PatchProxy.applyTwoRefs(obj, p0, obj1, b.class, "9");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = b.b(obj, p0, "asset_"+p0);
          }
       }else {
          obj1 = b.b(this.b.getContext(), p0, obj1);
       }
       return obj1;
    }
    public final g h(String p0,boolean p1){
       d obj1;
       Map a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.b.isInEditMode()) {
          return new g(new a$c(this, p0));
       }else {
          i oi = null;
          if (this.h != null) {
             if (p1) {
                Context context = this.b.getContext();
                obj1 = PatchProxy.applyTwoRefs(context, p0, oi, b.class, "4");
                if (obj1 != patchProxyRe) {
                }else {
                   String str = "url_"+p0;
                   obj1 = PatchProxy.applyThreeRefs(context, p0, str, null, b.class, "6");
                   if (obj1 != patchProxyRe) {
                   }else {
                      obj1 = new d(context, p0, str);
                      g og = PatchProxy.applyTwoRefs(str, obj1, oi, b.class, "32");
                      if (og != patchProxyRe) {
                      }else if(str == null){
                         oi = a.b().a(str);
                      }
                      if (oi != null) {
                         og = new g(new c(oi), true);
                      }else if(str != null){
                         a = b.a;
                         if (a.containsKey(str)) {
                            og = a.get(str);
                         }
                      }
                      og = new g(obj1);
                      if (str != null) {
                         og.b(new j(str));
                         og.a(new k(str));
                         b.a.put(str, og);
                      }
                      obj1 = og;
                   }
                }
             }else {
                obj1 = b.f(this.b.getContext(), p0);
             }
          }else {
             obj1 = b.g(this.b.getContext(), p0, oi);
          }
          return obj1;
       }
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       this.m = hashMap;
       hashMap.put("source", this.c);
       this.m.put("type", Boolean.valueOf(c.e(this.c)));
       this.m.put("animation", this.d);
       return;
    }
    public synchronized boolean isRunning(){
       a obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj != null) {
          return obj.isRunning();
       }
       return false;
    }
    public final void j(g p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       i oi = null;
       this.g = oi;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (!PatchProxy.applyVoid(oi, this, uoa, "5")) {
          uoa = this.a;
          if (uoa != null) {
             a ts = this.s;
             _monitor_enter(uoa);
             if (PatchProxy.applyOneRefs(ts, uoa, og, "3") != patchProxyRe) {
                _monitor_exit(uoa);
             }else {
                uoa.a.remove(ts);
                _monitor_exit(uoa);
             }
             uoa = this.a;
             ts = this.t;
             _monitor_enter(uoa);
             if (PatchProxy.applyOneRefs(ts, uoa, og, "5") != patchProxyRe) {
                _monitor_exit(uoa);
             }else {
                uoa.b.remove(ts);
                _monitor_exit(uoa);
             }
          }
       }
       this.a = p0.b(this.s).a(this.t);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (this.i.isEmpty()) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          AnimatorSet uAnimatorSet = iterator.next().a();
          if (uAnimatorSet.isRunning()) {
             uAnimatorSet.cancel();
          }
          uAnimatorSet.start();
       }
       return;
    }
}
