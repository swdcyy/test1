package com.kwai.feature.api.social.bridge.beans.UserContactItem;
import java.io.Serializable;
import com.kwai.feature.api.social.bridge.beans.UserContactItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UserContactItem implements Serializable	// class@0010bf
{
    public String contactName;
    public String phoneHash;
    public static final UserContactItem$a Companion;
    public static final long serialVersionUID;

    static {
       UserContactItem.Companion = new UserContactItem$a(null);
    }
    public void UserContactItem(){
       super(null, null, 3, null);
    }
    public void UserContactItem(String p0,String p1){
       a.p(p0, "contactName");
       a.p(p1, "phoneHash");
       super();
       this.contactName = p0;
       this.phoneHash = p1;
    }
    public void UserContactItem(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       if (p2 & 0x02) {
          p1 = "";
       }
       super(p0, p1);
       return;
    }
    public static UserContactItem copy$default(UserContactItem p0,String p1,String p2,int p3,Object p4){
       UserContactItem contactName;
       UserContactItem phoneHash;
       if (p3 & 0x01) {
          contactName = p0.contactName;
       }
       if (p3 & 0x02) {
          phoneHash = p0.phoneHash;
       }
       return p0.copy(contactName, phoneHash);
    }
    public final String component1(){
       return this.contactName;
    }
    public final String component2(){
       return this.phoneHash;
    }
    public final UserContactItem copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserContactItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "contactName");
       a.p(p1, "phoneHash");
       return new UserContactItem(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserContactItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserContactItem && (a.g(this.contactName, p0.contactName) && a.g(this.phoneHash, p0.phoneHash)))) {
          return true;
       }
       return false;
    }
    public final String getContactName(){
       return this.contactName;
    }
    public final String getPhoneHash(){
       return this.phoneHash;
    }
    public int hashCode(){
       UserContactItem obj = PatchProxy.apply(null, this, UserContactItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.contactName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UserContactItem tphoneHash = this.phoneHash;
       if (tphoneHash != null) {
          i = tphoneHash.hashCode();
       }
       return (i1 + i);
    }
    public final void setContactName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserContactItem.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.contactName = p0;
       return;
    }
    public final void setPhoneHash(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserContactItem.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.phoneHash = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserContactItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "name: "+this.contactName+" phoneHash: "+this.phoneHash;
    }
}
