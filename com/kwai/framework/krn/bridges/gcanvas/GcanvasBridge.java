package com.kwai.framework.krn.bridges.gcanvas.GcanvasBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.framework.krn.bridges.gcanvas.GcanvasBridge$a;
import com.kwai.plugin.dva.work.c$c;

public class GcanvasBridge extends KrnBridge	// class@0015b1
{

    public void GcanvasBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "Gcanvas";
    }
    public void loadLibrary(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcanvasBridge.class, "1")) {
          return;
       }
       c uoc = Dva.instance().getPluginInstallManager().j("kds_gcanvas");
       uoc.a(new GcanvasBridge$a(this, uoc, p0));
       return;
    }
}
