package d12.p;
import java.lang.Object;
import e12.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ub2.d;
import qvb.n0;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarFeedResponse;
import ql2.u;
import com.kuaishou.live.core.show.topic.api.LiveAudienceTopicFlowResponse;
import b42.a;
import com.yxcorp.gifshow.model.response.LiveChainPhotoFeedResponse;
import com.kuaishou.live.core.show.liveslidesquare.d;
import com.kuaishou.live.core.show.liveslidesquare.LiveSlideSquareResponse;
import android.app.Activity;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.utils.e;
import w51.a;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.f;
import wvb.e;

public class p	// class@002424
{

    public void p(){
       super();
    }
    public static c a(c p0){
       d obj = null;
       d obj1 = PatchProxy.applyOneRefs(p0, obj, p.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 instanceof d) {
          obj = p0;
          obj1 = new d(obj.w, obj.x);
          obj1.r2(obj.L0());
          obj1.L0().mCursor = obj.L0().mCursor;
          obj1.R1(p0.hasMore());
          return obj1;
       }else if(p0 instanceof u){
          u ou = p0;
          u ou1 = new u(ou.p, ou.q);
          ou1.j2(ou.L0());
          ou1.L0().mCursor = ou.L0().mCursor;
          ou1.R1(p0.hasMore());
          return ou1;
       }else if(p0 instanceof a){
          a uoa = new a();
          n0 on0 = p0;
          uoa.m2(on0.L0());
          if (on0.L0() != null) {
             uoa.L0().mCursor = on0.L0().mCursor;
          }
          uoa.R1(p0.hasMore());
          return uoa;
       }else if(p0 instanceof d){
          obj1 = new d();
          obj1.o2(p0.L0());
          obj1.L0().mCursor = p0.L0().mCursor;
          obj1.R1(p0.hasMore());
          return obj1;
       }else {
          return obj;
       }
    }
    public static boolean b(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!e.s(p0)) {
          return b;
       }
       p0 = PatchProxy.apply(null, null, a.class, "22");
       boolean b1 = (p0 != patchProxyRe)? p0.booleanValue(): l.c("enableLiveInnerPullOpt", b);
       if (b1 || a.t().u("SOURCE_LIVE").d("LiveDetailSlidePullStreamOptV2", b)) {
          b = true;
       }
       return b;
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b uob = b.e(p0);
       if (uob == null) {
          return false;
       }
       if (uob.M7() instanceof f) {
          return true;
       }
       if (uob.M7() instanceof e) {
          return true;
       }
       return false;
    }
}
