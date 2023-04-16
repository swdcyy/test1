package b4d.f1$f;
import java.lang.Runnable;
import b4d.f1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import d4d.a;
import com.yxcorp.plugin.emotion.append.AppendedWidget;

public final class f1$f implements Runnable	// class@00036a
{
    public final f1 b;

    public void f1$f(f1 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f1$f.class, "1")) {
          return;
       }
       f1$f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f1.class, "5")) {
          StringBuilder str = "widgets layout width:";
          f1 u = tb.u;
          if (u != null) {
             objArray = Integer.valueOf(u.getWidth());
          }
          Log.g("EmotionFloatPanelPresenter", str+objArray);
          if (a.g.c(tb.w)) {
             tb.S8();
          }
       }
       return;
    }
}
