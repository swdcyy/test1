package ng.a;
import r26.e;
import og.k;
import w26.c;
import java.lang.Object;
import r26.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.util.Map;
import java.lang.Math;
import com.feature.post.bridge.YodaUploadVideoResult;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.feature.post.bridge.karaoke.KaraokeHelper;

public final class a implements e	// class@002702
{
    public final int b;
    public final k c;
    public final c d;

    public void a(int p0,k p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void V4(float p0,a p1){
       a.p(p1, "postWorkInfo");
       if (this.b != p1.getId()) {
          return;
       }
       HashMap hashMap = new HashMap();
       if (p1.getUploadInfo() != null) {
          IUploadInfo uploadInfo = p1.getUploadInfo();
          a.o(uploadInfo, "postWorkInfo.uploadInfo");
          hashMap.put("filePath", uploadInfo.getFilePath());
          uploadInfo = p1.getUploadInfo();
          a.o(uploadInfo, "postWorkInfo.uploadInfo");
          hashMap.put("coverKey", uploadInfo.getCoverKey());
       }
       hashMap.put("progress", String.valueOf(Math.min(100, (int)(p0 * (float)100))));
       hashMap.put("uploadId", String.valueOf(p1.getId()));
       hashMap.put("isPublished", String.valueOf(false));
       this.c.d(new YodaUploadVideoResult(hashMap, 1));
       return;
    }
    public void w9(PostStatus p0,a p1){
       HashMap hashMap;
       IUploadInfo uploadInfo;
       a.p(p0, "status");
       a.p(p1, "postWorkInfo");
       if (this.b != p1.getId()) {
          return;
       }
       if (p0 == PostStatus.UPLOAD_COMPLETE) {
          KaraokeHelper.a.b(p1, this.c);
          this.c.c(this, this.d);
       }else {
          String str = "postWorkInfo.uploadInfo";
          if (PostStatus.UPLOAD_FAILED == p0 || PostStatus.ENCODE_FAILED == p0) {
             hashMap = new HashMap();
             if (p1.getUploadInfo() != null) {
                uploadInfo = p1.getUploadInfo();
                a.o(uploadInfo, str);
                hashMap.put("filePath", uploadInfo.getFilePath());
             }
             hashMap.put("progress", "0");
             hashMap.put("isPublished", String.valueOf(false));
             hashMap.put("uploadId", String.valueOf(p1.getId()));
             this.c.d(new YodaUploadVideoResult(hashMap, 412));
             this.c.c(this, this.d);
          }else if(PostStatus.ENCODE_CANCELED == p0 || PostStatus.UPLOAD_CANCELED == p0){
             hashMap = new HashMap();
             if (p1.getUploadInfo() != null) {
                IUploadInfo uploadInfo1 = p1.getUploadInfo();
                a.o(uploadInfo1, str);
                hashMap.put("filePath", uploadInfo1.getFilePath());
             }
             hashMap.put("progress", "0");
             hashMap.put("isPublished", String.valueOf(false));
             this.c.d(new YodaUploadVideoResult(hashMap, false));
             this.c.c(this, this.d);
          }
       }
       return;
    }
}
