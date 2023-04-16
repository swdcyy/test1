package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicNetworkBridgeRequestData;
import java.io.Serializable;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MagicNetworkBridgeRequestData implements Serializable	// class@000e2d
{
    public final Map params;
    public final String path;

    public void MagicNetworkBridgeRequestData(String p0,Map p1){
       super();
       this.path = p0;
       this.params = p1;
    }
    public static MagicNetworkBridgeRequestData copy$default(MagicNetworkBridgeRequestData p0,String p1,Map p2,int p3,Object p4){
       MagicNetworkBridgeRequestData path;
       MagicNetworkBridgeRequestData params;
       if (p3 & 0x01) {
          path = p0.path;
       }
       if (p3 & 0x02) {
          params = p0.params;
       }
       return p0.copy(path, params);
    }
    public final String component1(){
       return this.path;
    }
    public final Map component2(){
       return this.params;
    }
    public final MagicNetworkBridgeRequestData copy(String p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MagicNetworkBridgeRequestData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicNetworkBridgeRequestData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicNetworkBridgeRequestData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicNetworkBridgeRequestData && (a.g(this.path, p0.path) && a.g(this.params, p0.params)))) {
          return true;
       }
       return false;
    }
    public final Map getParams(){
       return this.params;
    }
    public final String getPath(){
       return this.path;
    }
    public int hashCode(){
       MagicNetworkBridgeRequestData obj = PatchProxy.apply(null, this, MagicNetworkBridgeRequestData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.path;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MagicNetworkBridgeRequestData tparams = this.params;
       if (tparams != null) {
          i = tparams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicNetworkBridgeRequestData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicNetworkBridgeRequestData\(path="+this.path+", params="+this.params+"\)";
    }
}
