package com.hpplay.sdk.source.bean.ConnectInfoBean;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class ConnectInfoBean	// class@000645
{
    public String appID;
    public int manifestVer;
    public String mf;
    public String model;
    public String sm;

    public void ConnectInfoBean(JSONObject p0){
       super();
       this.decode(p0);
    }
    public void decode(JSONObject p0){
       try{
          this.manifestVer = p0.optInt("manifestVer");
          this.model = p0.optString("model");
          this.sm = p0.optString("sm");
          this.mf = p0.optString("mf");
          this.appID = p0.optString("appID");
       }catch(java.lang.Exception e2){
          a.b("ConnectInfoBean", e2);
       }
       return;
    }
    public String getAppID(){
       return this.appID;
    }
    public int getManifestVer(){
       return this.manifestVer;
    }
    public String getMf(){
       return this.mf;
    }
    public String getModel(){
       return this.model;
    }
    public String getSm(){
       return this.sm;
    }
    public void setAppID(String p0){
       this.appID = p0;
    }
    public void setManifestVer(int p0){
       this.manifestVer = p0;
    }
    public void setMf(String p0){
       this.mf = p0;
    }
    public void setModel(String p0){
       this.model = p0;
    }
    public void setSm(String p0){
       this.sm = p0;
    }
}
