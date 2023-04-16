package com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import msd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion$a;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import androidx.fragment.app.FragmentActivity;
import android.content.ContextWrapper;
import com.kwai.dva.design.PluginInstallerUIHandler;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import com.kwai.feature.api.feed.tag.plugin.b;
import jp5.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import com.kwai.plugin.dva.work.c;
import com.kwai.feature.api.feed.tag.plugin.a;
import com.kwai.plugin.dva.work.c$c;
import android.content.Intent;
import com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion$gotoTagPageByScheme$1;

public final class TagPluginHelper$Companion	// class@000f70
{

    public void TagPluginHelper$Companion(){
       super();
    }
    public void TagPluginHelper$Companion(u p0){
       super();
    }
    public final void a(Context p0,a p1){
       boolean b;
       boolean b1;
       Dva uDva1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TagPluginHelper$Companion.class, "11")) {
          return;
       }
       Object[] objArray = null;
       TagPluginHelper$Companion$a obj = PatchProxy.apply(objArray, this, TagPluginHelper$Companion.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(g.e("tag_plugin") || Dva.instance().isLoaded("tag_plugin")){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p1.invoke();
       }else {
          obj = new TagPluginHelper$Companion$a(p1);
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, TagPluginHelper$Companion.class, "3")) {
             PluginDownloadExtension.k.a("tag_plugin");
             p1 = PatchProxy.apply(objArray, this, TagPluginHelper$Companion.class, "2");
             if (p1 != patchProxyRe) {
                b1 = p1.booleanValue();
             }else {
                uDva1 = Dva.instance();
                a.o(uDva1, "Dva.instance\(\)");
                b1 = uDva1.getPluginInstallManager().g("tag_plugin");
             }
             Object obj1 = PatchProxy.applyOneRefs(p0, this, TagPluginHelper$Companion.class, "12");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
                while (p0 instanceof ContextWrapper) {
                   if (p0 instanceof FragmentActivity) {
                      objArray = p0;
                      break ;
                   }
                   p0 = p0.getBaseContext();
                   a.o(p0, "context.baseContext");
                }
             }
             if (b1 || !objArray instanceof FragmentActivity) {
                if (!PatchProxy.applyVoidOneRefs(obj, this, TagPluginHelper$Companion.class, "4")) {
                   Dva uDva = Dva.instance();
                   a.o(uDva, "Dva.instance\(\)");
                   uDva.getPluginInstallManager().j("tag_plugin").a(new a(obj));
                }
             }else {
                uDva1 = Dva.instance();
                a.o(uDva1, "Dva.instance\(\)");
                b pluginInstal = uDva1.getPluginInstallManager();
                a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
                h.a(pluginInstal, "tag_plugin", PluginInstallerUIHandler.s.b(objArray).d(new b(obj)));
             }
          }
       }
       return;
    }
    public final void b(Context p0,Intent p1){
       a.p(p0, "context");
       a.p(p1, "intent");
    }
}
