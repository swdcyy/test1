package com.hpplay.sdk.source.browse.data.LelinkServiceInfoWrapper;
import android.os.Parcelable;
import java.lang.Comparable;
import com.hpplay.sdk.source.browse.data.LelinkServiceInfoWrapper$1;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import java.lang.String;
import java.lang.Integer;
import java.util.Map;
import android.os.Parcel;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Set;
import java.util.Iterator;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.StringBuilder;
import java.util.Map$Entry;

public class LelinkServiceInfoWrapper implements Parcelable, Comparable	// class@000663
{
    public String alias;
    public String ip;
    public boolean isConnect;
    public Map mBrowserInfos;
    public String manufacturer;
    public String name;
    public String pinCode;
    public int port;
    public String uid;
    public static final Parcelable$Creator CREATOR;

    static {
       LelinkServiceInfoWrapper.CREATOR = new LelinkServiceInfoWrapper$1();
    }
    public void LelinkServiceInfoWrapper(){
       super();
       this.mBrowserInfos = new ConcurrentHashMap();
    }
    public void LelinkServiceInfoWrapper(int p0,BrowserInfo p1){
       super();
       this.uid = p1.getUid();
       this.name = p1.getName();
       this.ip = p1.getIp();
       this.port = p1.getPort();
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.mBrowserInfos = uConcurrentH;
       uConcurrentH.put(Integer.valueOf(p1.getType()), p1);
       this.supplyIMBroserInfo(p0, p1);
    }
    public void LelinkServiceInfoWrapper(Parcel p0){
       super();
       this.name = p0.readString();
       this.alias = p0.readString();
       this.ip = p0.readString();
       this.port = p0.readInt();
       this.uid = p0.readString();
       boolean b = (p0.readByte())? true: false;
       this.isConnect = b;
       this.pinCode = p0.readString();
       this.manufacturer = p0.readString();
       return;
    }
    public void LelinkServiceInfoWrapper(String p0,String p1){
       super();
       this.uid = p0;
       this.name = p1;
       this.mBrowserInfos = new ConcurrentHashMap();
       BrowserInfo uBrowserInfo = new BrowserInfo(4, 4);
       uBrowserInfo.setUid(p0);
       uBrowserInfo.setName(p1);
       HashMap hashMap = new HashMap();
       hashMap.put("u", p0);
       uBrowserInfo.setExtras(hashMap);
       this.mBrowserInfos.put(Integer.valueOf(4), uBrowserInfo);
    }
    public int compareTo(LelinkServiceInfoWrapper p0){
       if (this == p0) {
          return 0;
       }
       if (!TextUtils.isEmpty(this.uid) && !TextUtils.isEmpty(p0.uid)) {
          return 0;
       }
       if (TextUtils.isEmpty(this.uid) && TextUtils.isEmpty(p0.uid)) {
          return 0;
       }
       int i = (!TextUtils.isEmpty(this.uid))? -1: 1;
       return i;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public void decode(int p0,JSONObject p1){
       if (p1 != null) {
          this.name = p1.optString("name");
          this.ip = p1.optString("ip");
          this.uid = p1.optString("u");
          JSONArray jSONArray = p1.optJSONArray("info");
          if (jSONArray != null) {
             int i1 = jSONArray.length();
             for (int i = 0; i < i1; i = i + 1) {
                this.supplyIMBroserInfo(p0, new BrowserInfo(p0, jSONArray.optJSONObject(i)));
             }
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
          LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
          if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
             JSONArray jSONArray = new JSONArray();
             Iterator iterator = this.mBrowserInfos.keySet().iterator();
             while (iterator.hasNext()) {
                jSONArray.put(this.mBrowserInfos.get(iterator.next()).encode());
             }
             jSONObject.put("info", jSONArray);
          }
       }catch(java.lang.Exception e1){
          a.b("LelinkServiceInfoWrapper", e1);
       }
       return jSONObject;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       LelinkServiceInfo lelinkServic = p0;
       if (!TextUtils.isEmpty(this.getUid()) && !TextUtils.isEmpty(lelinkServic.getUid())) {
          return (this.getUid()).equalsIgnoreCase(lelinkServic.getUid());
       }
       return super.equals(p0);
    }
    public String getAlias(){
       return this.alias;
    }
    public int getAndroidRemotePort(){
       try{
          LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
          if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
             BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
             if (uBrowserInfo != null) {
                return Integer.valueOf(uBrowserInfo.getExtras().get("port")).intValue();
             }
          }
       }catch(java.lang.Exception e0){
          a.b("LelinkServiceInfoWrapper", e0);
       }
       return 0;
    }
    public Map getBrowserInfos(){
       return this.mBrowserInfos;
    }
    public String getChannel(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && !tmBrowserInf.isEmpty()) {
          BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
          if (uBrowserInfo != null) {
             Map extras = uBrowserInfo.getExtras();
             if (extras != null && !extras.isEmpty()) {
                return extras.get("channel");
             }
          }
       }
       return null;
    }
    public int getH(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
          return Integer.valueOf(this.mBrowserInfos.get(Integer.valueOf(1)).getExtras().get("h")).intValue();
       }
       return 0;
    }
    public String getIp(){
       return this.ip;
    }
    public String getManufacturer(){
       if (!TextUtils.isEmpty(this.manufacturer)) {
          return this.manufacturer;
       }
       return "unknow";
    }
    public String getName(){
       return this.name;
    }
    public String getPackageName(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && !tmBrowserInf.isEmpty()) {
          BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
          if (uBrowserInfo != null) {
             Map extras = uBrowserInfo.getExtras();
             if (extras != null && !extras.isEmpty()) {
                return extras.get("packagename");
             }
          }
       }
       return null;
    }
    public Map getParams(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && !tmBrowserInf.isEmpty()) {
          BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
          if (uBrowserInfo != null) {
             return uBrowserInfo.getExtras();
          }
       }
       return null;
    }
    public String getPinCode(){
       return this.pinCode;
    }
    public int getPort(){
       return this.port;
    }
    public int getRemotePort(){
       try{
          LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
          if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
             BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
             if (uBrowserInfo != null) {
                return Integer.valueOf(uBrowserInfo.getExtras().get("remote")).intValue();
             }
          }
       }catch(java.lang.Exception e0){
          a.b("LelinkServiceInfoWrapper", e0);
       }
       return 0;
    }
    public String getTypes(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf == null || tmBrowserInf.size() <= 0) {
          return null;
       }
       StringBuilder str = "";
       Iterator iterator = this.mBrowserInfos.entrySet().iterator();
       while (iterator.hasNext()) {
          BrowserInfo value = iterator.next().getValue();
          if (value != null) {
             int type = value.getType();
             if (type != 1) {
                if (type != 3) {
                   if (type == 4) {
                      str = str+"IM";
                   }
                }else {
                   str = str+"DLNA";
                }
             }else {
                str = str+"Lelink";
             }
          }
          if (iterator.hasNext()) {
             str = str+",";
          }
       }
       return str;
    }
    public String getUid(){
       return this.uid;
    }
    public int getW(){
       try{
          LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
          if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
             return Integer.valueOf(this.mBrowserInfos.get(Integer.valueOf(1)).getExtras().get("w")).intValue();
          }
       }catch(java.lang.Exception e0){
          a.b("LelinkServiceInfoWrapper", e0);
       }
       return 0;
    }
    public boolean hasNewVersion(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && !tmBrowserInf.isEmpty()) {
          BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
          if (uBrowserInfo != null) {
             String str = uBrowserInfo.getExtras().get("appInfo");
             if (TextUtils.isEmpty(str) || ("1").equalsIgnoreCase(str.split(",")[0])) {
                return 1;
             }
          }
       }
       return 0;
    }
    public boolean isConnect(){
       return this.isConnect;
    }
    public boolean isDangle(BrowserInfo p0){
       try{
          String str = p0.getExtras().get("channel");
          if (!TextUtils.isEmpty(str) && str.contains("dongle")) {
             return true;
          }
       }catch(java.lang.Exception e2){
          a.b("LelinkServiceInfoWrapper", e2);
       }
       return false;
    }
    public boolean isLocalWifi(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null && tmBrowserInf.size() > 0) {
          BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(1));
          if (uBrowserInfo != null && uBrowserInfo.isLocalWifi()) {
             return 1;
          }else {
             uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(3));
             if (uBrowserInfo != null && uBrowserInfo.isLocalWifi()) {
                return 1;
             }
          }
       }
       return false;
    }
    public boolean isOnLine(){
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null) {
          Iterator iterator = tmBrowserInf.keySet().iterator();
          while (iterator.hasNext()) {
             if (this.mBrowserInfos.get(iterator.next()).isOnLine()) {
                return true;
             }
          }
       }
       return false;
    }
    public void setAlias(String p0){
       this.alias = p0;
    }
    public void setConnect(boolean p0){
       this.isConnect = p0;
    }
    public void setIp(String p0){
       this.ip = p0;
    }
    public void setManufacturer(String p0){
       this.manufacturer = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setPinCode(String p0){
       this.pinCode = p0;
    }
    public void setPort(int p0){
       this.port = p0;
    }
    public void setUid(String p0){
       this.uid = p0;
    }
    public void supplyIMBroserInfo(int p0,BrowserInfo p1){
       if (TextUtils.isEmpty(this.uid) && !TextUtils.isEmpty(p1.getUid())) {
          this.uid = p1.getUid();
       }
       this.name = p1.getName();
       this.ip = p1.getIp();
       this.mBrowserInfos.put(Integer.valueOf(p1.getType()), p1);
       return;
    }
    public String toString(){
       return "LelinkServiceInfo{, name=\'"+this.name+'''+", ip=\'"+this.ip+'''+", uid=\'"+this.uid+'''+", mBrowserInfos="+this.mBrowserInfos+'}';
    }
    public void updateByAliveBroserInfo(BrowserInfo p0){
       if (this.mBrowserInfos == null) {
          this.mBrowserInfos = new ConcurrentHashMap();
       }
       BrowserInfo uBrowserInfo = this.mBrowserInfos.get(Integer.valueOf(p0.getType()));
       if (uBrowserInfo == null) {
          this.mBrowserInfos.put(Integer.valueOf(p0.getType()), p0);
       }else {
          uBrowserInfo.setLocalWifi(p0.isLocalWifi());
          uBrowserInfo.setOnLine(p0.isOnLine());
       }
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.name);
       p0.writeString(this.alias);
       p0.writeString(this.ip);
       p0.writeInt(this.port);
       p0.writeString(this.uid);
       p0.writeByte((byte)this.isConnect);
       p0.writeString(this.pinCode);
       p0.writeString(this.manufacturer);
       LelinkServiceInfoWrapper tmBrowserInf = this.mBrowserInfos;
       if (tmBrowserInf != null) {
          int i = tmBrowserInf.size();
          p0.writeInt(i);
          if (i > 0) {
             Iterator iterator = this.mBrowserInfos.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p0.writeInt(uEntry.getKey().intValue());
                p0.writeParcelable(uEntry.getValue(), p1);
             }
          }
       }
       return;
    }
}
