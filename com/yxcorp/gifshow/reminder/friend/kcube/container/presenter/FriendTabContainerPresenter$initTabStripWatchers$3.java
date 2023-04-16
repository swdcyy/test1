package com.yxcorp.gifshow.reminder.friend.kcube.container.presenter.FriendTabContainerPresenter$initTabStripWatchers$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import kotlin.jvm.internal.CallableReference;
import android.widget.RelativeLayout;

public final class FriendTabContainerPresenter$initTabStripWatchers$3 extends FunctionReferenceImpl implements l	// class@001ab4
{

    public void FriendTabContainerPresenter$initTabStripWatchers$3(KwaiActionBar p0){
       super(1, p0, KwaiActionBar.class, "setTranslationY", "setTranslationY\(F\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(FriendTabContainerPresenter$initTabStripWatchers$3.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FriendTabContainerPresenter$initTabStripWatchers$3.class, "1")) {
          return;
       }
       this.receiver.setTranslationY(p0);
       return;
    }
}
