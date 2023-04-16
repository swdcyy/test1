package com.yxcorp.gifshow.message.krn.KSIMBridge$h;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qdb.a;

public final class KSIMBridge$h implements g	// class@001d76
{
    public final Promise b;

    public void KSIMBridge$h(Promise p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSIMBridge$h.class, "1")) {
       }else {
          a.a(p0, this.b);
       }
       return;
    }
}
