package cx0.g$a;
import f41.a;
import cx0.g;
import java.lang.Object;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationReinforceInfo;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationTopPendantInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.j;
import ms5.a$a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import ms5.a$b;
import cx0.h;
import ms5.a;
import kotlin.jvm.internal.a;
import ms5.c;
import lp3.c;
import lp3.e;

public final class g$a implements a	// class@001e94
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public final void a(LiveAudienceAuthorAuthenticationReinforceInfo p0,LiveAudienceAuthorAuthenticationTopPendantInfo p1,int p2){
       h oh;
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g$a.class, "1")) {
          return;
       }
       g$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), ta, g.class, "3")) {
          if (p1 == null && p0 == null) {
             b.P(LiveLogTag.LIVE_AUTHOR_AUTHENTICATION.appendTag("AudienceAuthorAuthenticationPresenter"), "fetch authentication valid data is null ");
          }else if(p0 != null && !j.h(p0.mImageUrlV2)){
             if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), ta, g.class, "4")) {
                a$a uoa = new a$a(p0.mImageUrlV2);
                uoa.d(p0.mEnterDelayMs);
                uoa.e(p0.mJumpUrl);
                uoa.b(p0.mBiz);
                if (PatchProxy.isSupport(g.class)) {
                   oh = PatchProxy.applyTwoRefs(p1, Integer.valueOf(p2), ta, g.class, "9");
                   if (oh != PatchProxyResult.class) {
                   label_00a1 :
                      uoa.c(oh);
                      p0 = p0.mShowDurationMs;
                      if (p0 > 0) {
                         uoa.f(p0);
                      }
                      a uoa1 = uoa.a();
                      g m = ta.M;
                      if (m == null) {
                         a.S("liveServiceManager");
                      }
                      m.a(c.class).mi(uoa1);
                   }
                }
                oh = new h(ta, p1, p2);
                goto label_00a1 ;
             }
          }else {
             ta.b9(p1, p2);
          }
       }
       return;
    }
}
