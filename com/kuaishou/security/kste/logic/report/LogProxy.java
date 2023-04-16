package com.kuaishou.security.kste.logic.report.LogProxy;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import com.kuaishou.security.kste.logic.report.LogProxy$a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;

public class LogProxy	// class@000f1a
{

    public void LogProxy(){
       super();
    }
    public static void nativeReport(int p0,String p1){
       LogProxy logProxy = LogProxy.class;
       if (PatchProxy.isSupport(logProxy) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, logProxy, "1")) {
          return;
       }
       KSTEContext.ksteThreadPool.execute(new LogProxy$a(p0, p1));
       return;
    }
}
