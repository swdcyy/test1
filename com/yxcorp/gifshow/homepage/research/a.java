package com.yxcorp.gifshow.homepage.research.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.yxcorp.gifshow.model.response.DialogResponse$SurveyDialogData;
import java.lang.Object;
import kua.c;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.homepage.research.ResearchWidget;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.model.response.DialogResponse$QuestionItem;
import com.kwai.library.widget.seekbar.ScoreSeekBar;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import i89.f;
import i89.e;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchUserQuizPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$UserQuizPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import m01.a;
import android.view.View$OnClickListener;
import java.lang.Integer;
import lnc.i3;
import ekd.m1;
import kua.a;
import kua.b;

public class a implements PopupInterface$f, d	// class@0017f5
{
    public TextView b;
    public TextView c;
    public LinearLayout d;
    public DialogResponse$SurveyDialogData e;
    public c f;
    public ScoreSeekBar$a g;

    public void a(DialogResponse$SurveyDialogData p0){
       super();
       this.g = new c(this);
       this.e = p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       a this;
       a uoa = a.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.f = p0;
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d04cf, p2, b);
       this.doBindView(view);
       String str = "3";
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoa, str)) {
          this.b.setText(this.e.mTitle);
          DialogResponse$SurveyDialogData mQuestions = this.e.mQuestions;
          if (!q.f(mQuestions)) {
             for (int i1 = 0; i1 < mQuestions.size(); i1 = i1 + 1) {
                ResearchWidget researchWidg = new ResearchWidget(this.f.u());
                DialogResponse$QuestionItem questionItem = mQuestions.get(i1);
                this = this.g;
                if (!PatchProxy.applyVoidTwoRefs(questionItem, this, researchWidg, ResearchWidget.class, str)) {
                   researchWidg.b.setText(questionItem.mQuestionContent);
                   researchWidg.d.setText(questionItem.mPositiveDesc);
                   researchWidg.e.setText(questionItem.mNegativeDesc);
                   questionItem = questionItem.mMinScore;
                   int i2 = questionItem.mMaxScore - questionItem;
                   i2 = i2 + 1;
                   ResearchWidget c = researchWidg.c;
                   c.e = questionItem;
                   c.d = i2;
                   c.q = this;
                   c.e(1);
                }
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
                if (i1 > 0) {
                   layoutParams.topMargin = a1.d(0x7f0702d2);
                }
                this.d.addView(researchWidg, layoutParams);
             }
          }
       }
       DialogResponse$SurveyDialogData mReportName = this.e.mReportName;
       if (!PatchProxy.applyVoidOneRefs(mReportName, this, uoa, "4")) {
          e.a().dialogReport(mReportName).subscribe(Functions.d(), Functions.d());
          if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             ClientContentWrapper$BatchUserQuizPackage uBatchUserQu = new ClientContentWrapper$BatchUserQuizPackage();
             int childCount = this.d.getChildCount();
             ClientContentWrapper$UserQuizPackage[] userQuizPack = new ClientContentWrapper$UserQuizPackage[childCount];
             for (; b < childCount; b = i) {
                ClientContentWrapper$UserQuizPackage userQuizPack1 = new ClientContentWrapper$UserQuizPackage();
                int i = b + 1;
                userQuizPack1.index = i;
                userQuizPack1.id = this.e.mId;
                ResearchWidget childAt = this.d.getChildAt(b);
                userQuizPack1.score = childAt.getScore();
                if (childAt.getAnswerPosition() > 0) {
                   userQuizPack1.answer = childAt.getScore()+"";
                }
                if (!q.f(this.e.mQuestions)) {
                   userQuizPack1.content = this.e.mQuestions.get(b).mQuestionContent;
                }
                userQuizPack[b] = userQuizPack1;
             }
             uBatchUserQu.userQuizPackage = userQuizPack;
             uContentWrap.batchUserQuizPackage = uBatchUserQu;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 531;
             uElementPack.name = "investigate_popup";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (!TextUtils.isEmpty(this.e.mKsOrderId)) {
                uContentPack.ksOrderInfoPackage = l0.a(this.e.mKsOrderId);
             }
             u1.v0(4, uElementPack, uContentPack, uContentWrap);
          }
       }
       view.setOnClickListener(a.b);
       return view;
    }
    public void b(c p0){
       this.f = null;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.f.q(4);
       return;
    }
    public final void d(int p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$BatchUserQuizPackage uBatchUserQu = new ClientContentWrapper$BatchUserQuizPackage();
       int childCount = this.d.getChildCount();
       ClientContentWrapper$UserQuizPackage[] userQuizPack = new ClientContentWrapper$UserQuizPackage[childCount];
       int i = 0;
       String str = "";
       while (i < childCount) {
          ClientContentWrapper$UserQuizPackage userQuizPack1 = new ClientContentWrapper$UserQuizPackage();
          int i1 = i + 1;
          userQuizPack1.index = i1;
          userQuizPack1.id = this.e.mId;
          ResearchWidget childAt = this.d.getChildAt(i);
          userQuizPack1.score = childAt.getScore();
          if (childAt.getAnswerPosition() > 0) {
             userQuizPack1.answer = childAt.getScore()+str;
          }
          if (!q.f(this.e.mQuestions)) {
             userQuizPack1.content = this.e.mQuestions.get(i).mQuestionContent;
          }
          userQuizPack[i] = userQuizPack1;
          i = i1;
       }
       uBatchUserQu.userQuizPackage = userQuizPack;
       uContentWrap.batchUserQuizPackage = uBatchUserQu;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.name = "investigate_popup";
       if (p1 != null) {
          i3 oi3 = i3.f();
          oi3.d("button_name", p1);
          uElementPack.params = oi3.e();
       }
       u1.E(str, 1, uContentWrap, uElementPack);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a35ba);
       this.b = m1.f(p0, 0x7f0a35bf);
       this.c = m1.f(p0, 0x7f0a35b9);
       m1.a(p0, new a(this), R.id.research_close);
       m1.a(p0, new b(this), R.id.research_confirm_text);
       return;
    }
}
