package com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class STATE extends Enum	// class@000e97
{
    public static final STATE[] $VALUES;
    public static final STATE ERROR;
    public static final STATE FINISHED;
    public static final STATE INIT;
    public static final STATE RUNNING;

    static {
       STATE sTATE;
       STATE[] sTATEArray = new STATE[]{sTATE,sTATE,sTATE,sTATE};
       sTATE = new STATE("RUNNING", 0);
       STATE.RUNNING = sTATE;
       sTATE = new STATE("INIT", 1);
       STATE.INIT = sTATE;
       sTATE = new STATE("FINISHED", 2);
       STATE.FINISHED = sTATE;
       sTATE = new STATE("ERROR", 3);
       STATE.ERROR = sTATE;
       STATE.$VALUES = sTATEArray;
    }
    public void STATE(String p0,int p1){
       super(p0, p1);
    }
    public static STATE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, STATE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(STATE.class, p0);
    }
    public static STATE[] values(){
       Object obj = PatchProxy.apply(null, null, STATE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return STATE.$VALUES.clone();
    }
}
