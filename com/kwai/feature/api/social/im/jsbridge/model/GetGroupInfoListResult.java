package com.kwai.feature.api.social.im.jsbridge.model.GetGroupInfoListResult;
import java.io.Serializable;
import java.util.Map;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import nsd.u;
import java.lang.Object;

public final class GetGroupInfoListResult implements Serializable	// class@0010dc
{
    public final ErrorInfo errorInfo;
    public final Map groupInfo;
    public final int resultCode;

    public void GetGroupInfoListResult(){
       super(0, null, null, 7, null);
    }
    public void GetGroupInfoListResult(int p0,Map p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.groupInfo = p1;
       this.errorInfo = p2;
    }
    public void GetGroupInfoListResult(int p0,Map p1,ErrorInfo p2,int p3,u p4){
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
