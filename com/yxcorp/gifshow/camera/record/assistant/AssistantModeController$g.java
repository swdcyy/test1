package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import kotlin.jvm.internal.a;

public final class AssistantModeController$g implements View$OnClickListener	// class@001cec
{
    public final AssistantModeController b;

    public void AssistantModeController$g(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController$g.class, "1")) {
          return;
       }
       AssistantModeController$g tb = this.b;
       if (tb.G != null) {
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f100402), "KSToast.applyStyle\(R.sty¡­stant_not_available_tips\)");
       }else if(tb.H != null){
          i.a(R.style.arg_RES_7f11066a, 0x7f1039d3);
       }
       return;
    }
}
