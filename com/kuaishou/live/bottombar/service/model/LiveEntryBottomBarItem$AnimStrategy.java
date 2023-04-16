package com.kuaishou.live.bottombar.service.model.LiveEntryBottomBarItem$AnimStrategy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveEntryBottomBarItem$AnimStrategy extends Enum	// class@000d53
{
    public static final LiveEntryBottomBarItem$AnimStrategy[] $VALUES;
    public static final LiveEntryBottomBarItem$AnimStrategy Default;
    public static final LiveEntryBottomBarItem$AnimStrategy ForceStartNewAnim;
    public static final LiveEntryBottomBarItem$AnimStrategy ForceStop;

    static {
       LiveEntryBottomBarItem$AnimStrategy uAnimStrateg = new LiveEntryBottomBarItem$AnimStrategy("Default", 0);
       LiveEntryBottomBarItem$AnimStrategy.Default = uAnimStrateg;
       LiveEntryBottomBarItem$AnimStrategy uAnimStrateg1 = new LiveEntryBottomBarItem$AnimStrategy("ForceStop", 1);
       LiveEntryBottomBarItem$AnimStrategy.ForceStop = uAnimStrateg1;
       LiveEntryBottomBarItem$AnimStrategy uAnimStrateg2 = new LiveEntryBottomBarItem$AnimStrategy("ForceStartNewAnim", 2);
       LiveEntryBottomBarItem$AnimStrategy.ForceStartNewAnim = uAnimStrateg2;
       LiveEntryBottomBarItem$AnimStrategy[] uAnimStrateg3 = new LiveEntryBottomBarItem$AnimStrategy[]{uAnimStrateg,uAnimStrateg1,uAnimStrateg2};
       LiveEntryBottomBarItem$AnimStrategy.$VALUES = uAnimStrateg3;
    }
    public void LiveEntryBottomBarItem$AnimStrategy(String p0,int p1){
       super(p0, p1);
    }
    public static LiveEntryBottomBarItem$AnimStrategy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveEntryBottomBarItem$AnimStrategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveEntryBottomBarItem$AnimStrategy.class, p0);
    }
    public static LiveEntryBottomBarItem$AnimStrategy[] values(){
       Object obj = PatchProxy.apply(null, null, LiveEntryBottomBarItem$AnimStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveEntryBottomBarItem$AnimStrategy.$VALUES.clone();
    }
}
