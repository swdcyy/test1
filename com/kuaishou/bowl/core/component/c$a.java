package com.kuaishou.bowl.core.component.c$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.bowl.core.component.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uu.i;
import java.lang.Runnable;
import android.os.Handler;

public class c$a implements View$OnAttachStateChangeListener	// class@0011a0
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       if (tb.b != null && tb.a != null) {
          tb.d.post(new i(this, p0));
          p0.removeOnAttachStateChangeListener(this.b.i);
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
