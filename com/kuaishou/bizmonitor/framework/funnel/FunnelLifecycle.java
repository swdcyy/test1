package com.kuaishou.bizmonitor.framework.funnel.FunnelLifecycle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FunnelLifecycle extends Enum	// class@001143
{
    public static final FunnelLifecycle[] $VALUES;
    public static final FunnelLifecycle AutoEnd;
    public static final FunnelLifecycle ManualEnd;

    static {
       FunnelLifecycle uFunnelLifec = new FunnelLifecycle("AutoEnd", 0);
       FunnelLifecycle.AutoEnd = uFunnelLifec;
       FunnelLifecycle uFunnelLifec1 = new FunnelLifecycle("ManualEnd", 1);
       FunnelLifecycle.ManualEnd = uFunnelLifec1;
       FunnelLifecycle[] uFunnelLifec2 = new FunnelLifecycle[]{uFunnelLifec,uFunnelLifec1};
       FunnelLifecycle.$VALUES = uFunnelLifec2;
    }
    public void FunnelLifecycle(String p0,int p1){
       super(p0, p1);
    }
    public static FunnelLifecycle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FunnelLifecycle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FunnelLifecycle.class, p0);
    }
    public static FunnelLifecycle[] values(){
       Object obj = PatchProxy.apply(null, null, FunnelLifecycle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FunnelLifecycle.$VALUES.clone();
    }
}
