package com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.CallableReference;

public final class AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1 extends FunctionReferenceImpl implements a	// class@000dfc
{

    public void AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1(AssistantUtils p0){
       super(0, p0, AssistantUtils.class, "getAssistantHasShowGuide", "getAssistantHasShowGuide\(\)Z", 0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.receiver.d();
    }
}
