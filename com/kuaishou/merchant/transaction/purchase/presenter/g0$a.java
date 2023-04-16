package com.kuaishou.merchant.transaction.purchase.presenter.g0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.g0$d;
import com.kuaishou.merchant.transaction.purchase.presenter.g0;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import vm4.e;

public class g0$a implements g0$d	// class@000977
{
    public final g0 a;

    public void g0$a(g0 p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,long p4,PaymentMethodInfo p5,long p6,String p7,long p8){
       g0$a uoa = this;
       object oobject = p3;
       object oobject1 = p7;
       g0$a uoa1 = g0$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = oobject;
          objArray[4] = Long.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = oobject1;
          objArray[8] = Long.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, uoa1, "1")) {
             return;
          }
       }
       uoa1 = uoa.a;
       uoa1.y = oobject;
       uoa1.z = p4;
       uoa1.A = e.e(p5);
       g0$a a = uoa.a;
       a.B = p6;
       a.C = oobject1;
       a.G = p8;
       a.V8(p4, p0, p1, p2, false, null, p5);
       return;
    }
    public void b(String p0,String p1,String p2,String p3,String p4,long p5,PaymentMethodInfo p6,long p7,String p8,long p9){
       g0$a uoa = this;
       object oobject = p4;
       object oobject1 = p8;
       g0$a uoa1 = g0$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = oobject;
          objArray[5] = Long.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = Long.valueOf(p7);
          objArray[8] = oobject1;
          objArray[9] = Long.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, this, uoa1, "2")) {
             return;
          }
       }
       uoa1 = uoa.a;
       uoa1.y = oobject;
       uoa1.z = p5;
       uoa1.A = e.e(p6);
       g0$a a = uoa.a;
       a.B = p7;
       a.C = oobject1;
       a.G = p9;
       a.V8(p5, p0, p1, p2, true, p3, p6);
       return;
    }
}
