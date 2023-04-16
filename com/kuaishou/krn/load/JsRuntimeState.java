package com.kuaishou.krn.load.JsRuntimeState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsRuntimeState extends Enum	// class@0008d9
{
    public static final JsRuntimeState[] $VALUES;
    public static final JsRuntimeState NOT_START;
    public static final JsRuntimeState STARTED;

    static {
       JsRuntimeState jsRuntimeSta = new JsRuntimeState("NOT_START", 0);
       JsRuntimeState.NOT_START = jsRuntimeSta;
       JsRuntimeState jsRuntimeSta1 = new JsRuntimeState("STARTED", 1);
       JsRuntimeState.STARTED = jsRuntimeSta1;
       JsRuntimeState[] jsRuntimeSta2 = new JsRuntimeState[]{jsRuntimeSta,jsRuntimeSta1};
       JsRuntimeState.$VALUES = jsRuntimeSta2;
    }
    public void JsRuntimeState(String p0,int p1){
       super(p0, p1);
    }
    public static JsRuntimeState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsRuntimeState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsRuntimeState.class, p0);
    }
    public static JsRuntimeState[] values(){
       Object obj = PatchProxy.apply(null, null, JsRuntimeState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsRuntimeState.$VALUES.clone();
    }
}
