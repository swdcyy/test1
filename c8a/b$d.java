package c8a.b$d;
import com.yxcorp.gifshow.widget.h$a;
import c8a.b;
import java.lang.Object;
import android.view.View;
import tyc.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lnc.i3;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import c8a.c;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.System;
import i3a.b;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;
import java.lang.CharSequence;
import e17.i;

public final class b$d implements h$a	// class@000573
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       t.b(this, p0);
    }
    public void b(View p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       b$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, b.class, "6")) {
          i3 oi3 = i3.f();
          oi3.d("toast_content", a1.p(R.string.arg_RES_7f1005c8));
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOAST_INFO_CARD";
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          b t = ta.t;
          if (t == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(t.mEntity);
          b p = ta.p;
          if (p == null) {
             a.S("mFragment");
          }
          u1.D0("", p, 3, uElementPack, uContentPack, null);
       }
       String str = a1.p(R.string.arg_RES_7f10180e);
       a.o(str, "CommonUtil.string\(R.string.knock_open_follow_list\)");
       c.a(p0, str);
       a = c.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putInt("slideAutoPlayGuideOpenShowCount", (c.q() + 1));
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putLong("slideAutoPlayGuideOpenShowTime", System.currentTimeMillis());
       g.a(uEditor1);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "2")) {
          return;
       }
       a.p(p0, "v");
       this.a.P8("JUMP");
       b.l(true);
       FragmentActivity activity = this.a.getActivity();
       a.m(activity);
       PendantPlayerStateVM.Companion.a(activity).notifyAutoPlayerState(true);
       c.b();
       i.g(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100305), true, true);
       return;
    }
}
