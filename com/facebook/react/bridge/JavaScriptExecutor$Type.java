package com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JavaScriptExecutor$Type extends Enum	// class@0011f8
{
    public static final JavaScriptExecutor$Type[] $VALUES;
    public static final JavaScriptExecutor$Type HERMES;
    public static final JavaScriptExecutor$Type JSC;
    public static final JavaScriptExecutor$Type UNKNOWN;
    public static final JavaScriptExecutor$Type V8;
    public static final JavaScriptExecutor$Type V8_LITE;
    public static final JavaScriptExecutor$Type V8_RN;

    static {
       JavaScriptExecutor$Type type = new JavaScriptExecutor$Type("JSC", 0);
       JavaScriptExecutor$Type.JSC = type;
       JavaScriptExecutor$Type type1 = new JavaScriptExecutor$Type("HERMES", 1);
       JavaScriptExecutor$Type.HERMES = type1;
       JavaScriptExecutor$Type type2 = new JavaScriptExecutor$Type("V8", 2);
       JavaScriptExecutor$Type.V8 = type2;
       JavaScriptExecutor$Type type3 = new JavaScriptExecutor$Type("V8_LITE", 3);
       JavaScriptExecutor$Type.V8_LITE = type3;
       JavaScriptExecutor$Type type4 = new JavaScriptExecutor$Type("V8_RN", 4);
       JavaScriptExecutor$Type.V8_RN = type4;
       JavaScriptExecutor$Type type5 = new JavaScriptExecutor$Type("UNKNOWN", 5);
       JavaScriptExecutor$Type.UNKNOWN = type5;
       JavaScriptExecutor$Type[] typeArray = new JavaScriptExecutor$Type[]{type,type1,type2,type3,type4,type5};
       JavaScriptExecutor$Type.$VALUES = typeArray;
    }
    public void JavaScriptExecutor$Type(String p0,int p1){
       super(p0, p1);
    }
    public static JavaScriptExecutor$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaScriptExecutor$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JavaScriptExecutor$Type.class, p0);
    }
    public static JavaScriptExecutor$Type[] values(){
       Object obj = PatchProxy.apply(null, null, JavaScriptExecutor$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaScriptExecutor$Type.$VALUES.clone();
    }
}
