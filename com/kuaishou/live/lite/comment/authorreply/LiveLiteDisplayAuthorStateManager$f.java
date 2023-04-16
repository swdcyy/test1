package com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager$f;
import erd.a;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteDisplayAuthorStateManager$f implements a	// class@0007fd
{
    public final LiveLiteDisplayAuthorStateManager b;
    public final a c;

    public void LiveLiteDisplayAuthorStateManager$f(LiveLiteDisplayAuthorStateManager p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteDisplayAuthorStateManager$f.class, "1")) {
          return;
       }
       LiveLiteDisplayAuthorStateManager$f tc = this.c;
       if (tc != null) {
          tc.accept(this.b.d);
       }
       return;
    }
}
