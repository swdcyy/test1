package com.kuaishou.android.vader.stat.ValueOrException$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ValueOrException$Type extends Enum	// class@000f7e
{
    public static final ValueOrException$Type[] $VALUES;
    public static final ValueOrException$Type EXCEPTION;
    public static final ValueOrException$Type VALUE;

    static {
       ValueOrException$Type type = new ValueOrException$Type("VALUE", 0);
       ValueOrException$Type.VALUE = type;
       ValueOrException$Type type1 = new ValueOrException$Type("EXCEPTION", 1);
       ValueOrException$Type.EXCEPTION = type1;
       ValueOrException$Type[] typeArray = new ValueOrException$Type[]{type,type1};
       ValueOrException$Type.$VALUES = typeArray;
    }
    public void ValueOrException$Type(String p0,int p1){
       super(p0, p1);
    }
    public static ValueOrException$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ValueOrException$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ValueOrException$Type.class, p0);
    }
    public static ValueOrException$Type[] values(){
       Object obj = PatchProxy.apply(null, null, ValueOrException$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ValueOrException$Type.$VALUES.clone();
    }
}
