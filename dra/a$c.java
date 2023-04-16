package dra.a$c;
import java.lang.Runnable;
import dra.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import kzc.d;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import dra.a$b;
import fra.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import dra.a$c$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a$c implements Runnable	// class@0024ff
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null && !uActivity.isFinishing()) {
          d uod = new d(uActivity);
          uod.Z0(109);
          uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
          uod.A(true);
          uod.z(true);
          uod.L(new a$b(this.b.a()));
          this.b.b(uod.Y(new a$c$a(this)));
       }
       return;
    }
}
