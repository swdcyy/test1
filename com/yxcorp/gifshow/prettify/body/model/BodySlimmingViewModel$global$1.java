package com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel$global$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x0c.c;
import java.lang.Integer;
import java.util.HashMap;

public final class BodySlimmingViewModel$global$1 extends Lambda implements a	// class@001133
{
    public final BodySlimmingViewModel this$0;

    public void BodySlimmingViewModel$global$1(BodySlimmingViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, BodySlimmingViewModel$global$1.class, "1")) {
          return;
       }
       c[] uocArray = this.this$0.A0();
       int len = uocArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uocArray[i];
          if (this.this$0.l.containsKey(Integer.valueOf(oobject.p()))) {
             Integer integer = this.this$0.l.get(Integer.valueOf(oobject.p()));
             int i1 = (integer != null)? integer.intValue(): 0;
             oobject.t(i1);
             int i2 = (integer != null)? integer.intValue(): 0;
             oobject.s(i2);
          }else {
             oobject.s(0);
          }
          i = i + 1;
       }
       return;
    }
}
