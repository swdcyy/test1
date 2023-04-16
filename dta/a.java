package dta.a;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import co5.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.BitSet;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wq6.f;

public final class a implements u	// class@002522
{
    public final BottomActionBarPresenter a;

    public void a(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "scrollable");
          if (p0.a == null) {
             this.a.u.set(p0.b);
          }else {
             this.a.u.clear(p0.b);
          }
          Log.g("NasaBottomPresenter", "flags:"+this.a.u);
          p0 = this.a.X8();
          boolean b = (this.a.u.cardinality())? true: false;
          p0.E0(b);
       }
       return;
    }
}
