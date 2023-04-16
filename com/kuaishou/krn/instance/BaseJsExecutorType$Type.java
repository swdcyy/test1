package com.kuaishou.krn.instance.BaseJsExecutorType$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BaseJsExecutorType$Type extends Enum	// class@0008bb
{
    public static final BaseJsExecutorType$Type[] $VALUES;
    public static final BaseJsExecutorType$Type UNKNOWN;
    public static final BaseJsExecutorType$Type V8_JIT;
    public static final BaseJsExecutorType$Type V8_LITE;

    static {
       BaseJsExecutorType$Type type = new BaseJsExecutorType$Type("UNKNOWN", 0);
       BaseJsExecutorType$Type.UNKNOWN = type;
       BaseJsExecutorType$Type type1 = new BaseJsExecutorType$Type("V8_JIT", 1);
       BaseJsExecutorType$Type.V8_JIT = type1;
       BaseJsExecutorType$Type type2 = new BaseJsExecutorType$Type("V8_LITE", 2);
       BaseJsExecutorType$Type.V8_LITE = type2;
       BaseJsExecutorType$Type[] typeArray = new BaseJsExecutorType$Type[]{type,type1,type2};
       BaseJsExecutorType$Type.$VALUES = typeArray;
    }
    public void BaseJsExecutorType$Type(String p0,int p1){
       super(p0, p1);
    }
    public static BaseJsExecutorType$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BaseJsExecutorType$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BaseJsExecutorType$Type.class, p0);
    }
    public static BaseJsExecutorType$Type[] values(){
       Object obj = PatchProxy.apply(null, null, BaseJsExecutorType$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseJsExecutorType$Type.$VALUES.clone();
    }
}
