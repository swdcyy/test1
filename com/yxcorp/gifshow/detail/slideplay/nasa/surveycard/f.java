package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionOptionMeta;
import java.lang.CharSequence;
import android.widget.TextView;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import q6a.i;
import android.view.View$OnClickListener;
import q6a.b;

public class f extends PresenterV2	// class@0017d1
{
    public SurveyBigCardQuestionOptionMeta p;
    public TextView q;
    public ImageView r;
    public RelativeLayout s;
    public ObservableList t;
    public boolean u;
    public b v;
    public SurveyBigCardMeta w;

    public void f(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f.class, "3")) {
          return;
       }
       String str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, this, f.class, str)) {
          f tw = this.w;
          if (tw != null && !q.f(tw.mQuestions)) {
             int i = 0;
             if (this.w.mQuestions.get(i) != null) {
                if (this.w.mQuestions.get(i).mType == 1) {
                   i = true;
                }
                this.u = i;
             }
          }
          PatchProxy.onMethodExit(f.class, str);
       }
       this.P8();
       if (!PatchProxy.applyVoidWithListener(objArray, this, f.class, "7")) {
          f tp = this.p;
          if (tp != null) {
             this.q.setText(tp.mText);
          }
          PatchProxy.onMethodExit(f.class, "7");
       }
       PatchProxy.onMethodExit(f.class, "3");
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "6")) {
          return;
       }
       this.s.setSelected(this.t.contains(this.p));
       this.q.setSelected(this.t.contains(this.p));
       f tr = this.r;
       int i = (this.t.contains(this.p))? 0: 4;
       tr.setVisibility(i);
       PatchProxy.onMethodExit(f.class, "6");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3c2a);
       this.r = m1.f(p0, 0x7f0a3c28);
       this.s = p0;
       p0.setOnClickListener(new i(this));
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(SurveyBigCardQuestionOptionMeta.class);
       this.t = this.r8("SELECTED_SURVEY");
       this.v = this.r8("SURVEY_CARD_ADAPTER");
       this.w = this.r8("SURVEY_BIG_CARD_META");
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
}
