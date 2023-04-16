package lh.a$a;
import com.yxcorp.gifshow.widget.m;
import lh.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nh.c;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import android.widget.Button;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import vt5.g;
import bna.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a$a extends m	// class@00255a
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tc = this.c;
       boolean b = c.a();
       Objects.requireNonNull(tc);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tc, uoa, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SUBMIT_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_name", tc.p.getText().toString());
          oi3.d("is_open", (String.valueOf(b)).toUpperCase());
          uElementPack.params = oi3.e();
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = tc.q.o();
          u1.A(urlPackage, "", 1, uElementPack, tc.q.Q3());
       }
       a = c.a;
       String str = "FloatViewGuideButtonPresenter";
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(str, a, c.class, "1")) {
          a.p(str, "tag");
          d.a(0x348c642a).F2(null);
       }
       this.c.getActivity().finish();
       return;
    }
}
