package com.meizu.cloud.pushsdk.notification.MPushMessage;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;
import java.util.Iterator;
import java.lang.String;
import org.json.JSONException;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;

public class MPushMessage implements Serializable	// class@00155f
{
    public String clickType;
    public String content;
    public Map extra;
    public String isDiscard;
    public String notifyType;
    public String packageName;
    public Map params;
    public String pushType;
    public String taskId;
    public String title;
    public static final String TAG = "MPushMessage";

    public void MPushMessage(){
       super();
       this.extra = new HashMap();
       this.params = new HashMap();
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
    public static MPushMessage parsePushMessage(String p0,String p1,String p2,String p3){
       MPushMessage mPushMessage;
       try{
          mPushMessage = new MPushMessage();
          mPushMessage.setTaskId(p3);
          mPushMessage.setPushType(p0);
          mPushMessage.setPackageName(p2);
          JSONObject jSONObject = new JSONObject(p1).getJSONObject("data");
          if (!jSONObject.isNull("content")) {
             mPushMessage.setContent(jSONObject.getString("content"));
          label_0034 :
             if (!jSONObject.isNull("isDiscard")) {
                mPushMessage.setIsDiscard(jSONObject.getString("isDiscard"));
             }
             if (!jSONObject.isNull("title")) {
                mPushMessage.setTitle(jSONObject.getString("title"));
             }
             if (!jSONObject.isNull("clickType")) {
                mPushMessage.setClickType(jSONObject.getString("clickType"));
             }
             if (!jSONObject.isNull("extra")) {
                jSONObject = jSONObject.getJSONObject("extra");
                if (jSONObject != null) {
                   if (!jSONObject.isNull("parameters")) {
                      try{
                         JSONObject jSONObject1 = jSONObject.getJSONObject("parameters");
                         if (jSONObject1 != null) {
                            mPushMessage.setParams(MPushMessage.getParamsMap(jSONObject1));
                         }
                      }catch(org.json.JSONException e9){
                         DebugLogger.i("MPushMessage", "parameter parse error message "+e9.getMessage());
                      }
                      jSONObject.remove("parameters");
                   }
                   mPushMessage.setExtra(MPushMessage.getParamsMap(jSONObject));
                }
             }
          }else {
             goto label_0034 ;
          }
       }catch(org.json.JSONException e8){
          DebugLogger.i("MPushMessage", "parse push message error "+e8.getMessage());
       }
       DebugLogger.i("MPushMessage", " parsePushMessage "+mPushMessage);
       return mPushMessage;
    }
    public String getClickType(){
       return this.clickType;
    }
    public String getContent(){
       return this.content;
    }
    public Map getExtra(){
       return this.extra;
    }
    public String getIsDiscard(){
       return this.isDiscard;
    }
    public String getNotifyType(){
       return this.notifyType;
    }
    public String getPackageName(){
       return this.packageName;
    }
    public Map getParams(){
       return this.params;
    }
    public String getPushType(){
       return this.pushType;
    }
    public String getTaskId(){
       return this.taskId;
    }
    public String getTitle(){
       return this.title;
    }
    public void setClickType(String p0){
       this.clickType = p0;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setExtra(Map p0){
       this.extra = p0;
    }
    public void setIsDiscard(String p0){
       this.isDiscard = p0;
    }
    public void setNotifyType(String p0){
       this.notifyType = p0;
    }
    public void setPackageName(String p0){
       this.packageName = p0;
    }
    public void setParams(Map p0){
       this.params = p0;
    }
    public void setPushType(String p0){
       this.pushType = p0;
    }
    public void setTaskId(String p0){
       this.taskId = p0;
    }
    public void setTitle(String p0){
       this.title = p0;
    }
    public String toString(){
       return "MPushMessage{taskId=\'"+this.taskId+'''+", pushType=\'"+this.pushType+'''+", packageName=\'"+this.packageName+'''+", title=\'"+this.title+'''+", content=\'"+this.content+'''+", notifyType=\'"+this.notifyType+'''+", clickType=\'"+this.clickType+'''+", isDiscard=\'"+this.isDiscard+'''+", extra="+this.extra+", params="+this.params+'}';
    }
}
