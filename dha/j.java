package dha.j;
import erd.g;
import dha.l$b;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dha.l;
import dha.l$a;
import io.reactivex.subjects.PublishSubject;

public final class j implements g	// class@0024aa
{
    public final l$b b;

    public void j(l$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l$b.class, "2")) {
       }else {
          tb.a.b.onNext(new l$a(p0));
       }
       return;
    }
}
