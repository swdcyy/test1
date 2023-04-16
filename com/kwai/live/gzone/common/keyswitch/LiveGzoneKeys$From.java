package com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys$From;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneKeys$From extends Enum	// class@000cae
{
    public int from;
    public static final LiveGzoneKeys$From[] $VALUES;
    public static final LiveGzoneKeys$From AB;
    public static final LiveGzoneKeys$From DEV;
    public static final LiveGzoneKeys$From SWITCH;

    static {
       LiveGzoneKeys$From uFrom = new LiveGzoneKeys$From("AB", 0, 1);
       LiveGzoneKeys$From.AB = uFrom;
       LiveGzoneKeys$From uFrom1 = new LiveGzoneKeys$From("SWITCH", 1, 2);
       LiveGzoneKeys$From.SWITCH = uFrom1;
       LiveGzoneKeys$From uFrom2 = new LiveGzoneKeys$From("DEV", 2, 3);
       LiveGzoneKeys$From.DEV = uFrom2;
       LiveGzoneKeys$From[] uFromArray = new LiveGzoneKeys$From[]{uFrom,uFrom1,uFrom2};
       LiveGzoneKeys$From.$VALUES = uFromArray;
    }
    public void LiveGzoneKeys$From(String p0,int p1,int p2){
       super(p0, p1);
       this.from = p2;
    }
    public static LiveGzoneKeys$From valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneKeys$From.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneKeys$From.class, p0);
    }
    public static LiveGzoneKeys$From[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneKeys$From.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneKeys$From.$VALUES.clone();
    }
}
