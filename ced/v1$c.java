package ced.v1$c;
import erd.g;
import ced.v1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.a;
import q87.c;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class v1$c implements g	// class@000587
{
    public final v1 b;

    public void v1$c(v1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v1$c.class, "1")) {
       }else {
          a.C().e("TagMagicFacePreDownloadPresenter", "pre download, load video plugin error", p0);
          p0 = this.b.q;
          a.m(p0);
          p0.onNext("fail");
       }
       return;
    }
}
