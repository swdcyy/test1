package com.hpplay.sdk.source.bean.DescriptionBean;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class DescriptionBean	// class@00064b
{
    public String cuid;
    public int handler;
    public String id;
    public int manifestType;
    public int manifestVer;
    public String sessionID;
    public int subscribe;
    public String uid;
    public int ver;

    public void DescriptionBean(){
       super();
    }
    public void DescriptionBean(JSONObject p0){
       super();
       this.decode(p0);
    }
    public void decode(JSONObject p0){
       this.ver = p0.optInt("ver");
       this.id = p0.optString("id");
       this.manifestType = p0.optInt("manifestType");
       this.manifestVer = p0.optInt("manifestVer");
       this.handler = p0.optInt("handler");
       this.subscribe = p0.optInt("subscribe");
       this.sessionID = p0.optString("sessionID");
       this.cuid = p0.optString("cuid");
       this.uid = p0.optString("uid");
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("ver", this.ver);
          jSONObject.put("id", this.id);
          jSONObject.put("manifestType", this.manifestType);
          jSONObject.put("manifestVer", this.manifestVer);
          jSONObject.put("handler", this.handler);
          jSONObject.put("subscribe", this.subscribe);
          jSONObject.put("sessionID", this.sessionID);
          jSONObject.put("cuid", this.cuid);
          jSONObject.put("uid", this.uid);
       }catch(java.lang.Exception e1){
          a.b("DescriptionBean", e1);
       }
       return jSONObject;
    }
    public String getCuid(){
       return this.cuid;
    }
    public int getHandler(){
       return this.handler;
    }
    public String getId(){
       return this.id;
    }
    public int getManifestType(){
       return this.manifestType;
    }
    public int getManifestVer(){
       return this.manifestVer;
    }
    public String getSessionId(){
       return this.sessionID;
    }
    public int getSubscribe(){
       return this.subscribe;
    }
    public String getUid(){
       return this.uid;
    }
    public int getVer(){
       return this.ver;
    }
    public void setCuid(String p0){
       this.cuid = p0;
    }
    public void setHandler(int p0){
       this.handler = p0;
    }
    public void setId(String p0){
       this.id = p0;
    }
    public void setManifestType(int p0){
       this.manifestType = p0;
    }
    public void setManifestVer(int p0){
       this.manifestVer = p0;
    }
    public void setSessionId(String p0){
       this.sessionID = p0;
    }
    public void setSubscribe(int p0){
       this.subscribe = p0;
    }
    public void setUid(String p0){
       this.uid = p0;
    }
    public void setVer(int p0){
       this.ver = p0;
    }
}
