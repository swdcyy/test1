package com.yxcorp.gifshow.widget.FlattenLyricView$EmptyLyricsStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FlattenLyricView$EmptyLyricsStyle extends Enum	// class@00184b
{
    public static final FlattenLyricView$EmptyLyricsStyle[] $VALUES;
    public static final FlattenLyricView$EmptyLyricsStyle AudiencePendantStyle;
    public static final FlattenLyricView$EmptyLyricsStyle NormalStyle;

    static {
       FlattenLyricView$EmptyLyricsStyle uEmptyLyrics = new FlattenLyricView$EmptyLyricsStyle("NormalStyle", 0);
       FlattenLyricView$EmptyLyricsStyle.NormalStyle = uEmptyLyrics;
       FlattenLyricView$EmptyLyricsStyle uEmptyLyrics1 = new FlattenLyricView$EmptyLyricsStyle("AudiencePendantStyle", 1);
       FlattenLyricView$EmptyLyricsStyle.AudiencePendantStyle = uEmptyLyrics1;
       FlattenLyricView$EmptyLyricsStyle[] uEmptyLyrics2 = new FlattenLyricView$EmptyLyricsStyle[]{uEmptyLyrics,uEmptyLyrics1};
       FlattenLyricView$EmptyLyricsStyle.$VALUES = uEmptyLyrics2;
    }
    public void FlattenLyricView$EmptyLyricsStyle(String p0,int p1){
       super(p0, p1);
    }
    public static FlattenLyricView$EmptyLyricsStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FlattenLyricView$EmptyLyricsStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FlattenLyricView$EmptyLyricsStyle.class, p0);
    }
    public static FlattenLyricView$EmptyLyricsStyle[] values(){
       Object obj = PatchProxy.apply(null, null, FlattenLyricView$EmptyLyricsStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FlattenLyricView$EmptyLyricsStyle.$VALUES.clone();
    }
}
