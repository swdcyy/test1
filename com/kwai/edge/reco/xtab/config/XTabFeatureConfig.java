package com.kwai.edge.reco.xtab.config.XTabFeatureConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class XTabFeatureConfig	// class@000d60
{
    public int nDayXTabShow;

    public void XTabFeatureConfig(){
       super(0, 1, null);
    }
    public void XTabFeatureConfig(int p0){
       super();
       this.nDayXTabShow = p0;
    }
    public void XTabFeatureConfig(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 7;
       }
       super(p0);
       return;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof XTabFeatureConfig && this.nDayXTabShow == p0.nDayXTabShow)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, XTabFeatureConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nDayXTabShow;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, XTabFeatureConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "XTabFeatureConfig\(nDayXTabShow="+this.nDayXTabShow+"\)";
    }
}
