package dha.h;
import erd.g;
import dha.i;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public final class h implements g	// class@0024a8
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "2")) {
       }else {
          tb.a.onNext(p0);
       }
       return;
    }
}
