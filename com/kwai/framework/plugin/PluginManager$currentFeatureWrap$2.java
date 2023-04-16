package com.kwai.framework.plugin.PluginManager$currentFeatureWrap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import od6.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.PluginManager;
import rd6.d;

public final class PluginManager$currentFeatureWrap$2 extends Lambda implements a	// class@000c63
{
    public static final PluginManager$currentFeatureWrap$2 INSTANCE;

    static {
       PluginManager$currentFeatureWrap$2.INSTANCE = new PluginManager$currentFeatureWrap$2();
    }
    public void PluginManager$currentFeatureWrap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final k invoke(){
       Object obj = PatchProxy.apply(null, this, PluginManager$currentFeatureWrap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginManager.H.t().g();
    }
}
