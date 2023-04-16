package com.kwai.emotionsdk.search.constant.SearchState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchState extends Enum	// class@000db6
{
    public static final SearchState[] $VALUES;
    public static final SearchState IDLE;
    public static final SearchState SEARCH_EMPTY;
    public static final SearchState SEARCH_FAILED;
    public static final SearchState SEARCH_IN_PROGRESS;
    public static final SearchState SEARCH_RESULT;

    static {
       SearchState searchState = new SearchState("IDLE", 0);
       SearchState.IDLE = searchState;
       SearchState searchState1 = new SearchState("SEARCH_IN_PROGRESS", 1);
       SearchState.SEARCH_IN_PROGRESS = searchState1;
       SearchState searchState2 = new SearchState("SEARCH_RESULT", 2);
       SearchState.SEARCH_RESULT = searchState2;
       SearchState searchState3 = new SearchState("SEARCH_EMPTY", 3);
       SearchState.SEARCH_EMPTY = searchState3;
       SearchState searchState4 = new SearchState("SEARCH_FAILED", 4);
       SearchState.SEARCH_FAILED = searchState4;
       SearchState[] searchStateA = new SearchState[]{searchState,searchState1,searchState2,searchState3,searchState4};
       SearchState.$VALUES = searchStateA;
    }
    public void SearchState(String p0,int p1){
       super(p0, p1);
    }
    public static SearchState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchState.class, p0);
    }
    public static SearchState[] values(){
       Object obj = PatchProxy.apply(null, null, SearchState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchState.$VALUES.clone();
    }
}
