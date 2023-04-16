package com.kuaishou.live.common.core.component.multiline.endline.EndLineSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EndLineSource extends Enum	// class@0014e7
{
    public static final EndLineSource[] $VALUES;
    public static final EndLineSource BANDS;
    public static final EndLineSource OPERATION_PANEL;
    public static final EndLineSource UNKNOWN;

    static {
       EndLineSource uEndLineSour = new EndLineSource("UNKNOWN", 0);
       EndLineSource.UNKNOWN = uEndLineSour;
       EndLineSource uEndLineSour1 = new EndLineSource("BANDS", 1);
       EndLineSource.BANDS = uEndLineSour1;
       EndLineSource uEndLineSour2 = new EndLineSource("OPERATION_PANEL", 2);
       EndLineSource.OPERATION_PANEL = uEndLineSour2;
       EndLineSource[] uEndLineSour3 = new EndLineSource[]{uEndLineSour,uEndLineSour1,uEndLineSour2};
       EndLineSource.$VALUES = uEndLineSour3;
    }
    public void EndLineSource(String p0,int p1){
       super(p0, p1);
    }
    public static EndLineSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EndLineSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EndLineSource.class, p0);
    }
    public static EndLineSource[] values(){
       Object obj = PatchProxy.apply(null, null, EndLineSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EndLineSource.$VALUES.clone();
    }
}
