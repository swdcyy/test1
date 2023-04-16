package com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$b;
import ub.a;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import hy3.a;

public final class SearchSwitcherPresenter$b extends a	// class@001765
{
    public final SearchSwitcherPresenter b;

    public void SearchSwitcherPresenter$b(SearchSwitcherPresenter p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchSwitcherPresenter$b.class, "1")) {
          return;
       }
       SearchSwitcherPresenter.P8(this.b).setBackgroundColor(this.b.B.b());
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchSwitcherPresenter$b.class, "2")) {
          return;
       }
       SearchSwitcherPresenter.P8(this.b).setBackgroundColor(this.b.B.b());
       return;
    }
}
