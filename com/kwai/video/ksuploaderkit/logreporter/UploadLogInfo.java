package com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo$DNSResolveStats;
import java.util.List;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;

public class UploadLogInfo	// class@0009a8
{
    public KSUploaderKitCommon$BusinessType mBusinessType;
    public int mCloseReason;
    public ArrayList mDNSResolveStatsList;
    public long mEndTime;
    public String mErrorMsg;
    public long mFileSize;
    public HttpRequestInfo mHttpRequestInfo;
    public KSUploaderKitCommon$MediaType mMediaType;
    public List mOriginGatewayInfoList;
    public long mStartTime;
    public String mStatsJson;
    public long mUploadStatus;
    public String mUploadType;

    public void UploadLogInfo(){
       super();
       this.mUploadType = "Rickon";
    }
    public KSUploaderKitCommon$BusinessType getBusinessType(){
       UploadLogInfo tmBusinessTy = this.mBusinessType;
       if (tmBusinessTy != null) {
          return tmBusinessTy;
       }
       return KSUploaderKitCommon$BusinessType.Unknown;
    }
    public int getCloseReason(){
       return this.mCloseReason;
    }
    public String getDNSResolveStatsListString(){
       Object[] objArray = null;
       UploadLogInfo obj = PatchProxy.apply(objArray, this, UploadLogInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDNSResolveStatsList;
       if (obj == null || obj.size() <= 0) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList(this.mDNSResolveStatsList.size());
       Iterator iterator = this.mDNSResolveStatsList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next().toJson();
          if (str != null) {
             uArrayList.add(str);
          }
       }
       return uArrayList.toString();
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
    public long getFileSize(){
       return this.mFileSize;
    }
    public String getGatewayInfoListString(){
       Object[] objArray = null;
       UploadLogInfo obj = PatchProxy.apply(objArray, this, UploadLogInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOriginGatewayInfoList;
       if (obj == null || obj.size() <= 0) {
          return objArray;
       }
       ArrayList uArrayList = new ArrayList(this.mOriginGatewayInfoList.size());
       Iterator iterator = this.mOriginGatewayInfoList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next().toJson();
          if (str != null) {
             uArrayList.add(str);
          }
       }
       return uArrayList.toString();
    }
    public HttpRequestInfo getHttpRequestInfo(){
       return this.mHttpRequestInfo;
    }
    public KSUploaderKitCommon$MediaType getMediaType(){
       return this.mMediaType;
    }
    public String getStatsJson(){
       return this.mStatsJson;
    }
    public long getTimeCost(){
       UploadLogInfo tmEndTime = this.mEndTime;
       UploadLogInfo tmStartTime = this.mStartTime;
       if (tmEndTime - tmStartTime < 0) {
          return 0;
       }
       return (tmEndTime - tmStartTime);
    }
    public long getUploadStatus(){
       return this.mUploadStatus;
    }
    public String getUploadType(){
       return this.mUploadType;
    }
    public void setBusinessType(KSUploaderKitCommon$BusinessType p0){
       this.mBusinessType = p0;
    }
    public void setCloseReason(int p0){
       this.mCloseReason = p0;
    }
    public void setDNSResolveStats(ArrayList p0){
       this.mDNSResolveStatsList = p0;
    }
    public void setEndTime(long p0){
       this.mEndTime = p0;
    }
    public void setErrorMsg(String p0){
       this.mErrorMsg = p0;
    }
    public void setFileSize(long p0){
       this.mFileSize = p0;
    }
    public void setGatewayInfoList(List p0){
       this.mOriginGatewayInfoList = p0;
    }
    public void setHttpRequestInfo(HttpRequestInfo p0){
       this.mHttpRequestInfo = p0;
    }
    public void setMediaType(KSUploaderKitCommon$MediaType p0){
       this.mMediaType = p0;
    }
    public void setStartTime(long p0){
       this.mStartTime = p0;
    }
    public void setStatsJson(String p0){
       this.mStatsJson = p0;
    }
    public void setUploadStatus(long p0){
       this.mUploadStatus = p0;
    }
    public void setUploadType(String p0){
       this.mUploadType = p0;
    }
}
