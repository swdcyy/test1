package com.yxcorp.gifshow.lelink.screencast.KwaiScreencastSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiScreencastSource extends Enum	// class@001a50
{
    public static final KwaiScreencastSource[] $VALUES;
    public static final KwaiScreencastSource CORONA;
    public static final KwaiScreencastSource LVIE;

    static {
       KwaiScreencastSource kwaiScreenca1;
       KwaiScreencastSource[] kwaiScreenca = new KwaiScreencastSource[]{kwaiScreenca1,kwaiScreenca1};
       kwaiScreenca1 = new KwaiScreencastSource("LVIE", 0);
       KwaiScreencastSource.LVIE = kwaiScreenca1;
       kwaiScreenca1 = new KwaiScreencastSource("CORONA", 1);
       KwaiScreencastSource.CORONA = kwaiScreenca1;
       KwaiScreencastSource.$VALUES = kwaiScreenca;
    }
    public void KwaiScreencastSource(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiScreencastSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiScreencastSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiScreencastSource.class, p0);
    }
    public static KwaiScreencastSource[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiScreencastSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiScreencastSource.$VALUES.clone();
    }
}
