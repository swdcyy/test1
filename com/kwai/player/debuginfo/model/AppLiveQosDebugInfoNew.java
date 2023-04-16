package com.kwai.player.debuginfo.model.AppLiveQosDebugInfoNew;
import java.lang.Object;
import java.lang.String;

public class AppLiveQosDebugInfoNew	// class@0012e4
{
    public String adaptiveInfo;
    public String aencInit;
    public long audioBitrate;
    public int audioBufferByteLength;
    public int audioBufferTimeLength;
    public String audioDecoder;
    public int audioDelay;
    public String audioRenderType;
    public long audioTotalDataSize;
    public int blockCnt;
    public long blockDuration;
    public String comment;
    public String cpuInfo;
    public String dataSourceType;
    public long decodedDataSize;
    public String firstScreenStepCostInfo;
    public int firstScreenTimeDroppedDuration;
    public long firstScreenTimeTotal;
    public int height;
    public String host;
    public String hostInfo;
    public boolean isLiveEncrypted;
    public boolean isLiveManifest;
    public int kflvBandwidthCurrent;
    public int kflvBandwidthFragment;
    public int kflvCurrentBufferMs;
    public int kflvEstimateBufferMs;
    public int kflvPlayingBitrate;
    public int kflvPredictedBufferMs;
    public int kflvSpeedupThresholdMs;
    public String memoryInfo;
    public String playUrl;
    public String protocolVersion;
    public int sourceDeviceType;
    public int speedupThresholdMs;
    public String taskDetails;
    public long totalDataSize;
    public int totalDroppedDuration;
    public String tscInfo;
    public String upstreamType;
    public String vencDynamic;
    public String vencInit;
    public long videoBitrate;
    public int videoBlockCnt;
    public long videoBlockDuration;
    public int videoBufferByteLength;
    public int videoBufferTimeLength;
    public float videoDecodeFramesPerSecond;
    public String videoDecoder;
    public int videoDelayAftDec;
    public int videoDelayBefDec;
    public int videoDelayRecv;
    public int videoDelayRender;
    public float videoDisplayFramesPerSecond;
    public float videoReadFramesPerSecond;
    public long videoTotalDataSize;
    public int width;
    public static final int VIDEO_CAPTURER_DEVICE_BACK_CAMERA = 3;
    public static final int VIDEO_CAPTURER_DEVICE_CAMERA = 1;
    public static final int VIDEO_CAPTURER_DEVICE_FRONT_CAMERA = 2;
    public static final int VIDEO_CAPTURER_DEVICE_GLASS = 4;
    public static final int VIDEO_CAPTURER_DEVICE_UNKNOWN;

    public void AppLiveQosDebugInfoNew(){
       super();
    }
    public String getDeviceType(){
       String str;
       AppLiveQosDebugInfoNew tsourceDevic = this.sourceDeviceType;
       if (tsourceDevic != null) {
          if (tsourceDevic != 1) {
             if (tsourceDevic != 2) {
                if (tsourceDevic != 3) {
                   str = (tsourceDevic != 4)? "": "Glass";
                }else {
                   str = "BackCamera";
                }
             }else {
                str = "FrontCamera";
             }
          }else {
             str = "Camera";
          }
       }else {
          str = "Unknown";
       }
       return str;
    }
    public void setHeight(int p0){
       this.height = p0;
    }
    public void setWidth(int p0){
       this.width = p0;
    }
}
