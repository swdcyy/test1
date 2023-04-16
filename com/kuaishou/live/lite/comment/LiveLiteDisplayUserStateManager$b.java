package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$b;
import erd.g;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public final class LiveLiteDisplayUserStateManager$b implements g	// class@0007ef
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$b(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayUserStateManager$b.class, "1")) {
       }else {
          p0.b = SystemClock.elapsedRealtime();
       }
       return;
    }
}
