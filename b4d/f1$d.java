package b4d.f1$d;
import erd.g;
import b4d.f1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;
import d4d.a;
import com.yxcorp.plugin.emotion.append.AppendedWidget;
import android.view.View;

public final class f1$d implements g	// class@000368
{
    public final f1 b;

    public void f1$d(f1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$d.class, "1")) {
       }else {
          String str = "EmotionFloatPanelPresenter";
          Log.g(str, "show animation: ..."+p0);
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, f1.class, "6")) {
             if (a.g.d(p0.w) || p0.R8()) {
                p0 = p0.u;
                if (p0 != null) {
                   p0.setAlpha(0);
                }
                Log.d(str, "readyShowWidget aleady hide!");
             }else {
                f1 u = p0.u;
                if (u != null && !u.getAlpha()) {
                   p0.S8();
                }
             }
          }
       }
       return;
    }
}
