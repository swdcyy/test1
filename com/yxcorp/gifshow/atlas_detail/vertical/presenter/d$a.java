package com.yxcorp.gifshow.atlas_detail.vertical.presenter.d$a;
import ud5.b;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.d;
import td5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import td5.b;
import im8.f;
import java.lang.Integer;
import brd.y;

public class d$a extends b	// class@001bde
{
    public final d d;

    public void d$a(d p0){
       this.d = p0;
       super();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (this.d.t != null) {
          b uob = new b(1);
          uob.c = p0;
          uob.b = this.d.s.get().intValue();
          this.d.t.onNext(uob);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "4")) {
          return;
       }
       d$a td = this.d;
       d t = td.t;
       if (t != null) {
          t.onNext(new b(4, td.s.get().intValue()));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d$a td = this.d;
       d t = td.t;
       if (t != null) {
          t.onNext(new b(2, td.s.get().intValue()));
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       d$a td = this.d;
       d t = td.t;
       if (t != null) {
          t.onNext(new b(3, td.s.get().intValue()));
       }
       return;
    }
}
