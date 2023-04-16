package e0b.e$i;
import android.view.View$OnClickListener;
import e0b.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import cgc.a;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.ImageView;
import e0b.e$a;

public final class e$i implements View$OnClickListener	// class@0025bd
{
    public final e b;

    public void e$i(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       e p;
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$i.class, "1")) {
          return;
       }
       e$i tb = this.b;
       String str = (tb.u != null)? "PAUSE": "PLAY";
       a uoa = tb.y.j();
       int b = this.b.y.d() instanceof a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(b), uoa, uoa1, "12")) {
          a.p(str, "type");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PROJECTION_SCREEN_PLAY_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("is_ks_tv", uoa.j(b));
          oi3.d("reason", uoa.i);
          oi3.d("click_type", str);
          uElementPack.params = oi3.e();
          u1.M("", null, 1, uElementPack, null, null);
       }
       tb = this.b;
       b = 0x7f06060a;
       if (tb.u != null) {
          p = tb.p;
          if (p != null) {
             p.setImageDrawable(j.n(tb.a(), R.drawable.arg_RES_7f08059d, b));
          }
          this.b.b().onPause();
          b1 = false;
       }else {
          p = tb.p;
          if (p != null) {
             p.setImageDrawable(j.n(tb.a(), R.drawable.arg_RES_7f0805ae, b));
          }
          this.b.b().onResume();
          b1 = true;
       }
       tb.u = b1;
       return;
    }
}
