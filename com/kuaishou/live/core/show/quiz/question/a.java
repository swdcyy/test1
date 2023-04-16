package com.kuaishou.live.core.show.quiz.question.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView;
import java.lang.CharSequence;
import android.widget.TextView;
import o79.i;
import eg2.b;
import p91.m;
import com.kuaishou.live.core.show.quiz.question.a$a;
import java.util.Objects;
import java.lang.Long;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.kuaishou.live.core.show.quiz.question.b;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView$a;
import android.os.CountDownTimer;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@000e3d
{
    public c p;
    public LiveQuizQuestionAnswerStateView q;
    public TextView r;
    public static String sLivePresenterClassName = "LiveQuizQuestionAnswerStatePresenter";

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tp = this.p;
       c f = tp.f;
       boolean b = true;
       if (f == LiveQuizDialogType.USER_RESULT_RIGHT) {
          this.q.c(b);
       }else {
          int i = 0;
          if (f == LiveQuizDialogType.USER_RESULT_WRONG) {
             if (tp.d != null) {
                this.r.setText("再接再厉");
             }else {
                this.r.setText("再接再厉，下一题加油");
             }
             this.r.setTextColor(i.a(R.color.arg_RES_7f061549));
             this.r.setVisibility(i);
             this.q.c(i);
          }else {
             this.q.setMaxCountDownTime(tp.g.b());
             tp = this.q;
             a tp1 = this.p;
             long l = tp1.g.a(tp1.a);
             a$a uoa = new a$a(this);
             Objects.requireNonNull(tp);
             if (!PatchProxy.isSupport(LiveQuizQuestionAnswerStateView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), uoa, tp, LiveQuizQuestionAnswerStateView.class, "4")) {
                tp.d.setVisibility(8);
                tp.c.setVisibility(i);
                LiveQuizQuestionAnswerStateView c = tp.c;
                c.setProgress((int)((long)c.getMax() - l));
                tp.i = b;
                b uob = new b(tp, l, 40, uoa);
                tp.f = b;
                tp.b.setVisibility(i);
                tp.b.setText(String.valueOf((l / 1000)));
                tp.f.start();
                tp.a();
                tp.e.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_quiz/live_quiz_count_down_finish.json"));
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(null, tq, LiveQuizQuestionAnswerStateView.class, "7")) {
          LiveQuizQuestionAnswerStateView j = tq.j;
          if (j != null) {
             if (j.isRunning()) {
                tq.j.cancel();
             }
             tq.j = null;
          }
          j = tq.f;
          if (j != null) {
             j.cancel();
             tq.f = null;
          }
          j = tq.e;
          if (j != null && j.p()) {
             tq.e.f();
          }
          tq.d.setBackground(null);
          tq.d.setVisibility(8);
       }
       this.q.setVisibility(8);
       this.r.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2407);
       this.r = m1.f(p0, 0x7f0a2416);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(c.class);
       return;
    }
}
