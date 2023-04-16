package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$b;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$a;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import com.kwai.logger.KwaiLog;

public final class SettingPluginHelper$b implements SettingPluginHelper$a	// class@000fdd
{
    public final a a;

    public void SettingPluginHelper$b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void success(){
       if (PatchProxy.applyVoid(null, this, SettingPluginHelper$b.class, "1")) {
          return;
       }
       try{
          this.a.invoke();
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          KwaiLog.g("setting_plugin", "setting_plugin_log", e0.getLocalizedMessage(), objArray);
       }
       return;
    }
}
