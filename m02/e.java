package m02.e;
import wj3.a$a;
import com.kuaishou.live.core.basic.activity.c;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements a$a	// class@0030b6
{
    public final c a;
    public final LivePlayLoader$e b;

    public void e(c p0,LivePlayLoader$e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       e ta = this.a;
       e tb = this.b;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(tb, ta, c.class, "19")) {
       }else {
          b.c0(ta.t, "onBizPresenterScatterBindDone", "liveStreamId", ta.d.getLiveStreamId());
          ta.o = true;
          tb.a(true);
       }
       return;
    }
}
