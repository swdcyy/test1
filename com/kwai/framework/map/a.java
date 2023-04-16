package com.kwai.framework.map.a;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.lang.String;
import brd.t;

public final class a implements o	// class@001682
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.booleanValue()) {
          PluginDownloadExtension.k.a("map_sdk_plugin");
       }
       return t.just(p0);
    }
}
