package gf9.a;
import erd.g;
import gf9.b;
import java.lang.Object;
import eda.w;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.feature.post.api.model.DownloadStatus;
import java.lang.Enum;
import j8c.a;
import q87.c;
import android.content.Context;
import com.yxcorp.gifshow.util.resource.f;
import q5b.j;

public final class a implements g	// class@002470
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
       }else if(tb.f != null){
          p0 = tb.n;
          if (p0 != null) {
             DownloadStatus dOWNLOAD_FAI = DownloadStatus.DOWNLOAD_FAILED;
             int i = 0;
             if (p0.equals(dOWNLOAD_FAI)) {
                objArray = new Object[i];
                a.D().s("MagicFaceDownload", "接受到下载失败通知，即将弹窗", objArray);
                j.a(tb.e, dOWNLOAD_FAI);
             }else {
                dOWNLOAD_FAI = DownloadStatus.DOWNLOAD_NETWORK_UNCONNECTED;
                if (tb.n.equals(dOWNLOAD_FAI)) {
                   objArray = new Object[i];
                   a.D().s("MagicFaceDownload", "接受到断网通知，即将弹窗", objArray);
                   j.a(tb.e, dOWNLOAD_FAI);
                }
             }
          }
       }
       return;
    }
}
