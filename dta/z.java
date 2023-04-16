package dta.z;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.view.ViewGroup;

public final class z implements u	// class@00255c
{
    public final a a;

    public void z(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       z ta = this.a;
       int b = p0.booleanValue();
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ta, uoa, "20") && (b || ta.v.getVisibility() != 8))) {
          a v = ta.v;
          b = (b)? 0: 4;
          v.setVisibility(b);
       }
       return;
    }
}
