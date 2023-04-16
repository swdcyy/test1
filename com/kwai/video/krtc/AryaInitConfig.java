package com.kwai.video.krtc.AryaInitConfig;
import com.kwai.video.krtc.AryaInitConfig$DefaultAryaSoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaInitConfig$AryaSoLoader;
import com.kwai.video.krtc.AryaInitConfig$1;
import com.kwai.video.stannis.StannisSoLoader$SoLoader;
import com.kwai.video.stannis.StannisSoLoader;

public class AryaInitConfig	// class@000735
{
    public static AryaInitConfig$AryaSoLoader sLoader;

    static {
       AryaInitConfig.sLoader = new AryaInitConfig$DefaultAryaSoLoader();
    }
    public void AryaInitConfig(){
       super();
    }
    public static void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AryaInitConfig.class, "2")) {
          return;
       }
       AryaInitConfig.sLoader.loadLibrary(p0);
       return;
    }
    public static void setSoLoader(AryaInitConfig$AryaSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AryaInitConfig.class, "1")) {
          return;
       }
       if (p0 != null) {
          AryaInitConfig.sLoader = p0;
          StannisSoLoader.setSoLoader(new AryaInitConfig$1());
       }
       return;
    }
}
