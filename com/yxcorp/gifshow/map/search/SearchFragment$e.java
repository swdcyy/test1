package com.yxcorp.gifshow.map.search.SearchFragment$e;
import com.yxcorp.map.search.SearchEditorLayout$a;
import com.yxcorp.gifshow.map.search.SearchFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.map.search.SearchFragment$b;

public final class SearchFragment$e implements SearchEditorLayout$a	// class@001cce
{
    public final SearchFragment a;

    public void SearchFragment$e(SearchFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       SearchFragment obj = PatchProxy.apply(null, this, SearchFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.n;
       if (obj != null) {
          obj.onClose();
       }
       return false;
    }
}
