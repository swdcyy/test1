package com.kwai.component.tti.a;
import com.kwai.component.tti.b;
import ph5.i;
import java.lang.String;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Handler;
import ekd.s1;
import android.os.Looper;
import android.os.HandlerThread;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.List;
import ph5.d;
import ph5.c;
import ph5.e;
import t45.c;
import ph5.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.component.tti.a$a;
import ph5.k;
import ph5.j;
import ph5.a;

public class a extends b	// class@000a9e
{
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final Map n;
    public final Map o;
    public int p;
    public int q;
    public Handler r;
    public static String s;
    public static long t;

    static {
       SharedPreferences a = i.a;
       a.s = a.getString("TTIBlackList", "");
       a.t = a.getLong("TTIWorkThreadIntervalTime", 200);
    }
    public void a(){
       super();
       this.b = true;
       this.c = true;
       this.d = false;
       this.e = false;
       this.f = false;
       this.g = false;
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new HashMap();
       this.o = new HashMap();
       this.p = 0;
       this.q = 0;
       this.r = new Handler(s1.b().getLooper());
    }
    public void a(Runnable p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, a.class, "1")) {
          return;
       }
       String s = a.s;
       if (s != null && s.contains(p1)) {
          return;
       }
       this.n.put(new WeakReference(p0), p1);
       if (p2) {
          if (p3) {
             this.i.add(p0);
          }else {
             this.h.add(p0);
          }
       }else if(p3){
          this.k.add(p0);
       }else {
          this.j.add(p0);
       }
       if (this.f != null && this.b != null) {
          this.l();
       }
       return;
    }
    public void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.l.remove(p0);
       this.m.remove(p0);
       return;
    }
    public void d(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.h.remove(p0);
       this.i.remove(p0);
       this.j.remove(p0);
       this.k.remove(p0);
       return;
    }
    public void e(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "5")) {
          return;
       }
       this.o.put(new WeakReference(p0), p1);
       if (p2) {
          a tm = this.m;
          tm.add(tm.size(), p0);
       }else {
          this.m.add(p0);
       }
       if (this.g != null && this.c != null) {
          this.m();
       }
       return;
    }
    public void f(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "3")) {
          return;
       }
       this.o.put(new WeakReference(p0), p1);
       if (p2) {
          this.l.add(p0);
       }else {
          this.m.add(p0);
       }
       if (this.g != null && this.c != null) {
          this.m();
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       this.b = true;
       this.l();
       this.r.post(new d(this));
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.b = false;
       this.r.post(new c(this));
       return;
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "8")) {
          return;
       }
       boolean b = false;
       if (this.c == null) {
          this.e = b;
          return;
       }else if(!this.l.isEmpty()){
          objArray = this.l.remove(b);
       }else if(!this.m.isEmpty()){
          objArray = this.m.remove(b);
       }
       int i = 1;
       if (objArray != null) {
          c.a(new e(objArray, this.k(objArray, b)));
          this.q = this.q + i;
          this.r.postDelayed(new b(this), a.t);
       }else {
          this.e = b;
          this.g = i;
       }
       return;
    }
    public final Runnable j(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.h.isEmpty()) {
          return this.h.remove(0);
       }
       if (!this.i.isEmpty()) {
          return this.i.remove(0);
       }
       if (!this.j.isEmpty()) {
          return this.j.remove(0);
       }
       if (!this.k.isEmpty()) {
          return this.k.remove(0);
       }
       return null;
    }
    public final String k(Runnable p0,boolean p1){
       Iterator iterator;
       Map$Entry uEntry;
       Runnable runnable;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          iterator = this.n.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             runnable = uEntry.getKey().get();
             if (runnable != null && p0 == runnable) {
                return uEntry.getValue();
             }
          }
       }else {
          iterator = this.o.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             runnable = uEntry.getKey().get();
             if (runnable != null && p0 == runnable) {
                return uEntry.getValue();
             }
          }
       }
       return null;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
          return;
       }
       if (this.d == null) {
          this.d = true;
          a$a uoa = new a$a(this);
          if (!PatchProxy.applyVoid(objArray, uoa, k.class, "1")) {
             uoa.a.post(new j(uoa));
          }
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (this.e == null) {
          this.e = true;
          this.r.post(new a(this));
       }
       return;
    }
}
