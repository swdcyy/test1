package dta.y;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import lr6.a;

public final class y implements u	// class@00255a
{
    public final a a;

    public void y(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       y ta = this.a;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ta, a.class, "8")) {
          ta.G = b;
          if (b) {
             if (!PatchProxy.applyVoid(null, ta, a.class, "7")) {
                ta.C.u(true);
             }
          }else {
             ta.C.u(false);
          }
       }
       return;
    }
}
