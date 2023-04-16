package nod.b;
import io.reactivex.g;
import nod.a;
import ood.d;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lod.a;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;

public class b implements g	// class@001e99
{
    public final d b;
    public final a c;

    public void b(a p0,d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.g.a(this.b, p0);
       return;
    }
}
