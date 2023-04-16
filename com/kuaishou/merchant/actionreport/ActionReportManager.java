package com.kuaishou.merchant.actionreport.ActionReportManager;
import com.kuaishou.merchant.actionreport.ActionReportManager$actionReportMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionReportManager	// class@0014d7
{
    public static final p a;
    public static final ActionReportManager b;

    static {
       ActionReportManager.b = new ActionReportManager();
       ActionReportManager.a = s.c(ActionReportManager$actionReportMap$2.INSTANCE);
    }
    public void ActionReportManager(){
       super();
    }
    public final Map a(){
       Object obj = PatchProxy.apply(null, this, ActionReportManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionReportManager.a.getValue();
    }
}
