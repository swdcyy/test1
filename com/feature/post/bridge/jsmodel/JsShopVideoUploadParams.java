package com.feature.post.bridge.jsmodel.JsShopVideoUploadParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;

public class JsShopVideoUploadParams implements Serializable	// class@00148f
{
    public Map mArgsMap;
    public String mCallback;
    public String mCoverUploadUrl;
    public List mEndpointList;
    public String mTaskId;
    public String mUploadToken;
    public static final long serialVersionUID = 0xf8f9bd9215a360df;

    public void JsShopVideoUploadParams(){
       super();
    }
    public RickonWholeUploadParams generateWholeUploadParams(){
       RickonWholeUploadParams rickonWholeU = new RickonWholeUploadParams();
       rickonWholeU.mTaskId = this.mTaskId;
       rickonWholeU.mUploadToken = this.mUploadToken;
       rickonWholeU.mServerInfoList = this.mEndpointList;
       rickonWholeU.mCoverUploadUrl = this.mCoverUploadUrl;
       return rickonWholeU;
    }
}
