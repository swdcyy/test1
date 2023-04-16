package dqa.a$a;
import com.yxcorp.download.k;
import dqa.a;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class a$a extends k	// class@0024e8
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       PreEmbeddedHelper.c.f("视频ID："+this.c.e+" 的视频文件取消下载，请稍后重试");
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       PreEmbeddedHelper.c.f("视频ID："+this.c.e+" 的视频文件已下载完毕");
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "4")) {
          return;
       }
       PreEmbeddedHelper.c.f("视频ID："+this.c.e+" 的视频文件下载失败，请稍后重试");
       return;
    }
    public void o(DownloadTask p0){
       PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1");
    }
}
