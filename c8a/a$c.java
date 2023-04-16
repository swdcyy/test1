package c8a.a$c;
import com.yxcorp.gifshow.widget.h$a;
import c8a.a;
import java.lang.Object;
import android.view.View;
import tyc.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.a1;
import c8a.c;
import uw9.c;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import i3a.b;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;
import java.lang.CharSequence;
import e17.i;

public final class a$c implements h$a	// class@00056d
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       t.b(this, p0);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       a$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_AUTOPLAY_TOAST";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          a r = ta.r;
          if (r == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(r.mEntity);
          a p = ta.p;
          if (p == null) {
             a.S("mFragment");
          }
          u1.D0("", p, 3, uElementPack, uContentPack, null);
       }
       String str = a1.p(R.string.arg_RES_7f1005f5);
       a.o(str, "CommonUtil.string\(R.string.close\)");
       c.a(p0, str);
       c.J((c.o() + 1));
       c.K((c.p() + 1));
       c.I((c.n() + 1));
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putLong("slideAutoPlayGuideCloseShowTime", System.currentTimeMillis());
       g.a(uEditor);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       a.p(p0, "v");
       this.a.R8("close_autoplay");
       b.l(false);
       FragmentActivity activity = this.a.getActivity();
       a.m(activity);
       PendantPlayerStateVM.Companion.a(activity).notifyAutoPlayerState(false);
       c.b();
       i.g(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10483e), true, true);
       return;
    }
}
