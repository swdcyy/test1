package com.kwai.video.player.KsPlayerCore;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsPlayerCore extends Enum	// class@000af3
{
    public static final KsPlayerCore[] $VALUES;
    public static final KsPlayerCore PLAYER_CORE_AEMON;
    public static final KsPlayerCore PLAYER_CORE_AEMON_HOTFIX;
    public static final KsPlayerCore PLAYER_CORE_IJK;

    static {
       KsPlayerCore ksPlayerCore = new KsPlayerCore("PLAYER_CORE_IJK", 0);
       KsPlayerCore.PLAYER_CORE_IJK = ksPlayerCore;
       KsPlayerCore ksPlayerCore1 = new KsPlayerCore("PLAYER_CORE_AEMON", 1);
       KsPlayerCore.PLAYER_CORE_AEMON = ksPlayerCore1;
       KsPlayerCore ksPlayerCore2 = new KsPlayerCore("PLAYER_CORE_AEMON_HOTFIX", 2);
       KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX = ksPlayerCore2;
       KsPlayerCore[] ksPlayerCore3 = new KsPlayerCore[]{ksPlayerCore,ksPlayerCore1,ksPlayerCore2};
       KsPlayerCore.$VALUES = ksPlayerCore3;
    }
    public void KsPlayerCore(String p0,int p1){
       super(p0, p1);
    }
    public static boolean isKindOfAemon(KsPlayerCore p0){
       boolean b = (p0 == KsPlayerCore.PLAYER_CORE_AEMON || p0 == KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX)? true: false;
       return b;
    }
    public static KsPlayerCore valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsPlayerCore.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsPlayerCore.class, p0);
    }
    public static KsPlayerCore[] values(){
       Object obj = PatchProxy.apply(null, null, KsPlayerCore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsPlayerCore.$VALUES.clone();
    }
}
