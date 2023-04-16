package com.meizu.cloud.pushsdk.handler.MessageV3;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.MessageV3$1;
import java.lang.Object;
import java.util.HashMap;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import java.lang.ClassLoader;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONObject;
import java.util.Map;
import java.util.Iterator;
import org.json.JSONException;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Integer;
import java.util.Set;
import java.util.Map$Entry;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.CharSequence;
import android.text.TextUtils;

public class MessageV3 implements Parcelable	// class@00152c
{
    public String activity;
    public int clickType;
    public String content;
    public String deviceId;
    public boolean isDiscard;
    public AdvanceSetting mAdvanceSetting;
    public AppIconSetting mAppIconSetting;
    public NotificationStyle mNotificationStyle;
    public TimeDisplaySetting mTimeDisplaySetting;
    public String notificationMessage;
    public String packageName;
    public Map paramsMap;
    public String pushTimestamp;
    public String seqId;
    public String taskId;
    public String throughMessage;
    public String title;
    public String uploadDataPackageName;
    public String uriPackageName;
    public String webUrl;
    public static final Parcelable$Creator CREATOR;
    public static final String TAG;

    static {
       MessageV3.CREATOR = new MessageV3$1();
    }
    public void MessageV3(){
       this.paramsMap = new HashMap();
    }
    public void MessageV3(Parcel p0){
       super();
       this.paramsMap = new HashMap();
       this.taskId = p0.readString();
       this.seqId = p0.readString();
       this.deviceId = p0.readString();
       this.title = p0.readString();
       this.content = p0.readString();
       this.packageName = p0.readString();
       this.clickType = p0.readInt();
       boolean b = (p0.readByte())? true: false;
       this.isDiscard = b;
       this.activity = p0.readString();
       this.webUrl = p0.readString();
       this.uriPackageName = p0.readString();
       this.uploadDataPackageName = p0.readString();
       this.pushTimestamp = p0.readString();
       this.paramsMap = p0.readHashMap(this.getClass().getClassLoader());
       this.throughMessage = p0.readString();
       this.notificationMessage = p0.readString();
       this.mAdvanceSetting = p0.readParcelable(AdvanceSetting.class.getClassLoader());
       this.mAppIconSetting = p0.readParcelable(AppIconSetting.class.getClassLoader());
       this.mNotificationStyle = p0.readParcelable(NotificationStyle.class.getClassLoader());
       this.mTimeDisplaySetting = p0.readParcelable(TimeDisplaySetting.class.getClassLoader());
       return;
    }
    public static Map getParamsMap(JSONObject p0){
       try{
          HashMap hashMap = new HashMap(p0.length());
          Iterator iterator = p0.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             hashMap.put(str, p0.getString(str));
          }
          return hashMap;
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
          return null;
       }
    }
    public static MessageV3 parse(String p0,String p1,String p2,MPushMessage p3){
       DebugLogger.e("Message_V3", "V2 message "+p3);
       MessageV3 messageV3 = new MessageV3();
       messageV3.setPackageName(p0);
       messageV3.setUploadDataPackageName(p0);
       messageV3.setDeviceId(p1);
       messageV3.setTaskId(p2);
       messageV3.setTitle(p3.getTitle());
       messageV3.setContent(p3.getContent());
       messageV3.setIsDiscard(("true").equals(p3.getIsDiscard()));
       messageV3.setClickType(Integer.valueOf(p3.getClickType()).intValue());
       messageV3.setWhiteList(false);
       messageV3.setDelayedReportMillis(0);
       Iterator iterator = p3.getExtra().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p2 = uEntry.getKey();
          uEntry = uEntry.getValue();
          if (("activity").equals(p2)) {
             messageV3.setActivity(uEntry);
          }
          if (("url").equals(p2)) {
             messageV3.setWebUrl(uEntry);
          }
          if (("pk").equals(p2)) {
             messageV3.setUriPackageName(uEntry);
          }
          if (("ns").equals(p2)) {
             messageV3.setNotificationStyle(NotificationStyle.parse(uEntry));
          }
          String str = "as";
          if (str.equals(p2)) {
             messageV3.setAdvanceSetting(AdvanceSetting.parse(uEntry));
          }
          if (("is").equals(p2)) {
             messageV3.setAppIconSetting(AppIconSetting.parse(uEntry));
          }
          if (("ts").equals(p2)) {
             messageV3.setTimeDisplaySetting(TimeDisplaySetting.parse(uEntry));
          }
          if (("bs").equals(p2)) {
             messageV3.setBrightRemindSetting(BrightRemindSetting.parse(uEntry));
          }
          if (str.equals(p2)) {
             messageV3.setAdvanceSettingEx(AdvanceSettingEx.parse(uEntry));
          }
          if (("ado").equals(p2)) {
             messageV3.setAdvertisementOption(AdvertisementOption.parse(uEntry));
          }
       }
       messageV3.setParamsMap(p3.getParams());
       iterator = e.a(p3.getExtra()).toString();
       DebugLogger.e("Message_V3", "MessageV2 extra json is "+iterator);
       if (!TextUtils.isEmpty(iterator)) {
          messageV3.setNotificationMessage(iterator);
       }
       DebugLogger.i("Message_V3", "parse V2 message to V3 message "+messageV3);
       return messageV3;
    }
    public static MessageV3 parse(String p0,String p1,String p2,String p3){
       return MessageV3.parse(p0, null, null, p1, p2, null, p3, false, 0);
    }
    public static MessageV3 parse(String p0,String p1,String p2,String p3,String p4){
       return MessageV3.parse(p0, null, null, p1, p2, p3, p4, false, 0);
    }
    public static MessageV3 parse(String p0,String p1,String p2,String p3,String p4,String p5,String p6){
       return MessageV3.parse(p0, p1, p2, p3, p4, p5, p6, false, 0);
    }
    public static MessageV3 parse(String p0,String p1,String p2,String p3,String p4,String p5,String p6,boolean p7,long p8){
       String str7;
       String str = p6;
       String str1 = "pk";
       String str2 = "task_id";
       String str3 = "ado";
       String str4 = "bs";
       String str5 = "as";
       String str6 = "parameters";
       MessageV3 messageV3 = new MessageV3();
       if (!p0.isEmpty()) {
          str7 = str1;
          messageV3.setPackageName(p0);
       }else {
          str7 = str1;
       }
       if (!p1.isEmpty()) {
          messageV3.setUploadDataPackageName(p1);
       }
       if (!p2.isEmpty()) {
          messageV3.setPushTimestamp(p2);
       }
       if (!p3.isEmpty()) {
          messageV3.setDeviceId(p3);
       }
       if (!p4.isEmpty()) {
          messageV3.setTaskId(p4);
       }else {
          int i = p4;
       }
       if (!p5.isEmpty()) {
          messageV3.setSeqId(p5);
       }
       if (!p6.isEmpty()) {
          messageV3.setNotificationMessage(str);
       }
       messageV3.setWhiteList(p7);
       String str8 = str2;
       long l = p8;
       try{
          messageV3.setDelayedReportMillis(l);
          JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
          if (!jSONObject.isNull("title")) {
             messageV3.setTitle(jSONObject.getString("title"));
          label_00a6 :
             if (!jSONObject.isNull("content")) {
                messageV3.setContent(jSONObject.getString("content"));
             }
             if (!jSONObject.isNull("isDiscard")) {
                messageV3.setIsDiscard(jSONObject.getBoolean("isDiscard"));
             }
             if (!jSONObject.isNull("clickType")) {
                messageV3.setClickType(jSONObject.getInt("clickType"));
             }
             if (!jSONObject.isNull("extra")) {
                jSONObject = jSONObject.getJSONObject("extra");
                if (!jSONObject.isNull("ns")) {
                   messageV3.setNotificationStyle(NotificationStyle.parse(jSONObject.getJSONObject("ns")));
                }
                if (!jSONObject.isNull("is")) {
                   messageV3.setAppIconSetting(AppIconSetting.parse(jSONObject.getJSONObject("is")));
                }
                if (!jSONObject.isNull(str5)) {
                   messageV3.setAdvanceSetting(AdvanceSetting.parse(jSONObject.getJSONObject(str5)));
                }
                if (!jSONObject.isNull("ts")) {
                   messageV3.setTimeDisplaySetting(TimeDisplaySetting.parse(jSONObject.getJSONObject("ts")));
                }
                if (!jSONObject.isNull("activity")) {
                   messageV3.setActivity(jSONObject.getString("activity"));
                }
                if (!jSONObject.isNull("url")) {
                   messageV3.setWebUrl(jSONObject.getString("url"));
                }
                str1 = str8;
                if (!jSONObject.isNull(str1) && TextUtils.isEmpty(p4)) {
                   DebugLogger.e("Message_V3", "Flyme 4 notification message by through message or taskId is null");
                   messageV3.setTaskId(jSONObject.getString(str1));
                }
                str1 = str7;
                if (!jSONObject.isNull(str1)) {
                   messageV3.setUriPackageName(jSONObject.getString(str1));
                }
                str1 = str6;
                if (!jSONObject.isNull(str1)) {
                   messageV3.setParamsMap(MessageV3.getParamsMap(jSONObject.getJSONObject(str1)));
                }
                str1 = str4;
                if (!jSONObject.isNull(str1)) {
                   messageV3.setBrightRemindSetting(BrightRemindSetting.parse(jSONObject.getJSONObject(str1)));
                }
                if (!jSONObject.isNull(str5)) {
                   messageV3.setAdvanceSettingEx(AdvanceSettingEx.parse(jSONObject.getJSONObject(str5)));
                }
                str5 = str3;
                if (!jSONObject.isNull(str5)) {
                   messageV3.setAdvertisementOption(AdvertisementOption.parse(jSONObject.getJSONObject(str5)));
                }
             }
          }else {
             goto label_00a6 ;
          }
       }catch(org.json.JSONException e0){
          DebugLogger.e("Message_V3", "parse message error "+e0.getMessage());
       }
       return messageV3;
    }
    public int describeContents(){
       return 0;
    }
    public String getActivity(){
       return this.activity;
    }
    public AdvanceSetting getAdvanceSetting(){
       return this.mAdvanceSetting;
    }
    public AdvanceSettingEx getAdvanceSettingEx(){
       return null;
    }
    public AdvertisementOption getAdvertisementOption(){
       return null;
    }
    public AppIconSetting getAppIconSetting(){
       return this.mAppIconSetting;
    }
    public BrightRemindSetting getBrightRemindSetting(){
       return null;
    }
    public int getClickType(){
       return this.clickType;
    }
    public String getContent(){
       return this.content;
    }
    public long getDelayedReportMillis(){
       return 0;
    }
    public String getDeviceId(){
       return this.deviceId;
    }
    public String getNotificationMessage(){
       return this.notificationMessage;
    }
    public NotificationStyle getNotificationStyle(){
       return this.mNotificationStyle;
    }
    public String getPackageName(){
       return this.packageName;
    }
    public Map getParamsMap(){
       return this.paramsMap;
    }
    public String getPushTimestamp(){
       return this.pushTimestamp;
    }
    public String getSeqId(){
       return this.seqId;
    }
    public String getTaskId(){
       return this.taskId;
    }
    public String getThroughMessage(){
       return this.throughMessage;
    }
    public TimeDisplaySetting getTimeDisplaySetting(){
       return this.mTimeDisplaySetting;
    }
    public String getTitle(){
       return this.title;
    }
    public String getUploadDataPackageName(){
       return this.uploadDataPackageName;
    }
    public String getUriPackageName(){
       return this.uriPackageName;
    }
    public String getWebUrl(){
       return this.webUrl;
    }
    public boolean getWhiteList(){
       return false;
    }
    public boolean isDiscard(){
       return this.isDiscard;
    }
    public void setActivity(String p0){
       this.activity = p0;
    }
    public void setAdvanceSetting(AdvanceSetting p0){
       this.mAdvanceSetting = p0;
    }
    public void setAdvanceSettingEx(AdvanceSettingEx p0){
    }
    public void setAdvertisementOption(AdvertisementOption p0){
    }
    public void setAppIconSetting(AppIconSetting p0){
       this.mAppIconSetting = p0;
    }
    public void setBrightRemindSetting(BrightRemindSetting p0){
    }
    public void setClickType(int p0){
       this.clickType = p0;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setDelayedReportMillis(long p0){
    }
    public void setDeviceId(String p0){
       this.deviceId = p0;
    }
    public void setIsDiscard(boolean p0){
       this.isDiscard = p0;
    }
    public void setNotificationMessage(String p0){
       this.notificationMessage = p0;
    }
    public void setNotificationStyle(NotificationStyle p0){
       this.mNotificationStyle = p0;
    }
    public void setPackageName(String p0){
       this.packageName = p0;
    }
    public void setParamsMap(Map p0){
       this.paramsMap = p0;
    }
    public void setPushTimestamp(String p0){
       this.pushTimestamp = p0;
    }
    public void setSeqId(String p0){
       this.seqId = p0;
    }
    public void setTaskId(String p0){
       this.taskId = p0;
    }
    public void setThroughMessage(String p0){
       this.throughMessage = p0;
    }
    public void setTimeDisplaySetting(TimeDisplaySetting p0){
       this.mTimeDisplaySetting = p0;
    }
    public void setTitle(String p0){
       this.title = p0;
    }
    public void setUploadDataPackageName(String p0){
       this.uploadDataPackageName = p0;
    }
    public void setUriPackageName(String p0){
       this.uriPackageName = p0;
    }
    public void setWebUrl(String p0){
       this.webUrl = p0;
    }
    public void setWhiteList(boolean p0){
    }
    public String toString(){
       return "MessageV3{taskId=\'"+this.taskId+'''+", seqId=\'"+this.seqId+'''+", deviceId=\'"+this.deviceId+'''+", title=\'"+this.title+'''+", content=\'"+this.content+'''+", packageName=\'"+this.packageName+'''+", clickType="+this.clickType+'''+", isDiscard="+this.isDiscard+'''+", activity=\'"+this.activity+'''+", webUrl=\'"+this.webUrl+'''+", uriPackageName=\'"+this.uriPackageName+'''+", pushTimestamp=\'"+this.pushTimestamp+'''+", uploadDataPackageName=\'"+this.uploadDataPackageName+'''+", paramsMap="+this.paramsMap+'''+", throughMessage=\'"+this.throughMessage+'''+", notificationMessage=\'"+this.notificationMessage+'''+", mAdvanceSetting="+this.mAdvanceSetting+'''+", mAppIconSetting="+this.mAppIconSetting+'''+", mNotificationStyle="+this.mNotificationStyle+'''+", mTimeDisplaySetting="+this.mTimeDisplaySetting+'''+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.taskId);
       p0.writeString(this.seqId);
       p0.writeString(this.deviceId);
       p0.writeString(this.title);
       p0.writeString(this.content);
       p0.writeString(this.packageName);
       p0.writeInt(this.clickType);
       p0.writeByte((byte)this.isDiscard);
       p0.writeString(this.activity);
       p0.writeString(this.webUrl);
       p0.writeString(this.uriPackageName);
       p0.writeString(this.uploadDataPackageName);
       p0.writeString(this.pushTimestamp);
       p0.writeMap(this.paramsMap);
       p0.writeString(this.throughMessage);
       p0.writeString(this.notificationMessage);
       p0.writeParcelable(this.mAdvanceSetting, p1);
       p0.writeParcelable(this.mAppIconSetting, p1);
       p0.writeParcelable(this.mNotificationStyle, p1);
       p0.writeParcelable(this.mTimeDisplaySetting, p1);
    }
}
