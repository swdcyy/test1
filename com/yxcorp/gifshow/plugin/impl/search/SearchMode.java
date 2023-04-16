package com.yxcorp.gifshow.plugin.impl.search.SearchMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchMode extends Enum	// class@000fd7
{
    public static final SearchMode[] $VALUES;
    public static final SearchMode GOODS_IMAGE;
    public static final SearchMode STANDARD;

    static {
       SearchMode searchMode = new SearchMode("STANDARD", 0);
       SearchMode.STANDARD = searchMode;
       SearchMode searchMode1 = new SearchMode("GOODS_IMAGE", 1);
       SearchMode.GOODS_IMAGE = searchMode1;
       SearchMode[] searchModeAr = new SearchMode[]{searchMode,searchMode1};
       SearchMode.$VALUES = searchModeAr;
    }
    public void SearchMode(String p0,int p1){
       super(p0, p1);
    }
    public static SearchMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchMode.class, p0);
    }
    public static SearchMode[] values(){
       Object obj = PatchProxy.apply(null, null, SearchMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchMode.$VALUES.clone();
    }
}
