package com.yxcorp.gifshow.v3.editor.music_v2.MusicContainerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicContainerType extends Enum	// class@001041
{
    public static final MusicContainerType[] $VALUES;
    public static final MusicContainerType MAIN;
    public static final MusicContainerType ROOT;

    static {
       MusicContainerType musicContain1;
       MusicContainerType[] musicContain = new MusicContainerType[]{musicContain1,musicContain1};
       musicContain1 = new MusicContainerType("ROOT", 0);
       MusicContainerType.ROOT = musicContain1;
       musicContain1 = new MusicContainerType("MAIN", 1);
       MusicContainerType.MAIN = musicContain1;
       MusicContainerType.$VALUES = musicContain;
    }
    public void MusicContainerType(String p0,int p1){
       super(p0, p1);
    }
    public static MusicContainerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicContainerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicContainerType.class, p0);
    }
    public static MusicContainerType[] values(){
       Object obj = PatchProxy.apply(null, null, MusicContainerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicContainerType.$VALUES.clone();
    }
}
