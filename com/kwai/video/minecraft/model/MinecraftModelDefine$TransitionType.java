package com.kwai.video.minecraft.model.MinecraftModelDefine$TransitionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MinecraftModelDefine$TransitionType extends Enum	// class@000a08
{
    public static final MinecraftModelDefine$TransitionType[] $VALUES;
    public static final MinecraftModelDefine$TransitionType TransitionType_Default;
    public static final MinecraftModelDefine$TransitionType TransitionType_TransitionEffect;

    static {
       MinecraftModelDefine$TransitionType transitionTy = new MinecraftModelDefine$TransitionType("TransitionType_Default", 0);
       MinecraftModelDefine$TransitionType.TransitionType_Default = transitionTy;
       MinecraftModelDefine$TransitionType transitionTy1 = new MinecraftModelDefine$TransitionType("TransitionType_TransitionEffect", 1);
       MinecraftModelDefine$TransitionType.TransitionType_TransitionEffect = transitionTy1;
       MinecraftModelDefine$TransitionType[] transitionTy2 = new MinecraftModelDefine$TransitionType[]{transitionTy,transitionTy1};
       MinecraftModelDefine$TransitionType.$VALUES = transitionTy2;
    }
    public void MinecraftModelDefine$TransitionType(String p0,int p1){
       super(p0, p1);
    }
    public static MinecraftModelDefine$TransitionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftModelDefine$TransitionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MinecraftModelDefine$TransitionType.class, p0);
    }
    public static MinecraftModelDefine$TransitionType[] values(){
       Object obj = PatchProxy.apply(null, null, MinecraftModelDefine$TransitionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftModelDefine$TransitionType.$VALUES.clone();
    }
}
