package com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponse;
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

public final class UserProfileFeatureResponse	// class@00153d
{
    public String mFeatures;

    public void UserProfileFeatureResponse(){
       super(null, 1, null);
    }
    public void UserProfileFeatureResponse(String p0){
       a.p(p0, "mFeatures");
       super();
       this.mFeatures = p0;
    }
    public void UserProfileFeatureResponse(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "";
       }
       super(p0);
       return;
    }
    public static UserProfileFeatureResponse copy$default(UserProfileFeatureResponse p0,String p1,int p2,Object p3){
       UserProfileFeatureResponse mFeatures;
       if (p2 & 0x01) {
          mFeatures = p0.mFeatures;
       }
       return p0.copy(mFeatures);
    }
    public final String component1(){
       return this.mFeatures;
    }
    public final UserProfileFeatureResponse copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfileFeatureResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mFeatures");
       return new UserProfileFeatureResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfileFeatureResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserProfileFeatureResponse && a.g(this.mFeatures, p0.mFeatures))) {
          return true;
       }
       return false;
    }
    public final String getMFeatures(){
       return this.mFeatures;
    }
    public int hashCode(){
       UserProfileFeatureResponse obj = PatchProxy.apply(null, this, UserProfileFeatureResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mFeatures;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setMFeatures(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFeatureResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mFeatures = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserProfileFeatureResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserProfileFeatureResponse\(mFeatures="+this.mFeatures+"\)";
    }
}
