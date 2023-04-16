package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b$b;
import y94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import y94.c;

public final class b$b implements a	// class@001c30
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void onChanged(Object p0){
       int i = p0.intValue();
       b$b uob = b$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uob, "1")) {
          uob = this.a;
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uob, uob1, "4")) {
             uob1 = uob.A;
             int i1 = (uob1 != null)? uob1.f(): 3;
             uob.y = i1;
             uob.V8(i1, i);
          }
       }
       return;
    }
}
