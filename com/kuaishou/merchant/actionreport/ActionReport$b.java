package com.kuaishou.merchant.actionreport.ActionReport$b;
import erd.g;
import com.kuaishou.merchant.actionreport.ActionReport;
import java.lang.Object;
import ib6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public final class ActionReport$b implements g	// class@0014cd
{
    public final ActionReport b;

    public void ActionReport$b(ActionReport p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActionReport$b.class, "1")) {
       }else {
          ActionReport.j(this.b, "DACNetworkApi reportAction success", null, true, 2, null);
       }
       return;
    }
}
