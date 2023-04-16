package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$b;
import erd.g;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public final class LiveLiteDisplayAuthorStateManager$b implements g	// class@0007f9
{
    public final LiveLiteDisplayAuthorStateManager b;

    public void LiveLiteDisplayAuthorStateManager$b(LiveLiteDisplayAuthorStateManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteDisplayAuthorStateManager$b.class, "1")) {
       }else {
          p0.c = SystemClock.elapsedRealtime();
       }
       return;
    }
}
