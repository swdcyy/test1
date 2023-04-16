package com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo$DNSResolveStats;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.util.ArrayList;

public class UploadLogInfo$DNSResolveStats	// class@0009a7
{
    public String chosenIP;
    public String host;
    public ArrayList resolvedIPs;
    public boolean success;

    public void UploadLogInfo$DNSResolveStats(){
       super();
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, UploadLogInfo$DNSResolveStats.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          UploadLogInfo$DNSResolveStats thost = this.host;
          if (thost != null) {
             obj.put("host", thost);
          }
          thost = this.resolvedIPs;
          if (thost != null && thost.size() > 0) {
             obj.put("resolved_ips", this.resolvedIPs);
          }
          thost = this.chosenIP;
          if (thost != null) {
             obj.put("chosen_ip", thost);
          }
          return obj.toString();
       }catch(java.lang.Exception e0){
          return "";
       }
    }
}
