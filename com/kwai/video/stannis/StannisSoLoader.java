package com.kwai.video.stannis.StannisSoLoader;
import com.kwai.video.stannis.StannisSoLoader$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.StannisSoLoader$SoLoader;

public class StannisSoLoader	// class@000bf4
{
    public static StannisSoLoader$SoLoader mLoader;

    static {
       StannisSoLoader.mLoader = new StannisSoLoader$1();
    }
    public void StannisSoLoader(){
       super();
    }
    public static void loadSoLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, StannisSoLoader.class, "1")) {
          return;
       }
       StannisSoLoader.mLoader.loadLibrary(p0);
       return;
    }
    public static void setSoLoader(StannisSoLoader$SoLoader p0){
       if (p0 != null) {
          StannisSoLoader.mLoader = p0;
       }
       return;
    }
}
