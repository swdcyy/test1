package com.kwai.feature.api.feed.home.XfPluginLogUtil;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.feed.home.XfPluginLogUtil$PluginPageResource;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Enum;
import hn5.i0;

public class XfPluginLogUtil	// class@000ee9
{
    public static String a = "xf_plugin_install_fail_log";

    public void XfPluginLogUtil(){
       super();
    }
    public static void a(String p0,String p1,XfPluginLogUtil$PluginPageResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, XfPluginLogUtil.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("pluginName", p0);
       oi3.a("isNebula", Boolean.FALSE);
       oi3.d("failReason", "Plugin installation failed reason£º"+p1);
       oi3.d("pageSource", p2.toString());
       i0.a(XfPluginLogUtil.a, oi3.e());
       return;
    }
}
