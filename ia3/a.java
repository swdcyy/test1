package ia3.a;
import lc1.b;
import ia3.a$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import lc1.a;
import lc1.f;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v91.d;
import v91.a;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import v91.h;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import v91.k;
import v91.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;

public abstract class a implements b	// class@002ce8
{
    public final String b;
    public final i c;
    public final LiveLiteGuidanceMessageQueueManager d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(String p0,i p1,LiveLiteGuidanceMessageQueueManager p2){
       a.p(p1, "receiveCommentNoticeService");
       a.p(p2, "guideQueueService");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       return a.b(this);
    }
    public final b d(LiveMessageFrequencyConfig$FrequencyConfig p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LiveLiteBaseCommentNoticeHandler";
       if (p0 != null) {
          d uod = a.b();
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String str = "LiveLiteBaseCommentNoticeHandler_"+qCurrentUser.getId();
          a tb = this.b;
          if (tb != null && uod.c(new h(str+"_"+tb, p0.mAppearTimesByLiveStream)) != null) {
             LiveLiteLogTag lITE_COMMENT = LiveLiteLogTag.LITE_COMMENT_NOTICE;
             lITE_COMMENT.appendTag(obj);
             LiveLiteLogTag liveLiteLogT = lITE_COMMENT;
             b.P(liveLiteLogT, "getBaseCommentNoticeFrequencyConsumer: liveStreamId is null!");
          }
          uod.c(new k(str, p0.mAppearColdTimeSpan, p0.mAppearTimesByColdTime));
          a.o(uod, "frequencyConsumer");
          return uod;
       }else {
          b.P(LiveLiteLogTag.LITE_COMMENT_NOTICE.appendTag(obj), "getBaseCommentNoticeFrequencyConsumer: bizFrequencyConfig is null!");
          return new e();
       }
    }
    public void dispose(){
       a.a(this);
    }
    public abstract b e(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveCommentNoticeBaseInfo p1);
}
