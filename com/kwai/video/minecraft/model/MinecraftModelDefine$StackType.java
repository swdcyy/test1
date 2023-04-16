package com.kwai.video.minecraft.model.MinecraftModelDefine$StackType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MinecraftModelDefine$StackType extends Enum	// class@000a07
{
    public static final MinecraftModelDefine$StackType[] $VALUES;
    public static final MinecraftModelDefine$StackType StackType_Default;
    public static final MinecraftModelDefine$StackType StackType_NestedStack;

    static {
       MinecraftModelDefine$StackType stackType = new MinecraftModelDefine$StackType("StackType_Default", 0);
       MinecraftModelDefine$StackType.StackType_Default = stackType;
       MinecraftModelDefine$StackType stackType1 = new MinecraftModelDefine$StackType("StackType_NestedStack", 1);
       MinecraftModelDefine$StackType.StackType_NestedStack = stackType1;
       MinecraftModelDefine$StackType[] stackTypeArr = new MinecraftModelDefine$StackType[]{stackType,stackType1};
       MinecraftModelDefine$StackType.$VALUES = stackTypeArr;
    }
    public void MinecraftModelDefine$StackType(String p0,int p1){
       super(p0, p1);
    }
    public static MinecraftModelDefine$StackType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftModelDefine$StackType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MinecraftModelDefine$StackType.class, p0);
    }
    public static MinecraftModelDefine$StackType[] values(){
       Object obj = PatchProxy.apply(null, null, MinecraftModelDefine$StackType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftModelDefine$StackType.$VALUES.clone();
    }
}
