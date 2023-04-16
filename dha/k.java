package dha.k;
import erd.g;
import dha.l$b;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dha.l;
import dha.l$a;
import io.reactivex.subjects.PublishSubject;

public final class k implements g	// class@0024ab
{
    public final l$b b;

    public void k(l$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l$b.class, "1")) {
       }else {
          tb.a.b.onNext(new l$a(p0));
       }
       return;
    }
}
