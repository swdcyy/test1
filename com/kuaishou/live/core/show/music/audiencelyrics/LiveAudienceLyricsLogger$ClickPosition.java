package com.kuaishou.live.core.show.music.audiencelyrics.LiveAudienceLyricsLogger$ClickPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceLyricsLogger$ClickPosition extends Enum	// class@000d27
{
    public final String mName;
    public static final LiveAudienceLyricsLogger$ClickPosition[] $VALUES;
    public static final LiveAudienceLyricsLogger$ClickPosition NORMAL;
    public static final LiveAudienceLyricsLogger$ClickPosition SIDE;

    static {
       LiveAudienceLyricsLogger$ClickPosition uClickPositi = new LiveAudienceLyricsLogger$ClickPosition("NORMAL", 0, "NORMAL");
       LiveAudienceLyricsLogger$ClickPosition.NORMAL = uClickPositi;
       LiveAudienceLyricsLogger$ClickPosition uClickPositi1 = new LiveAudienceLyricsLogger$ClickPosition("SIDE", 1, "SIDE");
       LiveAudienceLyricsLogger$ClickPosition.SIDE = uClickPositi1;
       LiveAudienceLyricsLogger$ClickPosition[] uClickPositi2 = new LiveAudienceLyricsLogger$ClickPosition[]{uClickPositi,uClickPositi1};
       LiveAudienceLyricsLogger$ClickPosition.$VALUES = uClickPositi2;
    }
    public void LiveAudienceLyricsLogger$ClickPosition(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveAudienceLyricsLogger$ClickPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceLyricsLogger$ClickPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceLyricsLogger$ClickPosition.class, p0);
    }
    public static LiveAudienceLyricsLogger$ClickPosition[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceLyricsLogger$ClickPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceLyricsLogger$ClickPosition.$VALUES.clone();
    }
}
