package fd1.i;
import erd.g;
import fd1.l;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaireInfoResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.util.Collection;
import ekd.q;
import fd1.l$b;
import fd1.d;
import fd1.d$c;
import nc1.j$a;
import bq5.f$a;
import fd1.m;
import bq5.d;
import nc1.j;
import lp3.i;
import nc1.k;
import lp3.c;

public final class i implements g	// class@0022f5
{
    public final l b;
    public final String c;
    public final int d;

    public void i(l p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveQuestionnaire;
       b.Z(LiveLogTag.LIVE_QUESTIONNAIRE, "getQuestionnaireInfo, liveQuestionnaire: "+p0);
       if (p0 != null && (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidThreeRefs(p0, tc, Integer.valueOf(td), tb, l.class, "6"))) {
          int i = 22;
          if (LiveCommentNoticeRemoveExperiment.a(i)) {
             b.Z(LiveCommonLogTag.COMMENT_NOTICE, "onInterceptNotice filter and showQuestionnaire will not show");
          }else if(q.f(p0.mQuestionOptions) && q.f(p0.mQuestionClickableOptions)){
             l$b uob = new l$b(tb, tc);
             j$a uoa = new j$a();
             uoa.f(td);
             uoa.e(new d(p0, uob));
             LiveQuestionnaire mDisplayDura = p0.mDisplayDurationMs;
             if (mDisplayDura <= 0) {
                mDisplayDura = 0x3a98;
             }
             uoa.c(mDisplayDura);
             uoa.h(tc);
             uoa.i(i);
             uoa.d(new m(tb, uob, p0));
             tb.P8().a(k.class).Y9(uoa.g());
          }
       }
       return;
    }
}
