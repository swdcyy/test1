package dm0.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dm0.a$a;
import nsd.u;
import dm0.a$c;
import com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.ad.brand.activity.nano.SCAdWatchLiveTaskSignal;
import lf3.g;
import hf3.a;
import ks5.m;
import com.kwai.robust.PatchProxyResult;
import dm0.a$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import fq5.b;
import com.kuaishou.protobuf.ad.brand.activity.nano.WidgetClientLog;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import java.util.Objects;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import lp3.i;
import vq5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@001fbc
{
    public final g A;
    public LiveTopPendantTempPlayService p;
    public a q;
    public m r;
    public LiveAudienceParam s;
    public i t;
    public b u;
    public BaseFragment v;
    public WidgetClientLog w;
    public d x;
    public boolean y;
    public WatchLivePendantView z;
    public static final a$a B;

    static {
       a.B = new a$a(null);
    }
    public void a(){
       super();
       this.A = new a$c(this);
    }
    public static final WatchLivePendantView P8(a p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mWatchLivePendantView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.p != null) {
          a tq = this.q;
          if (tq != null) {
             tq.u0(972, SCAdWatchLiveTaskSignal.class, this.A);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.o(972, this.A);
       }
       return;
    }
    public final m R8(){
       a obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = new a$b(this);
       }
       obj = this.r;
       a.m(obj);
       return obj;
    }
    public final ClientEvent$ElementPackage S8(){
       Object[] objArray1;
       Object[] objArray = null;
       ClientEvent$ElementPackage obj = PatchProxy.apply(objArray, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "BRAND_TASK_CMPT";
       i3 oi3 = i3.f();
       a tu = this.u;
       String str = (tu != null)? tu.d(): objArray;
       oi3.d("anchor_user_id", str);
       tu = this.u;
       str = (tu != null)? tu.getLiveStreamId(): objArray;
       oi3.d("live_stream_id", str);
       tu = this.w;
       WidgetClientLog taskId = (tu != null)? tu.taskId: objArray;
       oi3.d("task_id", taskId);
       tu = this.w;
       taskId = (tu != null)? tu.taskName: objArray;
       oi3.d("task_name", taskId);
       tu = this.w;
       Integer integer = (tu != null)? Integer.valueOf(tu.taskType): objArray;
       oi3.c("task_type", integer);
       tu = this.s;
       if (tu != null) {
          objArray = Integer.valueOf(tu.mLiveSourceType);
       }
       oi3.c("sourceType", objArray);
       obj.params = oi3.e();
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = a.d(this.getContext(), R.layout.arg_RES_7f0d09c8, p0, false);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView");
       this.z = p0;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, WatchLivePendantView.class, "1")) {
          p0.b = p0.findViewById(0x7f0a4553);
          p0.c = p0.findViewById(0x7f0a4554);
          p0.d = p0.findViewById(0x7f0a4555);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(LiveTopPendantTempPlayService.class);
       this.q = this.t8("LIVE_LONG_CONNECTION");
       this.s = this.t8("LIVE_AUDIENCE_PARAM");
       this.t = this.t8("LIVE_SERVICE_MANAGER");
       this.u = this.t8("LIVE_BASIC_CONTEXT");
       this.x = this.t8("LIVE_ROUTER_SERVICE");
       this.v = this.t8("LIVE_FRAGMENT");
       return;
    }
}
