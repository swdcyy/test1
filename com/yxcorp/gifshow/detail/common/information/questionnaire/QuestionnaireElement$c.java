package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import r1a.n;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class QuestionnaireElement$c implements g	// class@00143d
{
    public final QuestionnaireElement b;

    public void QuestionnaireElement$c(QuestionnaireElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QuestionnaireElement$c.class, "1")) {
       }else {
          p0 = this.b;
          p0.q0(QuestionnaireElement.o0(p0).getQuestionnaireLink());
          p0 = this.b.p0();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, n.class, "2")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = p0.a(p0.b);
             QuestionnaireInfo questionnair = p0.b.getQuestionnaireInfo();
             if (questionnair != null) {
                questionnair = questionnair.mKsOrderId;
                if (questionnair != null) {
                   ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
                   ksOrderInfoP.ksOrderId = questionnair;
                   uContentPack.ksOrderInfoPackage = ksOrderInfoP;
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUESTIONNAIRE_ENTER_BUTTON";
             new ClientEvent$ClickEvent().elementPackage = uElementPack;
             u1.M("", p0.a, 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
