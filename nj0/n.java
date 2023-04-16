package nj0.n;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.facebook.react.ReactRootView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import io.reactivex.exceptions.CompositeException;
import java.util.List;
import com.kuaishou.krn.event.a;
import java.util.Objects;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import com.kuaishou.krn.model.LaunchModel;
import oj0.b;
import java.lang.StringBuilder;
import ek0.d;

public final class n implements g	// class@00333b
{
    public final k b;
    public final String c;

    public void n(k p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       if (!tb.g().getRootViewTag() && tb.g().getIsAttachedToInstance()) {
          tb.g().m();
       }
       if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, k.class, "21")) {
          if (p0 instanceof CompositeException) {
             List exceptions = p0.getExceptions();
             if (!exceptions.isEmpty()) {
                p0 = exceptions.get((exceptions.size() - 1));
             }
          }
          a uoa = a.b();
          KrnDelegate d = tb.d;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(d, uoa, a.class, "7")) {
             uoa = uoa.b;
             if (uoa != null) {
                uoa.e(new KrnLifeCycleEvent(KrnLifeCycleEvent$EventType.LoadFail, d));
             }
          }
          d.c("加载Bundle出错了，bundleId为：「"+tc+"」", p0);
          tb.v(p0);
       }
       return;
    }
}
