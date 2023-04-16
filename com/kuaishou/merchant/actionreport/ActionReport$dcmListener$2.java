package com.kuaishou.merchant.actionreport.ActionReport$dcmListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.actionreport.ActionReport;
import com.kuaishou.merchant.actionreport.ActionReport$dcmListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionReport$dcmListener$2 extends Lambda implements a	// class@0014d1
{
    public final ActionReport this$0;

    public void ActionReport$dcmListener$2(ActionReport p0){
       this.this$0 = p0;
       super(0);
    }
    public final ActionReport$dcmListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, ActionReport$dcmListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActionReport$dcmListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
