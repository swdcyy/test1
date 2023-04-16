package com.kuaishou.krn.apm.fps.FpsMonitor$FpsType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FpsMonitor$FpsType extends Enum	// class@0007d7
{
    public static final FpsMonitor$FpsType[] $VALUES;
    public static final FpsMonitor$FpsType PAGE_ACTIVITY;
    public static final FpsMonitor$FpsType SCROLL;

    static {
       FpsMonitor$FpsType uFpsType;
       FpsMonitor$FpsType[] uFpsTypeArra = new FpsMonitor$FpsType[]{uFpsType,uFpsType};
       uFpsType = new FpsMonitor$FpsType("PAGE_ACTIVITY", 0);
       FpsMonitor$FpsType.PAGE_ACTIVITY = uFpsType;
       uFpsType = new FpsMonitor$FpsType("SCROLL", 1);
       FpsMonitor$FpsType.SCROLL = uFpsType;
       FpsMonitor$FpsType.$VALUES = uFpsTypeArra;
    }
    public void FpsMonitor$FpsType(String p0,int p1){
       super(p0, p1);
    }
    public static FpsMonitor$FpsType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FpsMonitor$FpsType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FpsMonitor$FpsType.class, p0);
    }
    public static FpsMonitor$FpsType[] values(){
       Object obj = PatchProxy.apply(null, null, FpsMonitor$FpsType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FpsMonitor$FpsType.$VALUES.clone();
    }
}
