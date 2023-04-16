package com.hpplay.sdk.source.browse.data.BrowserInfo;
import android.os.Parcelable;
import com.hpplay.sdk.source.browse.data.BrowserInfo$1;
import java.lang.Object;
import org.json.JSONObject;
import android.os.Parcel;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import java.lang.StringBuilder;
import java.util.Map$Entry;

public class BrowserInfo implements Parcelable	// class@000660
{
    public int createType;
    public Map extras;
    public String ip;
    public boolean isLocalWifi;
    public boolean isOnLine;
    public String name;
    public int port;
    public int type;
    public String uid;
    public static final Parcelable$Creator CREATOR;

    static {
       BrowserInfo.CREATOR = new BrowserInfo$1();
    }
    public void BrowserInfo(int p0,int p1){
       super();
       this.isOnLine = false;
       this.type = p0;
       this.createType = p1;
    }
    public void BrowserInfo(int p0,JSONObject p1){
       super();
       this.isOnLine = false;
       this.decode(p0, p1);
    }
    public void BrowserInfo(Parcel p0){
       super();
       boolean b = false;
       this.isOnLine = b;
       this.uid = p0.readString();
       this.name = p0.readString();
       this.ip = p0.readString();
       this.type = p0.readInt();
       this.port = p0.readInt();
       this.createType = p0.readInt();
       boolean b1 = true;
       int b2 = (p0.readByte())? true: false;
       this.isOnLine = b2;
       if (!p0.readByte()) {
          b1 = false;
       }
       this.isLocalWifi = b1;
       b2 = p0.readInt();
       this.extras = new HashMap(b2);
       for (; b < b2; b = b + 1) {
          this.extras.put(p0.readString(), p0.readString());
       }
       return;
    }
    public void decode(int p0,JSONObject p1){
       if (p1 != null) {
          this.uid = p1.optString("u");
          this.name = p1.optString("name");
          this.ip = p1.optString("ip");
          this.port = p1.optInt("port");
          this.type = p1.optInt("type");
          this.createType = p0;
          JSONObject jSONObject = p1.optJSONObject("extras");
          if (jSONObject != null && jSONObject.length() > 0) {
             HashMap hashMap = new HashMap();
             Iterator iterator = jSONObject.keys();
             while (iterator.hasNext()) {
                String str = iterator.next();
                hashMap.put(str, jSONObject.optString(str));
             }
             this.extras = hashMap;
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public JSONObject encode(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("u", this.uid);
          jSONObject.put("name", this.name);
          jSONObject.put("ip", this.ip);
          jSONObject.put("port", this.port);
          jSONObject.put("type", this.type);
          JSONObject jSONObject1 = new JSONObject();
          BrowserInfo textras = this.extras;
          if (textras != null && !textras.isEmpty()) {
             Iterator iterator = this.extras.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                jSONObject1.put(str, this.extras.get(str));
             }
             jSONObject.put("extras", jSONObject1);
          }
       }catch(java.lang.Exception e1){
          a.b("BrowserInfo", e1);
       }
       return jSONObject;
    }
    public int getConnectionType(){
       if (4 == this.type) {
          return 1;
       }
       return 0;
    }
    public int getCreateType(){
       return this.createType;
    }
    public Map getExtras(){
       return this.extras;
    }
    public String getIp(){
       return this.ip;
    }
    public String getName(){
       return this.name;
    }
    public int getPort(){
       return this.port;
    }
    public int getType(){
       return this.type;
    }
    public String getUid(){
       return this.uid;
    }
    public boolean isLocalWifi(){
       return this.isLocalWifi;
    }
    public boolean isOnLine(){
       return this.isOnLine;
    }
    public void setExtras(Map p0){
       this.extras = p0;
    }
    public void setIp(String p0){
       this.ip = p0;
    }
    public void setLocalWifi(boolean p0){
       this.isLocalWifi = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setOnLine(boolean p0){
       this.isOnLine = p0;
    }
    public void setPort(int p0){
       this.port = p0;
    }
    public void setUid(String p0){
       this.uid = p0;
    }
    public String toString(){
       return "BrowserInfo{uid=\'"+this.uid+'''+", name=\'"+this.name+'''+", ip=\'"+this.ip+'''+", type="+this.type+", createType="+this.createType+", port="+this.port+", isOnLine="+this.isOnLine+", isLocalWifi="+this.isLocalWifi+", extras="+this.extras+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.uid);
       p0.writeString(this.name);
       p0.writeString(this.ip);
       p0.writeInt(this.type);
       p0.writeInt(this.port);
       p0.writeInt(this.createType);
       p0.writeByte(this.isOnLine);
       p0.writeByte(this.isLocalWifi);
       p0.writeInt(this.extras.size());
       Iterator iterator = this.extras.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeString(uEntry.getKey());
          p0.writeString(uEntry.getValue());
       }
       return;
    }
}
