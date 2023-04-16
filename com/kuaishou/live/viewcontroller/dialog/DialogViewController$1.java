package com.kuaishou.live.viewcontroller.dialog.DialogViewController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Dialog;

public final class DialogViewController$1 implements LifecycleEventObserver	// class@000fed
{
    public final DialogViewController b;

    public void DialogViewController$1(DialogViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DialogViewController$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_CREATE) {
          DialogViewController$1 tb = this.b;
          DialogViewController j = tb.j;
          if (j == null) {
             a.S("dialog");
          }
          tb.X2(j);
       }
       return;
    }
}
