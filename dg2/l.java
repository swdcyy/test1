package dg2.l;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed;
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

public final class l implements g	// class@002519
{
    public final j b;

    public void l(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       l b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, j.class, "10")) {
       }else if(b.f == null){
          LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
          lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          b.S(lIVE_QUIZ, "onReceiveReviewedSignal", "msg", obj);
          b.a(obj.liveQuiz);
          long l = obj.reviewEndTime - b.d();
          long l1 = obj.reviewStartTime - b.d();
          lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
          b.V(lIVE_QUIZ, "onReceiveReviewedSignal", "serverTime", Long.valueOf(b.d()), "localTime", Long.valueOf(System.currentTimeMillis()), "reviewedEndDuration", Long.valueOf(l), "reviewedStartDuration", Long.valueOf(l1));
          if (l < 0) {
             lIVE_QUIZ.appendTag("LiveQuizAudienceManager");
             b.P(lIVE_QUIZ, "onReceiveReviewedSignal no time show answer -> toast");
             i.a(R.style.arg_RES_7f110668, 0x7f102b0c);
          }else if(l1 > 0){
             l1 = 0;
          }
          b.h.b(obj.questionNumber).f(obj, l1, "reviewed");
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
