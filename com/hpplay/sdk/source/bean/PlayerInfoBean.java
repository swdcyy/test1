package com.hpplay.sdk.source.bean.PlayerInfoBean;
import android.os.Parcelable;
import com.hpplay.sdk.source.bean.PlayerInfoBean$1;
import java.lang.Object;
import com.hpplay.sdk.source.bean.AesBean;
import android.os.Parcel;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import org.json.JSONObject;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;

public class PlayerInfoBean implements Parcelable	// class@000650
{
    public AesBean aes;
    public String header;
    public int loopMode;
    public int manifestVer;
    public String monitor;
    public String sessionID;
    public String uri;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayerInfoBean.CREATOR = new PlayerInfoBean$1();
    }
    public void PlayerInfoBean(){
       super();
       this.loopMode = -1;
       this.aes = new AesBean();
    }
    public void PlayerInfoBean(Parcel p0){
       super();
       this.loopMode = -1;
       this.manifestVer = p0.readInt();
       this.uri = p0.readString();
       this.header = p0.readString();
       this.sessionID = p0.readString();
       this.loopMode = p0.readInt();
       this.monitor = p0.readString();
       this.aes = p0.readParcelable(AesBean.class.getClassLoader());
    }
    public int describeContents(){
       return 0;
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("manifestVer", this.manifestVer);
          jSONObject.put("uri", this.uri);
          jSONObject.put("header", this.header);
          jSONObject.put("sessionID", this.sessionID);
          jSONObject.put("loopMode", this.loopMode);
          jSONObject.put("monitor", this.monitor);
          PlayerInfoBean taes = this.aes;
          if (taes != null) {
             jSONObject.put("aes", taes.encode());
          }
       }catch(java.lang.Exception e1){
          a.b("PlayerInfoBean", e1);
       }
       return jSONObject;
    }
    public AesBean getAesBean(){
       return this.aes;
    }
    public String getHeader(){
       return this.header;
    }
    public int getLoopMode(){
       return this.loopMode;
    }
    public int getManifestVer(){
       return this.manifestVer;
    }
    public String getMonitor(){
       return this.monitor;
    }
    public String getSessionId(){
       return this.sessionID;
    }
    public String getUri(){
       return this.uri;
    }
    public void setHeader(String p0){
       this.header = p0;
    }
    public void setLoopMode(int p0){
       this.loopMode = p0;
    }
    public void setManifestVer(int p0){
       this.manifestVer = p0;
    }
    public void setMonitor(String p0){
       this.monitor = p0;
    }
    public void setSessionId(String p0){
       this.sessionID = p0;
    }
    public void setUri(String p0){
       this.uri = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.manifestVer);
       p0.writeString(this.uri);
       p0.writeString(this.header);
       p0.writeString(this.sessionID);
       p0.writeInt(this.loopMode);
       p0.writeString(this.monitor);
       p0.writeParcelable(this.aes, p1);
    }
}
