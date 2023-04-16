package com.kwai.sdk.eve.internal.statistics.ExecuteState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class ExecuteState extends Enum	// class@0015b4
{
    public final int order;
    public static final ExecuteState[] $VALUES;
    public static final ExecuteState EVER_ACTIVATED;
    public static final ExecuteState EVER_FAILED;
    public static final ExecuteState EVER_STARTED;
    public static final ExecuteState EVER_SUCCEED;
    public static final ExecuteState NONE;

    static {
       ExecuteState uExecuteStat1;
       ExecuteState[] uExecuteStat = new ExecuteState[]{uExecuteStat1,uExecuteStat1,uExecuteStat1,uExecuteStat1,uExecuteStat1};
       uExecuteStat1 = new ExecuteState("NONE", 0, 0);
       ExecuteState.NONE = uExecuteStat1;
       uExecuteStat1 = new ExecuteState("EVER_ACTIVATED", 1, 1);
       ExecuteState.EVER_ACTIVATED = uExecuteStat1;
       uExecuteStat1 = new ExecuteState("EVER_STARTED", 2, 2);
       ExecuteState.EVER_STARTED = uExecuteStat1;
       uExecuteStat1 = new ExecuteState("EVER_FAILED", 3, 3);
       ExecuteState.EVER_FAILED = uExecuteStat1;
       uExecuteStat1 = new ExecuteState("EVER_SUCCEED", 4, 4);
       ExecuteState.EVER_SUCCEED = uExecuteStat1;
       ExecuteState.$VALUES = uExecuteStat;
    }
    public void ExecuteState(String p0,int p1,int p2){
       super(p0, p1);
       this.order = p2;
    }
    public static ExecuteState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ExecuteState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ExecuteState.class, p0);
    }
    public static ExecuteState[] values(){
       Object obj = PatchProxy.apply(null, null, ExecuteState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExecuteState.$VALUES.clone();
    }
    public final boolean reachableTo(ExecuteState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExecuteState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "target");
       boolean b = (p0.order > this.order)? true: false;
       return b;
    }
}
