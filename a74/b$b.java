package a74.b$b;
import b74.b;
import a74.b;
import java.lang.Object;
import c74.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.router.b;
import a74.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import w04.d;
import k2b.u1;

public final class b$b implements b	// class@000038
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       a a;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.t(MerchantLiveLogBiz.LIVE_REVENUE_PENDANT, "LiveMerchantGeneralActivityWidgetPresenter", "revenue pendant has clicked", "jumpUrl :", p0.b());
       b$b ta = this.a;
       String str = p0.b();
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(str, ta, uob, "10") && !TextUtils.isEmpty(str)) {
          b r = ta.r;
          if (r == null) {
             a.S("mLiveBasicContext");
          }
          b.o(r.s5(), ta.getActivity(), str);
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uob, "11")) {
          a = a.a;
          String str1 = p0.c();
          String str2 = ta.R8();
          String str3 = ta.P8();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(str1, str2, str3, a, a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MERCHANT_KWAI_ACTIVE_PENDANT";
             i3 oi3 = i3.f();
             oi3.d("material_id", str1);
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, d.b(str2, str3, null));
          }
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       a a = a.a;
       String str = p0.c();
       String str1 = this.a.R8();
       String str2 = this.a.P8();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidThreeRefs(str, str1, str2, a, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MERCHANT_KWAI_ACTIVE_PENDANT";
          i3 oi3 = i3.f();
          oi3.d("material_id", str);
          uElementPack.params = oi3.e();
          u1.u0(3, uElementPack, d.b(str1, str2, null));
       }
       return;
    }
}
