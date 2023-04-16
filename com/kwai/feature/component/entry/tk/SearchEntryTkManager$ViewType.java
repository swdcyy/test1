package com.kwai.feature.component.entry.tk.SearchEntryTkManager$ViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchEntryTkManager$ViewType extends Enum	// class@00120f
{
    public String mValue;
    public static final SearchEntryTkManager$ViewType[] $VALUES;
    public static final SearchEntryTkManager$ViewType SEARCH_BAR;
    public static final SearchEntryTkManager$ViewType SEARCH_BUBBLE;
    public static final SearchEntryTkManager$ViewType SEARCH_ICON;
    public static final SearchEntryTkManager$ViewType SEARCH_SWITCHER;

    static {
       SearchEntryTkManager$ViewType viewType = new SearchEntryTkManager$ViewType("SEARCH_ICON", 0, "searchIconView");
       SearchEntryTkManager$ViewType.SEARCH_ICON = viewType;
       SearchEntryTkManager$ViewType viewType1 = new SearchEntryTkManager$ViewType("SEARCH_BAR", 1, "searchBarView");
       SearchEntryTkManager$ViewType.SEARCH_BAR = viewType1;
       SearchEntryTkManager$ViewType viewType2 = new SearchEntryTkManager$ViewType("SEARCH_BUBBLE", 2, "searchBubbleView");
       SearchEntryTkManager$ViewType.SEARCH_BUBBLE = viewType2;
       SearchEntryTkManager$ViewType viewType3 = new SearchEntryTkManager$ViewType("SEARCH_SWITCHER", 3, "searchSwitcherView");
       SearchEntryTkManager$ViewType.SEARCH_SWITCHER = viewType3;
       SearchEntryTkManager$ViewType[] viewTypeArra = new SearchEntryTkManager$ViewType[]{viewType,viewType1,viewType2,viewType3};
       SearchEntryTkManager$ViewType.$VALUES = viewTypeArra;
    }
    public void SearchEntryTkManager$ViewType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static SearchEntryTkManager$ViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchEntryTkManager$ViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchEntryTkManager$ViewType.class, p0);
    }
    public static SearchEntryTkManager$ViewType[] values(){
       Object obj = PatchProxy.apply(null, null, SearchEntryTkManager$ViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchEntryTkManager$ViewType.$VALUES.clone();
    }
    public String getValue(){
       return this.mValue;
    }
}
