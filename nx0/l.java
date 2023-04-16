package nx0.l;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import nx0.l$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import nx0.l$b;
import xq5.c;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import lp3.c;
import lp3.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import android.view.ViewGroup;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2ViewController;
import v51.a;
import hf3.a;
import ry1.b;
import oq5.a;
import qy1.a;
import or5.d;
import java.util.Objects;
import or5.b;
import mq5.b;
import hz1.a;
import x67.j;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.live.viewcontroller.ViewController;
import qrd.l1;

public final class l extends LiveVCHostPresenter	// class@0033f3
{
    public i w;
    public LiveSlidePlayService x;
    public LiveAudienceOverRoomV2ViewController y;
    public static String sLivePresenterClassName = "LiveAudienceOverRoomV2Presenter";
    public static final l$a z;

    static {
       l.z = new l$a(null);
    }
    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       super.E8();
       LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
       l tx = this.x;
       if (tx == null) {
          a.S("liveSlidePlayService");
       }
       b.c0(lIVE_OVER_RO, "presenter onBind", "isSlideContainer", Boolean.valueOf(tx.v()));
       l tx1 = this.x;
       if (tx1 == null) {
          a.S("liveSlidePlayService");
       }
       if (tx1.v()) {
          tx1 = this.x;
          if (tx1 == null) {
             a.S("liveSlidePlayService");
          }
          tx1.P4(new l$b(this));
       }else {
          this.W8();
       }
       return;
    }
    public LifecycleOwner V8(){
       l obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj.a(a.class).t();
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       ViewGroup viewGroup = h.f(this.m8(), R.id.live_broadcast_banner_container_view_stub, 0x7f0a1ad1);
       l tw = this.w;
       String str = "liveServiceManager";
       if (tw == null) {
          a.S(str);
       }
       c uoc = tw.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­nnectManager::class.java\)");
       a uoa = uoc.u();
       a.o(uoa, "liveServiceManager.getSe¡­.java\).liveLongConnection");
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(b.class);
       a.o(uoc, "liveServiceManager.getSe¡­btainService::class.java\)");
       c uoc1 = uoc;
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­ationService::class.java\)");
       c uoc2 = uoc;
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­oModeService::class.java\)");
       c uoc3 = uoc;
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(d.class);
       Objects.requireNonNull(uoc, "null cannot be cast to non-null type com.kwai.feature.api.live.merchant.baseinfo.LiveAudienceFeedService");
       c uoc4 = uoc;
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(b.class);
       a.o(uoc, "liveServiceManager.getSe¡­ceEndManager::class.java\)");
       c uoc5 = uoc;
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       uoc = tw.a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­SceneService::class.java\)");
       j oj = uoc.bd();
       LiveAudienceOverRoomV2ViewController liveAudience = new LiveAudienceOverRoomV2ViewController(uoa, uoc1, uoc2, uoc3, uoc4, uoc5, oj);
       b.S(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Presenter"), "addVC", "VC hashCode", Integer.valueOf(v9.hashCode()));
       a.o(viewGroup, "broadcastBannerContainerView");
       this.E2(viewGroup, v9);
       this.y = v9;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.w = obj;
       obj = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       a.o(obj, "inject\(AccessIds.LIVE_SLIDE_PLAY_SERVICE\)");
       this.x = obj;
       return;
    }
}
