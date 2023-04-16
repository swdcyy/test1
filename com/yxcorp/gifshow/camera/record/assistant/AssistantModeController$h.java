package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$h;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import zb9.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.Objects;
import android.widget.TextView;
import android.view.View;
import zb9.x;
import android.view.View$OnClickListener;
import zb9.y;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class AssistantModeController$h implements g	// class@001ced
{
    public final AssistantModeController b;

    public void AssistantModeController$h(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       AssistantModeController uAssistantMo = AssistantModeController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController$h.class, "1")) {
       }else if(!this.b.o2().y()){
          this.b.v2();
       }else {
          Object[] objArray = null;
          if (p0.a()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, uAssistantMo, "12")) {
                uAssistantMo = p0.t;
                if (uAssistantMo != null) {
                   uAssistantMo.setSelected(true);
                }
                View view = p0.Q.i();
                if (view != null) {
                   view.setOnClickListener(new x(p0));
                }
                view = p0.Q.s();
                if (view != null) {
                   view.setOnClickListener(new y(p0));
                }
                view = p0.Q.s();
                if (view != null) {
                   TextView textView = view.findViewById(R.id.assistant_refresh_name_tv);
                   if (textView != null) {
                      textView.setText(a1.p(R.string.arg_RES_7f1041ed));
                   }
                }
                p0 = p0.d;
                a.o(p0, "mCallerContext");
                p0 = p0.b();
                a.o(p0, "mCallerContext.controllerManager");
                p0 = p0.V7();
                if (p0 != null) {
                   p0.c();
                }
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, uAssistantMo, "13")) {
                p0.Q.H(false);
                p0 = p0.t;
                if (p0 != null) {
                   p0.setSelected(false);
                }
             }
          }
       }
       return;
    }
}
