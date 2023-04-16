package com.kuaishou.bowl.core.component.b$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.bowl.core.component.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a implements View$OnAttachStateChangeListener	// class@00119d
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.b.onViewAppear(p0);
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.b.onViewDisappear(p0);
       return;
    }
}
