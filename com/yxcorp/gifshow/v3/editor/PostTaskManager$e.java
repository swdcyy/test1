package com.yxcorp.gifshow.v3.editor.PostTaskManager$e;
import erd.a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PostTaskManager$e implements a	// class@000d9d
{
    public final PostTaskManager b;
    public final String c;
    public final PostTaskManager$a d;

    public void PostTaskManager$e(PostTaskManager p0,String p1,PostTaskManager$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PostTaskManager$e.class, "1")) {
          return;
       }
       PostTaskManager$e tc = this.c;
       a.o(tc, "keyNow");
       this.b.h(tc, this.d, true);
       return;
    }
}
