package com.kwai.video.clipkit.mv.ClipAICut$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipAICut$Type extends Enum	// class@001a9b
{
    public final int value;
    public static final ClipAICut$Type[] $VALUES;
    public static final ClipAICut$Type AE2EffectMedia;
    public static final ClipAICut$Type ReplaceableMedia;

    static {
       ClipAICut$Type type = new ClipAICut$Type("ReplaceableMedia", 0, 0);
       ClipAICut$Type.ReplaceableMedia = type;
       ClipAICut$Type type1 = new ClipAICut$Type("AE2EffectMedia", 1, 1);
       ClipAICut$Type.AE2EffectMedia = type1;
       ClipAICut$Type[] typeArray = new ClipAICut$Type[]{type,type1};
       ClipAICut$Type.$VALUES = typeArray;
    }
    public void ClipAICut$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ClipAICut$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipAICut$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipAICut$Type.class, p0);
    }
    public static ClipAICut$Type[] values(){
       Object obj = PatchProxy.apply(null, null, ClipAICut$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipAICut$Type.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
