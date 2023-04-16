package com.kuaishou.raven.SignalingChannelNativeBridge$a;
import com.kuaishou.raven.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.raven.SignalingChannelNativeBridge;

public class SignalingChannelNativeBridge$a implements c$a	// class@000e92
{

    public void SignalingChannelNativeBridge$a(){
       super();
    }
    public void a(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SignalingChannelNativeBridge$a.class, "1")) {
          return;
       }
       SignalingChannelNativeBridge.nativeOnSignalMessage(p0);
       return;
    }
}
