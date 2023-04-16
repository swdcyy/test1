package aa2.a;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import crd.a;
import aa2.a$a;
import aa2.a$b;
import p91.m;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a51.c;
import vq5.b;
import vq5.d;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import t02.a0;
import ks5.c;
import hf3.a;
import n51.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import xn1.a;
import com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi;
import lnc.i3;
import brd.t;
import cjd.e;
import erd.o;
import aa2.b;
import aa2.c;
import erd.g;
import crd.b;
import krd.a;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import lp3.c;
import lp3.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.r1;

public final class a extends LiveVCHostPresenter	// class@000091
{
    public i A;
    public final a B;
    public LiveAudienceParam C;
    public a0 D;
    public r1 E;
    public final b F;
    public final b G;
    public d w;
    public c x;
    public m y;
    public a z;
    public static String sLivePresenterClassName = "LiveHotSpotPresenter";

    public void a(){
       super();
       this.B = new a();
       this.F = new a$a(this);
       this.G = new a$b(this);
    }
    public static final m W8(a p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("liveBasicContext");
       }
       return p0;
    }
    public void E8(){
       a tC;
       LiveBusinessParams hotSpotId;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       super.E8();
       String str = "liveRouterManager";
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          tC = this.w;
          if (tC == null) {
             a.S(str);
          }
          tC.t5("livehotspotdetail", this.F);
          tC = this.w;
          if (tC == null) {
             a.S(str);
          }
          tC.t5("livehotspotranklist", this.G);
       }
       a tx = this.x;
       if (tx == null) {
          a.S("liveTopPendantAssociateService");
       }
       a tz = this.z;
       if (tz == null) {
          a.S("liveLongConnection");
       }
       a ty = this.y;
       String str1 = "liveBasicContext";
       if (ty == null) {
          a.S(str1);
       }
       a tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       a tD = this.D;
       a0 uoa0 = (tD != null)? tD.z: objArray;
       FixedEntranceViewController uFixedEntran = new FixedEntranceViewController(tx, tz, ty, tw, uoa0);
       this.xg(v2);
       tC = this.C;
       if (tC == null || (tC.mLiveStreamStartPlaySourceForEnterPrompt == 117 && !PatchProxy.applyVoid(objArray, this, uoa, "4"))) {
          uoa = this.C;
          if (uoa != null) {
             LiveAudienceParam mLiveBusines = uoa.mLiveBusinessParams;
             if (mLiveBusines != null) {
                hotSpotId = mLiveBusines.hotSpotId;
             label_0089 :
                if (!TextUtils.isEmpty(hotSpotId)) {
                   uoa = LiveHotSpotApi.a();
                   int i = 1;
                   tD = this.y;
                   if (tD == null) {
                      a.S(str1);
                   }
                   str = tD.getLiveStreamId();
                   a.o(str, "liveBasicContext.liveStreamId");
                   i3 oi3 = i3.f();
                   a tC1 = this.C;
                   if (tC1 != null) {
                      LiveAudienceParam mLiveBusines1 = tC1.mLiveBusinessParams;
                      if (mLiveBusines1 != null) {
                         objArray = mLiveBusines1.hotSpotId;
                      }
                   }
                   oi3.d("hotspotId", objArray);
                   String str2 = oi3.e();
                   a.o(str2, "JsonStringBuilder.newIns¡­tId\)\n            .build\(\)");
                   t ot = uoa.c(i, str, str2);
                   b uob = ot.map(new e()).subscribe(b.b, c.b);
                   a.o(uob, "request.map\(ResponseFunc¡­Info error\"\)\n          }\)");
                   a.b(this.B, uob);
                }
             }
          }
          hotSpotId = objArray;
          goto label_0089 ;
       }
    label_00df :
       return;
    }
    public void J8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          uoa = this.w;
          String str = "liveRouterManager";
          if (uoa == null) {
             a.S(str);
          }
          uoa.Z4("livehotspotdetail");
          uoa = this.w;
          if (uoa == null) {
             a.S(str);
          }
          uoa.Z4("livehotspotranklist");
       }
       this.B.dispose();
       return;
    }
    public LifecycleOwner V8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj.a(a.class).t();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.w = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveTopPendantAssociateService::class.java\)");
       this.x = obj;
       obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.y = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.A = obj;
       this.C = this.t8("LIVE_AUDIENCE_PARAM");
       this.D = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       this.E = this.t8("LIVE_PUSH_CALLER_CONTEXT");
       obj = this.y;
       if (obj == null) {
          a.S("liveBasicContext");
       }
       obj = obj.u();
       a.o(obj, "liveBasicContext.liveLongConnection");
       this.z = obj;
       return;
    }
}
