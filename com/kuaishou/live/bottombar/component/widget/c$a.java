package com.kuaishou.live.bottombar.component.widget.c$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.live.bottombar.component.widget.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public class c$a implements View$OnAttachStateChangeListener	// class@000d46
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
       b.e("LiveBaseBottomBarWidget", " bottom bar widget onViewAttachedToWindow ", "widget ", this.b);
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       c$a tb = this.b;
       tb.i.removeCallbacks(tb.m);
       b.e("LiveBaseBottomBarWidget", " bottom bar widget onViewDetachedFromWindow ", "widget ", this.b);
       return;
    }
}
