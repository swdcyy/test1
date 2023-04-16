package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading$STYLE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneAccompanyLoading$STYLE extends Enum	// class@000b59
{
    public static final LiveGzoneAccompanyLoading$STYLE[] $VALUES;
    public static final LiveGzoneAccompanyLoading$STYLE FLOAT_LOADING;
    public static final LiveGzoneAccompanyLoading$STYLE INNER_LOADING;
    public static final LiveGzoneAccompanyLoading$STYLE NON;

    static {
       LiveGzoneAccompanyLoading$STYLE sTYLE = new LiveGzoneAccompanyLoading$STYLE("NON", 0);
       LiveGzoneAccompanyLoading$STYLE.NON = sTYLE;
       LiveGzoneAccompanyLoading$STYLE sTYLE1 = new LiveGzoneAccompanyLoading$STYLE("INNER_LOADING", 1);
       LiveGzoneAccompanyLoading$STYLE.INNER_LOADING = sTYLE1;
       LiveGzoneAccompanyLoading$STYLE sTYLE2 = new LiveGzoneAccompanyLoading$STYLE("FLOAT_LOADING", 2);
       LiveGzoneAccompanyLoading$STYLE.FLOAT_LOADING = sTYLE2;
       LiveGzoneAccompanyLoading$STYLE[] sTYLEArray = new LiveGzoneAccompanyLoading$STYLE[]{sTYLE,sTYLE1,sTYLE2};
       LiveGzoneAccompanyLoading$STYLE.$VALUES = sTYLEArray;
    }
    public void LiveGzoneAccompanyLoading$STYLE(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGzoneAccompanyLoading$STYLE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAccompanyLoading$STYLE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAccompanyLoading$STYLE.class, p0);
    }
    public static LiveGzoneAccompanyLoading$STYLE[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAccompanyLoading$STYLE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAccompanyLoading$STYLE.$VALUES.clone();
    }
}
