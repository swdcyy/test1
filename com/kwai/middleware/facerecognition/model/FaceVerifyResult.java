package com.kwai.middleware.facerecognition.model.FaceVerifyResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class FaceVerifyResult implements Serializable	// class@000f1f
{
    public String deviceToken;
    public String errorCode;
    public String errorDesc;
    public String errorDomain;
    public String errorReason;
    public String liveRate;
    public String orderNo;
    public String otherInfo;
    public double ratio;
    public String sdkType;
    public String sdkVer;
    public String sign;
    public String similarity;
    public int statusCode;
    public String statusMessage;
    public double totalCost;
    public String venderVer;
    public String videoFilePath;

    public void FaceVerifyResult(int p0,String p1,String p2,String p3,String p4,String p5){
       super(p1, p0, p2, p5);
       this.errorCode = p3;
       this.otherInfo = p4;
    }
    public void FaceVerifyResult(int p0,String p1,String p2,String p3,String p4,String p5,String p6){
       super(p2, p0, p1, p6);
       this.sign = p3;
       this.liveRate = p4;
       this.similarity = p5;
    }
    public void FaceVerifyResult(String p0,int p1,String p2,String p3){
       super();
       this.sdkVer = "1.3.28";
       this.ratio = 0x3ff0000000000000;
       this.orderNo = p0;
       this.statusCode = p1;
       if (p1 != -1) {
          if (p1) {
             p0 = (p1 != 1)? null: "success";
          }else {
             p0 = "cancelled";
          }
       }else {
          p0 = "failure";
       }
       this.statusMessage = p0;
       this.sdkType = p2;
       this.venderVer = p3;
       return;
    }
    public void FaceVerifyResult(String p0,int p1,String p2,String p3,String p4,String p5){
       super(p0, p1, p2, p5);
       this.deviceToken = p3;
       this.videoFilePath = p4;
    }
    public void FaceVerifyResult(String p0,int p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8){
       super(p0, p1, p2, p8);
       this.errorDomain = p3;
       this.errorDesc = p4;
       this.errorReason = p5;
       this.otherInfo = p6;
       this.errorCode = p7;
    }
    public void setTotalCost(long p0,long p1){
       this.totalCost = (double)(p1 - p0);
    }
}
