package mg.n0;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import java.lang.String;
import f55.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult;

public final class n0 implements g	// class@00263c
{
    public final JsUploadVideoFromAlbumParams b;
    public final long c;
    public final String d;
    public final long e;
    public final g f;

    public void n0(JsUploadVideoFromAlbumParams p0,long p1,String p2,long p3,g p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       JsUploadVideoFromAlbumResult$UploadData uploadData = new JsUploadVideoFromAlbumResult$UploadData(this.b.mTaskId, p0, "0");
       uploadData.setFileSize(String.valueOf(this.c));
       uploadData.setFileType(this.d);
       uploadData.mDuration = this.e;
       this.f.onSuccess(new JsUploadVideoFromAlbumResult(uploadData, 1));
    }
}
