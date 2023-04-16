package clc.b;
import erd.g;
import clc.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;

public final class b implements g	// class@0005c8
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoc, "3")) {
          a uoa = a.d();
          c q = tb.q;
          b = (b)? PlayEvent$Status.PAUSE: PlayEvent$Status.RESUME;
          uoa.k(new PlayEvent(q, b, 29));
       }
       return;
    }
}
