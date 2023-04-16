package com.kwai.framework.krn.init.preload.KrnPreRequestReportInfo;
import java.io.Serializable;
import java.lang.Object;
import android.os.SystemClock;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class KrnPreRequestReportInfo implements Serializable	// class@0015f9
{
    public String bundleID;
    public int bundleVersionCode;
    public String businessName;
    public long endRequest;
    public Map extraInfo;
    public boolean hasBizRequest;
    public boolean isHit;
    public boolean isKSwitchConfig;
    public boolean isSocketReused;
    public boolean isSuccess;
    public boolean isTimeOut;
    public boolean isUseKlinkProxy;
    public long klinkTimeCost;
    public long mAegonCost;
    public long mRequestBodyLength;
    public long mResponseBodyLength;
    public long networkCost;
    public String noHitClass;
    public String noHitReason;
    public long pre2request;
    public long request2Finish;
    public long startPreRequest;
    public long startRequest;
    public long t1;
    public long t2;
    public long t3;
    public long totalCost;
    public String url;
    public static final long serialVersionUID = 0x7c817f1da6f07061;

    public void KrnPreRequestReportInfo(){
       super();
       this.startPreRequest = 0;
       this.startRequest = -1;
       this.endRequest = -1;
       this.isSuccess = false;
       this.isHit = false;
       this.pre2request = 0;
       this.networkCost = 0;
       this.request2Finish = 0;
       this.url = "";
       this.bundleID = "";
       this.businessName = "";
       this.noHitReason = "";
       this.noHitClass = "";
       this.isTimeOut = false;
       this.hasBizRequest = false;
       this.isKSwitchConfig = false;
       this.bundleVersionCode = -1;
       this.isSocketReused = false;
       this.isUseKlinkProxy = false;
       this.mAegonCost = 0;
       this.t1 = 0;
       this.t2 = 0;
       this.t3 = 0;
       this.totalCost = -1;
       this.klinkTimeCost = -1;
       this.startPreRequest = SystemClock.elapsedRealtime();
    }
    public void calculate(){
       KrnPreRequestReportInfo tstartReques = this.startRequest;
       KrnPreRequestReportInfo tstartPreReq = this.startPreRequest;
       this.pre2request = tstartReques - tstartPreReq;
       KrnPreRequestReportInfo tendRequest = this.endRequest;
       this.networkCost = tendRequest - tstartPreReq;
       this.request2Finish = tendRequest - tstartReques;
    }
    public long getEndRequest(){
       return this.endRequest;
    }
    public long getStartPreRequest(){
       return this.startPreRequest;
    }
    public void onRequestFailed(){
       if (PatchProxy.applyVoid(null, this, KrnPreRequestReportInfo.class, "3")) {
          return;
       }
       if (0 - this.endRequest > 0) {
          this.endRequest = SystemClock.elapsedRealtime();
          this.isSuccess = false;
       }
       return;
    }
    public void onRespond(){
       if (PatchProxy.applyVoid(null, this, KrnPreRequestReportInfo.class, "2")) {
          return;
       }
       if (0 - this.endRequest > 0) {
          this.endRequest = SystemClock.elapsedRealtime();
          this.isSuccess = true;
       }
       return;
    }
    public void setKlinkTimeCost(long p0){
       if (0 - this.klinkTimeCost > 0) {
          this.klinkTimeCost = p0;
       }
       return;
    }
    public void setStartRequest(long p0){
       if (0 - this.startRequest > 0) {
          this.startRequest = p0;
       }
       return;
    }
    public void setTotalCost(long p0){
       if (0 - this.totalCost > 0) {
          this.totalCost = p0;
       }
       return;
    }
    public void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnPreRequestReportInfo.class, "1")) {
          return;
       }
       if (TextUtils.x(this.url)) {
          int i = p0.indexOf("?");
          this.url = (i > -1)? p0.substring(0, i): p0;
       }
    label_0026 :
       return;
    }
}
