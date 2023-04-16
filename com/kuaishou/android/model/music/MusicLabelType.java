package com.kuaishou.android.model.music.MusicLabelType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicLabelType extends Enum	// class@000e76
{
    public static final MusicLabelType[] $VALUES;
    public static final MusicLabelType SLEEP;
    public static final MusicLabelType UNKNOWN;

    static {
       MusicLabelType musicLabelTy = new MusicLabelType("UNKNOWN", 0);
       MusicLabelType.UNKNOWN = musicLabelTy;
       MusicLabelType musicLabelTy1 = new MusicLabelType("SLEEP", 1);
       MusicLabelType.SLEEP = musicLabelTy1;
       MusicLabelType[] musicLabelTy2 = new MusicLabelType[]{musicLabelTy,musicLabelTy1};
       MusicLabelType.$VALUES = musicLabelTy2;
    }
    public void MusicLabelType(String p0,int p1){
       super(p0, p1);
    }
    public static MusicLabelType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicLabelType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicLabelType.class, p0);
    }
    public static MusicLabelType[] values(){
       Object obj = PatchProxy.apply(null, null, MusicLabelType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicLabelType.$VALUES.clone();
    }
}
