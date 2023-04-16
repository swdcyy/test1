package dlc.i0;
import tkc.f$c;
import dlc.k0;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class i0 implements f$c	// class@002250
{
    public final k0 a;

    public void i0(k0 p0){
       this.a = p0;
    }
    public final void a(List p0){
       i0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!q.f(p0)) {
          ta.y.onNext(Integer.valueOf((ta.q.a0() + p0.size())));
       }
       return;
    }
}
