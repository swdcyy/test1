package com.kwai.feature.api.social.bridge.beans.JsFollowRequestResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.social.bridge.beans.JsFollowRequestResult$a;
import java.lang.Enum;

public class JsFollowRequestResult implements Serializable	// class@001095
{
    public String mErrorMsg;
    public int mResult;
    public int mStatus;
    public static final long serialVersionUID = 0xf1a9a50a4e19b50e;

    public void JsFollowRequestResult(int p0,int p1){
       super();
       this.mResult = p0;
       this.mStatus = p1;
    }
    public void JsFollowRequestResult(int p0,int p1,String p2){
       super();
       this.mResult = p0;
       this.mStatus = p1;
       this.mErrorMsg = p2;
    }
    public void JsFollowRequestResult(int p0,String p1){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
    public static int followStatusToInt(User$FollowStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsFollowRequestResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = JsFollowRequestResult$a.a[p0.ordinal()];
       int i1 = 2;
       if (i != 1) {
          if (i != i1) {
             i1 = 0;
          }
       }else {
          i1 = 1;
       }
       return i1;
    }
}
