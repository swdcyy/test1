package com.kwai.feature.api.danmaku.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.kwai.feature.api.feed.home.XfPluginLogUtil$PluginPageResource;
import com.kwai.feature.api.feed.home.XfPluginLogUtil;

public final class b implements g	// class@000e73
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       XfPluginLogUtil.a("danmaku_plugin", p0.toString(), XfPluginLogUtil$PluginPageResource.DETAIL);
    }
}
