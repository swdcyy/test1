package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;

public final class QuestionnaireElement$a implements g	// class@00143b
{
    public final QuestionnaireElement b;

    public void QuestionnaireElement$a(QuestionnaireElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QuestionnaireElement$a.class, "1")) {
       }else if(p0.intValue() > 0){
          this.b.b0();
       }else {
          this.b.c0();
       }
       return;
    }
}
