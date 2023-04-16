package by9.h$c;
import erd.g;
import by9.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import by9.h$a;
import k2b.e0;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class h$c implements g	// class@00051c
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$c.class, "1")) {
       }else {
          h$a.c(h.x, h.o0(this.b), "MORE_PANEL", h.n0(this.b), 0, 8, null);
          this.b.H().Q1.onNext(Boolean.TRUE);
          PatchProxy.onMethodExit(h$c.class, "1");
       }
       return;
    }
}
