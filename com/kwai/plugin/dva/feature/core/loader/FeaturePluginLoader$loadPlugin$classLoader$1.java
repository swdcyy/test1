package com.kwai.plugin.dva.feature.core.loader.FeaturePluginLoader$loadPlugin$classLoader$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.loader.FeaturePluginLoader;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.lang.ClassLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class FeaturePluginLoader$loadPlugin$classLoader$1 extends Lambda implements a	// class@00130d
{
    public final PluginConfig $config;
    public final PluginInfo $pluginInfo;
    public final FeatureInfo $splitInfo;
    public final FeaturePluginLoader this$0;

    public void FeaturePluginLoader$loadPlugin$classLoader$1(FeaturePluginLoader p0,FeatureInfo p1,PluginInfo p2,PluginConfig p3){
       this.this$0 = p0;
       this.$splitInfo = p1;
       this.$pluginInfo = p2;
       this.$config = p3;
       super(0);
    }
    public final ClassLoader invoke(){
       String str;
       PluginInfo obj = PatchProxy.apply(null, this, FeaturePluginLoader$loadPlugin$classLoader$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FeaturePluginLoader$loadPlugin$classLoader$1 tthis$0 = this.this$0;
       String splitName = this.$splitInfo.getSplitName();
       PluginInfo apkPath = this.$pluginInfo.apkPath;
       a.o(apkPath, "pluginInfo.apkPath");
       obj = this.$pluginInfo.odexPath;
       if (obj == null) {
          str = "";
       }
       File uFile = new File(str);
       File uFile1 = new File(this.$pluginInfo.soDir);
       PluginConfig depends = this.$config.depends;
       if (depends == null) {
          depends = CollectionsKt__CollectionsKt.E();
       }
       return tthis$0.d(splitName, apkPath, uFile, uFile1, depends);
    }
    public Object invoke(){
       return this.invoke();
    }
}
