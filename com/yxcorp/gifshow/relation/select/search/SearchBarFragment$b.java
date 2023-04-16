package com.yxcorp.gifshow.relation.select.search.SearchBarFragment$b;
import im8.g;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.search.d;
import java.util.Map;
import java.util.HashMap;

public class SearchBarFragment$b implements g	// class@0019b3
{
    public c b;
    public final SearchBarFragment c;

    public void SearchBarFragment$b(SearchBarFragment p0){
       this.c = p0;
       super();
       this.b = a.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchBarFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SearchBarFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SearchBarFragment$b.class, new d());
       }else {
          obj.put(SearchBarFragment$b.class, null);
       }
       return obj;
    }
}
