package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$Style;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveVoicePartyOrderedMusicFragment$Style extends Enum	// class@0017c6
{
    public static final LiveVoicePartyOrderedMusicFragment$Style[] $VALUES;
    public static final LiveVoicePartyOrderedMusicFragment$Style ApplyListDialog;
    public static final LiveVoicePartyOrderedMusicFragment$Style OrderMusicStation;

    static {
       LiveVoicePartyOrderedMusicFragment$Style style = new LiveVoicePartyOrderedMusicFragment$Style("OrderMusicStation", 0);
       LiveVoicePartyOrderedMusicFragment$Style.OrderMusicStation = style;
       LiveVoicePartyOrderedMusicFragment$Style style1 = new LiveVoicePartyOrderedMusicFragment$Style("ApplyListDialog", 1);
       LiveVoicePartyOrderedMusicFragment$Style.ApplyListDialog = style1;
       LiveVoicePartyOrderedMusicFragment$Style[] styleArray = new LiveVoicePartyOrderedMusicFragment$Style[]{style,style1};
       LiveVoicePartyOrderedMusicFragment$Style.$VALUES = styleArray;
    }
    public void LiveVoicePartyOrderedMusicFragment$Style(String p0,int p1){
       super(p0, p1);
    }
    public static LiveVoicePartyOrderedMusicFragment$Style valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyOrderedMusicFragment$Style.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyOrderedMusicFragment$Style.class, p0);
    }
    public static LiveVoicePartyOrderedMusicFragment$Style[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyOrderedMusicFragment$Style.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyOrderedMusicFragment$Style.$VALUES.clone();
    }
}
