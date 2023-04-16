package com.kwai.framework.plugin.repository.DefaultPluginSource$pluginDatabase$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.plugin.repository.DefaultPluginSource;
import com.kwai.framework.plugin.repository.persistence.PluginDatabase;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ae6.f;

public final class DefaultPluginSource$pluginDatabase$2 extends Lambda implements a	// class@000cb9
{
    public final DefaultPluginSource this$0;

    public void DefaultPluginSource$pluginDatabase$2(DefaultPluginSource p0){
       this.this$0 = p0;
       super(0);
    }
    public final PluginDatabase invoke(){
       Object obj = PatchProxy.apply(null, this, DefaultPluginSource$pluginDatabase$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.d.getValue();
    }
    public Object invoke(){
       return this.invoke();
    }
}
