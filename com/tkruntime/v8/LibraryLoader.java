package com.tkruntime.v8.LibraryLoader;
import java.lang.String;
import com.tkruntime.v8.LibraryLoader$1;
import java.lang.Object;
import com.tkruntime.v8.NativeLibraryLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class LibraryLoader	// class@000fa0
{
    public static final String[] sAndroidNativeLibraries;
    public static final NativeLibraryLoader sAndroidNativeLibraryLoader;
    public static final String[] sAndroidNativeLiteLibraries;

    static {
       String[] stringArray = new String[]{"kwai-v8","kwai-j2v8"};
       LibraryLoader.sAndroidNativeLibraries = stringArray;
       stringArray = new String[]{"kwai-v8-lite","kwai-j2v8-lite"};
       LibraryLoader.sAndroidNativeLiteLibraries = stringArray;
       LibraryLoader.sAndroidNativeLibraryLoader = new LibraryLoader$1();
    }
    public void LibraryLoader(){
       super();
    }
    public static void loadAndroidLibraries(NativeLibraryLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LibraryLoader.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.loadLibraries();
       }else {
          LibraryLoader.sAndroidNativeLibraryLoader.loadLibraries();
       }
       return;
    }
    public static void loadLibrary(String p0,NativeLibraryLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LibraryLoader.class, "2")) {
          return;
       }
       LibraryLoader.loadAndroidLibraries(p1);
       return;
    }
}
