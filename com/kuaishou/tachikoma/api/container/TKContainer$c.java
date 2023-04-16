package com.kuaishou.tachikoma.api.container.TKContainer$c;
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

public class TKContainer$c implements r	// class@000f65
{
    public final TKContainer a;

    public void TKContainer$c(TKContainer p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Throwable p1){
       TKContainer$c uoc = TKContainer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       uoc = this.a;
       uoc.L = false;
       Iterator iterator = uoc.J.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          if (or != null) {
             or.a(p0, p1);
          }
       }
       this.a.J.clear();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKContainer$c.class, "1")) {
          return;
       }
       TKContainer$c ta = this.a;
       ta.L = false;
       Iterator iterator = ta.J.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          if (or != null) {
             or.onSuccess();
          }
       }
       this.a.J.clear();
       return;
    }
}
