package com.yxcorp.gifshow.detail.player.panel.config.SmallWindowElementConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SmallWindowElementConfig	// class@001622
{
    public final boolean enable;

    public void SmallWindowElementConfig(boolean p0){
       super();
       this.enable = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SmallWindowElementConfig && this.enable == p0.enable)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SmallWindowElementConfig tenable = this.enable;
       if (tenable != null) {
          tenable = 1;
       }
       return tenable;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SmallWindowElementConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SmallWindowElementConfig\(enable="+this.enable+"\)";
    }
}
