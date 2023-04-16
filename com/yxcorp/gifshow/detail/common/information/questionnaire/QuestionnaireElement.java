package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$logger$2;
import msd.a;
import qrd.p;
import qrd.s;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import nr7.f;
import java.lang.Boolean;
import kp.r1;
import qp7.b;
import f4a.v;
import qp7.g;
import xq7.e;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$b;
import qp7.b1;
import qp7.c;
import nr7.e;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$c;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import brd.t;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import qp7.x0;
import nr7.f$a;
import pp7.b;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$d;
import r1a.n;
import qp7.d;
import nr7.d;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;

public final class QuestionnaireElement extends DispatchBaseElement	// class@001440
{
    public QPhoto t;
    public BaseFragment u;
    public a v;
    public u w;
    public final p x;
    public final GifshowActivity y;

    public void QuestionnaireElement(GifshowActivity p0,a p1){
       a.p(p0, "activity");
       super(d.z, p1);
       this.y = p0;
       this.x = s.c(new QuestionnaireElement$logger$2(this));
    }
    public static final u n0(QuestionnaireElement p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public static final QPhoto o0(QuestionnaireElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("photo");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, QuestionnaireElement.class, "2")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.u = b;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.v = o;
          p0 = p0.v.R;
          a.o(p0, "callerContext.mPhotoDeta¡­wipeToProfileFeedMovement");
          this.w = p0;
          PatchProxy.onMethodExit(QuestionnaireElement.class, "2");
       }
       return;
    }
    public a f0(a p0){
       f uof = PatchProxy.applyOneRefs(p0, this, QuestionnaireElement.class, "3");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(p0);
       }
       return uof;
    }
    public void j0(boolean p0){
       g e;
       QuestionnaireElement questionnair = QuestionnaireElement.class;
       if (PatchProxy.isSupport(questionnair) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, questionnair, "6")) {
          return;
       }
       QuestionnaireElement tt = this.t;
       String str = "photo";
       if (tt == null) {
          a.S(str);
       }
       if (tt.isQuestionnaire()) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          if (!r1.A2(tt)) {
             this.c0();
             v ov = v.b();
             QuestionnaireElement tt1 = this.t;
             if (tt1 == null) {
                a.S(str);
             }
             ov.h(tt1.getPhotoId());
             this.j(e.g(this.D(), new QuestionnaireElement$a(this), null, 2, null));
             this.i(new QuestionnaireElement$b(this));
             e uoe = this.A();
             QuestionnaireElement$c uoc = new QuestionnaireElement$c(this);
             e = Functions.e;
             a.o(e, "Functions.ERROR_CONSUMER");
             Objects.requireNonNull(uoe);
             b uob = PatchProxy.applyTwoRefs(uoc, e, uoe, e.class, "2");
             if (uob != PatchProxyResult.class) {
             }else {
                a.p(uoc, "onNext");
                a.p(e, "onError");
                uob = uoe.a.subscribe(uoc, e);
                a.o(uob, "mQuestionnaireClickSubje¡­ubscribe\(onNext, onError\)");
             }
             this.j(uob);
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             QuestionnaireInfo questionnair1 = tt.getQuestionnaireInfo();
             if (questionnair1 != null) {
                f uof = this.E();
                f$a uoa = PatchProxy.applyOneRefs(questionnair1, this, questionnair, "7");
                String str1 = "1";
                if (uoa != PatchProxyResult.class) {
                }else {
                   uoa = new f$a();
                   QuestionnaireInfo mText = questionnair1.mText;
                   a.o(mText, "questionnaireInfo.mText");
                   if (!PatchProxy.applyVoidOneRefs(mText, uoa, f$a.class, str1)) {
                      a.p(mText, "<set-?>");
                      uoa.a = mText;
                   }
                   uoa.b = questionnair1.mTextColor;
                   uoa.c = questionnair1.mPressedTextColor;
                   uoa.d = questionnair1.mBackgroundColor;
                   uoa.e = questionnair1.mPressedBackgroundColor;
                   uoa.f = questionnair1.mHeight;
                   uoa.g = questionnair1.mFontSize;
                   uoa.h = questionnair1.mIsBold;
                }
                Objects.requireNonNull(uof);
                if (!PatchProxy.applyVoidOneRefs(uoa, uof, f.class, str1)) {
                   a.p(uoa, "questionnaireModel");
                   uof.d.f(uoa);
                }
             }
             uoe = this.D();
             QuestionnaireElement$d uod = new QuestionnaireElement$d(this);
             a.o(e, "Functions.ERROR_CONSUMER");
             Objects.requireNonNull(uoe);
             b uob1 = PatchProxy.applyTwoRefs(uod, e, uoe, e.class, "8");
             if (uob1 != PatchProxyResult.class) {
             }else {
                a.p(uod, "onNext");
                a.p(e, "onError");
                uob1 = uoe.f.subscribe(uod, e);
                a.o(uob1, "clickToOpenUrlAction.subscribe\(onNext, onError\)");
             }
             this.j(uob1);
             return;
          }
       }
       this.b0();
       return;
    }
    public final n p0(){
       Object obj = PatchProxy.apply(null, this, QuestionnaireElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public d q(){
       d uod = PatchProxy.apply(null, this, QuestionnaireElement.class, "4");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public final void q0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QuestionnaireElement.class, "8")) {
          return;
       }
       this.y.startActivity(b.a(0x66dce92a).a(this.y, x0.f(p0)));
       return;
    }
    public c r(){
       e uoe = PatchProxy.apply(null, this, QuestionnaireElement.class, "5");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
}
