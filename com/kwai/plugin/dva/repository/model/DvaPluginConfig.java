package com.kwai.plugin.dva.repository.model.DvaPluginConfig;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class DvaPluginConfig	// class@001379
{
    public ComponentInfo componentInfo;
    public final List depends;
    public final List hostInterfaces;
    public final List hostPackages;
    public final String minSupportVersion;
    public final String name;
    public final int pluginVersionCode;
    public final String pluginVersionName;
    public final String sdkVersion;

    public void DvaPluginConfig(String p0,String p1,String p2,String p3,int p4,List p5,List p6,List p7){
       super();
       this.name = p0;
       this.sdkVersion = p1;
       this.minSupportVersion = p2;
       this.pluginVersionName = p3;
       this.pluginVersionCode = p4;
       this.hostPackages = p5;
       this.hostInterfaces = p6;
       this.depends = p7;
    }
    public static DvaPluginConfig emptyConfig(String p0,int p1){
       Object obj;
       DvaPluginConfig uDvaPluginCo = DvaPluginConfig.class;
       if (PatchProxy.isSupport(uDvaPluginCo)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uDvaPluginCo, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DvaPluginConfig uDvaPluginCo1 = new DvaPluginConfig(p0, "", "", "", p1, null, null, null);
       return obj;
    }
}
