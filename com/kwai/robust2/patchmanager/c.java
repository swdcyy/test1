package com.kwai.robust2.patchmanager.c;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.robust2.patchmanager.c$a;
import com.kwai.robust2.patchmanager.c$b;
import java.util.List;
import java.util.ArrayList;
import com.kwai.robust.Robust;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.robust.Patch;
import java.lang.String;
import android.content.Context;
import pm7.c;
import pm7.e;
import pm7.d;
import pm7.b;
import pm7.f;
import om7.c;
import pm7.h;
import rm7.e;
import pm7.i;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import java.lang.ClassLoader;
import java.lang.CharSequence;
import android.text.TextUtils;
import pm7.l;
import java.util.Map;
import java.lang.StringBuilder;
import java.util.Objects;
import pm7.a;
import java.lang.Runnable;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.System;
import pm7.m;
import pm7.g;
import java.lang.Iterable;
import rm7.a;
import java.lang.Throwable;
import java.util.Arrays;
import java.util.Queue;
import rm7.q;

public class c	// class@000ef9
{
    public h a;
    public e b;
    public c c;
    public final Map d;
    public boolean e;

    public void c(){
       super();
       this.d = new HashMap(8);
    }
    public void c(c$a p0){
       super();
       this.d = new HashMap(8);
    }
    public static c a(){
       return c$b.a;
    }
    public static List c(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = Robust.get().getAppliedPatches().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getId());
       }
       return uArrayList;
    }
    public List b(){
       return c.c();
    }
    public boolean d(){
       return this.e;
    }
    public void e(Context p0,c p1,e p2){
       if (p2 != null) {
          d.b().i(p2);
          Robust.get().setLogger(new f(p2));
       }
       this.a = new h(p0);
       this.c = p1;
       this.b = new e(this.a);
       Thread.setDefaultUncaughtExceptionHandler(new i(this.a));
       return;
    }
    public void f(String p0,ClassLoader p1){
       Object[] objArray1;
       int i = 0;
       if (TextUtils.isEmpty(p0) || p1 == null) {
          Object[] objArray = new Object[i];
          d.b().d("PatchManager", "Check whether feature \("+p0+"\), classloader: "+p1+" legal?", objArray);
          return;
       }else {
          l ol = new l(this, p0, p1);
          if (this.a.l.containsValue(p0)) {
             objArray1 = new Object[i];
             d.b().a("PatchManager", "sync installCustomPatchLoader feature: "+p0, objArray1);
             c ta = this.a;
             Objects.requireNonNull(ta);
             a uoa = new a(ol);
             if (ta.k.postAtFrontOfQueue(uoa)) {
                _monitor_enter(uoa);
                long l = SystemClock.uptimeMillis() + 2000;
                while (true) {
                   if (uoa.c == null) {
                      try{
                         long l1 = l - SystemClock.uptimeMillis();
                         if (l1 <= 0) {
                            _monitor_exit(uoa);
                            break ;
                         }else {
                            uoa.wait(l1);
                         }
                      }catch(java.lang.InterruptedException e0){
                      }
                   }else {
                      _monitor_exit(uoa);
                      break ;
                   }
                }
             }
          }else {
             objArray1 = new Object[i];
             d.b().a("PatchManager", "async installCustomPatchLoader feature: "+p0, objArray1);
             this.a.a(ol);
          }
       }
    }
    public void g(){
       this.h(true);
    }
    public final void h(boolean p0){
       long l = System.currentTimeMillis();
       this.b.e(this.a.a);
       if (p0) {
          c ta = this.a;
          ta.k.post(new g(ta));
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       d.b().a("PatchManager", "loadLocalPatch:"+TextUtils.join(",", new ArrayList(tb.i))+",cost "+(System.currentTimeMillis() - l)+"ms", objArray);
       return;
    }
    public void i(a p0,String p1,Object[] p2){
       String str;
       Object[] objArray;
       Throwable throwable = p0.c();
       try{
          str = p0.h();
       }catch(java.lang.Exception e0){
          str = "";
       }
       int i = 4;
       if (e0 != null) {
          objArray = new Object[i];
          objArray[0] = p0.b();
          objArray[1] = str;
          objArray[2] = p1;
          objArray[3] = Arrays.toString(p2);
          d.b().f("PatchManager", e0, "onEvent\(name:%s reportValue:%s\) robustId:%s args:%s", objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = p0.b();
          objArray[1] = str;
          objArray[2] = p1;
          objArray[3] = Arrays.toString(p2);
          d.b().a("PatchManager", "onEvent\(name:%s reportValue:%s\) robustId:%s args:%s", objArray);
       }
       c tc = this.c;
       if (tc != null) {
          tc.onEvent(p0, p1, p2);
       }
       return;
    }
    public void j(String p0){
       c tb = this.b;
       Iterator iterator = tb.h.iterator();
       while (iterator.hasNext()) {
          tb.d.j(iterator.next());
          iterator.remove();
       }
       q oq = new q(this.a);
       oq.f(null);
       this.a.j(oq);
       Object[] objArray = new Object[0];
       d.b().a("PatchManager", "requestPatch", objArray);
       return;
    }
    public void k(e p0){
       d.b().i(p0);
    }
}
