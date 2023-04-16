package com.kwai.video.krtc.QosInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.AssertionError;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import com.kwai.video.krtc.utils.Log;

public class QosInfo	// class@000768
{
    public int blockCnt;
    public long callerCallingTime;
    public long callerConnectedTime;
    public long callerNegotiationTime;
    public long cpuFreqDnCnt;
    public long cpuFreqUpCnt;
    public int droppedVideoFrames;
    public float encodeAKbps;
    public float encodeVKbps;
    public int encodedFrames;
    public int errorCode;
    public long fsDuration;
    public int fsRxBlockCnt;
    public long fsRxBlockTotalTime;
    public int fsRxDropFrmCnt;
    public int fsRxPktCnt;
    public int fsRxPktKByte;
    public int fsTxBlockCnt;
    public String idc;
    public int liveEncodeType;
    public long livePushEndTime;
    public long livePushStartTime;
    public String liveStreamId;
    public String pushUrl;
    public int retryCnt;
    public String role;
    public int rtUploadNum;
    public String rtmpHostIP;
    public String sdkVersion;
    public String serverMode;
    public long totalDuration;
    public int uploadedKByte;

    public void QosInfo(){
       super();
    }
    public void QosInfo(String p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,int p8,int p9,int p10,int p11,int p12,int p13,int p14,int p15,int p16,int p17,int p18,int p19,long p20,long p21,long p22,long p23,long p24,long p25,long p26,long p27,long p28,long p29,float p30,float p31){
       int i = this;
       super();
       i.rtmpHostIP = p0;
       i.serverMode = p1;
       i.idc = p2;
       i.role = p3;
       i.sdkVersion = p4;
       i.liveStreamId = p5;
       i.pushUrl = p6;
       i.uploadedKByte = p7;
       i.encodedFrames = p8;
       i.droppedVideoFrames = p9;
       i.rtUploadNum = p10;
       i.errorCode = p11;
       i.blockCnt = p12;
       i.retryCnt = p13;
       i.liveEncodeType = p14;
       i.fsRxBlockCnt = p15;
       i.fsTxBlockCnt = p16;
       i.fsRxPktCnt = p17;
       i.fsRxPktKByte = p18;
       i.fsRxDropFrmCnt = p19;
       i.livePushStartTime = p20;
       i.livePushEndTime = p21;
       i.totalDuration = p22;
       i.callerCallingTime = p23;
       i.callerConnectedTime = p24;
       i.callerNegotiationTime = p25;
       i.fsRxBlockTotalTime = p26;
       i.fsDuration = p27;
       i.cpuFreqUpCnt = p28;
       i.cpuFreqDnCnt = p29;
       i.encodeVKbps = p30;
       i.encodeAKbps = p31;
    }
    public static void assertTrue(boolean p0){
       QosInfo qosInfo = QosInfo.class;
       if (PatchProxy.isSupport(qosInfo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, qosInfo, "3")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new AssertionError("Expected condition to be true");
    }
    public void checkSelf(boolean p0){
       QosInfo tidc;
       QosInfo qosInfo = QosInfo.class;
       if (PatchProxy.isSupport(qosInfo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, qosInfo, "2")) {
          return;
       }
       boolean b = true;
       p0 = (this.serverMode != null)? true: false;
       QosInfo.assertTrue(p0);
       if ((this.serverMode).equals("mcu") && (this.role).equals("anchor")) {
          tidc = this.idc;
          tidc = (tidc != null && !tidc.isEmpty())? true: false;
          QosInfo.assertTrue(tidc);
       }
       tidc = (this.encodeVKbps >= 0)? true: false;
       QosInfo.assertTrue(tidc);
       tidc = (this.encodeAKbps >= 0)? true: false;
       QosInfo.assertTrue(tidc);
       tidc = (this.uploadedKByte >= null)? true: false;
       QosInfo.assertTrue(tidc);
       tidc = (this.encodedFrames >= null)? true: false;
       QosInfo.assertTrue(tidc);
       if (this.errorCode > null) {
          b = false;
       }
       QosInfo.assertTrue(b);
       return;
    }
    public int getBlockCnt(){
       return this.blockCnt;
    }
    public long getCallerCallingTime(){
       return this.callerCallingTime;
    }
    public long getCallerConnectedTime(){
       return this.callerConnectedTime;
    }
    public long getCallerNegotiationTime(){
       return this.callerNegotiationTime;
    }
    public long getCpuFreqDnCnt(){
       return this.cpuFreqDnCnt;
    }
    public long getCpuFreqUpCnt(){
       return this.cpuFreqUpCnt;
    }
    public int getDroppedVideoFrames(){
       return this.droppedVideoFrames;
    }
    public float getEncodeAKbps(){
       return this.encodeAKbps;
    }
    public float getEncodeVKbps(){
       return this.encodeVKbps;
    }
    public int getEncodedFrames(){
       return this.encodedFrames;
    }
    public int getErrorCode(){
       return this.errorCode;
    }
    public long getFsDuration(){
       return this.fsDuration;
    }
    public int getFsRxBlockCnt(){
       return this.fsRxBlockCnt;
    }
    public long getFsRxBlockTotalTime(){
       return this.fsRxBlockTotalTime;
    }
    public int getFsRxDropFrmCnt(){
       return this.fsRxDropFrmCnt;
    }
    public int getFsRxPktCnt(){
       return this.fsRxPktCnt;
    }
    public int getFsRxPktKByte(){
       return this.fsRxPktKByte;
    }
    public int getFsTxBlockCnt(){
       return this.fsTxBlockCnt;
    }
    public String getIdc(){
       return this.idc;
    }
    public int getLiveEncodeType(){
       return this.liveEncodeType;
    }
    public long getLivePushEndTime(){
       return this.livePushEndTime;
    }
    public long getLivePushStartTime(){
       return this.livePushStartTime;
    }
    public String getLiveStreamId(){
       return this.liveStreamId;
    }
    public String getPushUrl(){
       return this.pushUrl;
    }
    public int getRetryCnt(){
       return this.retryCnt;
    }
    public String getRole(){
       return this.role;
    }
    public int getRtUploadNum(){
       return this.rtUploadNum;
    }
    public String getRtmpHostIP(){
       return this.rtmpHostIP;
    }
    public String getSdkVersion(){
       return this.sdkVersion;
    }
    public String getServerMode(){
       return this.serverMode;
    }
    public long getTotalDuration(){
       return this.totalDuration;
    }
    public int getUploadedKByte(){
       return this.uploadedKByte;
    }
    public void print(){
       if (PatchProxy.applyVoid(null, this, QosInfo.class, "1")) {
          return;
       }
       Object[] objArray = new Object[32];
       objArray[0] = this.rtmpHostIP;
       objArray[1] = this.serverMode;
       objArray[2] = this.idc;
       objArray[3] = this.role;
       objArray[4] = this.sdkVersion;
       objArray[5] = this.liveStreamId;
       objArray[6] = this.pushUrl;
       objArray[7] = Integer.valueOf(this.uploadedKByte);
       objArray[8] = Integer.valueOf(this.encodedFrames);
       objArray[9] = Integer.valueOf(this.droppedVideoFrames);
       objArray[10] = Integer.valueOf(this.rtUploadNum);
       objArray[11] = Integer.valueOf(this.errorCode);
       objArray[12] = Integer.valueOf(this.blockCnt);
       objArray[13] = Integer.valueOf(this.retryCnt);
       objArray[14] = Integer.valueOf(this.liveEncodeType);
       objArray[15] = Integer.valueOf(this.fsRxBlockCnt);
       objArray[16] = Integer.valueOf(this.fsTxBlockCnt);
       objArray[17] = Integer.valueOf(this.fsRxPktCnt);
       objArray[18] = Integer.valueOf(this.fsRxPktKByte);
       objArray[19] = Integer.valueOf(this.fsRxDropFrmCnt);
       objArray[20] = Long.valueOf(this.livePushStartTime);
       objArray[21] = Long.valueOf(this.livePushEndTime);
       objArray[22] = Long.valueOf(this.totalDuration);
       objArray[23] = Long.valueOf(this.callerCallingTime);
       objArray[24] = Long.valueOf(this.callerConnectedTime);
       objArray[25] = Long.valueOf(this.callerNegotiationTime);
       objArray[26] = Long.valueOf(this.fsRxBlockTotalTime);
       objArray[27] = Long.valueOf(this.fsDuration);
       objArray[28] = Long.valueOf(this.cpuFreqUpCnt);
       objArray[29] = Long.valueOf(this.cpuFreqDnCnt);
       objArray[30] = Float.valueOf(this.encodeVKbps);
       objArray[31] = Float.valueOf(this.encodeAKbps);
       Log.i("QosInfo", String.format("rtmpHostIP: %s, serverMode: %s, idc: %s, role: %s, sdkVersion: %s, liveStreamId: %s, pushUrl: %s, uploadedKByte: %d, encodedFrames: %d, droppedVideoFrames: %d, rtUploadNum: %d, errorCode: %d, blockCnt: %d, retryCnt: %d, liveEncodeType: %d, fsRxBlockCnt: %d, fsTxBlockCnt: %d, fsRxPktCnt: %d, fsRxPktKByte: %d, fsRxDropFrmCnt: %d, livePushStartTime: %d, livePushEndTime: %d, totalDuration: %d, callerCallingTime: %d, callerConnectedTime: %d, callerNegotiationTime: %d, fsRxBlockTotalTime: %d, fsDuration: %d, cpuFreqUpCnt: %d, cpuFreqDnCnt: %d, encodeVKbps: %f, encodeAKbps: %f ", objArray));
       return;
    }
    public QosInfo setBlockCnt(int p0){
       this.blockCnt = p0;
       return this;
    }
    public QosInfo setCallerCallingTime(long p0){
       this.callerCallingTime = p0;
       return this;
    }
    public QosInfo setCallerConnectedTime(long p0){
       this.callerConnectedTime = p0;
       return this;
    }
    public QosInfo setCallerNegotiationTime(long p0){
       this.callerNegotiationTime = p0;
       return this;
    }
    public QosInfo setCpuFreqDnCnt(long p0){
       this.cpuFreqDnCnt = p0;
       return this;
    }
    public QosInfo setCpuFreqUpCnt(long p0){
       this.cpuFreqUpCnt = p0;
       return this;
    }
    public QosInfo setDroppedVideoFrames(int p0){
       this.droppedVideoFrames = p0;
       return this;
    }
    public QosInfo setEncodeAKbps(float p0){
       this.encodeAKbps = p0;
       return this;
    }
    public QosInfo setEncodeVKbps(float p0){
       this.encodeVKbps = p0;
       return this;
    }
    public QosInfo setEncodedFrames(int p0){
       this.encodedFrames = p0;
       return this;
    }
    public QosInfo setErrorCode(int p0){
       this.errorCode = p0;
       return this;
    }
    public QosInfo setFsDuration(long p0){
       this.fsDuration = p0;
       return this;
    }
    public QosInfo setFsRxBlockCnt(int p0){
       this.fsRxBlockCnt = p0;
       return this;
    }
    public QosInfo setFsRxBlockTotalTime(long p0){
       this.fsRxBlockTotalTime = p0;
       return this;
    }
    public QosInfo setFsRxDropFrmCnt(int p0){
       this.fsRxDropFrmCnt = p0;
       return this;
    }
    public QosInfo setFsRxPktCnt(int p0){
       this.fsRxPktCnt = p0;
       return this;
    }
    public QosInfo setFsRxPktKByte(int p0){
       this.fsRxPktKByte = p0;
       return this;
    }
    public QosInfo setFsTxBlockCnt(int p0){
       this.fsTxBlockCnt = p0;
       return this;
    }
    public QosInfo setIdc(String p0){
       this.idc = p0;
       return this;
    }
    public QosInfo setLiveEncodeType(int p0){
       this.liveEncodeType = p0;
       return this;
    }
    public QosInfo setLivePushEndTime(long p0){
       this.livePushEndTime = p0;
       return this;
    }
    public QosInfo setLivePushStartTime(long p0){
       this.livePushStartTime = p0;
       return this;
    }
    public QosInfo setLiveStreamId(String p0){
       this.liveStreamId = p0;
       return this;
    }
    public QosInfo setPushUrl(String p0){
       this.pushUrl = p0;
       return this;
    }
    public QosInfo setRetryCnt(int p0){
       this.retryCnt = p0;
       return this;
    }
    public QosInfo setRole(String p0){
       this.role = p0;
       return this;
    }
    public QosInfo setRtUploadNum(int p0){
       this.rtUploadNum = p0;
       return this;
    }
    public QosInfo setRtmpHostIP(String p0){
       this.rtmpHostIP = p0;
       return this;
    }
    public QosInfo setSdkVersion(String p0){
       this.sdkVersion = p0;
       return this;
    }
    public QosInfo setServerMode(String p0){
       this.serverMode = p0;
       return this;
    }
    public QosInfo setTotalDuration(long p0){
       this.totalDuration = p0;
       return this;
    }
    public QosInfo setUploadedKByte(int p0){
       this.uploadedKByte = p0;
       return this;
    }
}
