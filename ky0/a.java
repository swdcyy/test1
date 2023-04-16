package ky0.a;
import im8.g;
import c12.f;
import uf1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import p91.m;
import java.util.Objects;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import ky0.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a extends f implements g	// class@002e1d
{
    public final String K;
    public final c L;
    public m M;
    public static String sLivePresenterClassName = "LiveBidirectionalDataTransferPresenter";

    public void a(){
       super();
       this.K = "LiveBidirectionalDataTransferPresenter";
       this.L = new c();
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tM = this.M;
       if (tM == null) {
          a.S("liveBasicContext");
       }
       String liveStreamId = tM.getLiveStreamId();
       if (liveStreamId != null) {
          uoa = this.L;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(liveStreamId, uoa, c.class, "4")) {
             a.p(liveStreamId, "streamId");
             LiveLiteBidirectionalDataTransfer.c.a(liveStreamId);
          }
          return;
       }else {
          b.P(LiveLogTag.BIDIRECTIONAL_DATA_TRANSFER.appendTag(this.K), "onLiveUnbind: liveStreamId is null!");
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.M = obj;
       return;
    }
}
