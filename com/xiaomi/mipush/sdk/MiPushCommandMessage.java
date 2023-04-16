package com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.PushMessageHandler$a;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class MiPushCommandMessage implements PushMessageHandler$a	// class@0010df
{
    public List autoMarkPkgs;
    public String category;
    public String command;
    public List commandArguments;
    public String reason;
    public long resultCode;
    public static final long serialVersionUID = 0x1;

    public void MiPushCommandMessage(){
       super();
    }
    public static MiPushCommandMessage fromBundle(Bundle p0){
       MiPushCommandMessage miPushComman = new MiPushCommandMessage();
       miPushComman.command = p0.getString("command");
       miPushComman.resultCode = p0.getLong("resultCode");
       miPushComman.reason = p0.getString("reason");
       miPushComman.commandArguments = p0.getStringArrayList("commandArguments");
       miPushComman.category = p0.getString("category");
       miPushComman.autoMarkPkgs = p0.getStringArrayList("autoMarkPkgs");
       return miPushComman;
    }
    public List getAutoMarkPkgs(){
       return this.autoMarkPkgs;
    }
    public String getCategory(){
       return this.category;
    }
    public String getCommand(){
       return this.command;
    }
    public List getCommandArguments(){
       return this.commandArguments;
    }
    public String getReason(){
       return this.reason;
    }
    public long getResultCode(){
       return this.resultCode;
    }
    public void setAutoMarkPkgs(List p0){
       this.autoMarkPkgs = p0;
    }
    public void setCategory(String p0){
       this.category = p0;
    }
    public void setCommand(String p0){
       this.command = p0;
    }
    public void setCommandArguments(List p0){
       this.commandArguments = p0;
    }
    public void setReason(String p0){
       this.reason = p0;
    }
    public void setResultCode(long p0){
       this.resultCode = p0;
    }
    public Bundle toBundle(){
       Bundle uBundle = new Bundle();
       uBundle.putString("command", this.command);
       uBundle.putLong("resultCode", this.resultCode);
       uBundle.putString("reason", this.reason);
       MiPushCommandMessage tcommandArgu = this.commandArguments;
       if (tcommandArgu != null) {
          uBundle.putStringArrayList("commandArguments", tcommandArgu);
       }
       uBundle.putString("category", this.category);
       tcommandArgu = this.autoMarkPkgs;
       if (tcommandArgu != null) {
          uBundle.putStringArrayList("autoMarkPkgs", tcommandArgu);
       }
       return uBundle;
    }
    public String toString(){
       return "command={"+this.command+"}, resultCode={"+this.resultCode+"}, reason={"+this.reason+"}, category={"+this.category+"}, commandArguments={"+this.commandArguments+"}";
    }
}
