package com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$dealState$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler;
import java.lang.Object;
import com.kuaishou.bowl.core.component.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import yz7.n;

public final class CeilingActionHandler$dealState$1 extends Lambda implements l	// class@000a5b
{
    public final CeilingActionHandler this$0;

    public void CeilingActionHandler$dealState$1(CeilingActionHandler p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       Float uFloat;
       Float uFloat1;
       if (PatchProxy.applyVoidOneRefs(p0, this, CeilingActionHandler$dealState$1.class, "1")) {
          return;
       }
       try{
          uFloat = null;
          if (p0 != null) {
             uFloat1 = p0.invoke("getMountingHeight", "");
          label_001a :
             uFloat = Float.valueOf(Float.parseFloat(String.valueOf(uFloat1)));
          }else {
             uFloat1 = uFloat;
             goto label_001a ;
          }
       }catch(java.lang.Exception e1){
          if (p0 != null) {
             p0.addError("invoke getMountingHeight error", uFloat, e1);
          }
       }
       if (uFloat != null && !a.e(uFloat, 0)) {
          p0.e = n.b(uFloat.floatValue());
       }
       return;
    }
}
