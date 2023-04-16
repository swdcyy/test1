package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b$a;
import ty5.d;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ty5.c;

public class b$a implements d	// class@000863
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.b.Z8();
       Objects.requireNonNull(this.b);
       return;
    }
    public void ke(String p0,boolean p1){
       c.b(this, p0, p1);
    }
    public void qc(String p0,boolean p1,String p2){
       c.a(this, p0, p1, p2);
    }
    public void s7(boolean p0){
       c.c(this, p0);
    }
}
