package e0b.e$g;
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

public final class e$g implements View$OnClickListener	// class@0025bb
{
    public final e b;

    public void e$g(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$g.class, "1")) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f10445b);
       a.o(str, "CommonUtil.string\(R.string.screencast_reconnect\)");
       this.b.y.j().d(str, "STOP", this.b.y.d() instanceof a);
       this.b.b().reConnect();
       return;
    }
}
