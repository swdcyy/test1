package com.kuaishou.gifshow.kuaishan.mediascene.network.model.AvatarPostTopicResponse;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AvatarPostTopicResponse implements Serializable	// class@001a85
{
    public String mTopic;

    public void AvatarPostTopicResponse(){
       super(null, 1, null);
    }
    public void AvatarPostTopicResponse(String p0){
       a.p(p0, "mTopic");
       super();
       this.mTopic = p0;
    }
    public void AvatarPostTopicResponse(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "";
       }
       super(p0);
       return;
    }
    public static AvatarPostTopicResponse copy$default(AvatarPostTopicResponse p0,String p1,int p2,Object p3){
       AvatarPostTopicResponse mTopic;
       if (p2 & 0x01) {
          mTopic = p0.mTopic;
       }
       return p0.copy(mTopic);
    }
    public final String component1(){
       return this.mTopic;
    }
    public final AvatarPostTopicResponse copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarPostTopicResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mTopic");
       return new AvatarPostTopicResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AvatarPostTopicResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AvatarPostTopicResponse && a.g(this.mTopic, p0.mTopic))) {
          return true;
       }
       return false;
    }
    public final String getMTopic(){
       return this.mTopic;
    }
    public int hashCode(){
       AvatarPostTopicResponse obj = PatchProxy.apply(null, this, AvatarPostTopicResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTopic;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setMTopic(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarPostTopicResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTopic = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AvatarPostTopicResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AvatarPostTopicResponse\(mTopic="+this.mTopic+"\)";
    }
}
