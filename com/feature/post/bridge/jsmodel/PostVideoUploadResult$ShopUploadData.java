package com.feature.post.bridge.jsmodel.PostVideoUploadResult$ShopUploadData;
import java.lang.String;
import r26.a;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;

public class PostVideoUploadResult$ShopUploadData	// class@001492
{
    public String mCoverUrl;
    public String mFilePath;
    public String mProgress;
    public String mStatus;
    public String mTaskId;
    public String mThumbnail;
    public String mUploadId;

    public void PostVideoUploadResult$ShopUploadData(String p0,a p1){
       super();
       this.mStatus = p0;
       if (TextUtils.equals(p0, "success")) {
          this.mProgress = String.valueOf(100);
       }
       this.mUploadId = String.valueOf(p1.getId());
       IUploadInfo uploadInfo = p1.getUploadInfo();
       if (uploadInfo == null) {
          return;
       }else {
          this.mFilePath = uploadInfo.getFilePath();
          this.mCoverUrl = uploadInfo.getCoverKey();
          if (!TextUtils.equals(p0, "failed")) {
             this.mTaskId = p1.getSessionId();
          }
          return;
       }
    }
}
