package com.kwai.plugin.dva.install.remote.PluginInstallService;
import android.app.Service;
import com.kwai.plugin.dva.install.remote.PluginInstallService$a;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import jj7.e;

public class PluginInstallService extends Service	// class@001367
{
    public e b;
    public a$a c;

    public void PluginInstallService(){
       super();
       this.c = new PluginInstallService$a(this);
    }
    public IBinder onBind(Intent p0){
       return this.c;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, PluginInstallService.class, "1")) {
          return;
       }
       super.onCreate();
       this.b = e.a(this);
       return;
    }
}
