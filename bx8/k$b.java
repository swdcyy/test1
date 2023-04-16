package bx8.k$b;
import erd.o;
import bx8.k;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;
import mrd.a;

public final class k$b implements o	// class@00047a
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          this.b.b = false;
          Object[] objArray = new Object[false];
          a.b().w("ShareReEditRepo", "getReEdit info "+this.b.a().getPhotoId()+" success", objArray);
          this.b.a.onNext(p0.a());
          obj = p0.a();
       }
       return obj;
    }
}
