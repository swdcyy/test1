package com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$c;
import qvb.n0;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import java.lang.Object;
import java.util.Set;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wbc.j;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Collection;

public class SearchBarPreviewFragment$c extends n0	// class@0019b7
{
    public final SearchBarPreviewFragment m;

    public void SearchBarPreviewFragment$c(SearchBarPreviewFragment p0){
       this.m = p0;
       super();
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, SearchBarPreviewFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new j(this));
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchBarPreviewFragment$c.class, "2")) {
       }else {
          p1.clear();
          if (p0 != null) {
             p1.addAll(p0);
          }
       }
       return;
    }
}
