package com.kwai.chat.kwailink.adapter.n;
import com.kwai.chat.kwailink.adapter.p$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.g;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public class n implements p$b	// class@000a11
{
    public final String a;

    public void n(String p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       p0.R0(this.a);
       a.e("CallbackUtils", "callbackPushTokenReady by aidl, pushToken="+this.a+", callback="+p0);
       return;
    }
}
