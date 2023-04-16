package com.kuaishou.merchant.transaction.purchase.k0;
import erd.o;
import erd.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Exception;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import em4.o;

public class k0 implements o	// class@000937
{
    public int b;
    public b c;

    public void k0(b p0){
       super();
       this.b = -1;
       this.c = p0;
    }
    public final void a(boolean p0,Throwable p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ok0, "3")) {
          return;
       }
       ok0 = this.c;
       if (ok0 != null) {
          try{
             ok0.accept(Boolean.valueOf(p0), p1);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, k0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new o(this));
       }
       return ot;
    }
}
