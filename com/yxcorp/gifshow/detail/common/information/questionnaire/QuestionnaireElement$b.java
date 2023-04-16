package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$b;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import rf5.u;
import r1a.n;
import kotlin.jvm.internal.a;
import java.util.Objects;
import p1a.a$a;
import r1a.m;
import tl8.g;
import p1a.a;

public final class QuestionnaireElement$b extends y0	// class@00143c
{
    public final QuestionnaireElement a;

    public void QuestionnaireElement$b(QuestionnaireElement p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       QuestionnaireElement$b uob = QuestionnaireElement$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (QuestionnaireElement.o0(this.a).isQuestionnaire()) {
          QuestionnaireElement.n0(this.a).F(true, 17);
       }
       return;
    }
    public void f(boolean p0){
       QuestionnaireElement$b uob = QuestionnaireElement$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, str)) {
          return;
       }
       if (QuestionnaireElement.o0(this.a).isQuestionnaire()) {
          QuestionnaireElement.n0(this.a).F(false, 17);
          n on = this.a.p0();
          QuestionnaireElement v = this.a.v;
          if (v == null) {
             a.S("logListener");
          }
          Objects.requireNonNull(on);
          if (!PatchProxy.applyVoidOneRefs(v, on, n.class, str) && v != null) {
             a$a uoa = a$a.t("QUESTIONNAIRE_ENTER_BUTTON", "");
             uoa.h(new m(on));
             v.b(uoa);
          }
       }
    label_005f :
       return;
    }
}
