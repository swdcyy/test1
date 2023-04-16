package com.kuaishou.recruit.doubleList.question.widget.a;
import at4.b;
import android.view.View;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire$QuestionClickableOption;
import at4.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;

public class a implements b	// class@000ead
{
    public View a;
    public TextView b;
    public KwaiImageView c;
    public View d;
    public TextView e;
    public KwaiImageView f;
    public final k g;

    public void a(View p0,k p1){
       super();
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.a = m1.f(p0, 0x7f0a1c4a);
          this.b = m1.f(p0, 0x7f0a1c4c);
          this.c = m1.f(p0, 0x7f0a1c4b);
          this.d = m1.f(p0, 0x7f0a1c4d);
          this.e = m1.f(p0, 0x7f0a1c4f);
          this.f = m1.f(p0, 0x7f0a1c4e);
       }
       this.g = p1;
       return;
    }
    public void a(LiveQuestionnaire p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       a uoa1 = 8;
       if (!q.f(p0.mQuestionClickableOptions)) {
          p0 = p0.mQuestionClickableOptions;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
             this.b(p0.get(0), this.a, this.c, this.b);
             int i = 1;
             if (p0.size() > i) {
                this.b(p0.get(i), this.d, this.f, this.e);
             }else {
                this.d.setVisibility(uoa1);
             }
          }
       }else {
          this.a.setVisibility(uoa1);
          this.d.setVisibility(uoa1);
       }
       return;
    }
    public final void b(LiveQuestionnaire$QuestionClickableOption p0,View p1,KwaiImageView p2,TextView p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "4")) {
          return;
       }
       p1.setVisibility(0);
       p1.setOnClickListener(new a(this, p0));
       LiveQuestionnaire$QuestionClickableOption mCDNUrls = p0.mCDNUrls;
       if (mCDNUrls != null && mCDNUrls.length > 0) {
          p2.setVisibility(0);
          p2.U(p0.mCDNUrls);
       }
       p3.setText(p0.mText);
       return;
    }
}
