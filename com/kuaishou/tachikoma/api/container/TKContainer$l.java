package com.kuaishou.tachikoma.api.container.TKContainer$l;
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

public class TKContainer$l implements r	// class@000f6f
{
    public final boolean a;
    public final String b;
    public final r c;
    public final TKContainer d;

    public void TKContainer$l(TKContainer p0,boolean p1,String p2,r p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$l ol = TKContainer$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ol, "2")) {
          return;
       }
       TKContainer$l tc = this.c;
       if (tc != null) {
          tc.a(4001, p1);
       }
       tc = this.d;
       TKContainer k = tc.k;
       if (k != null) {
          k.j(tc.h, 0, 4001, TKContainer.R(p1), this.b);
       }
       return;
    }
    public void onSuccess(){
       TKContainer$l td;
       if (PatchProxy.applyVoid(null, this, TKContainer$l.class, "1")) {
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
       if (this.a == null) {
          td = this.d;
          TKContainer k = td.k;
          if (k != null) {
             td.k0(k, this.b);
          }
       }
       td = this.c;
       if (td != null) {
          td.onSuccess();
       }
       return;
    }
}
