package com.kuaishou.merchant.transaction.purchase.presenter.o0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$d;
import com.kuaishou.merchant.transaction.purchase.presenter.o0;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.purchase.model.PrepayParam;
import java.util.LinkedList;

public class o0$a implements o0$d	// class@000991
{
    public final o0 a;

    public void o0$a(o0 p0){
       this.a = p0;
       super();
    }
    public void a(long p0,String p1,PaymentMethodInfo p2,String p3,long p4,int p5,int p6,String p7){
       o0$a uoa = this;
       object oobject = p1;
       object oobject1 = p2;
       o0$a uoa1 = o0$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),oobject,oobject1,p3,Long.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "1")) {
             return;
          }
       }
       o0$a a = uoa.a;
       a.B = p0;
       a.z = oobject;
       a.C = oobject1;
       a.D = p4;
       a.A = p6;
       a.W8(true, null, p0, null, p3, p5, p7);
       return;
    }
}
