package ng.b;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeWrapperParam;
import og.k;
import java.lang.Object;
import lnc.s;
import um6.h;
import yxa.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yxa.a;
import kotlin.jvm.internal.a;
import r16.f;
import lnc.x6;
import lnc.y6;
import w26.c;
import com.feature.post.bridge.karaoke.KaraokeHelper;
import java.util.Objects;
import com.feature.post.bridge.karaoke.KaraokeHelper$KaraokeBridgeParams;
import um6.d;
import com.feature.post.bridge.karaoke.KaraokeBridgeBaseParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import n3d.a;
import ng.f;
import ng.g;
import java.lang.Runnable;

public final class b implements g	// class@002703
{
    public final GifshowActivity b;
    public final KaraokeHelper$KaraokeWrapperParam c;
    public final k d;

    public void b(GifshowActivity p0,KaraokeHelper$KaraokeWrapperParam p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       KaraokeHelper a;
       p0 = h.class;
       a uoa = null;
       x6 obj = PatchProxy.applyTwoRefs(p0, uoa, uoa, b.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "clazz");
          p0 = b.e.s(p0);
          if (p0 != null) {
             uoa = p0;
          }
          obj = uoa;
       }
       a.m(obj);
       Object obj1 = obj;
       p0 = y6.r(f.class);
       a.m(p0);
       obj = y6.r(c.class);
       a.m(obj);
       a = KaraokeHelper.a;
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(a);
       if (tc.getParams() != null) {
          KaraokeHelper$KaraokeBridgeParams params = tc.getParams();
          a.m(params);
          d uod = new d();
          uod.u(params.getMusicId());
          uod.v(params.getMusicType());
          uod.y(params.getSongMode());
          uod.x(params.getRecordMode());
          uod.t(params.getMinDuration());
          uod.w(params.getPurpose());
          uod.q(params.getDuetMode());
          uod.p(params.getReturnToOriginalPage());
          uod.z(params.getTag());
          if (TextUtils.isEmpty(uod.m())) {
             uod.z(params.getTopic());
          }
          uod.o(params.getAtFriends());
          uod.n(params.getActivity());
          uod.r(params.getDuetSourcePhotoId());
          uod.s(params.getDuetTip());
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.show(tb.getSupportFragmentManager(), "runner");
          f uof = new f(progressFrag);
          g og = new g(progressFrag, td);
          g og1 = og;
          obj1.hn(tb, a.a(td, 304, p0, obj), uof, og1, uod, (params.getHoldPostSession() ^ 0x01), params.getForbidRecoverDraft());
       }
       return;
    }
}
