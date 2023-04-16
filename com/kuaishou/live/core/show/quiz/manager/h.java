package com.kuaishou.live.core.show.quiz.manager.h;
import com.kuaishou.live.core.show.quiz.manager.d$a;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionAsked;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import dg2.d;
import eg2.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import eg2.a;
import bg2.c;
import java.util.ArrayList;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Message;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed;
import java.lang.Boolean;

public class h implements d$a	// class@000e16
{
    public final j a;

    public void h(j p0){
       this.a = p0;
       super();
    }
    public void a(LiveQuiz2Proto$SCLiveQuiz2QuestionAsked p0){
       String str1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, j.class, "11") || (p0 != null && ta.f != null)) {
          ta.d.h(p0.liveQuiz);
          j d = ta.d;
          d.i = p0.logoPicUrl;
          b uob = d.b();
          LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
          String str = "LiveQuizAudienceManager";
          lIVE_QUIZ.appendTag(str);
          b.T(lIVE_QUIZ, "handleAskedSignal", "curIndex", Integer.valueOf(uob.a), "newIndex", Integer.valueOf(p0.questionNumber));
          if (p0.questionNumber <= uob.a) {
             lIVE_QUIZ.appendTag(str);
             b.P(lIVE_QUIZ, "handleAskedSignal, question number <= cur, drop");
          }else if((p0.questionEndTimeMs - ta.d()) - 3000 <= 0){
             lIVE_QUIZ.appendTag(str);
             b.P(lIVE_QUIZ, "handleAskedSignal no enough time show question -> toast");
             i.a(R.style.arg_RES_7f110668, 0x7f102b0c);
          }else {
             d = ta.d;
             d g = d.g;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             ArrayList obj = null;
             b uob1 = PatchProxy.applyTwoRefs(g, p0, obj, b.class, "3");
             if (uob1 != patchProxyRe) {
             }else {
                uob1 = new b();
                uob1.a = p0.questionNumber;
                uob1.f = p0.title;
                if (!j.h(p0.option)) {
                   obj = PatchProxy.applyTwoRefs(g, p0, obj, a.class, "4");
                   if (obj != patchProxyRe) {
                   }else if(g != null){
                      str1 = c.b(g, p0.eraserErrorAnswer);
                   }else {
                      str1 = "";
                   }
                   obj = new ArrayList();
                   LiveQuiz2Proto$SCLiveQuiz2QuestionAsked option = p0.option;
                   int len = option.length;
                   for (i = 0; i < len; i = i + 1) {
                      a uoa = a.a(option[i]);
                      if (!TextUtils.x(str1) && (uoa.a).equals(str1)) {
                         uoa.e = true;
                      }
                      obj.add(uoa);
                   }
                   if (a.b(p0.liveQuiz)) {
                      a.c(p0.questionNumber, obj);
                   }
                   uob1.h = obj;
                }
                uob1.i = p0.submitMaxDelayMs;
                uob1.b = p0.questionStartTimeMs;
                uob1.c = p0.questionEndTimeMs;
             }
             d.g(uob1);
             ta.i(ta.g(2, ta.d));
          }
       }
       return;
    }
    public void b(LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed p0){
       b uob1;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, j.class, "12") || (p0 != null && ta.f != null)) {
          b uob = ta.d.b();
          LiveLogTag lIVE_QUIZ = LiveLogTag.LIVE_QUIZ;
          String str = "LiveQuizAudienceManager";
          lIVE_QUIZ.appendTag(str);
          b.U(lIVE_QUIZ, "handleReviewedSignal", "currentIndex", Integer.valueOf(uob.a), "reviewedSignal.Index", Integer.valueOf(p0.questionNumber), "isRight", Boolean.valueOf(uob.e()));
          ta.d.h(p0.liveQuiz);
          j d = ta.d;
          d.i = p0.logoPicUrl;
          int i = p0.questionNumber - uob.a;
          if (i < 0) {
             lIVE_QUIZ.appendTag(str);
             b.P(lIVE_QUIZ, "handleReviewedSignal diff < 0, drop");
          }else if(i > 0){
             lIVE_QUIZ.appendTag(str);
             b.P(lIVE_QUIZ, "handleReviewedSignal diff > 0, miss some signals, UPDATE INDEX");
             j d1 = ta.d;
             d g = d1.g;
             if (PatchProxy.isSupport(b.class)) {
                uob1 = PatchProxy.applyThreeRefs(g, p0, Boolean.TRUE, null, b.class, "4");
                if (uob1 != PatchProxyResult.class) {
                label_00a7 :
                   d1.g(uob1);
                   ta.i(ta.g(3, ta.d));
                }
             }
             uob1 = new b();
             uob1.f(g, p0);
             uob1.g = true;
             goto label_00a7 ;
          }else {
             uob.f(d.g, p0);
             if (uob.l == null) {
                lIVE_QUIZ.appendTag(str);
                b.P(lIVE_QUIZ, "handleReviewedSignal no submit answer -> failed");
                ta.i(ta.g(3, ta.d));
             }else if(uob.e()){
                lIVE_QUIZ.appendTag(str);
                b.P(lIVE_QUIZ, "handleReviewedSignal success and right -> right");
                ta.i(ta.g(4, ta.d));
             }else {
                lIVE_QUIZ.appendTag(str);
                b.P(lIVE_QUIZ, "handleReviewedSignal success but wrong -> fail");
                ta.i(ta.g(3, ta.d));
             }
          }
       }
       return;
    }
}
