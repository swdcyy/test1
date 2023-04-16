package e63.u0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import tx1.d;

public final class u0 implements View$OnClickListener	// class@002673
{
    public final e b;

    public void u0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       u0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "34")) {
       }else {
          tb.d9();
          e w = tb.w;
          if (w != null) {
             w.a(tb.q);
          }
       }
       return;
    }
}
