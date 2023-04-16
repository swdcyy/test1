package com.facebook.react.uimanager.j$a;
import java.lang.Runnable;
import com.facebook.react.uimanager.j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg.b$b;
import hg.b;
import android.os.SystemClock;
import java.util.Iterator;
import com.facebook.react.uimanager.j$w;
import yd.e;
import java.lang.Exception;
import com.facebook.react.uimanager.c;
import ze.f;
import cf.a;
import cb.a;
import com.facebook.react.uimanager.RenderProfileQueue;
import hg.a;

public class j$a implements Runnable	// class@001352
{
    public final int b;
    public final ArrayDeque c;
    public final ArrayList d;
    public final ArrayList e;
    public final AtomicBoolean f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final j k;

    public void j$a(j p0,int p1,ArrayDeque p2,ArrayList p3,ArrayList p4,AtomicBoolean p5,long p6,long p7,long p8,long p9){
       this.k = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       super();
    }
    public void run(){
       Iterator iterator;
       j$w ow;
       j$a tk;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$a.class, "1")) {
          return;
       }
       b$b uob = b.a(0, "DispatchUI").b("BatchId", this.b);
       try{
          uob.e();
          long l = SystemClock.uptimeMillis();
          j$a tc = this.c;
          if (tc != null) {
             iterator = tc.iterator();
             while (iterator.hasNext()) {
                ow = iterator.next();
                tk = this.k;
                if (tk.E != null && (tk.o(ow) || this.k.n(ow))) {
                   if (this.k.p(ow) && this.k.o(ow)) {
                      if (objArray == null) {
                         objArray = new ArrayDeque();
                      }
                      objArray.add(ow);
                   }
                }else if(e.y){
                   try{
                      this.k.u(ow);
                      ow.execute();
                      this.k.s(ow);
                   }catch(java.lang.Exception e7){
                      e7.printStackTrace();
                      goto label_002b ;
                   }
                }else {
                   this.k.u(ow);
                   ow.execute();
                   this.k.s(ow);
                }
             }
          }
          try{
             tc = this.d;
             if (tc != null) {
                iterator = tc.iterator();
                while (iterator.hasNext()) {
                   ow = iterator.next();
                   tk = this.k;
                   if (tk.E != null && (tk.o(ow) || this.k.n(ow))) {
                      if (this.k.p(ow) && this.k.o(ow)) {
                         if (objArray == null) {
                            objArray = new ArrayDeque();
                         }
                         objArray.add(ow);
                      }
                   }else if(e.y){
                      try{
                         this.k.u(ow);
                         ow.execute();
                         this.k.s(ow);
                      }catch(java.lang.Exception e7){
                         e7.printStackTrace();
                         goto label_0093 ;
                      }
                   }else {
                      this.k.u(ow);
                      ow.execute();
                      this.k.s(ow);
                   }
                }
             }
             tc = this.e;
             if (tc != null) {
                iterator = tc.iterator();
                while (iterator.hasNext()) {
                   ow = iterator.next();
                   if (e.y) {
                      try{
                         this.k.u(ow);
                         ow.execute();
                         this.k.s(ow);
                      }catch(java.lang.Exception e7){
                         e7.printStackTrace();
                         goto label_00fb ;
                      }
                   }else {
                      this.k.u(ow);
                      ow.execute();
                      this.k.s(ow);
                   }
                }
             }
             if (objArray != null) {
                Iterator iterator1 = objArray.iterator();
                while (iterator1.hasNext()) {
                   j$w ow1 = iterator1.next();
                   if (e.y) {
                      try{
                         this.k.u(ow1);
                         ow1.execute();
                         this.k.s(ow1);
                      }catch(java.lang.Exception e6){
                         e6.printStackTrace();
                         goto label_0132 ;
                      }
                   }else {
                      this.k.u(ow1);
                      ow1.execute();
                      this.k.s(ow1);
                   }
                }
             }
             if (this.k.B != null && this.f.get()) {
                this.k.A.B();
             }
             j$a tk1 = this.k;
             if (tk1.m != null && !tk1.o) {
                tk1.o = this.g;
                tk1.p = SystemClock.uptimeMillis();
                tk1 = this.k;
                tk1.q = this.h;
                tk1.r = this.i;
                tk1.s = l;
                tk1.t = tk1.p;
                tk1.w = this.j;
                j o = tk1.o;
             }
             this.k.b.i();
             j j = this.k.j;
             if (j != null) {
                j.a();
             }
             this.k.t(l);
             if (e.r && this.f.get()) {
             label_01e3 :
                this.k.A.C().e();
             }
             a.c(0, "DispatchUI");
             return;
          }catch(java.lang.Exception e1){
             if (e.y) {
                a.g("ReactNative", "Exception1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                e1.printStackTrace();
                if (e.r && this.f.get()) {
                   goto label_01e3 ;
                }else {
                   goto label_01ee ;
                }
             }else {
                this.k.l = true;
                throw e1;
             }
          }
       }catch(java.lang.Exception e1){
       }
    }
}
