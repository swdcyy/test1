package com.heytap.msp.push.mode.MessageStat;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Exception;
import com.heytap.mcssdk.utils.d;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;

public class MessageStat	// class@000556
{
    public String mAppPackage;
    public String mDataExtra;
    public String mEventId;
    public long mEventTime;
    public String mGlobalId;
    public String mProperty;
    public String mStatisticsExtra;
    public String mTaskID;
    public int mType;

    public void MessageStat(){
       super();
       this.mType = 4096;
       this.mEventTime = System.currentTimeMillis();
    }
    public void MessageStat(int p0,String p1,String p2,String p3){
       super(p0, p1, null, null, p2, p3);
    }
    public void MessageStat(int p0,String p1,String p2,String p3,String p4,String p5){
       super(p0, p1, p2, p3, p4, p5, "", "");
    }
    public void MessageStat(int p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7){
       super();
       this.mType = 4096;
       this.mEventTime = System.currentTimeMillis();
       this.setType(p0);
       this.setAppPackage(p1);
       this.setGlobalId(p2);
       this.setTaskID(p3);
       this.setEventId(p4);
       this.setProperty(p5);
       this.setStatisticsExtra(p6);
       this.setDataExtra(p7);
    }
    public void MessageStat(String p0,String p1){
       super(4096, p0, null, null, p1, "");
    }
    public void MessageStat(String p0,String p1,String p2){
       super(4096, p0, null, null, p1, p2);
    }
    public static MessageStat parse(String p0){
       try{
          MessageStat messageStat = new MessageStat();
          JSONObject jSONObject = new JSONObject(p0);
          messageStat.setType(jSONObject.optInt("messageType", 0));
          messageStat.setAppPackage(jSONObject.optString("appPackage"));
          messageStat.setEventId(jSONObject.optString("eventID"));
          messageStat.setGlobalId(jSONObject.optString("globalID", ""));
          messageStat.setTaskID(jSONObject.optString("taskID", ""));
          messageStat.setProperty(jSONObject.optString("property", ""));
          messageStat.setEventTime(jSONObject.optLong("eventTime", System.currentTimeMillis()));
          messageStat.setStatisticsExtra(jSONObject.optString("statistics_extra"));
          messageStat.setDataExtra(jSONObject.optString("data_extra"));
          return messageStat;
       }catch(java.lang.Exception e5){
          d.e(e5.getLocalizedMessage());
          return null;
       }
    }
    public String getAppPackage(){
       return this.mAppPackage;
    }
    public String getDataExtra(){
       return this.mDataExtra;
    }
    public String getEventId(){
       return this.mEventId;
    }
    public long getEventTime(){
       return this.mEventTime;
    }
    public String getGlobalId(){
       return this.mGlobalId;
    }
    public String getProperty(){
       return this.mProperty;
    }
    public String getStatisticsExtra(){
       return this.mStatisticsExtra;
    }
    public String getTaskID(){
       return this.mTaskID;
    }
    public int getType(){
       return this.mType;
    }
    public void setAppPackage(String p0){
       this.mAppPackage = p0;
    }
    public void setDataExtra(String p0){
       this.mDataExtra = p0;
    }
    public void setEventId(String p0){
       this.mEventId = p0;
    }
    public void setEventTime(long p0){
       this.mEventTime = p0;
    }
    public void setGlobalId(String p0){
       this.mGlobalId = p0;
    }
    public void setProperty(String p0){
       this.mProperty = p0;
    }
    public void setStatisticsExtra(String p0){
       this.mStatisticsExtra = p0;
    }
    public void setTaskID(int p0){
       this.mTaskID = p0+"";
    }
    public void setTaskID(String p0){
       this.mTaskID = p0;
    }
    public void setType(int p0){
       this.mType = p0;
    }
    public String toJsonObject(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.putOpt("messageType", Integer.valueOf(this.mType));
          jSONObject.putOpt("eventID", this.mEventId);
          jSONObject.putOpt("appPackage", this.mAppPackage);
          jSONObject.putOpt("eventTime", Long.valueOf(this.mEventTime));
          if (!TextUtils.isEmpty(this.mGlobalId)) {
             jSONObject.putOpt("globalID", this.mGlobalId);
          label_0038 :
             if (!TextUtils.isEmpty(this.mTaskID)) {
                jSONObject.putOpt("taskID", this.mTaskID);
             }
             if (!TextUtils.isEmpty(this.mProperty)) {
                jSONObject.putOpt("property", this.mProperty);
             }
             if (!TextUtils.isEmpty(this.mStatisticsExtra)) {
                jSONObject.putOpt("statistics_extra", this.mStatisticsExtra);
             }
             if (!TextUtils.isEmpty(this.mDataExtra)) {
                jSONObject.putOpt("data_extra", this.mDataExtra);
             }
          }else {
             goto label_0038 ;
          }
       }catch(java.lang.Exception e1){
          d.e(e1.getLocalizedMessage());
       }
       return jSONObject.toString();
    }
}
