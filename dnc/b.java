package dnc.b;
import io.reactivex.g;
import com.yxcorp.gifshow.upload.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import ekd.k1;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import com.yxcorp.gifshow.upload.e;
import com.ks.ksapi.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postwork.a;
import tkd.b;
import tkd.d;
import f0c.t;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.yxcorp.gifshow.upload.f;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;
import java.lang.Boolean;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import com.ks.ksuploader.KSFileUploader;
import java.lang.Long;

public final class b implements g	// class@00228d
{
    public final g b;
    public final UploadInfo c;
    public final String d;
    public final List e;
    public final String f;

    public void b(g p0,UploadInfo p1,String p2,List p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       e uoe = new e(tb, tc, this.d, this.e, k1.i(), this.f);
       int i = 1;
       tb.b = new PipelineUploadTask(v11, tc.mResumeKey, i);
       a uoa = PatchProxy.apply(null, tb, g.class, "6");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = d.a(-273232199).a20();
       }
       tb.b.e(new f(tb, tc, p0, uoa.c4(tc.getId())));
       tb.b.d(tc.getVideoDuration());
       g b = tb.b;
       String filePath = tc.getFilePath();
       Objects.requireNonNull(b);
       PipelineUploadTask pipelineUplo = PipelineUploadTask.class;
       if (!PatchProxy.isSupport(pipelineUplo) || !PatchProxy.applyVoidTwoRefs(filePath, Boolean.TRUE, b, pipelineUplo, "7")) {
          int i1 = 0;
          Object[] objArray = new Object[i1];
          a.D().w("PipelineUploadTask", "uploadWholeFile: outputPath: "+filePath+", isEnableResumeUpload: "+i+", rickonUploadMode: "+b.h+", taskId: "+b.f, objArray);
          pipelineUplo = b.a;
          if (pipelineUplo == null) {
             Object[] objArray1 = new Object[i1];
             a.D().w("PipelineUploadTask", "uploadWholeFile\(\) uploader is null now", objArray1);
          }else {
             b.j.add(Long.valueOf(b.k));
             pipelineUplo.startUploadFile(filePath, b.f, i);
          }
       }
       return;
    }
}
