package com.yxcorp.gifshow.pymk.c;
import java.lang.Object;
import java.util.ArrayList;
import g7c.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import x6c.o;
import erd.g;
import crd.b;
import java.util.Iterator;
import java.lang.ref.WeakReference;

public class c	// class@0016b0
{
    public ArrayList a;
    public boolean b;

    public void c(){
       super();
       this.a = new ArrayList();
       this.b = false;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (this.b == null) {
          RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new o(this));
          this.b = true;
       }
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             b uob = iterator.next().get();
             if (uob != null && uob == p0) {
                break ;
             }
          }else {
             this.a.add(new WeakReference(p0));
             return;
          }
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       WeakReference weakReferenc = null;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc1 = iterator.next();
          b uob = weakReferenc1.get();
          if (uob != null && uob == p0) {
             weakReferenc = weakReferenc1;
          }
       }
       if (weakReferenc != null) {
          this.a.remove(weakReferenc);
       }
       return;
    }
}
