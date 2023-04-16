package djc.o1$a;
import com.yxcorp.gifshow.widget.m;
import djc.o1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import nf6.i;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import e17.i;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class o1$a extends m	// class@002213
{
    public final o1 c;
    public final View d;

    public void o1$a(o1 p0,View p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o1$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       Intent intent = b.a(0x66dce92a).a(this.c.a().getActivity(), w0.f(this.c.d));
       if (intent != null) {
          FragmentActivity activity = this.c.a().getActivity();
          if (activity != null) {
             activity.startActivity(intent);
          }
       }else {
          i.a(R.style.arg_RES_7f110669, 0x7f100d6e);
       }
       o1$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, o1.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHARE_EARN_GOLD_BANNER";
          u1.u(1, uElementPack, null);
       }
       this.c.a().dismiss();
       PatchProxy.onMethodExit(o1$a.class, "1");
       return;
    }
}
