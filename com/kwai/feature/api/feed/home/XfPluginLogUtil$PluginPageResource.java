package com.kwai.feature.api.feed.home.XfPluginLogUtil$PluginPageResource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class XfPluginLogUtil$PluginPageResource extends Enum	// class@000ee8
{
    public static final XfPluginLogUtil$PluginPageResource[] $VALUES;
    public static final XfPluginLogUtil$PluginPageResource CORONA;
    public static final XfPluginLogUtil$PluginPageResource DETAIL;
    public static final XfPluginLogUtil$PluginPageResource LIVE;
    public static final XfPluginLogUtil$PluginPageResource VOICE_BARRAGE;

    static {
       XfPluginLogUtil$PluginPageResource pluginPageRe = new XfPluginLogUtil$PluginPageResource("LIVE", 0);
       XfPluginLogUtil$PluginPageResource.LIVE = pluginPageRe;
       XfPluginLogUtil$PluginPageResource pluginPageRe1 = new XfPluginLogUtil$PluginPageResource("DETAIL", 1);
       XfPluginLogUtil$PluginPageResource.DETAIL = pluginPageRe1;
       XfPluginLogUtil$PluginPageResource pluginPageRe2 = new XfPluginLogUtil$PluginPageResource("CORONA", 2);
       XfPluginLogUtil$PluginPageResource.CORONA = pluginPageRe2;
       XfPluginLogUtil$PluginPageResource pluginPageRe3 = new XfPluginLogUtil$PluginPageResource("VOICE_BARRAGE", 3);
       XfPluginLogUtil$PluginPageResource.VOICE_BARRAGE = pluginPageRe3;
       XfPluginLogUtil$PluginPageResource[] pluginPageRe4 = new XfPluginLogUtil$PluginPageResource[]{pluginPageRe,pluginPageRe1,pluginPageRe2,pluginPageRe3};
       XfPluginLogUtil$PluginPageResource.$VALUES = pluginPageRe4;
    }
    public void XfPluginLogUtil$PluginPageResource(String p0,int p1){
       super(p0, p1);
    }
    public static XfPluginLogUtil$PluginPageResource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, XfPluginLogUtil$PluginPageResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(XfPluginLogUtil$PluginPageResource.class, p0);
    }
    public static XfPluginLogUtil$PluginPageResource[] values(){
       Object obj = PatchProxy.apply(null, null, XfPluginLogUtil$PluginPageResource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return XfPluginLogUtil$PluginPageResource.$VALUES.clone();
    }
}
