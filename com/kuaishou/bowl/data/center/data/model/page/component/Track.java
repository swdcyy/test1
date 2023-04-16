package com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class Track implements Serializable	// class@0011f3
{
    public Map areas;
    public Map contentPackage;
    public Map elementPackage;
    public Map urlPackage;
    public static final long serialVersionUID = 0xd4e5ca3e28b1db06;

    public void Track(){
       super();
    }
    public String getPage2(){
       Track obj = PatchProxy.apply(null, this, Track.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.urlPackage;
       if (obj != null && (!obj.containsKey("page2") || !this.urlPackage.get("page2") instanceof String)) {
          return null;
       }
       return this.urlPackage.get("page2");
    }
    public Map getUrlPackageParams(){
       Object[] objArray = null;
       Track obj = PatchProxy.apply(objArray, this, Track.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.urlPackage;
       if (obj != null && obj.containsKey("params")) {
          try{
             objArray = this.urlPackage.get("params");
          }catch(java.lang.Exception e0){
          }
       }
       return objArray;
    }
}
