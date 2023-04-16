package com.yxcorp.gifshow.detail.player.panel.config.SaveTrafficElementConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SaveTrafficElementConfig	// class@00161e
{
    public final boolean enable;
    public final int toastFrequencyMode;

    public final boolean a(){
       return this.enable;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SaveTrafficElementConfig && (this.enable == p0.enable && this.toastFrequencyMode == p0.toastFrequencyMode))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       SaveTrafficElementConfig obj = PatchProxy.apply(null, this, SaveTrafficElementConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       return ((i * 31) + this.toastFrequencyMode);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SaveTrafficElementConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SaveTrafficElementConfig\(enable="+this.enable+", toastFrequencyMode="+this.toastFrequencyMode+"\)";
    }
}
