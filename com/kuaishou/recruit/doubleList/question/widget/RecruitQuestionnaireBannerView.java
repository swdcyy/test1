package com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.ViewStub;
import java.lang.CharSequence;
import lnc.a1;
import d61.k;
import com.kuaishou.recruit.doubleList.question.widget.RecruitQuestionnaireBannerView$a;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import at4.e;
import android.view.View$OnClickListener;
import at4.d;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Collection;
import ekd.q;
import com.kuaishou.recruit.doubleList.question.widget.a;
import at4.f;
import z1.k;
import at4.c;

public class RecruitQuestionnaireBannerView extends LinearLayout	// class@000eac
{
    public View b;
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public View f;
    public ViewStub g;
    public ViewStub h;
    public View i;
    public View j;
    public RecruitQuestionnaireBannerView$a k;

    public void RecruitQuestionnaireBannerView(Context p0){
       super(p0, null);
    }
    public void RecruitQuestionnaireBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RecruitQuestionnaireBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, RecruitQuestionnaireBannerView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d12ed, this);
          this.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
          this.b = this.findViewById(0x7f0a1c59);
          this.c = this.findViewById(0x7f0a1c5a);
          this.d = this.findViewById(0x7f0a1c58);
          this.e = this.findViewById(0x7f0a1c57);
          this.f = this.findViewById(0x7f0a1c51);
          ViewStub viewStub = this.findViewById(R.id.live_explore_questionnaire_options_container_vs);
          this.g = viewStub;
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d12ef);
          viewStub = this.findViewById(R.id.live_explore_questionnaire_clickable_options_container_vs);
          this.h = viewStub;
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d12ee);
       }
       return;
    }
    public final void a(TextView p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RecruitQuestionnaireBannerView.class, "6")) {
          return;
       }
       p0.setText(p1);
       p0.setTextColor(k.c(p2, a1.a(R.color.arg_RES_7f0607de)));
       return;
    }
    public void setOnQuestionBannerClickListener(RecruitQuestionnaireBannerView$a p0){
       this.k = p0;
    }
    public void setQuestionnaireBannerInfo(LiveQuestionnaire p0){
       RecruitQuestionnaireBannerView ti;
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "2")) {
          return;
       }
       this.setOnClickListener(new e(this, p0));
       int i = 0;
       int i1 = 8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "8")) {
          if (p0.mIsCanClose != null) {
             this.f.setVisibility(i);
             this.f.setOnClickListener(new d(this));
          }else {
             this.f.setVisibility(i1);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "7")) {
          if (!TextUtils.x(p0.mTitle)) {
             this.b.setVisibility(i);
             this.c.setVisibility(i);
             this.c.U(p0.mPicUrls);
             this.d.setVisibility(i);
             this.a(this.d, p0.mTitle, p0.mTitleFontColor);
          }else {
             this.b.setVisibility(i1);
             this.c.setVisibility(i1);
             this.d.setVisibility(i1);
          }
       }
       this.a(this.e, p0.mSubTitle, p0.mSubTitleFontColor);
       if (!PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "3")) {
          if (!q.f(p0.mQuestionClickableOptions) && this.g != null) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "4")) {
                if (this.j == null) {
                   this.j = this.h.inflate();
                   this.h.setVisibility(i);
                }
                this.j.setVisibility(i);
                ti = this.i;
                if (ti != null) {
                   ti.setVisibility(i1);
                }
                new a(this.j, new f(this)).a(p0);
             }
          }else if(!q.f(p0.mQuestionOptions) && (this.h == null || PatchProxy.applyVoidOneRefs(p0, this, RecruitQuestionnaireBannerView.class, "5"))){
             if (this.i == null) {
                this.i = this.g.inflate();
                this.g.setVisibility(i);
             }
             this.i.setVisibility(i);
             ti = this.j;
             if (ti != null) {
                ti.setVisibility(i1);
             }
             new c(this.i).a(p0);
          }
       }
       return;
    }
}
