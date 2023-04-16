package com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement$logger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.information.questionnaire.QuestionnaireElement;
import java.lang.Object;
import r1a.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class QuestionnaireElement$logger$2 extends Lambda implements a	// class@00143f
{
    public final QuestionnaireElement this$0;

    public void QuestionnaireElement$logger$2(QuestionnaireElement p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final n invoke(){
       Object obj = PatchProxy.apply(null, this, QuestionnaireElement$logger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QuestionnaireElement u = this.this$0.u;
       if (u == null) {
          a.S("fragment");
       }
       return new n(u, QuestionnaireElement.o0(this.this$0));
    }
}
