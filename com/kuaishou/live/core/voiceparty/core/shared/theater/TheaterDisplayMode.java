package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TheaterDisplayMode extends Enum	// class@00145f
{
    public static final TheaterDisplayMode[] $VALUES;
    public static final TheaterDisplayMode FULL_SCREEN_LANDSCAPE;
    public static final TheaterDisplayMode FULL_SCREEN_PORTRAIT;
    public static final TheaterDisplayMode HALF_SCREEN;

    static {
       TheaterDisplayMode theaterDispl1;
       TheaterDisplayMode[] theaterDispl = new TheaterDisplayMode[]{theaterDispl1,theaterDispl1,theaterDispl1};
       theaterDispl1 = new TheaterDisplayMode("FULL_SCREEN_PORTRAIT", 0);
       TheaterDisplayMode.FULL_SCREEN_PORTRAIT = theaterDispl1;
       theaterDispl1 = new TheaterDisplayMode("FULL_SCREEN_LANDSCAPE", 1);
       TheaterDisplayMode.FULL_SCREEN_LANDSCAPE = theaterDispl1;
       theaterDispl1 = new TheaterDisplayMode("HALF_SCREEN", 2);
       TheaterDisplayMode.HALF_SCREEN = theaterDispl1;
       TheaterDisplayMode.$VALUES = theaterDispl;
    }
    public void TheaterDisplayMode(String p0,int p1){
       super(p0, p1);
    }
    public static TheaterDisplayMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TheaterDisplayMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TheaterDisplayMode.class, p0);
    }
    public static TheaterDisplayMode[] values(){
       Object obj = PatchProxy.apply(null, null, TheaterDisplayMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TheaterDisplayMode.$VALUES.clone();
    }
}
