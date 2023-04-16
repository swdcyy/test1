package com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams$FinishedParamsBean;

public class JsUploadVideoFromAlbumParams implements Serializable	// class@001382
{
    public String mCallback;
    public List mEndpointList;
    public JsUploadVideoFromAlbumParams$FinishedParamsBean mFinishedParams;
    public List mLimitParams;
    public String mTaskId;
    public String mUploadToken;
    public static final long serialVersionUID = 0x3d59da2bafeaa614;

    public void JsUploadVideoFromAlbumParams(){
       super();
    }
    public RickonWholeUploadParams generateWholeUploadParams(){
       RickonWholeUploadParams obj = PatchProxy.apply(null, this, JsUploadVideoFromAlbumParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RickonWholeUploadParams();
       obj.mUploadToken = this.mUploadToken;
       obj.mServerInfoList = this.mEndpointList;
       JsUploadVideoFromAlbumParams tmFinishedPa = this.mFinishedParams;
       obj.mReportApi = tmFinishedPa.mReportApi;
       obj.mParams = tmFinishedPa.mParams;
       return obj;
    }
}
