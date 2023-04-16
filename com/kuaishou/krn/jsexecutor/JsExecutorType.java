package com.kuaishou.krn.jsexecutor.JsExecutorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsExecutorType extends Enum	// class@0008d0
{
    public static final JsExecutorType[] $VALUES;
    public static final JsExecutorType UNKNOWN;
    public static final JsExecutorType V8_JIT;
    public static final JsExecutorType V8_LITE;

    static {
       JsExecutorType jsExecutorTy = new JsExecutorType("UNKNOWN", 0);
       JsExecutorType.UNKNOWN = jsExecutorTy;
       JsExecutorType jsExecutorTy1 = new JsExecutorType("V8_JIT", 1);
       JsExecutorType.V8_JIT = jsExecutorTy1;
       JsExecutorType jsExecutorTy2 = new JsExecutorType("V8_LITE", 2);
       JsExecutorType.V8_LITE = jsExecutorTy2;
       JsExecutorType[] jsExecutorTy3 = new JsExecutorType[]{jsExecutorTy,jsExecutorTy1,jsExecutorTy2};
       JsExecutorType.$VALUES = jsExecutorTy3;
    }
    public void JsExecutorType(String p0,int p1){
       super(p0, p1);
    }
    public static JsExecutorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsExecutorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsExecutorType.class, p0);
    }
    public static JsExecutorType[] values(){
       Object obj = PatchProxy.apply(null, null, JsExecutorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsExecutorType.$VALUES.clone();
    }
}
