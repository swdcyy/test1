package com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$DanmakuStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchLiveDanmakuHelper$DanmakuStyle extends Enum	// class@000787
{
    public static final SearchLiveDanmakuHelper$DanmakuStyle[] $VALUES;
    public static final SearchLiveDanmakuHelper$DanmakuStyle HORIZONTAL_FRAME_MOVE;
    public static final SearchLiveDanmakuHelper$DanmakuStyle VERTICAL_ANIMATOR_TIMER_MOVE;
    public static final SearchLiveDanmakuHelper$DanmakuStyle VERTICAL_FRAME_MOVE;

    static {
       SearchLiveDanmakuHelper$DanmakuStyle uDanmakuStyl = new SearchLiveDanmakuHelper$DanmakuStyle("VERTICAL_FRAME_MOVE", 0);
       SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_FRAME_MOVE = uDanmakuStyl;
       SearchLiveDanmakuHelper$DanmakuStyle uDanmakuStyl1 = new SearchLiveDanmakuHelper$DanmakuStyle("HORIZONTAL_FRAME_MOVE", 1);
       SearchLiveDanmakuHelper$DanmakuStyle.HORIZONTAL_FRAME_MOVE = uDanmakuStyl1;
       SearchLiveDanmakuHelper$DanmakuStyle uDanmakuStyl2 = new SearchLiveDanmakuHelper$DanmakuStyle("VERTICAL_ANIMATOR_TIMER_MOVE", 2);
       SearchLiveDanmakuHelper$DanmakuStyle.VERTICAL_ANIMATOR_TIMER_MOVE = uDanmakuStyl2;
       SearchLiveDanmakuHelper$DanmakuStyle[] uDanmakuStyl3 = new SearchLiveDanmakuHelper$DanmakuStyle[]{uDanmakuStyl,uDanmakuStyl1,uDanmakuStyl2};
       SearchLiveDanmakuHelper$DanmakuStyle.$VALUES = uDanmakuStyl3;
    }
    public void SearchLiveDanmakuHelper$DanmakuStyle(String p0,int p1){
       super(p0, p1);
    }
    public static SearchLiveDanmakuHelper$DanmakuStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchLiveDanmakuHelper$DanmakuStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchLiveDanmakuHelper$DanmakuStyle.class, p0);
    }
    public static SearchLiveDanmakuHelper$DanmakuStyle[] values(){
       Object obj = PatchProxy.apply(null, null, SearchLiveDanmakuHelper$DanmakuStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchLiveDanmakuHelper$DanmakuStyle.$VALUES.clone();
    }
}
