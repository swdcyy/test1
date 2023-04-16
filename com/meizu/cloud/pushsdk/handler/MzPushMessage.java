package com.meizu.cloud.pushsdk.handler.MzPushMessage;
import java.io.Serializable;
import java.lang.Object;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.model.a;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;

public class MzPushMessage implements Serializable	// class@00152f
{
    public String content;
    public int notifyId;
    public int pushType;
    public String selfDefineContentString;
    public String taskId;
    public String title;
    public static final String TAG = "MzPushMessage";

    public void MzPushMessage(){
       super();
    }
    public static MzPushMessage fromMessageV3(MessageV3 p0){
       MzPushMessage mzPushMessag = new MzPushMessage();
       mzPushMessag.setTitle(p0.getTitle());
       mzPushMessag.setContent(p0.getContent());
       mzPushMessag.setTaskId(p0.getTaskId());
       mzPushMessag.setPushType(0);
       mzPushMessag.setNotifyId(a.b(p0));
       mzPushMessag.setSelfDefineContentString(MzPushMessage.selfDefineContentString(p0.getWebUrl(), p0.getParamsMap()));
       return mzPushMessag;
    }
    public static String selfDefineContentString(String p0,Map p1){
       if (!TextUtils.isEmpty(p0)) {
       }else if(p1 != null){
          p0 = p1.get("sk");
          if (TextUtils.isEmpty(p0)) {
             p0 = e.a(p1).toString();
          }
       }else {
          p0 = null;
       }
       DebugLogger.e("MzPushMessage", "self json "+p0);
       return p0;
    }
    public String getContent(){
       return this.content;
    }
    public int getNotifyId(){
       return this.notifyId;
    }
    public int getPushType(){
       return this.pushType;
    }
    public String getSelfDefineContentString(){
       return this.selfDefineContentString;
    }
    public String getTaskId(){
       return this.taskId;
    }
    public String getTitle(){
       return this.title;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setNotifyId(int p0){
       this.notifyId = p0;
    }
    public void setPushType(int p0){
       this.pushType = p0;
    }
    public void setSelfDefineContentString(String p0){
       this.selfDefineContentString = p0;
    }
    public void setTaskId(String p0){
       this.taskId = p0;
    }
    public void setTitle(String p0){
       this.title = p0;
    }
    public String toString(){
       return "MzPushMessage{title=\'"+this.title+'''+", content=\'"+this.content+'''+", pushType="+this.pushType+", taskId=\'"+this.taskId+'''+", selfDefineContentString=\'"+this.selfDefineContentString+'''+", notifyId="+this.notifyId+'}';
    }
}
