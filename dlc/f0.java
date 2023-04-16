package dlc.f0;
import tkc.f$c;
import dlc.h0;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class f0 implements f$c	// class@002246
{
    public final h0 a;

    public void f0(h0 p0){
       this.a = p0;
    }
    public final void a(List p0){
       f0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!q.f(p0)) {
          ta.y.onNext(Integer.valueOf((ta.q.a0() + p0.size())));
       }
       return;
    }
}
