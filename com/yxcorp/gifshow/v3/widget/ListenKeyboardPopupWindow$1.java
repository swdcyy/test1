package com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcorp.gifshow.v3.widget.ListenKeyboardPopupWindow;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ListenKeyboardPopupWindow$1 implements LifecycleEventObserver	// class@00164f
{
    public final ListenKeyboardPopupWindow b;

    public void ListenKeyboardPopupWindow$1(ListenKeyboardPopupWindow p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ListenKeyboardPopupWindow$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.dismiss();
       }
       return;
    }
}
