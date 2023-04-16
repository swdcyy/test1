package lod.c;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import nuc.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eb7.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader$a;
import lod.e;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class c implements g	// class@001c7d
{
    public final Sk2cResourceDownloader b;
    public final a c;

    public void c(Sk2cResourceDownloader p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, Sk2cResourceDownloader.class, "5")) {
          Object[] objArray = new Object[0];
          a.D().w("Sk2cResourceDownloader", "innerDownload: "+tc.r(), objArray);
          tb.b().d(new Sk2cResourceDownloader$a(tb, tc), new e(tb, tc, p0));
       }
       return;
    }
}
