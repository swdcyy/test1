package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$f;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import ec9.f1;
import cc9.l;
import java.util.ArrayList;
import java.util.List;
import nsd.u;
import sa6.a;

public final class AssistantModeController$f implements View$OnClickListener	// class@001ceb
{
    public final AssistantModeController b;

    public void AssistantModeController$f(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       d d;
       BaseFragment uBaseFragmen;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantModeController$f.class, "1")) {
          return;
       }
       AssistantModeController$f tb = this.b;
       if (tb.E != null) {
          tb.z = true;
          d = this.b.d;
          a.o(d, "mCallerContext");
          uBaseFragmen = d.f();
          a.o(uBaseFragmen, "mCallerContext.fragment");
          tb.o2().h().f(uBaseFragmen, false);
          this.b.g2();
       }
       l ol = new l(new ArrayList(), 0, false, false, 14, null);
       this.b.o2().r().w0(uBaseFragmen);
       if (this.b.o2().D()) {
          this.b.k2(false);
          d = this.b.d;
          a.o(d, "mCallerContext");
          uBaseFragmen = d.f();
          a.o(uBaseFragmen, "mCallerContext.fragment");
          this.b.o2().h().e(false, uBaseFragmen);
       }else {
          this.b.k2(true);
          d = this.b.d;
          a.o(d, "mCallerContext");
          uBaseFragmen = d.f();
          a.o(uBaseFragmen, "mCallerContext.fragment");
          this.b.o2().h().e(true, uBaseFragmen);
       }
       return;
    }
}
