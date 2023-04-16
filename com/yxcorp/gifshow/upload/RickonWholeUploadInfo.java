package com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class RickonWholeUploadInfo extends UploadInfo	// class@001e4c
{
    public String mCoverUploadUrl;
    public String mHttpEndpoint;
    public Map mParams;
    public String mReportApi;
    public List mServerInfoList;
    public String mUploadToken;

    public void RickonWholeUploadInfo(UploadInfo p0){
       super(p0);
    }
    public void RickonWholeUploadInfo(UploadRequest p0){
       super(p0);
       p0 = p0.mRickonWholeUploadParams;
       if (p0 == null) {
          return;
       }
       this.mUploadToken = p0.mUploadToken;
       ArrayList uArrayList = new ArrayList();
       this.mServerInfoList = uArrayList;
       uArrayList.addAll(p0.mServerInfoList);
       this.mCoverUploadUrl = p0.mCoverUploadUrl;
       this.mReportApi = p0.mReportApi;
       this.mParams = p0.mParams;
       this.mHttpEndpoint = p0.mHttpEndpoint;
       return;
    }
    public UploadInfo clone(){
       Object obj = PatchProxy.apply(null, this, RickonWholeUploadInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RickonWholeUploadInfo(this);
    }
    public Object clone(){
       return this.clone();
    }
    public String getCoverUploadUrl(){
       return this.mCoverUploadUrl;
    }
    public Map getParams(){
       return this.mParams;
    }
    public String getReportApi(){
       return this.mReportApi;
    }
    public List getServerInfoList(){
       return this.mServerInfoList;
    }
    public String getUploadToken(){
       return this.mUploadToken;
    }
    public boolean hasVideoUploadInfo(){
       RickonWholeUploadInfo obj = PatchProxy.apply(null, this, RickonWholeUploadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mServerInfoList;
       boolean b = (obj != null && (!obj.isEmpty() && !TextUtils.isEmpty(this.mUploadToken)))? true: false;
       return b;
    }
    public boolean isNeedUploadCover(){
       Object obj = PatchProxy.apply(null, this, RickonWholeUploadInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.mCoverUploadUrl) ^ 0x01);
    }
    public void updateUploadInfo(UploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RickonWholeUploadInfo.class, "2")) {
          return;
       }
       super.updateUploadInfo(p0);
       if (!p0 instanceof RickonWholeUploadInfo) {
          return;
       }
       this.mUploadToken = p0.mUploadToken;
       ArrayList uArrayList = new ArrayList();
       this.mServerInfoList = uArrayList;
       uArrayList.addAll(p0.mServerInfoList);
       this.mCoverUploadUrl = p0.mCoverUploadUrl;
       this.mReportApi = p0.mReportApi;
       this.mParams = p0.mParams;
       return;
    }
}
