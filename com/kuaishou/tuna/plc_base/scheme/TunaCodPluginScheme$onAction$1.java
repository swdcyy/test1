package com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$onAction$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.net.Uri;

public final class TunaCodPluginScheme$onAction$1 extends Lambda implements a	// class@001082
{
    public final TunaCodPluginScheme this$0;

    public void TunaCodPluginScheme$onAction$1(TunaCodPluginScheme p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaCodPluginScheme$onAction$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "plc handle cod uri:"+TunaCodPluginScheme.e(this.this$0);
    }
}
