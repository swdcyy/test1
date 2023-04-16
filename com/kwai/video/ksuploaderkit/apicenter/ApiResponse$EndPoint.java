package com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;

public class ApiResponse$EndPoint implements Serializable	// class@00098c
{
    public String host;
    public short port;
    public String protocol;

    public void ApiResponse$EndPoint(String p0,short p1,String p2){
       super();
       this.host = p0;
       this.port = p1;
       this.protocol = p2;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ApiResponse$EndPoint.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          ApiResponse$EndPoint thost = this.host;
          if (thost != null) {
             obj.put("host", thost);
          }
          obj.put("port", this.port);
          thost = this.protocol;
          if (thost != null) {
             obj.put("protocol", thost);
          }
          return obj.toString();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
}
