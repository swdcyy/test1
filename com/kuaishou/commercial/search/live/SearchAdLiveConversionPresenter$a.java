package com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter$a;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.search.live.SearchAdLiveConversionPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;

public final class SearchAdLiveConversionPresenter$a implements View$OnClickListener	// class@00155e
{
    public final SearchAdLiveConversionPresenter b;

    public void SearchAdLiveConversionPresenter$a(SearchAdLiveConversionPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchAdLiveConversionPresenter$a.class, "1")) {
          return;
       }
       SearchAdLiveConversionPresenter r = this.b.r;
       if (r != null && !r.isDisposed()) {
          r.dispose();
       }
       return;
    }
}
