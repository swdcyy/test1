package e0b.e$c;
import android.view.View$OnClickListener;
import e0b.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import lnc.a1;
import kotlin.jvm.internal.a;
import cgc.a;
import e0b.e$a;

public final class e$c implements View$OnClickListener	// class@0025b7
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       e m = this.b.m;
       String str = (m != null && !m.getVisibility())? "STOP": "ING";
       String str1 = a1.p(R.string.arg_RES_7f100da2);
       a.o(str1, "CommonUtil.string\(R.string.exit_screen_projection\)");
       this.b.y.j().d(str1, str, this.b.y.d() instanceof a);
       this.b.b().i();
       return;
    }
}
