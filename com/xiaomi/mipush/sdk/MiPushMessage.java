package com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageHandler$a;
import java.lang.Object;
import java.util.HashMap;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class MiPushMessage implements PushMessageHandler$a	// class@0010e0
{
    public String alias;
    public boolean arrived;
    public String category;
    public String content;
    public String description;
    public HashMap extra;
    public boolean isNotified;
    public String messageId;
    public int messageType;
    public int notifyId;
    public int notifyType;
    public int passThrough;
    public String title;
    public String topic;
    public String userAccount;
    public static final long serialVersionUID = 0x1;

    public void MiPushMessage(){
       super();
       this.arrived = false;
       this.extra = new HashMap();
    }
    public static MiPushMessage fromBundle(Bundle p0){
       MiPushMessage miPushMessag = new MiPushMessage();
       miPushMessag.messageId = p0.getString("messageId");
       miPushMessag.messageType = p0.getInt("messageType");
       miPushMessag.passThrough = p0.getInt("passThrough");
       miPushMessag.alias = p0.getString("alias");
       miPushMessag.userAccount = p0.getString("user_account");
       miPushMessag.topic = p0.getString("topic");
       miPushMessag.content = p0.getString("content");
       miPushMessag.description = p0.getString("description");
       miPushMessag.title = p0.getString("title");
       miPushMessag.isNotified = p0.getBoolean("isNotified");
       miPushMessag.notifyId = p0.getInt("notifyId");
       miPushMessag.notifyType = p0.getInt("notifyType");
       miPushMessag.category = p0.getString("category");
       miPushMessag.extra = SerializableHook.getSerializable(p0, "extra");
       return miPushMessag;
    }
    public String getAlias(){
       return this.alias;
    }
    public String getCategory(){
       return this.category;
    }
    public String getContent(){
       return this.content;
    }
    public String getDescription(){
       return this.description;
    }
    public Map getExtra(){
       return this.extra;
    }
    public String getMessageId(){
       return this.messageId;
    }
    public int getMessageType(){
       return this.messageType;
    }
    public int getNotifyId(){
       return this.notifyId;
    }
    public int getNotifyType(){
       return this.notifyType;
    }
    public int getPassThrough(){
       return this.passThrough;
    }
    public String getTitle(){
       return this.title;
    }
    public String getTopic(){
       return this.topic;
    }
    public String getUserAccount(){
       return this.userAccount;
    }
    public boolean isArrivedMessage(){
       return this.arrived;
    }
    public boolean isNotified(){
       return this.isNotified;
    }
    public void setAlias(String p0){
       this.alias = p0;
    }
    public void setArrivedMessage(boolean p0){
       this.arrived = p0;
    }
    public void setCategory(String p0){
       this.category = p0;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setDescription(String p0){
       this.description = p0;
    }
    public void setExtra(Map p0){
       this.extra.clear();
       if (p0 != null) {
          this.extra.putAll(p0);
       }
       return;
    }
    public void setMessageId(String p0){
       this.messageId = p0;
    }
    public void setMessageType(int p0){
       this.messageType = p0;
    }
    public void setNotified(boolean p0){
       this.isNotified = p0;
    }
    public void setNotifyId(int p0){
       this.notifyId = p0;
    }
    public void setNotifyType(int p0){
       this.notifyType = p0;
    }
    public void setPassThrough(int p0){
       this.passThrough = p0;
    }
    public void setTitle(String p0){
       this.title = p0;
    }
    public void setTopic(String p0){
       this.topic = p0;
    }
    public void setUserAccount(String p0){
       this.userAccount = p0;
    }
    public Bundle toBundle(){
       Bundle uBundle = new Bundle();
       uBundle.putString("messageId", this.messageId);
       uBundle.putInt("passThrough", this.passThrough);
       uBundle.putInt("messageType", this.messageType);
       if (!TextUtils.isEmpty(this.alias)) {
          uBundle.putString("alias", this.alias);
       }
       if (!TextUtils.isEmpty(this.userAccount)) {
          uBundle.putString("user_account", this.userAccount);
       }
       if (!TextUtils.isEmpty(this.topic)) {
          uBundle.putString("topic", this.topic);
       }
       uBundle.putString("content", this.content);
       if (!TextUtils.isEmpty(this.description)) {
          uBundle.putString("description", this.description);
       }
       if (!TextUtils.isEmpty(this.title)) {
          uBundle.putString("title", this.title);
       }
       uBundle.putBoolean("isNotified", this.isNotified);
       uBundle.putInt("notifyId", this.notifyId);
       uBundle.putInt("notifyType", this.notifyType);
       if (!TextUtils.isEmpty(this.category)) {
          uBundle.putString("category", this.category);
       }
       MiPushMessage textra = this.extra;
       if (textra != null) {
          SerializableHook.putSerializable(uBundle, "extra", textra);
       }
       return uBundle;
    }
    public String toString(){
       return "messageId={"+this.messageId+"},passThrough={"+this.passThrough+"},alias={"+this.alias+"},topic={"+this.topic+"},userAccount={"+this.userAccount+"},content={"+this.content+"},description={"+this.description+"},title={"+this.title+"},isNotified={"+this.isNotified+"},notifyId={"+this.notifyId+"},notifyType={"+this.notifyType+"}, category={"+this.category+"}, extra={"+this.extra+"}";
    }
}
