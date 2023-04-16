package com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.ListenKeyboardPopupWindow;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ListenKeyboardPopupWindow$1 implements LifecycleEventObserver	// class@000795
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
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.dismiss();
       }
       return;
    }
}
