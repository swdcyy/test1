package com.vivo.push.model.UnvarnishedMessage;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.p;
import org.json.JSONArray;
import org.json.JSONObject;
import com.vivo.push.util.m;
import org.json.JSONException;
import java.lang.Throwable;

public class UnvarnishedMessage	// class@00108b
{
    public String mMessage;
    public long mMsgId;
    public Map mParams;
    public int mTargetType;
    public String mTragetContent;

    public void UnvarnishedMessage(){
       super();
       this.mParams = new HashMap();
    }
    public void UnvarnishedMessage(String p0){
       super();
       this.mParams = new HashMap();
       this.packToObj(p0);
    }
    public String getMessage(){
       return this.mMessage;
    }
    public long getMsgId(){
       return this.mMsgId;
    }
    public Map getParams(){
       return this.mParams;
    }
    public int getTargetType(){
       return this.mTargetType;
    }
    public String getTragetContent(){
       return this.mTragetContent;
    }
    public final void packToObj(String p0){
       String str = "UnvarnishedMessage";
       try{
          if (TextUtils.isEmpty(p0)) {
             p.a(str, "unvarnishedMsg pack to obj is null");
             return;
          }else {
             JSONArray jSONArray = new JSONArray(p0);
             this.mTargetType = jSONArray.optInt(0);
             this.mTragetContent = jSONArray.getString(1);
             this.mMessage = jSONArray.getString(2);
             p0 = jSONArray.getString(3);
             this.mParams = m.a(new JSONObject(p0));
             return;
          }
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
          p.a(str, "unvarnishedMsg pack to obj error", e3);
          return;
       }
    }
    public void setMessage(String p0){
       this.mMessage = p0;
    }
    public void setMsgId(long p0){
       this.mMsgId = p0;
    }
    public void setParams(Map p0){
       this.mParams = p0;
    }
    public void setTargetType(int p0){
       this.mTargetType = p0;
    }
    public void setTragetContent(String p0){
       this.mTragetContent = p0;
    }
    public String unpackToJson(){
       JSONArray jSONArray = new JSONArray();
       jSONArray.put(this.mTargetType);
       jSONArray.put(this.mTragetContent);
       jSONArray.put(this.mMessage);
       UnvarnishedMessage tmParams = this.mParams;
       if (tmParams == null) {
          tmParams = new HashMap();
       }
       jSONArray.put(tmParams);
       return jSONArray.toString();
    }
}
