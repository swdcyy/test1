package cb5.w$a;
import com.kwai.component.homepage_interface.homeitemfragment.a$a;
import cb5.w;
import java.lang.Object;
import ab5.y;
import java.lang.Throwable;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb5.v;
import java.lang.Enum;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;

public final class w$a implements a$a	// class@00045e
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public void a(){
       y.b(this);
    }
    public void b(){
       y.c(this);
    }
    public void c(Throwable p0){
       y.a(this, p0);
    }
    public final void d(RefreshType p0){
       w ow;
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          switch (v.a[p0.ordinal()]){
              case 1:
              case 3:
              case 4:
              case 5:
              case 6:
              case 2:
                w$a tb = this.b;
                Objects.requireNonNull(tb);
                ow = PatchProxy.apply(null, tb, w.class, "2");
                if (ow != PatchProxyResult.class) {
                }else {
                   ow = tb.p;
                   if (ow == null) {
                      a.S("mFragment");
                   }
                }
                break;
              default:
          }
          ow.N1();
       }
       return;
    }
}
