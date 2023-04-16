package com.kwai.video.krtc.Arya$AryaDeviceInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Arya$AryaDeviceInfo	// class@000663
{
    public int id;
    public String name;
    public int routeType;

    public void Arya$AryaDeviceInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Arya$AryaDeviceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AryaDeviceInfo{id="+this.id+", name=\'"+this.name+'''+", routeType="+this.routeType+'}';
    }
}
