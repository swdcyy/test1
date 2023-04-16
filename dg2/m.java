package dg2.m;
import erd.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.model.LiveQuizReviveCardResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import dg2.d;

public final class m implements g	// class@00251a
{
    public final j b;

    public void m(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "getLiveQuizMyReviveCard\(n/live/quiz2/reviveCard/simpleQuery\)", "response", p0);
       tb.d.i(p0.mInvitationCode);
       tb.j(p0.mTotalAvailableReviveCard, p0.mQuizAvailableReviveCard);
    }
}
