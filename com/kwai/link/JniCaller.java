package com.kwai.link.JniCaller;
import java.lang.Object;
import bv7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;

public class JniCaller	// class@000d14
{

    public void JniCaller(){
       super();
    }
    public static Object objectCall(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JniCaller.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.get();
       }catch(java.lang.UnsatisfiedLinkError e0){
          return p0.get();
       }
    }
    public static void voidCall(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, JniCaller.class, "2")) {
          return;
       }
       try{
          p0.run();
       }catch(java.lang.UnsatisfiedLinkError e0){
          p0.run();
       }
       return;
    }
}
