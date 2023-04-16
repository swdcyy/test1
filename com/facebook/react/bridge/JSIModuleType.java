package com.facebook.react.bridge.JSIModuleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JSIModuleType extends Enum	// class@0011de
{
    public static final JSIModuleType[] $VALUES;
    public static final JSIModuleType TurboModuleManager;
    public static final JSIModuleType UIManager;

    static {
       JSIModuleType jSIModuleTyp = new JSIModuleType("TurboModuleManager", 0);
       JSIModuleType.TurboModuleManager = jSIModuleTyp;
       JSIModuleType jSIModuleTyp1 = new JSIModuleType("UIManager", 1);
       JSIModuleType.UIManager = jSIModuleTyp1;
       JSIModuleType[] jSIModuleTyp2 = new JSIModuleType[]{jSIModuleTyp,jSIModuleTyp1};
       JSIModuleType.$VALUES = jSIModuleTyp2;
    }
    public void JSIModuleType(String p0,int p1){
       super(p0, p1);
    }
    public static JSIModuleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JSIModuleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JSIModuleType.class, p0);
    }
    public static JSIModuleType[] values(){
       Object obj = PatchProxy.apply(null, null, JSIModuleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JSIModuleType.$VALUES.clone();
    }
}
