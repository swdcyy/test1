package com.kuaishou.gifshow.kuaishan.KSSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSSource extends Enum	// class@0019ed
{
    public static final KSSource[] $VALUES;
    public static final KSSource AI_CUT;
    public static final KSSource CAMERA_MOVIE;
    public static final KSSource EXTERNAL;
    public static final KSSource MEMORY;
    public static final KSSource MEMORY_LOCAL;
    public static final KSSource SEARCH;
    public static final KSSource TOOLBOX;

    static {
       KSSource kSSource;
       KSSource[] kSSourceArra = new KSSource[]{kSSource,kSSource,kSSource,kSSource,kSSource,kSSource,kSSource};
       kSSource = new KSSource("CAMERA_MOVIE", 0);
       KSSource.CAMERA_MOVIE = kSSource;
       kSSource = new KSSource("TOOLBOX", 1);
       KSSource.TOOLBOX = kSSource;
       kSSource = new KSSource("AI_CUT", 2);
       KSSource.AI_CUT = kSSource;
       kSSource = new KSSource("MEMORY", 3);
       KSSource.MEMORY = kSSource;
       kSSource = new KSSource("MEMORY_LOCAL", 4);
       KSSource.MEMORY_LOCAL = kSSource;
       kSSource = new KSSource("SEARCH", 5);
       KSSource.SEARCH = kSSource;
       kSSource = new KSSource("EXTERNAL", 6);
       KSSource.EXTERNAL = kSSource;
       KSSource.$VALUES = kSSourceArra;
    }
    public void KSSource(String p0,int p1){
       super(p0, p1);
    }
    public static KSSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSSource.class, p0);
    }
    public static KSSource[] values(){
       Object obj = PatchProxy.apply(null, null, KSSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSSource.$VALUES.clone();
    }
}
