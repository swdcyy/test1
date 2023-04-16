package com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LyricsMode extends Enum	// class@000d45
{
    public static final LyricsMode[] $VALUES;
    public static final LyricsMode LEFT;
    public static final LyricsMode RIGHT;

    static {
       LyricsMode lyricsMode;
       LyricsMode[] lyricsModeAr = new LyricsMode[]{lyricsMode,lyricsMode};
       lyricsMode = new LyricsMode("LEFT", 0);
       LyricsMode.LEFT = lyricsMode;
       lyricsMode = new LyricsMode("RIGHT", 1);
       LyricsMode.RIGHT = lyricsMode;
       LyricsMode.$VALUES = lyricsModeAr;
    }
    public void LyricsMode(String p0,int p1){
       super(p0, p1);
    }
    public static LyricsMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LyricsMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LyricsMode.class, p0);
    }
    public static LyricsMode[] values(){
       Object obj = PatchProxy.apply(null, null, LyricsMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LyricsMode.$VALUES.clone();
    }
}
