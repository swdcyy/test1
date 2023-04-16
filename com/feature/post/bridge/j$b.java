package com.feature.post.bridge.j$b;
import r26.e;
import java.lang.String;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import f55.g;
import q46.r;
import java.lang.Object;
import r26.a;
import java.text.DecimalFormat;
import java.lang.Math;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class j$b implements e	// class@001480
{
    public final String b;
    public final JsUploadVideoFromAlbumResult$UploadData c;
    public final g d;
    public final r e;

    public void j$b(String p0,JsUploadVideoFromAlbumResult$UploadData p1,g p2,r p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void V4(float p0,a p1){
       if ((this.b).equals(p1.getSessionId()) && p0) {
          j$b tc = this.c;
          if (tc.mHasFail == null) {
             tc.setUploadData(this.b, "", new DecimalFormat("0.00").format((double)Math.min(100.00f, (p0 * 100.00f))), false, 0);
             if (p1.getUploadInfo() != null) {
                p0.mRemainingTime = p1.getUploadInfo().getUploadRemainingTime();
             }
             this.d.onSuccess(new JsUploadVideoFromAlbumResult(this.c, 1));
          }
       }
       return;
    }
    public void w9(PostStatus p0,a p1){
       if (!(this.b).equals(p1.getSessionId())) {
          return;
       }
       int i = 0;
       if (p0 == PostStatus.UPLOAD_COMPLETE) {
          this.c.setUploadData(this.b, "", "100", false, 0);
          if (p1.getUploadInfo() != null) {
             p0.mRemainingTime = p1.getUploadInfo().getUploadRemainingTime();
             UploadResult uploadResult = p1.getUploadInfo().getUploadResult();
             if (uploadResult != null) {
                p1.mPhotoId = uploadResult.getPhotoId();
                p1.mCoverUrl = uploadResult.getThumbUrl();
             }
          }
          Object[] objArray = new Object[i];
          l.D().w("JsPublishFun", "UPLOAD_COMPLETE, uploadData:"+this.c.toString(), objArray);
          this.d.onSuccess(new JsUploadVideoFromAlbumResult(this.c, 1));
       }else {
          j$b tc = this.c;
          JsUploadVideoFromAlbumResult$UploadData mHasFail = tc.mHasFail;
          if (mHasFail == null && (PostStatus.UPLOAD_FAILED == p0 || PostStatus.ENCODE_FAILED == p0)) {
             tc.setUploadData(this.b, "", "0", true, 0);
             if (p1.getUploadInfo() != null) {
                p0.mRemainingTime = p1.getUploadInfo().getUploadRemainingTime();
             }
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "bundle_result", new JsUploadVideoFromAlbumResult(this.c, -1));
             this.d.a(-1, "", uBundle);
             this.e.c(this);
          }else if(mHasFail == null && (PostStatus.ENCODE_CANCELED == p0 || PostStatus.UPLOAD_CANCELED == p0)){
             tc.setUploadData(this.b, "", "0", true, 0);
             if (p1.getUploadInfo() != null) {
                p0.mRemainingTime = p1.getUploadInfo().getUploadRemainingTime();
             }
             this.d.onSuccess(new JsUploadVideoFromAlbumResult(this.c, i));
             this.e.c(this);
          }else if(PostStatus.UPLOAD_PENDING == p0 || PostStatus.UPLOADING == p0){
             tc.mHasFail = i;
          }
       }
       return;
    }
}
