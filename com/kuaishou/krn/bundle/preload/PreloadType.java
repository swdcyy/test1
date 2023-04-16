package com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PreloadType extends Enum	// class@000840
{
    public static final PreloadType[] $VALUES;
    public static final PreloadType BUNDLE;
    public static final PreloadType DEFAULT;
    public static final PreloadType GENERATE_CODE_CACHE;
    public static final PreloadType RUN_APPLICATION;

    static {
       PreloadType preloadType;
       PreloadType[] preloadTypeA = new PreloadType[]{preloadType,preloadType,preloadType,preloadType};
       preloadType = new PreloadType("BUNDLE", 0);
       PreloadType.BUNDLE = preloadType;
       preloadType = new PreloadType("GENERATE_CODE_CACHE", 1);
       PreloadType.GENERATE_CODE_CACHE = preloadType;
       preloadType = new PreloadType("RUN_APPLICATION", 2);
       PreloadType.RUN_APPLICATION = preloadType;
       preloadType = new PreloadType("DEFAULT", 3);
       PreloadType.DEFAULT = preloadType;
       PreloadType.$VALUES = preloadTypeA;
    }
    public void PreloadType(String p0,int p1){
       super(p0, p1);
    }
    public static PreloadType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PreloadType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PreloadType.class, p0);
    }
    public static PreloadType[] values(){
       Object obj = PatchProxy.apply(null, null, PreloadType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PreloadType.$VALUES.clone();
    }
}
