package fna.w;
import io.reactivex.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import fna.j;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import fna.j$a;
import fna.b;
import fna.j$c;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.util.List;
import brd.g;

public final class w implements g	// class@002998
{
    public final GrowthCleanerReDispatchPresenter b;
    public final j c;

    public void w(GrowthCleanerReDispatchPresenter p0,j p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, w.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       long l = 20;
       Thread.sleep(l);
       w b = obj.b;
       b.s = b.s + 1;
       b = obj.b;
       long l1 = 100;
       while (b.s - l1 < 0) {
          l1 = l1 - obj.b.s;
          int i = obj.c.c() - 1;
          j$c uoc = new j$c(obj.c.a(), i, obj.c.c(), obj.c.d().a(l1).d(l1), obj.c.d(), obj.c.e);
          obj1.onNext(obj.b.P8(b));
          Thread.sleep(l);
          b = obj.b;
          long l2 = b.s + 1;
          b.s = l2;
       }
       b.t = null;
       obj1.onNext(obj.c);
       p0.onComplete();
       return;
    }
}
