package com.yxcorp.gifshow.v3.editor.PostTaskManager$g;
import erd.g;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PostTaskManager$g implements g	// class@000d9f
{
    public final PostTaskManager b;
    public final String c;
    public final PostTaskManager$a d;

    public void PostTaskManager$g(PostTaskManager p0,String p1,PostTaskManager$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTaskManager$g.class, "1")) {
       }else {
          PostTaskManager$g tc = this.c;
          a.o(tc, "keyNow");
          this.b.h(tc, this.d, false);
          this.b.f.accept(p0);
       }
       return;
    }
}
