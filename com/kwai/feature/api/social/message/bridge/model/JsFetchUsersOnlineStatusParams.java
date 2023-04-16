package com.kwai.feature.api.social.message.bridge.model.JsFetchUsersOnlineStatusParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsFetchUsersOnlineStatusParams implements Serializable	// class@001127
{
    public final String callback;
    public final String subBiz;
    public final List uIds;

    public void JsFetchUsersOnlineStatusParams(String p0,List p1,String p2){
       super();
       this.subBiz = p0;
       this.uIds = p1;
       this.callback = p2;
    }
    public static JsFetchUsersOnlineStatusParams copy$default(JsFetchUsersOnlineStatusParams p0,String p1,List p2,String p3,int p4,Object p5){
       JsFetchUsersOnlineStatusParams subBiz;
       JsFetchUsersOnlineStatusParams uIds;
       JsFetchUsersOnlineStatusParams callback;
       if (p4 & 0x01) {
          subBiz = p0.subBiz;
       }
       if (p4 & 0x02) {
          uIds = p0.uIds;
       }
       if (p4 & 0x04) {
          callback = p0.callback;
       }
       return p0.copy(subBiz, uIds, callback);
    }
    public final String component1(){
       return this.subBiz;
    }
    public final List component2(){
       return this.uIds;
    }
    public final String component3(){
       return this.callback;
    }
    public final JsFetchUsersOnlineStatusParams copy(String p0,List p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, JsFetchUsersOnlineStatusParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsFetchUsersOnlineStatusParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsFetchUsersOnlineStatusParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsFetchUsersOnlineStatusParams && (a.g(this.subBiz, p0.subBiz) && (a.g(this.uIds, p0.uIds) && a.g(this.callback, p0.callback))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getSubBiz(){
       return this.subBiz;
    }
    public final List getUIds(){
       return this.uIds;
    }
    public int hashCode(){
       JsFetchUsersOnlineStatusParams obj = PatchProxy.apply(null, this, JsFetchUsersOnlineStatusParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsFetchUsersOnlineStatusParams tuIds = this.uIds;
       int i2 = (tuIds != null)? tuIds.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuIds = this.callback;
       if (tuIds != null) {
          i = tuIds.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsFetchUsersOnlineStatusParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsFetchUsersOnlineStatusParams\(subBiz="+this.subBiz+", uIds="+this.uIds+", callback="+this.callback+"\)";
    }
}
