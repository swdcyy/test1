package com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveTaskLifecycle extends Enum	// class@0015bd
{
    public static final EveTaskLifecycle[] $VALUES;
    public static final EveTaskLifecycle ACTIVATED;
    public static final EveTaskLifecycle INSTALLED;
    public static final EveTaskLifecycle NONE;
    public static final EveTaskLifecycle OUTDATED;
    public static final EveTaskLifecycle PREWARMING;
    public static final EveTaskLifecycle RUNNING;
    public static final EveTaskLifecycle TERMINATED;
    public static final EveTaskLifecycle TERMINATING;
    public static final EveTaskLifecycle UPDATING;

    static {
       EveTaskLifecycle[] uEveTaskLife = new EveTaskLifecycle[9];
       EveTaskLifecycle uEveTaskLife1 = new EveTaskLifecycle("NONE", 0);
       EveTaskLifecycle.NONE = uEveTaskLife1;
       uEveTaskLife[0] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("INSTALLED", 1);
       EveTaskLifecycle.INSTALLED = uEveTaskLife1;
       uEveTaskLife[1] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("OUTDATED", 2);
       EveTaskLifecycle.OUTDATED = uEveTaskLife1;
       uEveTaskLife[2] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("UPDATING", 3);
       EveTaskLifecycle.UPDATING = uEveTaskLife1;
       uEveTaskLife[3] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("PREWARMING", 4);
       EveTaskLifecycle.PREWARMING = uEveTaskLife1;
       uEveTaskLife[4] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("ACTIVATED", 5);
       EveTaskLifecycle.ACTIVATED = uEveTaskLife1;
       uEveTaskLife[5] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("RUNNING", 6);
       EveTaskLifecycle.RUNNING = uEveTaskLife1;
       uEveTaskLife[6] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("TERMINATING", 7);
       EveTaskLifecycle.TERMINATING = uEveTaskLife1;
       uEveTaskLife[7] = uEveTaskLife1;
       uEveTaskLife1 = new EveTaskLifecycle("TERMINATED", 8);
       EveTaskLifecycle.TERMINATED = uEveTaskLife1;
       uEveTaskLife[8] = uEveTaskLife1;
       EveTaskLifecycle.$VALUES = uEveTaskLife;
    }
    public void EveTaskLifecycle(String p0,int p1){
       super(p0, p1);
    }
    public static EveTaskLifecycle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveTaskLifecycle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EveTaskLifecycle.class, p0);
    }
    public static EveTaskLifecycle[] values(){
       Object obj = PatchProxy.apply(null, null, EveTaskLifecycle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EveTaskLifecycle.$VALUES.clone();
    }
}
