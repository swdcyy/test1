package com.kwai.platform.krouter.meta.KRouterMetaConfig$tube_plugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh7.d;
import java.util.ArrayList;
import java.util.List;
import rh7.a;
import wh7.c;

public class KRouterMetaConfig$tube_plugin	// class@0012ca
{

    public void KRouterMetaConfig$tube_plugin(){
       super();
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, KRouterMetaConfig$tube_plugin.class, "1")) {
          return;
       }
       d uod = new d("tube/.*", "com.yxcorp.gifshow.tube.TubeRouterActivity", new ArrayList(), null, "tube_plugin");
       c.d(v0);
       return;
    }
}
