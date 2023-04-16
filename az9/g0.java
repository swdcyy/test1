package az9.g0;
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

public final class g0 implements g	// class@000326
{
    public final i0 b;

    public void g0(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "20")) {
       }else {
          tb.X.h0.onNext(tb.u);
       }
       return;
    }
}
