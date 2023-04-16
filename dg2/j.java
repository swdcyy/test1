package dg2.j;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2Sync;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import bg2.c;
import dg2.d;
import lf3.f;

public final class j implements g	// class@002517
{
    public final j b;

    public void j(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       LiveQuiz2Proto$SCLiveQuiz2Sync syncType;
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "8")) {
       }else if(p0 == null || tb.f == null){
          tb.a(p0.liveQuiz);
          b.T(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onReceiveQuiz2SYNCSignal ", "syncSignal.syncType", Integer.valueOf(p0.syncType), "syncSignal", p0);
          LiveQuiz2Proto$SCLiveQuiz2Sync liveQuiz = p0.liveQuiz;
          String str = (liveQuiz == null)? "": liveQuiz.liveQuizId;
          long l = c.f(p0.maxDelayMs);
          tb.d.h(p0.liveQuiz);
          syncType = p0.syncType;
          if (syncType == 2) {
             tb.b(l, str, "sync_signal");
          }else if(syncType == 1){
             tb.c(l, str);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
