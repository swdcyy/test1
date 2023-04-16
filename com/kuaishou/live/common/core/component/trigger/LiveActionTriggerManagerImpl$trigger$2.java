package com.kuaishou.live.common.core.component.trigger.LiveActionTriggerManagerImpl$trigger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveActionTriggerManagerImpl$trigger$2 extends Lambda implements a	// class@0017b9
{
    public static final LiveActionTriggerManagerImpl$trigger$2 INSTANCE;

    static {
       LiveActionTriggerManagerImpl$trigger$2.INSTANCE = new LiveActionTriggerManagerImpl$trigger$2();
    }
    public void LiveActionTriggerManagerImpl$trigger$2(){
       super(0);
    }
    public final LiveActionTrigger invoke(){
       Object obj = PatchProxy.apply(null, this, LiveActionTriggerManagerImpl$trigger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveActionTrigger();
    }
    public Object invoke(){
       return this.invoke();
    }
}
