package com.kwai.plugin.dva.hook.component.activity.PluginActivityHelper;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.entity.Plugin;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.hook.component.PluginActivity;
import android.content.pm.PackageInfo;
import android.content.pm.ActivityInfo;
import android.view.Window;
import android.content.pm.ApplicationInfo;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.Iterator;
import java.util.List;
import com.kwai.plugin.dva.repository.model.ActivityInfo;

public final class PluginActivityHelper	// class@001331
{

    public void PluginActivityHelper(){
       super();
    }
    public static void injectIfNeededIn(Activity p0){
    }
    public static void injectIfNeededInPlugin(Activity p0){
       PluginActivityHelper pluginActivi = PluginActivityHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, pluginActivi, "3")) {
          return;
       }
       Plugin pluginByClas = Dva.instance().getPluginByClass(p0.getClass().getName());
       if (pluginByClas != null && pluginByClas.getClassLoader() == pluginActivi.getClassLoader()) {
          PluginActivityHelper.injectIfNeededIn(p0);
       }
       return;
    }
    public static final void onCreate(Activity p0){
       String obj;
       int i2;
       PluginActivityHelper pluginActivi = PluginActivityHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, pluginActivi, "1")) {
          return;
       }
       if (p0 instanceof PluginActivity) {
          PluginActivity pluginActivi1 = p0;
          Plugin plugin = pluginActivi1.getPlugin();
          String name = pluginActivi1.getClass().getName();
          if (plugin.getPackageInfo().activities != null) {
             PackageInfo activities = plugin.getPackageInfo().activities;
             int len = activities.length;
             int i = 0;
             int i1 = 0;
             while (i1 < len) {
                object oobject = activities[i1];
                if ((oobject.name).equals(name)) {
                   pluginActivi1.setRequestedOrientation(oobject.screenOrientation);
                   pluginActivi1.getWindow().setSoftInputMode(oobject.softInputMode);
                   int themeResourc = oobject.getThemeResource();
                   ApplicationInfo theme = plugin.getPackageInfo().applicationInfo.theme;
                   if (PatchProxy.isSupport(pluginActivi)) {
                      obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(themeResourc), Integer.valueOf(theme), plugin, null, PluginActivityHelper.class, "2");
                      if (obj != PatchProxyResult.class) {
                         i2 = obj.intValue();
                      label_0108 :
                         if (i2 > 0) {
                            pluginActivi1.setTheme(i2);
                            break ;
                         }
                      }
                   }
                   obj = p0.getClass().getName();
                   if (theme > null) {
                      d.a("create activity "+obj+": try use application theme "+theme);
                      i = theme;
                   }
                   if (themeResourc > 0) {
                      d.a("create activity "+obj+": try use activity theme "+themeResourc);
                   }else {
                      themeResourc = i;
                   }
                   if (themeResourc <= null) {
                      Iterator iterator = plugin.getPluginInfo().activities.iterator();
                      while (iterator.hasNext()) {
                         ActivityInfo uActivityInf = iterator.next();
                         if ((p0.getClass().getName()).equals(uActivityInf.name)) {
                            d.a("create activity "+obj+": try use readed activity theme "+uActivityInf.theme);
                            themeResourc = uActivityInf.theme;
                         }else {
                            continue ;
                         }
                      }
                   }
                   i2 = themeResourc;
                   goto label_0108 ;
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
}
