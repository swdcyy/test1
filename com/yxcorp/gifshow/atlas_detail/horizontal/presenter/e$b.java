package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e$b;
import ud5.b;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e;
import td5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import td5.b;
import brd.y;

public class e$b extends b	// class@001bc6
{
    public final e d;

    public void e$b(e p0){
       this.d = p0;
       super();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       if (this.d.y != null) {
          b uob = new b(1);
          uob.c = p0;
          e$b td = this.d;
          uob.b = td.t;
          td.y.onNext(uob);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "4")) {
          return;
       }
       e$b td = this.d;
       e y = td.y;
       if (y != null) {
          y.onNext(new b(4, td.t));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "2")) {
          return;
       }
       e$b td = this.d;
       e y = td.y;
       if (y != null) {
          y.onNext(new b(2, td.t));
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "3")) {
          return;
       }
       e$b td = this.d;
       e y = td.y;
       if (y != null) {
          y.onNext(new b(3, td.t));
       }
       return;
    }
}
