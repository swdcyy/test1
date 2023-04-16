package com.kwai.feature.api.platform.mini.plugin.HostVideoStorageItem;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class HostVideoStorageItem	// class@001070
{
    public Number index;
    public Number position;
    public Number total;

    public void HostVideoStorageItem(){
       super();
    }
    public JSONObject toJson(){
       JSONObject obj = PatchProxy.apply(null, this, HostVideoStorageItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("position", this.position);
          obj.put("index", this.index);
          obj.put("total", this.total);
          return e0;
       }catch(org.json.JSONException e0){
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HostVideoStorageItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.toJson().toString();
    }
}
