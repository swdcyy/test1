package com.yxcorp.gifshow.v3.editor.relay.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wsc.b0;

public final class c implements Runnable	// class@0011aa
{
    public final PostRelayActivity$e b;
    public final c c;

    public void c(PostRelayActivity$e p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       b0.b.g(this.c, tb.c, tb.f, tb.d, tb.g);
       return;
    }
}
