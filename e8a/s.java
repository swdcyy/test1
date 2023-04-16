package e8a.s;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.g$a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d0a.f;
import io.reactivex.subjects.PublishSubject;

public final class s implements g	// class@0020d6
{
    public final g$a b;

    public void s(g$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g$a b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(p0, b, g.class, "4")) {
       }else if(!p0.booleanValue()){
          b.s.onNext(new f());
       }
       return;
    }
}
