package com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class PostRelayActivity$c implements g	// class@0011a3
{
    public final g b;

    public void PostRelayActivity$c(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostRelayActivity$c.class, "1")) {
       }else {
          PostUtils.D("PostRelayActivity", "postVideoRelayFromWorkspace error", p0);
          this.b.accept(null);
       }
       return;
    }
}
