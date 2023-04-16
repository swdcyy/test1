package com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import ok.j$b;
import ok.j;

public class FollowTabNotify$TabUserInfo implements Serializable, Cloneable	// class@001e18
{
    public String mAuthorId;
    public String mHeadUrl;
    public static final long serialVersionUID = 0x6868d45feff84e5e;

    public void FollowTabNotify$TabUserInfo(){
       super();
    }
    public FollowTabNotify$TabUserInfo clone(){
       FollowTabNotify$TabUserInfo obj = PatchProxy.apply(null, this, FollowTabNotify$TabUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FollowTabNotify$TabUserInfo();
       obj.mAuthorId = this.mAuthorId;
       obj.mHeadUrl = this.mHeadUrl;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowTabNotify$TabUserInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof FollowTabNotify$TabUserInfo) {
          return false;
       }
       if (!k.a(this.mAuthorId, p0.mAuthorId) || !k.a(this.mHeadUrl, p0.mHeadUrl)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, FollowTabNotify$TabUserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mAuthorId,this.mHeadUrl};
       return k.b(obj);
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, FollowTabNotify$TabUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("mAuthorId", this.mAuthorId);
       obj.c("mHeadUrl", this.mHeadUrl);
       return obj.toString();
    }
}
