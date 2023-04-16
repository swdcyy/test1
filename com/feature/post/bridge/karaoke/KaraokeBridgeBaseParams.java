package com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams;
import java.io.Serializable;
import com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class KaraokeBridgeBaseParams implements Serializable	// class@001497
{
    public String activity;
    public String atFriends;
    public boolean forbidRecoverDraft;
    public boolean holdPostSession;
    public boolean returnToOriginalPage;
    public String tag;
    public String topic;
    public static final KaraokeBridgeBaseParams$a Companion;

    static {
       KaraokeBridgeBaseParams.Companion = new KaraokeBridgeBaseParams$a(null);
    }
    public void KaraokeBridgeBaseParams(){
       super();
    }
    public final String getActivity(){
       return this.activity;
    }
    public final String getAtFriends(){
       return this.atFriends;
    }
    public final boolean getForbidRecoverDraft(){
       return this.forbidRecoverDraft;
    }
    public final boolean getHoldPostSession(){
       return this.holdPostSession;
    }
    public final boolean getReturnToOriginalPage(){
       return this.returnToOriginalPage;
    }
    public final String getTag(){
       return this.tag;
    }
    public final String getTopic(){
       return this.topic;
    }
    public final void setActivity(String p0){
       this.activity = p0;
    }
    public final void setAtFriends(String p0){
       this.atFriends = p0;
    }
    public final void setForbidRecoverDraft(boolean p0){
       this.forbidRecoverDraft = p0;
    }
    public final void setHoldPostSession(boolean p0){
       this.holdPostSession = p0;
    }
    public final void setReturnToOriginalPage(boolean p0){
       this.returnToOriginalPage = p0;
    }
    public final void setTag(String p0){
       this.tag = p0;
    }
    public final void setTopic(String p0){
       this.topic = p0;
    }
    public String toString(){
       return "atFriends = "+this.atFriends+" activity = "+this.activity+" tag = "+this.tag+" \n topic = "+this.topic+' '+"returnToOriginalPage = "+this.returnToOriginalPage+" holdPostSession = "+this.holdPostSession+" \n"+"forbidRecoverDraft = "+this.forbidRecoverDraft;
    }
}
