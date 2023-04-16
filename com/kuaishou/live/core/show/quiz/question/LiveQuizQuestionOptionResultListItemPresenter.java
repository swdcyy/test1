package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionResultListItemPresenter;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import eg2.a;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState;
import eg2.b;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ProgressBar;
import java.lang.Integer;
import android.animation.ValueAnimator;
import gg2.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class LiveQuizQuestionOptionResultListItemPresenter extends c	// class@000e3b
{
    public ProgressBar p;
    public TextView q;
    public TextView r;
    public TextView s;
    public a t;
    public c u;
    public LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState v;
    public static String sLivePresenterClassName = "LiveQuizQuestionOptionResultListItemPresenter";

    public void LiveQuizQuestionOptionResultListItemPresenter(){
       super();
    }
    public void E8(){
       LiveQuizQuestionOptionResultListItemPresenter liveQuizQues = LiveQuizQuestionOptionResultListItemPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveQuizQues, "3")) {
          return;
       }
       c g = this.u.g;
       this.q.setText(this.t.b);
       this.r.setText(this.t.d);
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState liveQuizQues1 = PatchProxy.applyOneRefs(g, this, liveQuizQues, "4");
       if (liveQuizQues1 != PatchProxyResult.class) {
       }else if(g == null){
          liveQuizQues1 = LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.NORMAL;
       }else if(TextUtils.n(this.t.a, g.k)){
          liveQuizQues1 = LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.RIGHT;
       }else if(TextUtils.n(this.t.a, g.j)){
          liveQuizQues1 = LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.WRONG;
       }else {
          liveQuizQues1 = LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.NORMAL;
       }
       this.v = liveQuizQues1;
       LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState rIGHT = LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.RIGHT;
       if (liveQuizQues1 == rIGHT) {
          this.p.setProgressDrawable(a1.f(R.drawable.arg_RES_7f081424));
       }else if(liveQuizQues1 == LiveQuizQuestionOptionResultListItemPresenter$LiveQuizQuestionOptionResultState.WRONG){
          this.p.setProgressDrawable(a1.f(R.drawable.arg_RES_7f081425));
       }else {
          this.p.setProgressDrawable(a1.f(R.drawable.arg_RES_7f081423));
       }
       a c = this.t.c;
       int i = 2;
       if (c - 0x3ca3d70a <= 0) {
          this.p.setProgress(i);
       }else {
          LiveQuizQuestionOptionResultListItemPresenter tp = this.p;
          int i1 = (int)(c * 100.00f);
          if (!PatchProxy.isSupport(liveQuizQues) || !PatchProxy.applyVoidTwoRefs(tp, Integer.valueOf(i1), this, liveQuizQues, "5")) {
             int[] ointArray = new int[i];
             ointArray[0] = 0;
             ointArray[1] = i1;
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             valueAnimato.setDuration(250);
             valueAnimato.setStartDelay(200);
             valueAnimato.addUpdateListener(new e(tp));
             valueAnimato.start();
          }
       }
       if (this.t.e != null) {
          this.s.setVisibility(0);
          this.s.setText("ÏðÆ¤²ÁÒÑ²Á³ý");
          this.s.setBackgroundResource(R.drawable.arg_RES_7f081421);
       }else if(this.v == rIGHT && !TextUtils.x(g.o)){
          this.s.setVisibility(0);
          this.s.setText(g.o);
          this.s.setBackgroundResource(R.drawable.arg_RES_7f081422);
       }else {
          this.s.setVisibility(8);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionOptionResultListItemPresenter.class, "6")) {
          return;
       }
       this.v = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizQuestionOptionResultListItemPresenter.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2448);
       this.q = m1.f(p0, 0x7f0a2446);
       this.r = m1.f(p0, 0x7f0a244a);
       this.s = m1.f(p0, 0x7f0a2447);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionOptionResultListItemPresenter.class, "1")) {
          return;
       }
       this.t = this.q8(a.class);
       this.u = this.r8("key_quiz_question_caller_context");
       return;
    }
}
