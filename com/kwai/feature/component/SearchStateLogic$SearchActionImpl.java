package com.kwai.feature.component.SearchStateLogic$SearchActionImpl;
import com.kwai.feature.component.SearchStateLogic$d;
import java.lang.Enum;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl$1;
import java.lang.String;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl$2;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl$3;
import com.kwai.feature.component.SearchStateLogic$SearchActionImpl$4;
import com.kwai.feature.component.SearchStateLogic$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class SearchStateLogic$SearchActionImpl extends Enum implements SearchStateLogic$d	// class@0011dd
{
    public static final SearchStateLogic$SearchActionImpl[] $VALUES;
    public static final SearchStateLogic$SearchActionImpl FOCUS;
    public static final SearchStateLogic$SearchActionImpl IDLE;
    public static final SearchStateLogic$SearchActionImpl INPUT;
    public static final SearchStateLogic$SearchActionImpl SEARCH_ACTION;

    static {
       SearchStateLogic$SearchActionImpl$1 searchAction = new SearchStateLogic$SearchActionImpl$1("IDLE", 0);
       SearchStateLogic$SearchActionImpl.IDLE = searchAction;
       SearchStateLogic$SearchActionImpl$2 searchAction1 = new SearchStateLogic$SearchActionImpl$2("FOCUS", 1);
       SearchStateLogic$SearchActionImpl.FOCUS = searchAction1;
       SearchStateLogic$SearchActionImpl$3 searchAction2 = new SearchStateLogic$SearchActionImpl$3("INPUT", 2);
       SearchStateLogic$SearchActionImpl.INPUT = searchAction2;
       SearchStateLogic$SearchActionImpl$4 searchAction3 = new SearchStateLogic$SearchActionImpl$4("SEARCH_ACTION", 3);
       SearchStateLogic$SearchActionImpl.SEARCH_ACTION = searchAction3;
       SearchStateLogic$SearchActionImpl[] searchAction4 = new SearchStateLogic$SearchActionImpl[]{searchAction,searchAction1,searchAction2,searchAction3};
       SearchStateLogic$SearchActionImpl.$VALUES = searchAction4;
    }
    public void SearchStateLogic$SearchActionImpl(String p0,int p1){
       super(p0, p1);
    }
    public void SearchStateLogic$SearchActionImpl(String p0,int p1,SearchStateLogic$a p2){
       super(p0, p1);
    }
    public static SearchStateLogic$SearchActionImpl valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchStateLogic$SearchActionImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchStateLogic$SearchActionImpl.class, p0);
    }
    public static SearchStateLogic$SearchActionImpl[] values(){
       Object obj = PatchProxy.apply(null, null, SearchStateLogic$SearchActionImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchStateLogic$SearchActionImpl.$VALUES.clone();
    }
}
