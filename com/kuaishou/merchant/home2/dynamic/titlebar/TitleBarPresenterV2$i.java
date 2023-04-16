package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$i;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public final class TitleBarPresenterV2$i implements g	// class@001778
{
    public final TitleBarPresenterV2 b;

    public void TitleBarPresenterV2$i(TitleBarPresenterV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenterV2$i.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME){
          TitleBarPresenterV2.S8(this.b).k(3);
       }else if(p0 == FragmentEvent.PAUSE){
          TitleBarPresenterV2.S8(this.b).e();
       }
       return;
    }
}
