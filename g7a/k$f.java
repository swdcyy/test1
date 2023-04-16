package g7a.k$f;
import erd.g;
import g7a.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.l1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.webkit.URLUtil;
import tkd.b;
import tkd.d;
import nl9.b0;
import android.content.Context;
import xh7.b;
import java.util.LinkedHashMap;
import java.util.Map;
import xh7.a;
import qh7.b;
import qh7.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class k$f implements g	// class@0023e5
{
    public final k b;

    public void k$f(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$f.class, "1")) {
       }else if(a.g(k.W8(this.b).t(), k.P8(this.b)) ^ 0x01){
          k$f tb = this.b;
          a.o(p0, "url");
          Objects.requireNonNull(tb);
          k ok = k.class;
          if (PatchProxy.applyOneRefs(p0, tb, ok, "10") != PatchProxyResult.class) {
          }else {
             Activity activity = tb.getActivity();
             if (activity != null) {
                if (URLUtil.isNetworkUrl(p0)) {
                   d.a(0x37593069).Eb(activity, p0);
                }else {
                   p0 = b.j(activity, p0);
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   k q = tb.q;
                   if (q == null) {
                      a.S("mPhoto");
                   }
                   linkedHashMa.put("QPhoto", q);
                   p0.h("EXTRA_CONTEXT_MAP", linkedHashMa);
                   a.b(p0, null);
                }
                if (!PatchProxy.applyVoid(null, tb, ok, "11")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "FANS_GUIDE_ICON";
                   p0 = i3.f();
                   ok = tb.q;
                   if (ok == null) {
                      a.S("mPhoto");
                   }
                   p0.d("icon_type", ok.getFansTopPurchaseText());
                   uElementPack.params = p0.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   p0 = tb.q;
                   if (p0 == null) {
                      a.S("mPhoto");
                   }
                   uContentPack.photoPackage = w1.f(p0.mEntity);
                   k t = tb.t;
                   if (t == null) {
                      a.S("mFragment");
                   }
                   u1.M("", t, 1, uElementPack, uContentPack, null);
                }
                p0 = l1.a;
             }
          }
       }
       return;
    }
}
