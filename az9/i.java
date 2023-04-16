package az9.i;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import vv6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import az9.k0;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;

public final class i implements g	// class@00032d
{
    public final i0 b;

    public void i(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i0.class, "22")) {
       }else {
          a uoa = new a(tb.u, tb.v, true);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "2")) {
             a.p(p0, "<set-?>");
             uoa.c = p0;
          }
          uoa.a = new k0(tb);
          if (!PatchProxy.applyVoid(null, uoa, a.class, "4") && (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(0), uoa, a.class, "3"))) {
             uoa.d = false;
             k1.r(uoa.h, 0);
          }
       }
       return;
    }
}
