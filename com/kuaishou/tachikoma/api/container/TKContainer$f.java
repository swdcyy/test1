package com.kuaishou.tachikoma.api.container.TKContainer$f;
import tx4.r;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.util.List;

public class TKContainer$f implements r	// class@000f68
{
    public final TKContainer a;

    public void TKContainer$f(TKContainer p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$f uof = TKContainer$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "2")) {
          return;
       }
       uof = this.a;
       uof.M = false;
       Iterator iterator = uof.K.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          if (or != null) {
             or.a(p0, p1);
          }
       }
       this.a.K.clear();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$f.class, "1")) {
          return;
       }
       TKContainer$f ta = this.a;
       ta.M = false;
       Iterator iterator = ta.K.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          if (or != null) {
             or.onSuccess();
          }
       }
       this.a.K.clear();
       return;
    }
}
