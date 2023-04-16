package fia.l$a;
import erd.g;
import fia.l;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import cia.w;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import hf5.e;
import rf5.u;
import com.yxcorp.gifshow.widget.SwipeLayout;

public final class l$a implements g	// class@002919
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean i = p0.intValue();
       l$a uoa = l$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoa, "1")) {
          i = (i)? true: false;
          uoa = this.b;
          Objects.requireNonNull(uoa);
          l ol = PatchProxy.apply(null, uoa, l.class, "4");
          if (ol != PatchProxyResult.class) {
          }else {
             ol = uoa.q;
             if (ol == null) {
                a.S("mFollowSlideInjectAdapter");
             }
          }
          Objects.requireNonNull(ol);
          w ow = w.class;
          if (!PatchProxy.isSupport(ow) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), ol, ow, "4")) {
             ow = ol.f;
             if (ow != null) {
                ow.jg(i);
             }else {
                ow = ol.i;
                if (ow != null) {
                   ow.F(i, 9);
                }
             }
          }
          l r = this.b.r;
          if (r != null) {
             r.n(i, 10);
          }
       }
       return;
    }
}
