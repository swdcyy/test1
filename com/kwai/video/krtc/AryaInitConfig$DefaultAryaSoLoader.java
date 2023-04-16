package com.kwai.video.krtc.AryaInitConfig$DefaultAryaSoLoader;
import com.kwai.video.krtc.AryaInitConfig$AryaSoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public class AryaInitConfig$DefaultAryaSoLoader implements AryaInitConfig$AryaSoLoader	// class@000734
{

    public void AryaInitConfig$DefaultAryaSoLoader(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaInitConfig$DefaultAryaSoLoader.class, "1")) {
          return;
       }
       System.loadLibrary(p0);
       return;
    }
}
