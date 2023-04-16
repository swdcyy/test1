package com.kuaishou.tachikoma.api.container.TKContainer$n;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import bx4.h;
import tx4.p;
import cx4.d;
import android.view.ViewGroup;
import tx4.w;

public class TKContainer$n implements r	// class@000f71
{
    public final boolean a;
    public final r b;
    public final String c;
    public final TKContainer d;

    public void TKContainer$n(TKContainer p0,boolean p1,r p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$n on = TKContainer$n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "2")) {
          return;
       }
       on = this.b;
       if (on != null) {
          on.a(p0, p1);
       }
       on = this.d;
       TKContainer k = on.k;
       if (k != null) {
          k.j(on.h, 0, p0, TKContainer.R(p1), this.c);
       }
       return;
    }
    public void onSuccess(){
       TKContainer$n td;
       TKContainer k;
       if (PatchProxy.applyVoid(null, this, TKContainer$n.class, "1")) {
          return;
       }
       if (this.d.isDestroyed()) {
          return;
       }
       if (this.a == null) {
          td = this.d;
          if (td.u != null) {
             d.c(td);
          }
       }
       td = this.b;
       if (td != null) {
          td.onSuccess();
       }
       if (this.a == null) {
          td = this.d;
          k = td.k;
          if (k != null) {
             td.k0(k, this.c);
          }
       }
       td = this.d;
       k = td.g;
       if (k != null) {
          td.E(k, td.b, null);
       }
       return;
    }
}
