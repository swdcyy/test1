package com.kuaishou.merchant.actionreport.ActionReport$c;
import erd.g;
import com.kuaishou.merchant.actionreport.ActionReport;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public final class ActionReport$c implements g	// class@0014ce
{
    public final ActionReport b;

    public void ActionReport$c(ActionReport p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ActionReport$c.class, "1")) {
       }else {
          ActionReport.b(this.b, "DACNetworkApi reportAction error", obj, null, 4, null);
       }
       return;
    }
}
