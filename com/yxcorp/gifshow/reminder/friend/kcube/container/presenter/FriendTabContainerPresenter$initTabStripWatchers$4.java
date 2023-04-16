package com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerPresenter$initTabStripWatchers$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import kotlin.jvm.internal.CallableReference;

public final class FriendTabContainerPresenter$initTabStripWatchers$4 extends FunctionReferenceImpl implements l	// class@001ab5
{

    public void FriendTabContainerPresenter$initTabStripWatchers$4(SearchIconEntryView p0){
       super(1, p0, SearchIconEntryView.class, "setAlpha", "setAlpha\(F\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(FriendTabContainerPresenter$initTabStripWatchers$4.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FriendTabContainerPresenter$initTabStripWatchers$4.class, "1")) {
          return;
       }
       this.receiver.setAlpha(p0);
       return;
    }
}
