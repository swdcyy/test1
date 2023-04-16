package com.kwai.chat.kwailink.adapter.h;
import com.kwai.chat.kwailink.adapter.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.b;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public class h implements p$b	// class@000a0c
{
    public final int a;
    public final int b;

    public void h(int p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       p0.C(this.a, this.b);
       a.e("CallbackUtils", "callbackConnectStateChanged by aidl, oldState="+this.a+", newState="+this.b+", callback="+p0);
       return;
    }
}
