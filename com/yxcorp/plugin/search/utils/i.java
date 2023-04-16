package com.yxcorp.plugin.search.utils.i;
import jl8.e;
import java.lang.Object;
import el8.c;
import nfd.s0;
import nfd.s;
import com.yxcorp.plugin.search.fragment.SearchVerticalHomeAndSugFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.b;
import com.yxcorp.plugin.search.fragment.SearchBaseHomeAndSugFragment;
import com.kwai.feature.component.entry.SearchVerticalParams;

public final class i implements e	// class@0007a1
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Object a(c p0){
       SearchVerticalHomeAndSugFragment searchVertic;
       s0 c = p0.c;
       s0 a = p0.a;
       if (PatchProxy.isSupport(SearchVerticalHomeAndSugFragment.class)) {
          searchVertic = PatchProxy.applyTwoRefs(c, Boolean.valueOf(a), null, SearchVerticalHomeAndSugFragment.class, "1");
          if (searchVertic != PatchProxyResult.class) {
          label_003d :
             return searchVertic;
          }
       }
       searchVertic = new SearchVerticalHomeAndSugFragment();
       searchVertic.mh(c);
       b k = c.k;
       int colorMode = (k != null)? k.getColorMode(): 0;
       searchVertic.D = colorMode;
       searchVertic.lh(a);
       goto label_003d ;
    }
}
