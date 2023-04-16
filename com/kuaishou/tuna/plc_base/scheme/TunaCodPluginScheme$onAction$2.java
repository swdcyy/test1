package com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$2;
import nmc.b$a;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme;
import android.app.Activity;
import java.util.Map;
import nmc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$2$onFail$1;
import msd.a;
import c15.b;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$2$onSuccess$1;
import android.net.Uri;
import agc.a;

public final class TunaCodPluginScheme$onAction$2 implements b$a	// class@001085
{
    public final TunaCodPluginScheme a;
    public final Activity b;
    public final Map c;
    public final b d;

    public void TunaCodPluginScheme$onAction$2(TunaCodPluginScheme p0,Activity p1,Map p2,b p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, TunaCodPluginScheme$onAction$2.class, "2")) {
          return;
       }
       b.d(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodPluginScheme"), TunaCodPluginScheme$onAction$2$onFail$1.INSTANCE);
       this.d.hc(this.b);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TunaCodPluginScheme$onAction$2.class, "1")) {
          return;
       }
       b.f(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodPluginScheme"), TunaCodPluginScheme$onAction$2$onSuccess$1.INSTANCE);
       a.c(this.b, TunaCodPluginScheme.e(this.a).toString(), this.c);
       return;
    }
}
