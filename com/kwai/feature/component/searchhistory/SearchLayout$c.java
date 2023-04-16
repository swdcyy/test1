package com.kwai.feature.component.searchhistory.SearchLayout$c;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import java.lang.Object;
import com.kwai.feature.component.searchhistory.SearchLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.searchhistory.SearchHistoryFragment;
import g06.e;

public abstract class SearchLayout$c implements SearchLayout$e	// class@001291
{

    public void SearchLayout$c(){
       super();
    }
    public BaseFragment a(SearchLayout p0){
       SearchHistoryFragment obj = PatchProxy.applyOneRefs(p0, this, SearchLayout$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SearchHistoryFragment();
       obj.Ih(p0);
       obj.Jh(this.b());
       obj.Hh(false);
       return obj;
    }
    public abstract String b();
}
