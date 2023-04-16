package com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$STATE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MilanoLazyPresenterGroup$STATE extends Enum	// class@000f1a
{
    public static final MilanoLazyPresenterGroup$STATE[] $VALUES;
    public static final MilanoLazyPresenterGroup$STATE BIND;
    public static final MilanoLazyPresenterGroup$STATE BOUND;
    public static final MilanoLazyPresenterGroup$STATE CREATE;
    public static final MilanoLazyPresenterGroup$STATE INIT;
    public static final MilanoLazyPresenterGroup$STATE NONE;

    static {
       MilanoLazyPresenterGroup$STATE sTATE;
       MilanoLazyPresenterGroup$STATE[] sTATEArray = new MilanoLazyPresenterGroup$STATE[]{sTATE,sTATE,sTATE,sTATE,sTATE};
       sTATE = new MilanoLazyPresenterGroup$STATE("NONE", 0);
       MilanoLazyPresenterGroup$STATE.NONE = sTATE;
       sTATE = new MilanoLazyPresenterGroup$STATE("INIT", 1);
       MilanoLazyPresenterGroup$STATE.INIT = sTATE;
       sTATE = new MilanoLazyPresenterGroup$STATE("CREATE", 2);
       MilanoLazyPresenterGroup$STATE.CREATE = sTATE;
       sTATE = new MilanoLazyPresenterGroup$STATE("BIND", 3);
       MilanoLazyPresenterGroup$STATE.BIND = sTATE;
       sTATE = new MilanoLazyPresenterGroup$STATE("BOUND", 4);
       MilanoLazyPresenterGroup$STATE.BOUND = sTATE;
       MilanoLazyPresenterGroup$STATE.$VALUES = sTATEArray;
    }
    public void MilanoLazyPresenterGroup$STATE(String p0,int p1){
       super(p0, p1);
    }
    public static MilanoLazyPresenterGroup$STATE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MilanoLazyPresenterGroup$STATE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MilanoLazyPresenterGroup$STATE.class, p0);
    }
    public static MilanoLazyPresenterGroup$STATE[] values(){
       Object obj = PatchProxy.apply(null, null, MilanoLazyPresenterGroup$STATE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MilanoLazyPresenterGroup$STATE.$VALUES.clone();
    }
}
