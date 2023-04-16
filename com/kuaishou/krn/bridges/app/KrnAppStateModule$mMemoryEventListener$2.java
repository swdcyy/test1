package com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.bridges.app.KrnAppStateModule;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnAppStateModule$mMemoryEventListener$2 extends Lambda implements a	// class@000809
{
    public final KrnAppStateModule this$0;

    public void KrnAppStateModule$mMemoryEventListener$2(KrnAppStateModule p0){
       this.this$0 = p0;
       super(0);
    }
    public final KrnAppStateModule$mMemoryEventListener$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, KrnAppStateModule$mMemoryEventListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KrnAppStateModule$mMemoryEventListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
