package com.yxcorp.gifshow.v3.editor.relay.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class b implements g	// class@0011a9
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          PostUtils.D("PostRelayActivity", "saveVideoRelaySessionToServer error", p0);
       }
       return;
    }
}
