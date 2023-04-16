package com.kwai.feature.component.searchhistory.SearchLayout$a;
import java.lang.Runnable;
import com.kwai.feature.component.searchhistory.SearchLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class SearchLayout$a implements Runnable	// class@00128f
{
    public final SearchLayout b;

    public void SearchLayout$a(SearchLayout p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SearchLayout$a.class, "1")) {
          return;
       }
       this.b.t();
       return;
    }
}
