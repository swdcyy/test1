package com.kwai.feature.api.social.im.jsbridge.model.GetGroupMemberInfoResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.KrnGroupMemberInfo;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import nsd.u;
import java.lang.Object;

public final class GetGroupMemberInfoResult implements Serializable	// class@0010dd
{
    public final ErrorInfo errorInfo;
    public final KrnGroupMemberInfo memberInfo;
    public final int resultCode;

    public void GetGroupMemberInfoResult(){
       super(0, null, null, 7, null);
    }
    public void GetGroupMemberInfoResult(int p0,KrnGroupMemberInfo p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.memberInfo = p1;
       this.errorInfo = p2;
    }
    public void GetGroupMemberInfoResult(int p0,KrnGroupMemberInfo p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
