package com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$d;
import erd.g;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity;
import wsc.g;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;

public final class PostRelayActivity$d implements g	// class@0011a4
{
    public final PostRelayActivity b;
    public final g c;
    public final Bundle d;

    public void PostRelayActivity$d(PostRelayActivity p0,g p1,Bundle p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostRelayActivity$d.class, "1")) {
       }else {
          this.c.c(this.b, this.d, p0);
       }
       return;
    }
}
