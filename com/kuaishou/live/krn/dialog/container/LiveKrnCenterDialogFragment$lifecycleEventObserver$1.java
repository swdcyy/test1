package com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$lifecycleEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;

public final class LiveKrnCenterDialogFragment$lifecycleEventObserver$1 implements LifecycleEventObserver	// class@001d51
{
    public final LiveKrnCenterDialogFragment b;

    public void LiveKrnCenterDialogFragment$lifecycleEventObserver$1(LiveKrnCenterDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveKrnCenterDialogFragment$lifecycleEventObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_RESUME) {
          b.Z(LiveLogTag.LIVE_KRN_DIALOG, "KrnFragment ON_RESUME");
          LiveKrnCenterDialogFragment$lifecycleEventObserver$1 tb = this.b;
          LiveKrnCenterDialogFragment t = tb.t;
          if (t != null) {
             tb.z = new LiveKrnCenterDialogFragment$lifecycleEventObserver$1$a(t);
          }
       }else if(p1 == Lifecycle$Event.ON_PAUSE){
          b.Z(LiveLogTag.LIVE_KRN_DIALOG, "KrnFragment ON_PAUSE");
          p0.z = null;
       }
       return;
    }
}
