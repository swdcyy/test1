package com.yxcorp.gifshow.v3.editor.music_v2.model.LyricItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LyricItemType extends Enum	// class@001099
{
    public static final LyricItemType[] $VALUES;
    public static final LyricItemType CLEAR_LYRIC;
    public static final LyricItemType NORMAL;

    static {
       LyricItemType lyricItemTyp1;
       LyricItemType[] lyricItemTyp = new LyricItemType[]{lyricItemTyp1,lyricItemTyp1};
       lyricItemTyp1 = new LyricItemType("NORMAL", 0);
       LyricItemType.NORMAL = lyricItemTyp1;
       lyricItemTyp1 = new LyricItemType("CLEAR_LYRIC", 1);
       LyricItemType.CLEAR_LYRIC = lyricItemTyp1;
       LyricItemType.$VALUES = lyricItemTyp;
    }
    public void LyricItemType(String p0,int p1){
       super(p0, p1);
    }
    public static LyricItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LyricItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LyricItemType.class, p0);
    }
    public static LyricItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LyricItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LyricItemType.$VALUES.clone();
    }
}
