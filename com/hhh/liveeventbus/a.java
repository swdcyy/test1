package com.hhh.liveeventbus.a;
import bm.k;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import com.hhh.liveeventbus.LiveEventData;
import java.util.HashMap;
import java.lang.Thread;
import androidx.lifecycle.Observer;
import bm.c;
import java.lang.Runnable;
import bm.h;
import bm.d;
import bm.g;
import bm.e;
import bm.f;
import androidx.lifecycle.LifecycleOwner;
import bm.b;
import bm.a;
import bm.l;
import java.util.Map;

public class a implements k	// class@00055e
{
    public final LiveEventData a;
    public final Map b;
    public static final Handler c;

    static {
       a.c = new Handler(Looper.getMainLooper());
    }
    public void a(){
       super();
       this.a = new LiveEventData();
       this.b = new HashMap();
    }
    public static boolean i(){
       boolean b = (Looper.getMainLooper().getThread() == Thread.currentThread())? true: false;
       return b;
    }
    public void a(Observer p0){
       if (a.i()) {
          this.j(p0);
       }else {
          a.c.post(new c(this, p0));
       }
       return;
    }
    public void b(Object p0){
       a.c.post(new h(this, p0));
    }
    public void c(Observer p0){
       if (a.i()) {
          this.l(p0);
       }else {
          a.c.post(new d(this, p0));
       }
       return;
    }
    public void d(Object p0,long p1){
       a.c.postDelayed(new g(this, p0), p1);
    }
    public void e(Observer p0){
       if (a.i()) {
          this.o(p0);
       }else {
          a.c.post(new e(this, p0));
       }
       return;
    }
    public void f(Object p0){
       if (a.i()) {
          this.n(p0);
       }else {
          a.c.post(new f(this, p0));
       }
       return;
    }
    public void g(LifecycleOwner p0,Observer p1){
       if (a.i()) {
          this.m(p0, p1);
       }else {
          a.c.post(new b(this, p0, p1));
       }
       return;
    }
    public void h(LifecycleOwner p0,Observer p1){
       if (a.i()) {
          this.k(p0, p1);
       }else {
          a.c.post(new a(this, p0, p1));
       }
       return;
    }
    public final void j(Observer p0){
       l ol = new l(p0);
       boolean b = (this.a.d() > -1)? true: false;
       ol.c = b;
       this.b.put(p0, ol);
       this.a.f(ol);
       return;
    }
    public final void k(LifecycleOwner p0,Observer p1){
       l ol = new l(p1);
       boolean b = (this.a.d() > -1)? true: false;
       ol.c = b;
       this.a.e(p0, ol);
       return;
    }
    public final void l(Observer p0){
       l ol = new l(p0);
       this.b.put(p0, ol);
       this.a.f(ol);
    }
    public final void m(LifecycleOwner p0,Observer p1){
       this.a.e(p0, new l(p1));
    }
    public final void n(Object p0){
       this.a.h(p0);
    }
    public final void o(Observer p0){
       if (this.b.containsKey(p0)) {
          p0 = this.b.remove(p0);
       }
       this.a.g(p0);
       return;
    }
}
