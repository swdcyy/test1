package com.kwai.video.clipkit.ClipKitUtils$CLIPKIT_VERSION;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipKitUtils$CLIPKIT_VERSION extends Enum	// class@001a31
{
    public static final ClipKitUtils$CLIPKIT_VERSION[] $VALUES;
    public static final ClipKitUtils$CLIPKIT_VERSION CLIPKIT_VERSION_1;
    public static final ClipKitUtils$CLIPKIT_VERSION CLIPKIT_VERSION_DEFAULT;
    public static final ClipKitUtils$CLIPKIT_VERSION CLIPKIT_VERSION_MAX;

    static {
       ClipKitUtils$CLIPKIT_VERSION uCLIPKIT_VER = new ClipKitUtils$CLIPKIT_VERSION("CLIPKIT_VERSION_DEFAULT", 0);
       ClipKitUtils$CLIPKIT_VERSION.CLIPKIT_VERSION_DEFAULT = uCLIPKIT_VER;
       ClipKitUtils$CLIPKIT_VERSION uCLIPKIT_VER1 = new ClipKitUtils$CLIPKIT_VERSION("CLIPKIT_VERSION_1", 1);
       ClipKitUtils$CLIPKIT_VERSION.CLIPKIT_VERSION_1 = uCLIPKIT_VER1;
       ClipKitUtils$CLIPKIT_VERSION uCLIPKIT_VER2 = new ClipKitUtils$CLIPKIT_VERSION("CLIPKIT_VERSION_MAX", 2);
       ClipKitUtils$CLIPKIT_VERSION.CLIPKIT_VERSION_MAX = uCLIPKIT_VER2;
       ClipKitUtils$CLIPKIT_VERSION[] uCLIPKIT_VER3 = new ClipKitUtils$CLIPKIT_VERSION[]{uCLIPKIT_VER,uCLIPKIT_VER1,uCLIPKIT_VER2};
       ClipKitUtils$CLIPKIT_VERSION.$VALUES = uCLIPKIT_VER3;
    }
    public void ClipKitUtils$CLIPKIT_VERSION(String p0,int p1){
       super(p0, p1);
    }
    public static ClipKitUtils$CLIPKIT_VERSION valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils$CLIPKIT_VERSION.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipKitUtils$CLIPKIT_VERSION.class, p0);
    }
    public static ClipKitUtils$CLIPKIT_VERSION[] values(){
       Object obj = PatchProxy.apply(null, null, ClipKitUtils$CLIPKIT_VERSION.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils$CLIPKIT_VERSION.$VALUES.clone();
    }
}
