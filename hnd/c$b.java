package hnd.c$b;
import io.reactivex.g;
import hnd.c;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;

public final class c$b implements g	// class@000f92
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.i.i(p0, false);
       return;
    }
}
