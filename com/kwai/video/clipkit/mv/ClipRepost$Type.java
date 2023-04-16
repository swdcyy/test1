package com.kwai.video.clipkit.mv.ClipRepost$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipRepost$Type extends Enum	// class@001aae
{
    public final int value;
    public static final ClipRepost$Type[] $VALUES;
    public static final ClipRepost$Type Atlas;
    public static final ClipRepost$Type LongPicture;

    static {
       ClipRepost$Type type = new ClipRepost$Type("LongPicture", 0, 0);
       ClipRepost$Type.LongPicture = type;
       ClipRepost$Type type1 = new ClipRepost$Type("Atlas", 1, 1);
       ClipRepost$Type.Atlas = type1;
       ClipRepost$Type[] typeArray = new ClipRepost$Type[]{type,type1};
       ClipRepost$Type.$VALUES = typeArray;
    }
    public void ClipRepost$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ClipRepost$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipRepost$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipRepost$Type.class, p0);
    }
    public static ClipRepost$Type[] values(){
       Object obj = PatchProxy.apply(null, null, ClipRepost$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipRepost$Type.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
