package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$dealOperationList$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import mf5.w0;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class NewPlayerFeedbackPanel$dealOperationList$2 extends Lambda implements l	// class@000a79
{
    public static final NewPlayerFeedbackPanel$dealOperationList$2 INSTANCE;

    static {
       NewPlayerFeedbackPanel$dealOperationList$2.INSTANCE = new NewPlayerFeedbackPanel$dealOperationList$2();
    }
    public void NewPlayerFeedbackPanel$dealOperationList$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(w0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewPlayerFeedbackPanel$dealOperationList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return a.g(p0.A(), "space");
    }
}
