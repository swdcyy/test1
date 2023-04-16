package com.yxcorp.plugin.search.utils.h;
import jl8.e;
import java.lang.Object;
import el8.c;
import nfd.s0;
import nfd.s;
import com.yxcorp.plugin.search.fragment.SearchMiddleHomeSugFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.b;
import com.yxcorp.plugin.search.fragment.SearchBaseHomeAndSugFragment;

public final class h implements e	// class@00079f
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object a(c p0){
       SearchMiddleHomeSugFragment searchMiddle;
       s0 c = p0.c;
       s0 a = p0.a;
       if (PatchProxy.isSupport(SearchMiddleHomeSugFragment.class)) {
          searchMiddle = PatchProxy.applyTwoRefs(c, Boolean.valueOf(a), null, SearchMiddleHomeSugFragment.class, "1");
          if (searchMiddle != PatchProxyResult.class) {
          label_0031 :
             return searchMiddle;
          }
       }
       searchMiddle = new SearchMiddleHomeSugFragment();
       searchMiddle.mh(c);
       searchMiddle.lh(a);
       goto label_0031 ;
    }
}
