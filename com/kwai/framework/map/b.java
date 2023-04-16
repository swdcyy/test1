package com.kwai.framework.map.b;
import java.lang.Object;
import android.content.Context;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yz6.u;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import g07.a;
import com.kwai.library.widget.map.a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import yz6.t;
import erd.o;
import com.kwai.framework.map.a;

public class b	// class@001683
{

    public void b(){
       super();
    }
    public static t a(Context p0){
       t ot;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!u.c()) {
          PluginDownloadExtension.k.s("map_sdk_plugin", 40);
       }
       if (u.c()) {
          ot = (u.d())? t.just(Boolean.TRUE): d.a(-115370941).Xl(p0);
       }else {
          ot = t.fromCallable(a.b).subscribeOn(d.c).observeOn(d.a).flatMap(new t(p0));
       }
       return ot.flatMap(a.b);
    }
}
