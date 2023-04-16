package djc.p0;
import android.view.View$OnClickListener;
import djc.o0$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import djc.o0;
import mhc.q;
import djc.m0;
import java.lang.CharSequence;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;

public final class p0 implements View$OnClickListener	// class@002216
{
    public final o0$c b;

    public void p0(o0$c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p0.class, "1")) {
          return;
       }
       q oq = this.b.c.b.c();
       if (oq != null) {
          oq.a();
       }
       boolean b = true;
       p0 op0 = (this.b.c.b.a().length() > 0)? 1: null;
       if (op0) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          Intent intent = b.a(0x66dce92a).c(uoc.f(), x0.f(this.b.c.b.a()), b, false);
          if (intent != null) {
             c uoc1 = a.a();
             a.o(uoc1, "AppEnv.get\(\)");
             uoc1.f().startActivity(intent);
          }
       }
       o0 b1 = this.b.c.b;
       if (b1.e != null) {
          m0 g = b1.g;
          if (g.isAdded()) {
             g.dismissAllowingStateLoss();
          }
       }
       PatchProxy.onMethodExit(p0.class, "1");
       return;
    }
}
