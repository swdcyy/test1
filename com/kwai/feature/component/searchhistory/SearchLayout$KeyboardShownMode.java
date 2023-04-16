package com.kwai.feature.component.searchhistory.SearchLayout$KeyboardShownMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchLayout$KeyboardShownMode extends Enum	// class@00128e
{
    public static final SearchLayout$KeyboardShownMode[] $VALUES;
    public static final SearchLayout$KeyboardShownMode ADJUST_NOTHING;
    public static final SearchLayout$KeyboardShownMode SHOW_HISTORY;

    static {
       SearchLayout$KeyboardShownMode keyboardShow = new SearchLayout$KeyboardShownMode("ADJUST_NOTHING", 0);
       SearchLayout$KeyboardShownMode.ADJUST_NOTHING = keyboardShow;
       SearchLayout$KeyboardShownMode keyboardShow1 = new SearchLayout$KeyboardShownMode("SHOW_HISTORY", 1);
       SearchLayout$KeyboardShownMode.SHOW_HISTORY = keyboardShow1;
       SearchLayout$KeyboardShownMode[] keyboardShow2 = new SearchLayout$KeyboardShownMode[]{keyboardShow,keyboardShow1};
       SearchLayout$KeyboardShownMode.$VALUES = keyboardShow2;
    }
    public void SearchLayout$KeyboardShownMode(String p0,int p1){
       super(p0, p1);
    }
    public static SearchLayout$KeyboardShownMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchLayout$KeyboardShownMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchLayout$KeyboardShownMode.class, p0);
    }
    public static SearchLayout$KeyboardShownMode[] values(){
       Object obj = PatchProxy.apply(null, null, SearchLayout$KeyboardShownMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchLayout$KeyboardShownMode.$VALUES.clone();
    }
}
