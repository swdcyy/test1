package com.kwai.chat.kwailink.adapter.g;
import com.kwai.chat.kwailink.adapter.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.b;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public class g implements p$b	// class@000a0b
{
    public final int a;

    public void g(int p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       p0.A(this.a);
       a.e("CallbackUtils", "callbackAppIdUpdated by aidl, appid="+this.a+", callback="+p0);
       return;
    }
}
