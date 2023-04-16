package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$f;
import erd.a;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteDisplayUserStateManager$f implements a	// class@0007f3
{
    public final LiveLiteDisplayUserStateManager b;
    public final a c;

    public void LiveLiteDisplayUserStateManager$f(LiveLiteDisplayUserStateManager p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteDisplayUserStateManager$f.class, "1")) {
          return;
       }
       LiveLiteDisplayUserStateManager$f tc = this.c;
       if (tc != null) {
          tc.accept(this.b.c);
       }
       return;
    }
}
