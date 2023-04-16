package com.yxcorp.gifshow.dialog.kem.k;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zca.b;
import com.yxcorp.gifshow.dialog.kem.k$a;
import b66.k;
import com.yxcorp.gifshow.dialog.kem.k$c;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import t45.d;
import brd.z;
import x9a.h0;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import ap5.a;
import com.yxcorp.gifshow.dialog.kem.k$d;
import x9a.i0;
import wkd.b;
import tjc.c;
import com.yxcorp.gifshow.dialog.kem.k$b;
import ujc.e;
import x9a.g0;
import x9a.a;
import com.yxcorp.gifshow.dialog.kem.j;

public class k	// class@001ac6
{

    public void k(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k.class, "1")) {
          return;
       }
       k.b(p0);
       return;
    }
    public static void b(Runnable p0){
       b uob = b.class;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, ok, "3")) {
          return;
       }
       k$a uoa = new k$a(p0);
       int a = k.a;
       if (a == 2 || a == 3) {
          if (d.a(-2061018968).FY()) {
             k$d uod = new k$d(uoa);
             if (!PatchProxy.applyVoid(null, uod, k$d.class, "1")) {
                uod.b = RxBus.f.f(uob).observeOn(d.a).subscribe(new i0(uod));
             }
          }else if(b.a(-1608526086).W()){
             k$b uob1 = new k$b(uoa);
             if (!PatchProxy.applyVoid(null, uob1, k$b.class, "1")) {
                uob1.b = RxBus.f.f(e.class).observeOn(d.a).subscribe(new g0(uob1));
             }
          }else {
             uoa.run();
          }
       }else if(PatchProxy.applyVoidOneRefs(uoa, null, ok, "12")){
          k$c uoc = new k$c(uoa);
          if (!PatchProxy.applyVoid(null, uoc, k$c.class, "1")) {
             u1.a(uoc);
             uoc.b = RxBus.f.f(uob).observeOn(d.a).subscribe(new h0(uoc));
          }
       }
       return;
    }
    public static void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k.class, "2")) {
          return;
       }
       k.b(new j(p0));
       return;
    }
}
