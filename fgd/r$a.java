package fgd.r$a;
import android.view.View$OnClickListener;
import fgd.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import bgd.b;
import bgd.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import kotlin.jvm.internal.Ref$BooleanRef;
import lnc.a1;
import kzc.d;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.CharSequence;
import fgd.r$a$a;
import u07.u;
import fgd.r$a$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import u07.t;

public final class r$a implements View$OnClickListener	// class@000e37
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b a;
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, str)) {
          return;
       }
       if (!this.b.v.get() && this.b.getActivity() != null) {
          Activity activity = this.b.getActivity();
          a.m(activity);
          String str1 = "activity!!";
          a.o(activity, str1);
          if (!activity.isFinishing()) {
             activity = this.b.getActivity();
             a.m(activity);
             a.o(activity, str1);
             if (!activity.isDestroyed()) {
                a = b.a;
                str1 = r.S8(this.b).d();
                String str2 = r.S8(this.b).c();
                Objects.requireNonNull(a);
                b = true;
                if (!PatchProxy.applyVoidTwoRefs(str1, str2, a, b.class, str)) {
                   a.p(str1, "cacheType");
                   a.p(str2, "size");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CLEAR_BUTTON";
                   i3 oi3 = i3.f();
                   oi3.d("card_content", str1);
                   oi3.d("size", str2);
                   uElementPack.params = oi3.e();
                   u1.u(b, uElementPack, null);
                }
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = false;
                str1 = a1.r(R.string.arg_RES_7f100588, r.S8(this.b).d());
                r$a tb = this.b;
                Activity activity1 = tb.getActivity();
                a.m(activity1);
                d uod = f.e(new d(activity1));
                uod.z(b);
                uod.A(b);
                uod.z0(str1);
                uod.T0(a1.p(R.string.arg_RES_7f100a73));
                uod.R0(a1.p(R.string.arg_RES_7f100a72));
                uod.u0(new r$a$a(this, uBooleanRef));
                tb.w = uod.Y(new r$a$b(this, str1, uBooleanRef));
             }
          }
       }
       return;
    }
}
