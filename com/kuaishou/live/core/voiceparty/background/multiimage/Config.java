package com.kuaishou.live.core.voiceparty.background.multiimage.Config;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Config	// class@00134b
{
    public final String _scaleType;

    public void Config(){
       super(null, 1, null);
    }
    public void Config(String p0){
       a.p(p0, "_scaleType");
       super();
       this._scaleType = p0;
    }
    public void Config(String p0,int p1,u p2){
       p0 = (p1 & 0x01)? "crop": null;
       super(p0);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Config.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Config && a.g(this._scaleType, p0._scaleType))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Config obj = PatchProxy.apply(null, this, Config.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this._scaleType;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Config.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Config\(_scaleType="+this._scaleType+"\)";
    }
}
