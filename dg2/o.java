package dg2.o;
import erd.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import t02.a0;
import p91.m;
import com.kuaishou.android.live.log.b;

public final class o implements g	// class@00251c
{
    public final j b;
    public final String c;

    public void o(j p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       p0 = LiveLogTag.LIVE_QUIZ;
       p0.appendTag("LiveQuizAudienceManager");
       LiveLogTag liveLogTag = p0;
       b.w(liveLogTag, "getLiveQuizMyStatus\(n/live/quiz2/myStatus\) ", "mLiveStreamId", tb.a.Z2.getLiveStreamId(), "liveQuizId", this.c, p0);
    }
}
