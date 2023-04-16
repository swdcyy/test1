package com.kwai.component.uiconfig.visitor.VisitorModeManager$appSessionId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;
import kotlin.jvm.internal.a;

public final class VisitorModeManager$appSessionId$2 extends Lambda implements a	// class@000ab1
{
    public static final VisitorModeManager$appSessionId$2 INSTANCE;

    static {
       VisitorModeManager$appSessionId$2.INSTANCE = new VisitorModeManager$appSessionId$2();
    }
    public void VisitorModeManager$appSessionId$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, VisitorModeManager$appSessionId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UUID.randomUUID().toString();
       a.o(obj, "UUID.randomUUID\(\).toString\(\)");
       return obj;
    }
}
