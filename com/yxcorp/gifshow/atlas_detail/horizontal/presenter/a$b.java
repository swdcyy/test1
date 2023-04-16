package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a$b;
import ud5.b;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a;
import td5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import td5.b;
import brd.y;

public class a$b extends b	// class@001bbd
{
    public final a d;

    public void a$b(a p0){
       this.d = p0;
       super();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       if (this.d.v != null) {
          b uob = new b(1);
          uob.c = p0;
          a$b td = this.d;
          uob.b = td.t;
          td.v.onNext(uob);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "4")) {
          return;
       }
       a$b td = this.d;
       a v = td.v;
       if (v != null) {
          v.onNext(new b(4, td.t));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       a$b td = this.d;
       a v = td.v;
       if (v != null) {
          v.onNext(new b(2, td.t));
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       a$b td = this.d;
       a v = td.v;
       if (v != null) {
          v.onNext(new b(3, td.t));
       }
       return;
    }
}
