package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$lifecycleEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment;
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
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;

public final class LiveKrnBottomDialogFragment$lifecycleEventObserver$1 implements LifecycleEventObserver	// class@001d4a
{
    public final LiveKrnBottomDialogFragment b;

    public void LiveKrnBottomDialogFragment$lifecycleEventObserver$1(LiveKrnBottomDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveKrnBottomDialogFragment$lifecycleEventObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_RESUME) {
          b.Z(LiveLogTag.LIVE_KRN_DIALOG, "KrnFragment ON_RESUME");
          LiveKrnBottomDialogFragment$lifecycleEventObserver$1 tb = this.b;
          LiveKrnBottomDialogFragment f = tb.F;
          if (f != null) {
             tb.Ch(new LiveKrnBottomDialogFragment$lifecycleEventObserver$1$a(f));
          }
       }else if(p1 == Lifecycle$Event.ON_PAUSE){
          b.Z(LiveLogTag.LIVE_KRN_DIALOG, "KrnFragment ON_PAUSE");
          this.b.Ch(null);
       }
       return;
    }
}
