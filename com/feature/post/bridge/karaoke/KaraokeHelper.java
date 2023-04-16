package com.feature.post.bridge.karaoke.KaraokeHelper;
import java.lang.Object;
import og.k;
import r16.f;
import w26.c;
import n3d.a;
import com.feature.post.bridge.karaoke.KaraokeHelper$a;
import r26.a;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.feature.post.bridge.YodaUploadVideoResult;

public final class KaraokeHelper	// class@00149f
{
    public static final KaraokeHelper a;

    static {
       KaraokeHelper.a = new KaraokeHelper();
    }
    public void KaraokeHelper(){
       super();
    }
    public final a a(k p0,int p1,f p2,c p3){
       return new KaraokeHelper$a(p1, p0, p2, p3);
    }
    public final void b(a p0,k p1){
       HashMap hashMap = new HashMap();
       hashMap.put("isPublished", String.valueOf(true));
       hashMap.put("progress", "100");
       if (p0 != null) {
          hashMap.put("uploadId", String.valueOf(p0.getId()));
          if (p0.getUploadInfo() != null) {
             IUploadInfo uploadInfo = p0.getUploadInfo();
             a.o(uploadInfo, "postWorkInfo.uploadInfo");
             hashMap.put("filePath", uploadInfo.getFilePath());
             uploadInfo = p0.getUploadInfo();
             a.o(uploadInfo, "postWorkInfo.uploadInfo");
             UploadResult uploadResult = uploadInfo.getUploadResult();
             a.o(uploadResult, "postWorkInfo.uploadInfo.uploadResult");
             hashMap.put("photoId", uploadResult.getPhotoId());
             uploadInfo = p0.getUploadInfo();
             a.o(uploadInfo, "postWorkInfo.uploadInfo");
             uploadResult = uploadInfo.getUploadResult();
             a.o(uploadResult, "postWorkInfo.uploadInfo.uploadResult");
             hashMap.put("coverUrl", uploadResult.getThumbUrl());
             uploadInfo = p0.getUploadInfo();
             a.o(uploadInfo, "postWorkInfo.uploadInfo");
             uploadResult = uploadInfo.getUploadResult();
             a.o(uploadResult, "postWorkInfo.uploadInfo.uploadResult");
             hashMap.put("videoUrl", uploadResult.getVideoUrl());
             IUploadInfo uploadInfo1 = p0.getUploadInfo();
             a.o(uploadInfo1, "postWorkInfo.uploadInfo");
             hashMap.put("coverKey", uploadInfo1.getCoverKey());
          }
       }
       p1.d(new YodaUploadVideoResult(hashMap, true));
       return;
    }
}
