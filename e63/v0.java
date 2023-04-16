package e63.v0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx1.d;

public final class v0 implements View$OnClickListener	// class@002675
{
    public final e b;

    public void v0(e p0){
       super();
       this.b = p0;
    }
    public final void onClick(View p0){
       v0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "41")) {
       }else {
          tb.d9();
          e w = tb.w;
          if (w != null) {
             w.g();
          }
       }
       return;
    }
}
