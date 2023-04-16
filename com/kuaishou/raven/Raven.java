package com.kuaishou.raven.Raven;
import java.lang.Object;
import com.kuaishou.raven.Raven$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.aegon.Aegon;
import com.kuaishou.live.playeradapter.dns.b;
import java.lang.ClassLoader;
import java.lang.RuntimeException;

public class Raven	// class@000e8e
{

    public void Raven(){
       super();
    }
    public static void a(Raven$a p0){
       Raven raven = Raven.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, raven, "1")) {
          return;
       }
       if (!Aegon.f()) {
          throw new RuntimeException("Raven must be initialized after aegon");
       }
       p0.loadLibrary("raven");
       Raven.nativeInitReplacementClassLoader(raven.getClassLoader());
       return;
    }
    public static native void nativeInitReplacementClassLoader(ClassLoader p0);
    public static native void nativeSetDebug(boolean p0);
    public static native void nativeSetLoggingCallback(long p0,boolean p1);
}
