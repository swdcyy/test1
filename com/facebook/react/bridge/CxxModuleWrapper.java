package com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.CxxModuleWrapperBase;
import com.facebook.jni.HybridData;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.soloader.SoLoader;
import java.io.File;

public class CxxModuleWrapper extends CxxModuleWrapperBase	// class@0011b7
{

    public void CxxModuleWrapper(HybridData p0){
       super(p0);
    }
    public static CxxModuleWrapper makeDso(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CxxModuleWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SoLoader.b(p0);
       return CxxModuleWrapper.makeDsoNative(SoLoader.unpackLibraryAndDependencies(p0).getAbsolutePath(), p1);
    }
    public static native CxxModuleWrapper makeDsoNative(String p0,String p1);
}
