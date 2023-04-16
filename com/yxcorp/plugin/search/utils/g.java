package com.yxcorp.plugin.search.utils.g;
import jl8.e;
import java.lang.Object;
import el8.c;
import nfd.s0;
import nfd.s;
import com.yxcorp.plugin.search.fragment.SearchSimpleHomeAndResultFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.fragment.VerticalContainerFragment;
import l8d.u;
import com.yxcorp.plugin.search.b;
import com.kwai.feature.component.entry.SearchVerticalParams;

public final class g implements e	// class@00079c
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Object a(c p0){
       s0 c = p0.c;
       SearchSimpleHomeAndResultFragment searchSimple = PatchProxy.applyOneRefs(c, null, SearchSimpleHomeAndResultFragment.class, "1");
       if (searchSimple != PatchProxyResult.class) {
       }else {
          searchSimple = new SearchSimpleHomeAndResultFragment();
          VerticalContainerFragment m = searchSimple.m;
          m.b = c;
          m.c = searchSimple;
          b k = c.k;
          searchSimple.o = k;
          int colorMode = (k != null)? k.getColorMode(): 0;
          m.g = colorMode;
       }
       return searchSimple;
    }
}
