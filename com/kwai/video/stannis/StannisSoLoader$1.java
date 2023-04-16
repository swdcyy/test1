package com.kwai.video.stannis.StannisSoLoader$1;
import com.kwai.video.stannis.StannisSoLoader$SoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public final class StannisSoLoader$1 implements StannisSoLoader$SoLoader	// class@000bf2
{

    public void StannisSoLoader$1(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisSoLoader$1.class, "1")) {
          return;
       }
       System.loadLibrary(p0);
       return;
    }
}
