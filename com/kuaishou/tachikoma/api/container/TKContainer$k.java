package com.kuaishou.tachikoma.api.container.TKContainer$k;
import tx4.n;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx4.h;
import java.lang.Throwable;
import java.lang.Integer;

public class TKContainer$k implements n	// class@000f6e
{
    public final boolean a;
    public final TKContainer b;

    public void TKContainer$k(TKContainer p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKContainer$k.class, "1")) {
          return;
       }
       if (this.b.isDestroyed()) {
          return;
       }
       this.b.E = false;
       if (this.b.C != null) {
          this.b.C.a();
          this.b.C = objArray;
          if (this.b.b != null) {
             TKContainer k = this.b.k;
             if (k != null) {
                k.h();
             }
          }
       }else {
          this.b.a0(this.a);
       }
       return;
    }
    public void b(int p0,Throwable p1){
       TKContainer$k ok = TKContainer$k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ok, "2")) {
          return;
       }
       TKContainer k = this.b.k;
       if (k != null) {
          k.g();
       }
       this.b.E = false;
       if (this.b.C != null) {
          this.b.C.b(p0, p1);
          p0.C = null;
       }
       return;
    }
    public void onInitSuccess(){
    }
}
