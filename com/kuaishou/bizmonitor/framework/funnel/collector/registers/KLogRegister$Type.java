package com.kuaishou.bizmonitor.framework.funnel.collector.registers.KLogRegister$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KLogRegister$Type extends Enum	// class@001183
{
    public static final KLogRegister$Type[] $VALUES;
    public static final KLogRegister$Type Product;
    public static final KLogRegister$Type unknown;

    static {
       KLogRegister$Type type = new KLogRegister$Type("Product", 0);
       KLogRegister$Type.Product = type;
       KLogRegister$Type type1 = new KLogRegister$Type("unknown", 1);
       KLogRegister$Type.unknown = type1;
       KLogRegister$Type[] typeArray = new KLogRegister$Type[]{type,type1};
       KLogRegister$Type.$VALUES = typeArray;
    }
    public void KLogRegister$Type(String p0,int p1){
       super(p0, p1);
    }
    public static KLogRegister$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLogRegister$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KLogRegister$Type.class, p0);
    }
    public static KLogRegister$Type[] values(){
       Object obj = PatchProxy.apply(null, null, KLogRegister$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLogRegister$Type.$VALUES.clone();
    }
}
