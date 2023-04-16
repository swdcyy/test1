package lod.u;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import bod.d;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import mn9.a;

public final class u implements g	// class@001c91
{
    public final TextTemplateRepo b;
    public final d c;

    public void u(TextTemplateRepo p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateRepo", "real preDownloadAllTextTemplate item = "+this.c, objArray);
       u tc = this.c;
       a.o(tc, "textTemplateItem");
       this.b.a(tc, 0, p0);
       return;
    }
}
