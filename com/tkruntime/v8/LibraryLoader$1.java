package com.tkruntime.v8.LibraryLoader$1;
import com.tkruntime.v8.NativeLibraryLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.LibraryLoader;
import java.lang.System;

public final class LibraryLoader$1 implements NativeLibraryLoader	// class@000f9f
{

    public void LibraryLoader$1(){
       super();
    }
    public void loadLibraries(){
       if (PatchProxy.applyVoid(null, this, LibraryLoader$1.class, "2")) {
          return;
       }
       this.loadLibraries(LibraryLoader.sAndroidNativeLibraries);
       return;
    }
    public final void loadLibraries(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryLoader$1.class, "1")) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          System.loadLibrary(p0[i]);
       }
       return;
    }
}
