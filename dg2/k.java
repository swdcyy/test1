package dg2.k;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionAsked;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import java.lang.Long;
import java.lang.System;
import e17.i;
import com.kuaishou.live.core.show.quiz.manager.a;
import com.kuaishou.live.core.show.quiz.manager.d;
import lf3.f;

public final class k implements g	// class@002518
{
    public final j b;

    public void k(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       k b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, j.class, "9")) {
       }else if(b.f == null){
          LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
          lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          b.S(lIVE_QUIZ, "onReceiveAskedSignal", "msg", obj);
          b.a(obj.liveQuiz);
          long l = obj.questionEndTimeMs - b.d();
          long l1 = obj.questionStartTimeMs - b.d();
          lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          b.V(lIVE_QUIZ, "onReceiveAskedSignal", "serverTime", Long.valueOf(b.d()), "localTime", Long.valueOf(System.currentTimeMillis()), "questionEndDuration", Long.valueOf(l), "questionStartDuration", Long.valueOf(l1));
          if (l - 3000 <= 0) {
             lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
             b.P(lIVE_QUIZ, "onReceiveAskedSignal, no enough time show question -> toast");
             i.a(R.style.arg_RES_7f110668, 0x7f102b0c);
          }else {
             LiveQuiz2Proto$SCLiveQuiz2QuestionAsked sCLiveQuiz2Q = null;
             if (l1 - sCLiveQuiz2Q <= 0) {
                l1 = sCLiveQuiz2Q;
             }
             b.h.a(obj.questionNumber).f(obj, l1, "asked");
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
