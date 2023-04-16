package com.kwai.feature.api.social.bridge.beans.ContactInfoBridgeResult;
import java.io.Serializable;
import com.kwai.feature.api.social.bridge.beans.ContactInfoBridgeResult$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class ContactInfoBridgeResult implements Serializable	// class@001081
{
    public int result;
    public List userContactList;
    public static final ContactInfoBridgeResult$a Companion;
    public static final long serialVersionUID;

    static {
       ContactInfoBridgeResult.Companion = new ContactInfoBridgeResult$a(null);
    }
    public void ContactInfoBridgeResult(){
       super();
       this.result = 1;
    }
    public final int getResult(){
       return this.result;
    }
    public final List getUserContactList(){
       return this.userContactList;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
    public final void setUserContactList(List p0){
       this.userContactList = p0;
    }
}
