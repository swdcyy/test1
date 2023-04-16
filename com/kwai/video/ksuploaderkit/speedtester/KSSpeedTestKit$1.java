package com.kwai.video.ksuploaderkit.speedtester.KSSpeedTestKit$1;
import com.ks.ksapi.b;
import com.kwai.video.ksuploaderkit.speedtester.KSSpeedTestKit;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import ln.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KSSpeedTestKit$1 implements b	// class@0009bb
{
    public final KSSpeedTestKit this$0;
    public final List val$endPoints;
    public final String val$fileKey;
    public final String val$originToken;

    public void KSSpeedTestKit$1(KSSpeedTestKit p0,String p1,String p2,List p3){
       this.this$0 = p0;
       this.val$fileKey = p1;
       this.val$originToken = p2;
       this.val$endPoints = p3;
       super();
    }
    public b fetchResumeInfo(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KSSpeedTestKit$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.this$0.buildRickonTokenResponse(this.val$originToken, this.val$endPoints);
    }
    public b fetchRickonToken(){
       Object obj = PatchProxy.apply(null, this, KSSpeedTestKit$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fetchResumeInfo(this.val$fileKey);
    }
}
