package com.kwai.video.stannis.StannisDeviceInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class StannisDeviceInfo	// class@000bf1
{
    public int id;
    public String name;
    public int routeType;

    public void StannisDeviceInfo(){
       super();
    }
    public void StannisDeviceInfo(int p0,String p1,int p2){
       super();
       this.id = p0;
       this.name = p1;
       this.routeType = p2;
    }
    public int getId(){
       return this.id;
    }
    public String getName(){
       return this.name;
    }
    public int getRouteType(){
       return this.routeType;
    }
    public void setId(int p0){
       this.id = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setRouteType(int p0){
       this.routeType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StannisDeviceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StannisDeviceInfo{id="+this.id+", name=\'"+this.name+'''+", routeType="+this.routeType+'}';
    }
}
