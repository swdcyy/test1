package com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.os.Parcelable;
import java.lang.Comparable;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo$1;
import java.lang.Object;
import com.hpplay.sdk.source.browse.data.LelinkServiceInfoWrapper;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import org.json.JSONObject;
import java.util.Map;

public class LelinkServiceInfo implements Parcelable, Comparable	// class@00065a
{
    public LelinkServiceInfoWrapper mInstance;
    public static final Parcelable$Creator CREATOR;

    static {
       LelinkServiceInfo.CREATOR = new LelinkServiceInfo$1();
    }
    public void LelinkServiceInfo(){
       super();
       this.mInstance = new LelinkServiceInfoWrapper();
    }
    public void LelinkServiceInfo(int p0,BrowserInfo p1){
       super();
       this.mInstance = new LelinkServiceInfoWrapper(p0, p1);
    }
    public void LelinkServiceInfo(Parcel p0){
       try{
          super();
          this.mInstance = p0.readParcelable(LelinkServiceInfoWrapper.class.getClassLoader());
       }catch(java.lang.Exception e0){
          this.mInstance = new LelinkServiceInfoWrapper();
       }
       return;
    }
    public void LelinkServiceInfo(String p0,String p1){
       super();
       this.mInstance = new LelinkServiceInfoWrapper(p0, p1);
    }
    public int compareTo(LelinkServiceInfo p0){
       return this.mInstance.compareTo(p0.mInstance);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public void decode(int p0,JSONObject p1){
       this.mInstance.decode(p0, p1);
    }
    public int describeContents(){
       return 0;
    }
    public JSONObject encode(){
       return this.mInstance.encode();
    }
    public boolean equals(Object p0){
       LelinkServiceInfo tmInstance = this.mInstance;
       if (tmInstance != null) {
          return tmInstance.equals(p0);
       }
       return false;
    }
    public String getAlias(){
       return this.mInstance.getAlias();
    }
    public int getAndroidRemotePort(){
       return this.mInstance.getAndroidRemotePort();
    }
    public Map getBrowserInfos(){
       return this.mInstance.getBrowserInfos();
    }
    public String getChannel(){
       return this.mInstance.getChannel();
    }
    public int getH(){
       return this.mInstance.getH();
    }
    public String getIp(){
       return this.mInstance.getIp();
    }
    public String getManufacturer(){
       return this.mInstance.getManufacturer();
    }
    public String getName(){
       return this.mInstance.getName();
    }
    public String getPackageName(){
       return this.mInstance.getPackageName();
    }
    public Map getParams(){
       return this.mInstance.getParams();
    }
    public String getPinCode(){
       return this.mInstance.getPinCode();
    }
    public int getPort(){
       return this.mInstance.getPort();
    }
    public int getRemotePort(){
       return this.mInstance.getRemotePort();
    }
    public String getTypes(){
       return this.mInstance.getTypes();
    }
    public String getUid(){
       return this.mInstance.getUid();
    }
    public int getW(){
       return this.mInstance.getW();
    }
    public boolean hasNewVersion(){
       return this.mInstance.hasNewVersion();
    }
    public boolean isConnect(){
       return this.mInstance.isConnect();
    }
    public boolean isLocalWifi(){
       return this.mInstance.isLocalWifi();
    }
    public boolean isOnLine(){
       return this.mInstance.isOnLine();
    }
    public void setAlias(String p0){
       this.mInstance.setAlias(p0);
    }
    public void setConnect(boolean p0){
       this.mInstance.setConnect(p0);
    }
    public void setIp(String p0){
       this.mInstance.setIp(p0);
    }
    public void setManufacturer(String p0){
       this.mInstance.setManufacturer(p0);
    }
    public void setName(String p0){
       this.mInstance.setName(p0);
    }
    public void setPinCode(String p0){
       this.mInstance.setPinCode(p0);
    }
    public void setPort(int p0){
       this.mInstance.setPort(p0);
    }
    public void setUid(String p0){
       this.mInstance.setUid(p0);
    }
    public String toString(){
       return this.mInstance.toString();
    }
    public void updateByAliveBroserInfo(BrowserInfo p0){
       this.mInstance.updateByAliveBroserInfo(p0);
    }
    public void updateByBroserInfo(int p0,BrowserInfo p1){
       this.mInstance.supplyIMBroserInfo(p0, p1);
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.mInstance, p1);
    }
}
