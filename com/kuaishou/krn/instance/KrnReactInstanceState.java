package com.kuaishou.krn.instance.KrnReactInstanceState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class KrnReactInstanceState extends Enum	// class@0008ca
{
    public static final KrnReactInstanceState[] $VALUES;
    public static final KrnReactInstanceState BUSINESS_LOADING;
    public static final KrnReactInstanceState DIRTY;
    public static final KrnReactInstanceState ERROR;
    public static final KrnReactInstanceState IDLE;
    public static final KrnReactInstanceState LOADING;
    public static final KrnReactInstanceState READY;

    static {
       KrnReactInstanceState krnReactInst1;
       KrnReactInstanceState[] krnReactInst = new KrnReactInstanceState[]{krnReactInst1,krnReactInst1,krnReactInst1,krnReactInst1,krnReactInst1,krnReactInst1};
       krnReactInst1 = new KrnReactInstanceState("IDLE", 0);
       KrnReactInstanceState.IDLE = krnReactInst1;
       krnReactInst1 = new KrnReactInstanceState("LOADING", 1);
       KrnReactInstanceState.LOADING = krnReactInst1;
       krnReactInst1 = new KrnReactInstanceState("READY", 2);
       KrnReactInstanceState.READY = krnReactInst1;
       krnReactInst1 = new KrnReactInstanceState("BUSINESS_LOADING", 3);
       KrnReactInstanceState.BUSINESS_LOADING = krnReactInst1;
       krnReactInst1 = new KrnReactInstanceState("DIRTY", 4);
       KrnReactInstanceState.DIRTY = krnReactInst1;
       krnReactInst1 = new KrnReactInstanceState("ERROR", 5);
       KrnReactInstanceState.ERROR = krnReactInst1;
       KrnReactInstanceState.$VALUES = krnReactInst;
    }
    public void KrnReactInstanceState(String p0,int p1){
       super(p0, p1);
    }
    public static KrnReactInstanceState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnReactInstanceState.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnReactInstanceState.class, p0);
    }
    public static KrnReactInstanceState[] values(){
       Object obj = PatchProxy.apply(null, null, KrnReactInstanceState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnReactInstanceState.$VALUES.clone();
    }
    public final boolean isAtLeast(KrnReactInstanceState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnReactInstanceState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "state");
       boolean b = (this.compareTo(p0) >= 0)? true: false;
       return b;
    }
    public final boolean isAtMost(KrnReactInstanceState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnReactInstanceState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "state");
       boolean b = (this.compareTo(p0) <= 0)? true: false;
       return b;
    }
}
