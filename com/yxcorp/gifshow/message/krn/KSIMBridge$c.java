package com.yxcorp.gifshow.message.krn.KSIMBridge$c;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qdb.a;

public final class KSIMBridge$c implements g	// class@001d6f
{
    public final Promise b;

    public void KSIMBridge$c(Promise p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSIMBridge$c.class, "1")) {
       }else {
          a.a(p0, this.b);
       }
       return;
    }
}
