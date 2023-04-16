package com.meizu.cloud.pushsdk.handler.MessageV4;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MessageV4$1;
import android.os.Parcel;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Object;

public class MessageV4 extends MessageV3	// class@00152e
{
    public ActVideoSetting actVideoSetting;
    public static final Parcelable$Creator CREATOR;
    public static final String TAG;

    static {
       MessageV4.CREATOR = new MessageV4$1();
    }
    public void MessageV4(){
       super();
    }
    public void MessageV4(Parcel p0){
       this.actVideoSetting = p0.readParcelable(ActVideoSetting.class.getClassLoader());
    }
    public static MessageV4 parse(MessageV3 p0){
       String str = "acts";
       String str1 = "extra";
       MessageV4 messageV4 = new MessageV4();
       if (!TextUtils.isEmpty(p0.getNotificationMessage())) {
          try{
             JSONObject jSONObject = new JSONObject(p0.getNotificationMessage()).getJSONObject("data");
             if (!jSONObject.isNull(str1)) {
                jSONObject = jSONObject.getJSONObject(str1);
                if (!jSONObject.isNull(str)) {
                   messageV4.setActVideoSetting(ActVideoSetting.parse(jSONObject.getJSONObject(str)));
                }
             }
          }catch(org.json.JSONException e5){
             DebugLogger.e("MessageV4", "parse messageV4 error "+e5.getMessage());
          }
       }
    }
    public ActVideoSetting getActVideoSetting(){
       return this.actVideoSetting;
    }
    public void setActVideoSetting(ActVideoSetting p0){
       this.actVideoSetting = p0;
    }
    public String toString(){
       return "MessageV4{actVideoSetting="+this.actVideoSetting+'}'+super.toString();
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeParcelable(this.actVideoSetting, p1);
    }
}
