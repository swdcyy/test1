package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$g;
import erd.g;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public final class TitleBarPresenter$g implements g	// class@0017e4
{
    public final TitleBarPresenter b;

    public void TitleBarPresenter$g(TitleBarPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenter$g.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME){
          TitleBarPresenter.S8(this.b).k(3);
       }else if(p0 == FragmentEvent.PAUSE){
          TitleBarPresenter.S8(this.b).e();
       }
       return;
    }
}
