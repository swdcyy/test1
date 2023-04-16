package com.kuaishou.tuna_core.button.TunaPhoneAction$b;
import android.text.style.ClickableSpan;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import h05.d;
import android.text.TextPaint;
import lnc.a1;

public final class TunaPhoneAction$b extends ClickableSpan	// class@0010a2
{
    public final Activity b;
    public final String c;

    public void TunaPhoneAction$b(Activity p0,String p1){
       a.p(p0, "activity");
       a.p(p1, "link");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaPhoneAction$b.class, "2")) {
          return;
       }
       a.p(p0, "widget");
       if (this.b.isFinishing()) {
          return;
       }
       JumpUrlModel jumpUrlModel = new JumpUrlModel();
       jumpUrlModel.mUrl = this.c;
       d.b(this.b, jumpUrlModel);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaPhoneAction$b.class, "1")) {
          return;
       }
       a.p(p0, "ds");
       p0.setColor(a1.a(R.color.arg_RES_7f0607c1));
       return;
    }
}
