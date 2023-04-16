package nod.a$a;
import io.reactivex.g;
import nod.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;

public class a$a implements g	// class@001e97
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.g.b(CachePolicy.CACHE_ELSE_NETWORK, p0, "");
       return;
    }
}
