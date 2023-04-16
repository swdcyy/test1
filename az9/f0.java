package az9.f0;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v6a.m0;
import io.reactivex.subjects.PublishSubject;

public final class f0 implements g	// class@000324
{
    public final i0 b;

    public void f0(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "19")) {
       }else {
          tb.o0();
          tb.X.g0.onNext(tb.u);
       }
       return;
    }
}
