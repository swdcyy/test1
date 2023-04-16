package com.kwai.video.westeros.aiedit.AIEditSoLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.Throwable;

public class AIEditSoLoader	// class@000e73
{

    public void AIEditSoLoader(){
       super();
    }
    public static void loadNative(){
       if (PatchProxy.applyVoid(null, null, AIEditSoLoader.class, "1")) {
          return;
       }
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("tensorflow-lite");
       WesterosSoLoader.loadLibrary("ykit");
       WesterosSoLoader.loadLibrary("ykit_module");
       WesterosSoLoader.loadLibrary("ykit_module_plugin");
       return;
    }
}
