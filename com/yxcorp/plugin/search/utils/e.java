package com.yxcorp.plugin.search.utils.e;
import jl8.e;
import java.lang.Object;
import el8.c;
import nfd.s0;
import nfd.s;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabBaseFragment;
import com.yxcorp.plugin.search.b;

public final class e implements e	// class@000795
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final Object a(c p0){
       SearchResultTabFragment searchResult = new SearchResultTabFragment();
       s0 c = p0.c;
       if (c != null) {
          searchResult.o1 = c;
          c.g = searchResult.G;
       }
       return searchResult;
    }
}
