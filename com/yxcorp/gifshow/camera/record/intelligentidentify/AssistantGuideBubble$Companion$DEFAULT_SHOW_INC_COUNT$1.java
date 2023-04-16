package com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.CallableReference;

public final class AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1 extends FunctionReferenceImpl implements l	// class@000dfb
{

    public void AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1(AssistantUtils p0){
       super(1, p0, AssistantUtils.class, "incAssistantHasGuide", "incAssistantHasGuide\(I\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1.class, "1")) {
          return;
       }
       this.receiver.o(p0);
       return;
    }
}
