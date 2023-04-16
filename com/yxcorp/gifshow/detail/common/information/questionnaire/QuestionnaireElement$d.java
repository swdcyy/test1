package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;

public final class QuestionnaireElement$d implements g	// class@00143e
{
    public final QuestionnaireElement b;

    public void QuestionnaireElement$d(QuestionnaireElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QuestionnaireElement$d.class, "1")) {
       }else {
          p0 = this.b;
          p0.q0(QuestionnaireElement.o0(p0).getQuestionnaireLink());
       }
       return;
    }
}
