package com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter$d;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.titlebar.SearchSwitcherPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public final class SearchSwitcherPresenter$d implements g	// class@001767
{
    public final SearchSwitcherPresenter b;

    public void SearchSwitcherPresenter$d(SearchSwitcherPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherPresenter$d.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME){
          SearchSwitcherPresenter.R8(this.b).k(3);
       }else if(p0 == FragmentEvent.PAUSE){
          SearchSwitcherPresenter.R8(this.b).e();
       }
       return;
    }
}
