package com.kuaishou.raven.SignalingChannelNativeBridge;
import com.kuaishou.raven.SignalingChannelNativeBridge$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.raven.c;
import com.kuaishou.raven.c$a;
import es4.c;
import java.lang.Runnable;
import t45.c;

public class SignalingChannelNativeBridge	// class@000e93
{
    public static final String TAG = "Raven::SignalingChannel";
    public static c sChannel;
    public static SignalingChannelNativeBridge$a sDelegate;

    static {
       SignalingChannelNativeBridge.sDelegate = new SignalingChannelNativeBridge$a();
    }
    public void SignalingChannelNativeBridge(){
       super();
    }
    public static String GetSelfDescriptor(){
       c obj = PatchProxy.apply(null, null, SignalingChannelNativeBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SignalingChannelNativeBridge.sChannel;
       if (obj == null) {
          return "";
       }
       try{
          return obj.b();
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public static void Initialize(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SignalingChannelNativeBridge.class, "1")) {
          return;
       }
       SignalingChannelNativeBridge.sChannel = p0;
       p0.a(SignalingChannelNativeBridge.sDelegate);
       SignalingChannelNativeBridge.nativeSetInitialized();
       return;
    }
    public static void Send(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, SignalingChannelNativeBridge.class, "2")) {
          return;
       }
       c.a(new c(p0, p1));
       return;
    }
    public static void lambda$Send$0(String p0,byte[] p1){
       c sChannel = SignalingChannelNativeBridge.sChannel;
       if (sChannel == null) {
          return;
       }
       try{
          sChannel.c(p0, p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static native void nativeOnSignalMessage(byte[] p0);
    public static native void nativeSetInitialized();
}
