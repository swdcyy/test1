package com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class DownloadPhotoInfoResponse implements Serializable, a	// class@000ece
{
    public String mDownloadUrl;
    public CDNUrl[] mDownloadUrls;
    public String mErrorMsg;
    public boolean mHasWatermark;
    public boolean mIsRedPack;
    public boolean mNotNeedWaterMark;
    public boolean mPhotoDownloadDeny;
    public String mSharePlatform;
    public boolean mShowCancelButton;
    public boolean mShowDownloadGuide;
    public long mVideoSize;
    public String mVideoUrl;
    public CDNUrl[] mVideoUrls;
    public static final long serialVersionUID = 0xcfe190be6ca89d0d;

    public void DownloadPhotoInfoResponse(){
       super();
    }
    public static CDNUrl[] getDownloadUrl(DownloadPhotoInfoResponse p0){
       CDNUrl[] uCDNUrlArray = null;
       DownloadPhotoInfoResponse obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, DownloadPhotoInfoResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mDownloadUrls;
       if (obj != null && obj.length) {
          return obj;
       }
       if (!TextUtils.x(p0.mDownloadUrl)) {
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[]{new CDNUrl(uCDNUrlArray, p0.mDownloadUrl)};
          uCDNUrlArray = uCDNUrlArray1;
       }
       return uCDNUrlArray;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, DownloadPhotoInfoResponse.class, "1")) {
          return;
       }
       DownloadPhotoInfoResponse tmVideoUrls = this.mVideoUrls;
       if (tmVideoUrls != null && tmVideoUrls.length > 0) {
          int len = tmVideoUrls.length;
          int i = 0;
          while (i < len) {
             object oobject = tmVideoUrls[i];
             if (oobject != null && !TextUtils.x(oobject.getUrl())) {
                this.mVideoUrl = (oobject.getUrl()).trim();
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
}
