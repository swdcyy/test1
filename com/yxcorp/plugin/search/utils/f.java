package com.yxcorp.plugin.search.utils.f;
import jl8.e;
import java.lang.Object;
import el8.c;
import nfd.s0;
import nfd.s;
import com.yxcorp.plugin.search.result.fragment.SearchVerticalResultContainerFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.fragment.VerticalContainerFragment;
import l8d.u;
import com.yxcorp.plugin.search.b;
import com.kwai.feature.component.entry.SearchVerticalParams;

public final class f implements e	// class@00079a
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final Object a(c p0){
       s0 c = p0.c;
       SearchVerticalResultContainerFragment searchVertic = PatchProxy.applyOneRefs(c, null, SearchVerticalResultContainerFragment.class, "1");
       if (searchVertic != PatchProxyResult.class) {
       }else {
          searchVertic = new SearchVerticalResultContainerFragment();
          VerticalContainerFragment m = searchVertic.m;
          m.b = c;
          b k = c.k;
          searchVertic.p = k;
          int colorMode = (k != null)? k.getColorMode(): 0;
          m.g = colorMode;
       }
       return searchVertic;
    }
}
