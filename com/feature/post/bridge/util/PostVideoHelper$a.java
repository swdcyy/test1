package com.feature.post.bridge.util.PostVideoHelper$a;
import r26.e;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import r26.a;
import java.util.HashMap;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.String;
import java.lang.Math;
import java.lang.Boolean;
import com.feature.post.bridge.jsmodel.JsUploadVideoResult;
import java.util.Map;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.feature.post.bridge.util.PostVideoHelper;
import w26.c;

public class PostVideoHelper$a implements e	// class@0014c0
{
    public final int b;
    public final b1 c;
    public final PostVideoHelper$c d;

    public void PostVideoHelper$a(int p0,b1 p1,PostVideoHelper$c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void V4(float p0,a p1){
       if (p1 != null && this.b == p1.getId()) {
          HashMap hashMap = new HashMap();
          if (p1.getUploadInfo() != null) {
             hashMap.put("filePath", p1.getUploadInfo().getFilePath());
             hashMap.put("coverKey", p1.getUploadInfo().getCoverKey());
          }
          hashMap.put("progress", String.valueOf(Math.min(100, (int)(p0 * 100.00f))));
          hashMap.put("uploadId", String.valueOf(p1.getId()));
          hashMap.put("isPublished", Boolean.toString(false));
          this.c.a(new JsUploadVideoResult(hashMap, 1));
       }
       return;
    }
    public void w9(PostStatus p0,a p1){
       HashMap hashMap;
       if (p1 != null && this.b == p1.getId()) {
          if (p0 == PostStatus.UPLOAD_COMPLETE) {
             PostVideoHelper.m(p1, this.c);
             this.c.c(this, this.d.b);
          }else {
             String str = "filePath";
             if (PostStatus.UPLOAD_FAILED == p0 || PostStatus.ENCODE_FAILED == p0) {
                hashMap = new HashMap();
                if (p1.getUploadInfo() != null) {
                   hashMap.put(str, p1.getUploadInfo().getFilePath());
                }
                hashMap.put("progress", "0");
                hashMap.put("isPublished", Boolean.toString(false));
                hashMap.put("uploadId", String.valueOf(p1.getId()));
                if (p1.getUploadInfo() != null) {
                   int i = 0xc384;
                   if (p1.getUploadInfo().getErrorCode() == i) {
                      this.c.a(new JsUploadVideoResult(hashMap, i));
                   label_00c5 :
                      this.c.c(this, this.d.b);
                   }
                }
                this.c.a(new JsUploadVideoResult(hashMap, 412));
                goto label_00c5 ;
             }else if(PostStatus.ENCODE_CANCELED == p0 || PostStatus.UPLOAD_CANCELED == p0){
                hashMap = new HashMap();
                if (p1.getUploadInfo() != null) {
                   hashMap.put(str, p1.getUploadInfo().getFilePath());
                }
                hashMap.put("progress", "0");
                hashMap.put("isPublished", Boolean.toString(false));
                this.c.a(new JsUploadVideoResult(hashMap, false));
                this.c.c(this, this.d.b);
             }
          }
       }
       return;
    }
}
