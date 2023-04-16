package com.kwai.chat.kwailink.adapter.o;
import com.kwai.chat.kwailink.adapter.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.g;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public class o implements p$b	// class@000a12
{
    public final long a;

    public void o(long p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       p0.A0(this.a);
       a.e("CallbackUtils", "callbackUpdateTimeOffset by aidl, offset="+this.a+", callback="+p0);
       return;
    }
}
