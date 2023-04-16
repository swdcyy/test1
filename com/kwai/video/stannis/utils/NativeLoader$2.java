package com.kwai.video.stannis.utils.NativeLoader$2;
import wt6.b$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.StannisSoLoader;

public final class NativeLoader$2 implements b$b	// class@000c7d
{

    public void NativeLoader$2(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NativeLoader$2.class, "1")) {
          return;
       }
       StannisSoLoader.loadSoLibrary(p0);
       return;
    }
}
