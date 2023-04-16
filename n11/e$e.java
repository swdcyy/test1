package n11.e$e;
import android.view.GestureDetector$SimpleOnGestureListener;
import n11.e;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import lq5.a;
import pb1.a;
import java.util.Objects;
import no1.j;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$FlowDiversionSourceType;
import qa2.b;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import k2b.e0;
import na2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public class e$e extends GestureDetector$SimpleOnGestureListener	// class@00327a
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       a0 obj = PatchProxy.applyOneRefs(p0, this, e$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.K.V;
       if (obj != null) {
          obj.A(p0);
       }
       return super.onDoubleTap(p0);
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "3")) {
          return;
       }
       e o = this.b.O;
       if (o != null) {
          o.a((int)p0.getRawY());
       }
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       e$e obj = PatchProxy.applyOneRefs(p0, this, e$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, e.class, "8")) {
          j f = obj.L.f;
          if (f == null || f.counterpartAuthor == null) {
             List list = LiveLogTag.LIVE_LINE.appendTag("RevenueInterceptReport");
             StringBuilder str = "[LiveLineAudienceFloatContainerPresenter][clickLiveLinePeerView]: mLineCallerContext.mReadyInfo:"+obj.L.f+"mLineCallerContext.mReadyInfo.counterpartAuthor:";
             j f1 = obj.L.f;
             if (f1 != null) {
                objArray = f1.counterpartAuthor;
             }
             b.P(list, str+objArray);
          }else {
             b.a(obj.getActivity(), obj.K, String.valueOf(obj.L.f.counterpartAuthor.userId), obj.L.b, 172, LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_LINE);
             a.a(obj.K.S.t0(), obj.c9(), "", "LIVE_ONLINE", obj.L.b, obj.K.Z2.a(), true, obj.b9());
          }
       }
       return super.onSingleTapConfirmed(p0);
    }
}
