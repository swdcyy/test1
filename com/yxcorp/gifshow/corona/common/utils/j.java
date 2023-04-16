package com.yxcorp.gifshow.corona.common.utils.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import jd6.g;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import crd.b;
import uq9.u;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ql5.c;
import q87.c;
import uq9.t;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;

public class j	// class@001278
{

    public void j(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Dva.instance().getPluginInstallManager().g("landscape");
    }
    public static boolean b(){
       String obj = PatchProxy.apply(null, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "landscape";
       if (!g.e(obj) || Dva.instance().isLoaded(obj)) {
          PluginDownloadExtension.k.a(obj);
       }
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public static b c(GifshowActivity p0,PluginInstallerUIHandler$d p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "landscape";
       if (!g.e(obj)) {
          PluginDownloadExtension.k.a(obj);
       }
       if (g.e(obj) || Dva.instance().isLoaded(obj)) {
          Object[] objArray = new Object[0];
          c.C().s("CoronaLandscapePluginHelper", "loadLandscapePluginAsync: is loaded", objArray);
          return t.just(Boolean.TRUE).subscribe(new t(p1));
       }else {
          return t.fromCallable(new u(p0, p1)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.e);
       }
    }
    public static c d(c$c p0){
       c obj = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Dva.instance().getPluginInstallManager().j("landscape");
       obj.a(p0);
       return obj;
    }
}
