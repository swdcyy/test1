package com.kuaishou.live.core.basic.activity.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.core.basic.activity.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;

public class c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00182e
{
    public final View b;
    public final c c;

    public void c$a(c p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       if (this.b.getMeasuredWidth() > 0) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          int measuredWidt = this.b.getMeasuredWidth();
          if (measuredWidt > a1.h()) {
             measuredWidt = a1.h();
          }
          this.b.getLayoutParams().width = measuredWidt;
       }
       return;
    }
}
