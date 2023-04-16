package ced.y1;
import erd.g;
import ced.v1$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.a;
import q87.c;
import ced.v1;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class y1 implements g	// class@000591
{
    public final v1$b b;

    public void y1(v1$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "1")) {
       }else {
          a.C().e("TagMagicFacePreDownloadPresenter", "pre download failed", p0);
          p0 = this.b.b.q;
          a.m(p0);
          p0.onNext("fail");
       }
       return;
    }
}
