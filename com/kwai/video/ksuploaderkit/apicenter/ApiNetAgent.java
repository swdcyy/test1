package com.kwai.video.ksuploaderkit.apicenter.ApiNetAgent;
import com.ks.ksapi.b;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import java.lang.String;
import java.lang.Object;
import ln.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import java.lang.Number;

public class ApiNetAgent implements b	// class@00098b
{
    public String mInnerTaskId;
    public ApiManager mManager;
    public ApiManager$TokenType mTokenType;

    public void ApiNetAgent(ApiManager p0,String p1){
       super();
       this.mManager = p0;
       this.mInnerTaskId = p1;
    }
    public b fetchResumeInfo(String p0){
       ApiNetAgent obj = PatchProxy.applyOneRefs(p0, this, ApiNetAgent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mManager;
       if (obj != null) {
          return obj.getResumeInfo(p0);
       }
       return null;
    }
    public b fetchRickonToken(){
       Object[] objArray = null;
       ApiNetAgent obj = PatchProxy.apply(objArray, this, ApiNetAgent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mManager;
       if (obj != null) {
          return obj.getUploadToken(this.mTokenType);
       }
       return objArray;
    }
    public long getStartFileSize(){
       ApiNetAgent obj = PatchProxy.apply(null, this, ApiNetAgent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mManager;
       if (obj != null) {
          return obj.getStartFileSize(this.mInnerTaskId);
       }
       return 0;
    }
    public ApiManager$TokenType getTokenType(){
       return this.mTokenType;
    }
    public void setTokenType(ApiManager$TokenType p0){
       this.mTokenType = p0;
    }
}
