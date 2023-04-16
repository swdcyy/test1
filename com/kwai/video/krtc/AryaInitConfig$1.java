package com.kwai.video.krtc.AryaInitConfig$1;
import com.kwai.video.stannis.StannisSoLoader$SoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaInitConfig;
import com.kwai.video.krtc.AryaInitConfig$AryaSoLoader;

public final class AryaInitConfig$1 implements StannisSoLoader$SoLoader	// class@000732
{

    public void AryaInitConfig$1(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitConfig$1.class, "1")) {
          return;
       }
       AryaInitConfig.sLoader.loadLibrary(p0);
       return;
    }
}
