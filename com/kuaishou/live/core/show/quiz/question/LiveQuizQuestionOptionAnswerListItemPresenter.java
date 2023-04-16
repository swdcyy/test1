package com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionAnswerListItemPresenter;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import eg2.a;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState;
import com.kuaishou.live.core.show.quiz.question.e;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import th0.d;
import android.animation.TimeInterpolator;
import gg2.c;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.quiz.question.c;

public class LiveQuizQuestionOptionAnswerListItemPresenter extends c	// class@000e39
{
    public TextView p;
    public TextView q;
    public a r;
    public e s;
    public c t;
    public LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState u;
    public AnimatorSet v;
    public static String sLivePresenterClassName = "LiveQuizQuestionOptionAnswerListItemPresenter";

    public void LiveQuizQuestionOptionAnswerListItemPresenter(){
       super();
    }
    public void E8(){
       LiveQuizQuestionOptionAnswerListItemPresenter liveQuizQues = LiveQuizQuestionOptionAnswerListItemPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveQuizQues, "3")) {
          return;
       }
       this.p.setEnabled(true);
       this.p.setSelected(false);
       this.p.setText(this.r.b);
       this.p.setOnClickListener(objArray);
       LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState liveQuizQues1 = PatchProxy.apply(objArray, this, liveQuizQues, "4");
       if (liveQuizQues1 != PatchProxyResult.class) {
       }else if(TextUtils.n(this.s.r1(), this.r.a)){
          liveQuizQues1 = LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.SELECTED;
       }else if(this.s.s1() || this.r.e != null){
          liveQuizQues1 = LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.DISABLE;
       }else if(TextUtils.x(this.s.r1())){
          liveQuizQues1 = LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.NORMAL;
       }else {
          liveQuizQues1 = LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.DISABLE;
       }
       this.u = liveQuizQues1;
       this.p.setBackgroundResource(R.drawable.arg_RES_7f08141d);
       LiveQuizQuestionOptionAnswerListItemPresenter tu = this.u;
       if (tu == LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.DISABLE) {
          this.p.setEnabled(false);
       }else if(tu == LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.SELECTED){
          this.p.setSelected(true);
          if (!this.s.s1() && !PatchProxy.applyVoid(objArray, this, liveQuizQues, "6")) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.v = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.p, View.SCALE_X, new float[3]{0x3f800000,0x3f666666,0x3f800000}),ObjectAnimator.ofFloat(this.p, View.SCALE_Y, new float[3]{0x3f800000,0x3f666666,0x3f800000})};
             uAnimatorSet.playTogether(uAnimatorArr);
             this.v.setDuration(400);
             this.v.setInterpolator(new d());
             this.v.start();
          }
       }else if(tu == LiveQuizQuestionOptionAnswerListItemPresenter$LiveQuizQuestionOptionAnswerState.NORMAL){
          this.p.setOnClickListener(new c(this));
       }
       if (this.r.e != null) {
          this.q.setVisibility(false);
          this.q.setText("ÏðÆ¤²ÁÒÑ²Á³ý");
          this.q.setBackgroundResource(R.drawable.arg_RES_7f081421);
       }else {
          this.q.setVisibility(8);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionOptionAnswerListItemPresenter.class, "8")) {
          return;
       }
       LiveQuizQuestionOptionAnswerListItemPresenter tv = this.v;
       if (tv != null) {
          tv.cancel();
          this.v = null;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionOptionAnswerListItemPresenter.class, "7")) {
          return;
       }
       this.p.setOnClickListener(null);
       this.u = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQuizQuestionOptionAnswerListItemPresenter.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2446);
       this.q = m1.f(p0, 0x7f0a2447);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveQuizQuestionOptionAnswerListItemPresenter.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.s = this.r8("ADAPTER");
       this.t = this.r8("key_quiz_question_caller_context");
       return;
    }
}
