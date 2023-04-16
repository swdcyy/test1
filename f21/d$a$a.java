package f21.d$a$a;
import lnc.c3$a;
import f21.d$a;
import java.lang.Object;
import j61.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import f21.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.bottombar.component.widget.d;
import androidx.lifecycle.LiveData;
import z61.b;

public final class d$a$a implements c3$a	// class@00229f
{
    public final d$a a;

    public void d$a$a(d$a p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a$a.class, "1")) {
       }else {
          a.p(p0, "clickListener");
          d$a b = this.a.b;
          Objects.requireNonNull(b);
          Object obj = PatchProxy.apply(null, b, d.class, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             MutableLiveData mutableLiveD = b.n();
             if (mutableLiveD != null) {
                b value = mutableLiveD.getValue();
                if (value != null) {
                   value = value.mFeatureId;
                }
             }
             i = 0;
          }
          p0.a(i);
       }
       return;
    }
}
