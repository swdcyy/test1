package com.kwai.video.cache.AcCallBackInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import com.kwai.video.hodor.BaseTaskInfo;

public class AcCallBackInfo	// class@0019e9
{
    public String cacheKey;
    public long cachedBytes;
    public String cdnStatJson;
    public long contentLength;
    public long currentSpeedKbps;
    public String currentUri;
    public long downloadBytes;
    public String downloadUUID;
    public int errorCode;
    public String errorMsg;
    public String host;
    public int httpResponseCode;
    public String ip;
    public String kwaiSign;
    public String networkType;
    public long progressPosition;
    public String sessionUUID;
    public int stopReason;
    public int taskState;
    public long totalBytes;
    public int transferConsumeMs;
    public String xKsCache;
    public static final String[] STOP_REASON_STRING;

    static {
       String[] stringArray = new String[]{"STOP_REASON_UNKNOWN","STOP_REASON_FINISHED","STOP_REASON_CANCELLED","STOP_REASON_FAILED","STOP_REASON_TIMEOUT","STOP_REASON_NO_CONTENT_LENGTH","STOP_REASON_CONTENT_LENGTH_INVALID","STOP_REASON_BYTE_RANGE_INVALID","STOP_REASON_RESOLVE_HOST_FAIL","STOP_REASON_END"};
       AcCallBackInfo.STOP_REASON_STRING = stringArray;
    }
    public void AcCallBackInfo(){
       super();
       this.taskState = -1;
    }
    public static String stopReasonToString(int p0){
       if (p0 >= 0 && p0 < 9) {
          return AcCallBackInfo.STOP_REASON_STRING[p0];
       }
       return "innerError, check AcCallBackInfo.stopReasonToString plz";
    }
    public String getPrettyString(){
       String str;
       JSONObject obj = PatchProxy.apply(null, this, AcCallBackInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("cachedBytes", this.cachedBytes);
          obj.put("cdnStatJson", this.cdnStatJson);
          obj.put("contentLength", this.contentLength);
          obj.put("currentSpeedKbps", this.currentSpeedKbps);
          obj.put("currentUri", this.currentUri);
          obj.put("downloadBytes", this.downloadBytes);
          obj.put("downloadUUID", this.downloadUUID);
          obj.put("errorCode", this.errorCode);
          obj.put("host", this.host);
          obj.put("httpResponseCode", this.httpResponseCode);
          obj.put("ip", this.ip);
          obj.put("kwaiSign", this.kwaiSign);
          obj.put("progressPosition", this.progressPosition);
          obj.put("stopReason", this.stopReason);
          obj.put("taskState", this.taskState);
          obj.put("totalBytes", this.totalBytes);
          obj.put("transferConsumeMs", this.transferConsumeMs);
          obj.put("xKsCache", this.xKsCache);
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       int i = 4;
       try{
          str = obj.toString(i);
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return str;
    }
    public String getTaskStateString(){
       Object obj = PatchProxy.apply(null, this, AcCallBackInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BaseTaskInfo.taskStateToString(this.taskState);
    }
    public boolean isFullyCached(){
       AcCallBackInfo ttotalBytes = this.totalBytes;
       boolean b = (ttotalBytes - null > 0 && !this.progressPosition - ttotalBytes)? true: false;
       return b;
    }
}
