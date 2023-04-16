package fd1.d;
import bq5.b;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import fd1.d$c;
import java.lang.Object;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.widget.FrameLayout;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import fd1.d$a;
import android.view.View$OnClickListener;
import fd1.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import d61.k;
import java.util.List;
import java.lang.Math;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire$QuestionClickableOption;
import fd1.d$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class d implements b	// class@0022f0
{
    public final LiveQuestionnaire b;
    public final d$c c;
    public View d;

    public void d(LiveQuestionnaire p0,d$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       f.d(this);
    }
    public View getView(){
       return this.d;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       boolean b;
       LiveQuestionnaire mQuestionCli1;
       View view1;
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_QUESTIONNAIRE, "LiveQuestionnaireBubbleWidget.createView");
       Context context = p0.getContext();
       b = false;
       View view = a.d(context, R.layout.arg_RES_7f0d0a96, new FrameLayout(context), b);
       this.d = view;
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       int i = (TextUtils.x(this.b.mTitle))? a1.d(R.dimen.arg_RES_7f070925): a1.d(R.dimen.arg_RES_7f070926);
       layoutParams.height = i;
       layoutParams.width = a1.d(0x7f0702c2);
       this.d.setLayoutParams(layoutParams);
       d$a uoa = new d$a(this);
       if (this.b.mIsSubmitAnswer == null) {
          this.d.setOnClickListener(uoa);
       }
       Object[] objArray = null;
       String str = 8;
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          view1 = this.d.findViewById(R.id.live_questionnaire_close_image_view);
          if (this.b.mIsCanClose != null) {
             view1.setVisibility(b);
             view1.setOnClickListener(new c(this));
          }else {
             view1.setVisibility(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          view1 = this.d.findViewById(R.id.live_questionnaire_title_container);
          KwaiImageView kwaiImageVie = this.d.findViewById(R.id.live_questionnaire_title_left_image_view);
          TextView textView1 = this.d.findViewById(R.id.live_questionnaire_title);
          if (!TextUtils.x(this.b.mTitle)) {
             view1.setVisibility(b);
             kwaiImageVie.setVisibility(b);
             kwaiImageVie.U(this.b.mPicUrls);
             textView1.setVisibility(b);
             textView1.setText(this.b.mTitle);
             textView1.setTextColor(k.c(this.b.mTitleFontColor, a1.a(R.color.arg_RES_7f061ff3)));
          }else {
             view1.setVisibility(str);
             kwaiImageVie.setVisibility(str);
             textView1.setVisibility(str);
          }
       }
       d tb = this.b;
       if (!PatchProxy.applyVoidOneRefs(tb, this, uod, "3")) {
          int i1 = 3;
          int[] ointArray = new int[i1]{0x7f0a23f5,0x7f0a23f7,0x7f0a23f6};
          LiveQuestionnaire mOptionFontC = tb.mOptionFontColor;
          LiveQuestionnaire mQuestionCli = tb.mQuestionClickableOptions;
          int i2 = 2;
          if (mQuestionCli != null && mQuestionCli.size() >= i2) {
             mQuestionCli1 = tb.mQuestionClickableOptions;
             i1 = Math.min(mQuestionCli1.size(), i1);
             for (; b < i1; b = b + 1) {
                this.t(this.d.findViewById(ointArray[b]), mQuestionCli1.get(b).mText, mQuestionCli1.get(b).mLink, mOptionFontC);
             }
          }else {
             mQuestionCli = tb.mQuestionOptions;
             if (mQuestionCli != null && mQuestionCli.size() >= i2) {
                mQuestionCli = tb.mQuestionOptions;
                i1 = Math.min(mQuestionCli.size(), i1);
                mQuestionCli1 = tb.mRouteUrl;
                for (; b < i1; b = b + 1) {
                   this.t(this.d.findViewById(ointArray[b]), mQuestionCli.get(b), mQuestionCli1, mOptionFontC);
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          TextView textView = this.d.findViewById(R.id.live_questionnaire_sub_title);
          textView.setText(this.b.mSubTitle);
          textView.setTextColor(k.c(this.b.mSubTitleFontColor, a1.a(R.color.arg_RES_7f061ff3)));
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public final void t(TextView p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, d.class, "4")) {
          return;
       }
       p0.setOnClickListener(new d$b(this, p2));
       p0.setText(p1);
       if (!TextUtils.x(p3)) {
          p0.setTextColor(k.c(p3, a1.a(R.color.arg_RES_7f061ff3)));
       }
       p0.setVisibility(0);
       return;
    }
    public int z(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!TextUtils.x(this.b.mTitle)) {
          return a1.d(0x7f070926);
       }
       return a1.d(0x7f070925);
    }
}
