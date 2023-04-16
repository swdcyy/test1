package com.yxcorp.gifshow.detail.player.panel.config.SimplePlayerPanelElementConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SimplePlayerPanelElementConfig implements Serializable	// class@00161f
{
    public final boolean enable;

    public void SimplePlayerPanelElementConfig(boolean p0){
       super();
       this.enable = p0;
    }
    public static SimplePlayerPanelElementConfig copy$default(SimplePlayerPanelElementConfig p0,boolean p1,int p2,Object p3){
       SimplePlayerPanelElementConfig enable;
       if (p2 & 0x01) {
          enable = p0.enable;
       }
       return p0.copy(enable);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final SimplePlayerPanelElementConfig copy(boolean p0){
       if (PatchProxy.isSupport(SimplePlayerPanelElementConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, SimplePlayerPanelElementConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SimplePlayerPanelElementConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SimplePlayerPanelElementConfig && this.enable == p0.enable)) {
          return true;
       }
       return false;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public int hashCode(){
       SimplePlayerPanelElementConfig tenable = this.enable;
       if (tenable != null) {
          tenable = 1;
       }
       return tenable;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SimplePlayerPanelElementConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SimplePlayerPanelElementConfig\(enable="+this.enable+"\)";
    }
}
